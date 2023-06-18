import org.antlr.v4.runtime.LexerInterpreter;
import org.antlr.v4.runtime.tree.TerminalNode;
import value.*;
import parser.*;

import java.util.*;

public class IntImp extends ImpBaseVisitor<Value> {

    private final LinkedList<Conf> vars;                             //variables
    private final Conf globalVars;
    private final Set<FunValue> functions = new HashSet<>();         //functions

    private ExpValue<?> arnold_operand = null;

    public IntImp(Conf conf) {
        vars = new LinkedList<>();
        vars.add(new Conf());

        globalVars = new Conf();
    }

    private ComValue visitCom(ImpParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ExpValue<?> visitExp(ImpParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private int visitNatExp(ImpParser.ExpContext ctx) {
        try {
            return ((NatValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Natural expression expected.");
            System.exit(1);
        }

        return 0; // unreachable code
    }

    private boolean visitBoolExp(ImpParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Boolean expression expected.");
            System.exit(1);
        }

        return false; // unreachable code
    }

    @Override
    public ComValue visitProg(ImpParser.ProgContext ctx) {
        for (ImpParser.FuncDefContext f: ctx.funcDef()) {
            visitFuncDef(f);
        }
        for(ImpParser.GlobalDeclareContext g : ctx.globalDeclare()){
            visitGlobalDeclare(g);
        }
        return visitCom(ctx.com());
    }

    @Override
    public ComValue visitIf(ImpParser.IfContext ctx) {
        return visitBoolExp(ctx.exp())
                ? visitCom(ctx.com(0))
                : visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitAssign(ImpParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        vars.getLast().update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(ImpParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSeq(ImpParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        return visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitWhile(ImpParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com());

        return visitWhile(ctx);
    }

    @Override
    public ComValue visitOut(ImpParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public NatValue visitNat(ImpParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BoolValue visitBool(ImpParser.BoolContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(ImpParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public NatValue visitPow(ImpParser.PowContext ctx) {
        int base = visitNatExp(ctx.exp(0));
        int exp = visitNatExp(ctx.exp(1));

        return new NatValue((int) Math.pow(base, exp));
    }

    @Override
    public BoolValue visitNot(ImpParser.NotContext ctx) {
        return new BoolValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public NatValue visitDivMulMod(ImpParser.DivMulModContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.DIV -> new NatValue(left / right);
            case ImpParser.MUL -> new NatValue(left * right);
            case ImpParser.MOD -> new NatValue(left % right);
            default -> null;
        };
    }

    @Override
    public NatValue visitPlusMinus(ImpParser.PlusMinusContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.PLUS -> new NatValue(left + right);
            case ImpParser.MINUS -> new NatValue(Math.max(left - right, 0));
            default -> null;
        };
    }

    @Override
    public BoolValue visitEqExp(ImpParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.EQQ -> new BoolValue(left.equals(right));
            case ImpParser.NEQ -> new BoolValue(!left.equals(right));
            default -> null; // unreachable code
        };
    }

    @Override
    public ExpValue<?> visitId(ImpParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if (!vars.getLast().contains(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        return vars.getLast().get(id);
    }

    @Override
    public BoolValue visitCmpExp(ImpParser.CmpExpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.GEQ -> new BoolValue(left >= right);
            case ImpParser.LEQ -> new BoolValue(left <= right);
            case ImpParser.LT  -> new BoolValue(left < right);
            case ImpParser.GT  -> new BoolValue(left > right);
            default -> null;
        };
    }

    @Override
    public BoolValue visitLogicExp(ImpParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.AND -> new BoolValue(left && right);
            case ImpParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }

    @Override
    public Value visitFuncDef(ImpParser.FuncDefContext ctx) {
        String functionName = ctx.ID().getText();

        // Controllo che la funzione non sia stata già definita
        for(FunValue fun : functions) {
            if (fun.getName().equals(functionName)) {
                System.err.println("Function " + functionName + " already defined");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.exit(1);
            }
        }

        // Salvo i nomi degli parametri
        List<String> parameters = new ArrayList<>();
        if(ctx.params() != null) {
            for (TerminalNode par : ctx.params().ID()) {
                if(parameters.contains(par.getText())) {
                    System.err.println("Parameter " + par.getText() + " already defined");
                    System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                    System.exit(1);
                }
                parameters.add(par.getText());
            }
        }

        if(ctx.funcBody().exp().getText().isEmpty()){
            System.err.println("Function " + functionName + " has no return value");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        // Aggiungo la funzione
        functions.add(
                new FunValue(
                        functionName,
                        parameters,
                        ctx.funcBody().com(),
                        ctx.funcBody().exp()
                )
        );

        return ComValue.INSTANCE;
    }

    @Override
    public ExpValue<?> visitFuncCall(ImpParser.FuncCallContext ctx) {
        String functionName = ctx.ID().getText();
        List<ImpParser.ExpContext> args = ctx.exp();

        for(FunValue fun : functions){
            if(fun.getName().equals(functionName)){
                if(fun.totParams() != args.size()) {
                    System.err.println("Function " + functionName + " called with the wrong number of arguments");
                    System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                    System.exit(1);
                }

                Conf funcConf = new Conf();                 // Function variables
                int paramIndex = 0;
                for (String id : fun.getParams()) {         // Visit all parameters
                    funcConf.update(id, visitExp(args.get(paramIndex)));      // Add param value to function Conf
                    paramIndex++;
                }

                vars.add(funcConf);         // Push function context
                ImpParser.ComContext body = fun.getBody();
                if(body != null)
                    visitCom(fun.getBody());    // Function body execution

                ExpValue<?> returnValue = visitExp(fun.getReturnExp());
                vars.removeLast();          // Pop function context

                return returnValue;
            }
        }

        // Function not found -> exit with error
        System.err.println("Function " + functionName + " used but never declared");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
        return null;
    }

    @Override
    public Value visitGlobalDeclare(ImpParser.GlobalDeclareContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        globalVars.update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitGlobalAssign(ImpParser.GlobalAssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        if(!globalVars.contains(id)) {
            System.err.println("Global variable " + id + " used but never declared");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        globalVars.update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitGlobalId(ImpParser.GlobalIdContext ctx) {
        String id = ctx.ID().getText();

        if (!globalVars.contains(id)) {
            System.err.println("Global variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        return globalVars.get(id);
    }

    @Override
    public ComValue visitNd(ImpParser.NdContext ctx) {
        // Generate random boolean value
        boolean b = Math.random() >= 0.5;
        if(b)
            return visitCom(ctx.com(0));
        else
            return visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitArnoldBlock(ImpParser.ArnoldBlockContext ctx) {
        vars.add(new Conf());         // Push arnold block context
        visit(ctx.arnoldCProg());
        vars.removeLast();            // Pop arnold block context
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitArnoldCProg(ImpParser.ArnoldCProgContext ctx) {
        for(ImpParser.ArnoldCComContext c : ctx.arnoldCCom()){
            visit(c);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitArnoldCprint(ImpParser.ArnoldCprintContext ctx) {
        System.out.println(visit(ctx.arnoldCexp()));
        return ComValue.INSTANCE;
    }

    @Override
    public ExpValue<?> visitArnoldCid(ImpParser.ArnoldCidContext ctx) {
        String id = ctx.ID().getText();

        if (!vars.getLast().contains(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        return vars.getLast().get(id);
    }

    @Override
    public StringValue visitArnoldCstring(ImpParser.ArnoldCstringContext ctx) {
        String value = ctx.getText();
        if (value.startsWith("\"") && value.endsWith("\"")) {
            value = value.substring(1, value.length() - 1);
        }
        return new StringValue(value);
    }

    @Override
    public FloatValue visitArnoldCbool(ImpParser.ArnoldCboolContext ctx) {
        return switch(ctx.ARBOOL().getText()){
            case "@I LIED" -> new FloatValue(0);
            case "@NO PROBLEMO" -> new FloatValue(1);
            default -> null;    // Dead code
        };
    }

    @Override
    public FloatValue visitArnoldCfloat(ImpParser.ArnoldCfloatContext ctx) {
        return new FloatValue(Float.parseFloat(ctx.FLOAT().getText()));
    }

    private ExpValue<?> visitArnoldCexp(ImpParser.ArnoldCexpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    @Override
    public ComValue visitArnoldCdeclare(ImpParser.ArnoldCdeclareContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> value = visitArnoldCexp(ctx.arnoldCexp());

        vars.getLast().update(id, value);
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitArnoldCArithmeticOp(ImpParser.ArnoldCArithmeticOpContext ctx) {
        try{
            FloatValue v = (FloatValue) visitArnoldCexp(ctx.arnoldCexp());
            float val1 = (float) arnold_operand.toJavaValue();
            float val2 = v.toJavaValue();
            switch (ctx.op.getType()){
                case ImpParser.ARNPLUS -> arnold_operand = new FloatValue(val1 + val2);
                case ImpParser.ARNMIN -> arnold_operand = new FloatValue(val1 - val2);
                case ImpParser.ARNMULT -> arnold_operand = new FloatValue(val1 * val2);
                case ImpParser.ARNDIV -> arnold_operand = new FloatValue(val1 / val2);
                default -> {}     // Dead code
            }
        } catch(ClassCastException e){
            System.err.println("Expression is not a float");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitArnoldCLogicalOp(ImpParser.ArnoldCLogicalOpContext ctx) {
        try{
            ExpValue<?> v = visitArnoldCexp(ctx.arnoldCexp());
            switch (ctx.op.getType()) {
                case ImpParser.ARNGT -> {
                    float v1 = ((FloatValue) arnold_operand).toJavaValue();
                    float v2 = ((FloatValue) visitArnoldCexp(ctx.arnoldCexp())).toJavaValue();
                    arnold_operand = (v1 > v2) ? new FloatValue(1) : new FloatValue(0);
                }
                case ImpParser.ARNEQ -> {
                    ExpValue<?> v1 = arnold_operand;
                    ExpValue<?> v2 = visitArnoldCexp(ctx.arnoldCexp());
                    arnold_operand = (v1.equals(v2)) ? new FloatValue(1) : new FloatValue(0);
                }
                case ImpParser.ARNAND -> {
                    float v1 = ((FloatValue) arnold_operand).toJavaValue();
                    float v2 = ((FloatValue) visitArnoldCexp(ctx.arnoldCexp())).toJavaValue();
                    arnold_operand = ((v1 * v2) > 0) ? new FloatValue(1) : new FloatValue(0);
                }
                case ImpParser.ARNOR -> {
                    float v1 = ((FloatValue) arnold_operand).toJavaValue();
                    float v2 = ((FloatValue) visitArnoldCexp(ctx.arnoldCexp())).toJavaValue();
                    arnold_operand = ((v1 + v2) > 0) ? new FloatValue(1) : new FloatValue(0);
                }
                default -> { /* Dead code */}
            }
        } catch(ClassCastException e){
            System.err.println("Inconsistent operand types : " + e.getMessage());
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitArnoldCassign(ImpParser.ArnoldCassignContext ctx) {
        String id = ctx.ID().getText();
        arnold_operand = visitArnoldCexp(ctx.arnoldCexp());

        for(ImpParser.ArnoldCOpsContext op : ctx.arnoldCOps()){
            visit(op);
        }

        vars.getLast().update(id, arnold_operand);

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitArnoldCifelse(ImpParser.ArnoldCifelseContext ctx) {
        try{
            float cond = ((FloatValue) visitArnoldCexp(ctx.arnoldCexp())).toJavaValue();
            return (cond != 0)
                    ? visit(ctx.arnoldCCom(0))
                    : visit(ctx.arnoldCCom(1));
        } catch(ClassCastException e){
            System.err.println("Invalid condition expression");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        return null;        // Dead code
    }

    @Override
    public ComValue visitArnoldCwhile(ImpParser.ArnoldCwhileContext ctx) {
        float cond = ((FloatValue) visitArnoldCexp(ctx.arnoldCexp())).toJavaValue();

        if (cond == 0)
            return ComValue.INSTANCE;

        for(ImpParser.ArnoldCComContext com : ctx.arnoldCCom())
            visit(com);

        return visitArnoldCwhile(ctx);
    }
}
