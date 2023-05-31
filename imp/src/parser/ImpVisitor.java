// Generated from /home/stini/univr/3anno/linguaggi/lab/lab_programming_languages/imp/src/Imp.g4 by ANTLR 4.12.0
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ImpParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(ImpParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ImpParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(ImpParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#globalDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclare(ImpParser.GlobalDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldBlock}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldBlock(ImpParser.ArnoldBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalAssign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAssign(ImpParser.GlobalAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nd}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNd(ImpParser.NdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(ImpParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ImpParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ImpParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(ImpParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ImpParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(ImpParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(ImpParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(ImpParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ImpParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalId}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalId(ImpParser.GlobalIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivMulMod(ImpParser.DivMulModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ImpParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(ImpParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExp(ImpParser.CmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(ImpParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(ImpParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(ImpParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(ImpParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ImpParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#arnoldCProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCProg(ImpParser.ArnoldCProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCprint}
	 * labeled alternative in {@link ImpParser#arnoldCCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCprint(ImpParser.ArnoldCprintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCdeclare}
	 * labeled alternative in {@link ImpParser#arnoldCCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCdeclare(ImpParser.ArnoldCdeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCassign}
	 * labeled alternative in {@link ImpParser#arnoldCCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCassign(ImpParser.ArnoldCassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCifelse}
	 * labeled alternative in {@link ImpParser#arnoldCCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCifelse(ImpParser.ArnoldCifelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCwhile}
	 * labeled alternative in {@link ImpParser#arnoldCCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCwhile(ImpParser.ArnoldCwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCArithmeticOp}
	 * labeled alternative in {@link ImpParser#arnoldCOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCArithmeticOp(ImpParser.ArnoldCArithmeticOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCLogicalOp}
	 * labeled alternative in {@link ImpParser#arnoldCOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCLogicalOp(ImpParser.ArnoldCLogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCstring}
	 * labeled alternative in {@link ImpParser#arnoldCexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCstring(ImpParser.ArnoldCstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCbool}
	 * labeled alternative in {@link ImpParser#arnoldCexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCbool(ImpParser.ArnoldCboolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCfloat}
	 * labeled alternative in {@link ImpParser#arnoldCexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCfloat(ImpParser.ArnoldCfloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldCid}
	 * labeled alternative in {@link ImpParser#arnoldCexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldCid(ImpParser.ArnoldCidContext ctx);
}