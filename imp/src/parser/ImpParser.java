// Generated from /home/stini/univr/3anno/linguaggi/lab/lab_programming_languages/imp/src/Imp.g4 by ANTLR 4.12.0
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ImpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NAT=3, FLOAT=4, BOOL=5, PLUS=6, MINUS=7, MUL=8, DIV=9, 
		MOD=10, POW=11, AND=12, OR=13, EQQ=14, NEQ=15, LEQ=16, GEQ=17, LT=18, 
		GT=19, NOT=20, IF=21, THEN=22, ELSE=23, WHILE=24, SKIPP=25, ASSIGN=26, 
		OUT=27, FUN=28, RETURN=29, GLOBAL=30, ND=31, LPAR=32, RPAR=33, LBRACE=34, 
		RBRACE=35, DOLLAR=36, SEMICOLON=37, COMMA=38, DOTG=39, ARNPRINT=40, ARNDECLR1=41, 
		ARNDECLR2=42, ARNASSIGN1=43, ARNASSIGN2=44, ARNASSIGN3=45, ARNPLUS=46, 
		ARNMIN=47, ARNMULT=48, ARNDIV=49, ARNEQ=50, ARNGT=51, ARNOR=52, ARNAND=53, 
		ARNIF1=54, ARNIF2=55, ARNIF3=56, ARNWHILE1=57, ARNWHILE2=58, ARBOOL=59, 
		ID=60, StringLiteral=61, WS=62;
	public static final int
		RULE_prog = 0, RULE_funcDef = 1, RULE_params = 2, RULE_funcBody = 3, RULE_globalDeclare = 4, 
		RULE_com = 5, RULE_exp = 6, RULE_arnoldCProg = 7, RULE_arnoldCCom = 8, 
		RULE_arnoldCOps = 9, RULE_arnoldCexp = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "funcDef", "params", "funcBody", "globalDeclare", "com", "exp", 
			"arnoldCProg", "arnoldCCom", "arnoldCOps", "arnoldCexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", "'|'", "'=='", "'!='", 
			"'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", "'else'", "'while'", 
			"'skip'", "'='", "'out'", "'fun'", "'return '", "'global'", "'nd'", "'('", 
			"')'", "'{'", "'}'", "'$'", "';'", "','", "'.g'", "'TALK TO THE HAND'", 
			"'HEY CHRISTMAS TREE'", "'YOU SET US UP'", "'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", 
			"'ENOUGH TALK'", "'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", "'HE HAD TO SPLIT'", 
			"'YOU ARE NOT YOU YOU ARE ME'", "'LET OFF SOME STEAM BENNET'", "'CONSIDER THAT A DIVORCE'", 
			"'KNOCK KNOCK'", "'BECAUSE I'M GOING TO SAY PLEASE'", "'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", 
			"'STICK AROUND'", "'CHILL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NAT", "FLOAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "POW", "AND", "OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", 
			"IF", "THEN", "ELSE", "WHILE", "SKIPP", "ASSIGN", "OUT", "FUN", "RETURN", 
			"GLOBAL", "ND", "LPAR", "RPAR", "LBRACE", "RBRACE", "DOLLAR", "SEMICOLON", 
			"COMMA", "DOTG", "ARNPRINT", "ARNDECLR1", "ARNDECLR2", "ARNASSIGN1", 
			"ARNASSIGN2", "ARNASSIGN3", "ARNPLUS", "ARNMIN", "ARNMULT", "ARNDIV", 
			"ARNEQ", "ARNGT", "ARNOR", "ARNAND", "ARNIF1", "ARNIF2", "ARNIF3", "ARNWHILE1", 
			"ARNWHILE2", "ARBOOL", "ID", "StringLiteral", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Imp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ImpParser.EOF, 0); }
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public List<GlobalDeclareContext> globalDeclare() {
			return getRuleContexts(GlobalDeclareContext.class);
		}
		public GlobalDeclareContext globalDeclare(int i) {
			return getRuleContext(GlobalDeclareContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(22);
				funcDef();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(28);
				globalDeclare();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			com(0);
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(ImpParser.FUN, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(FUN);
			setState(38);
			match(ID);
			setState(39);
			match(LPAR);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(40);
				params();
				}
			}

			setState(43);
			match(RPAR);
			setState(44);
			funcBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImpParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(47);
				match(COMMA);
				setState(48);
				match(ID);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(ImpParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LBRACE);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921590692839424L) != 0)) {
				{
				setState(55);
				com(0);
				setState(56);
				match(SEMICOLON);
				}
			}

			setState(60);
			match(RETURN);
			setState(61);
			exp(0);
			setState(62);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalDeclareContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(ImpParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public GlobalDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitGlobalDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclareContext globalDeclare() throws RecognitionException {
		GlobalDeclareContext _localctx = new GlobalDeclareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_globalDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(GLOBAL);
			setState(65);
			match(ID);
			setState(66);
			match(ASSIGN);
			setState(67);
			exp(0);
			setState(68);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldBlockContext extends ComContext {
		public List<TerminalNode> DOLLAR() { return getTokens(ImpParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(ImpParser.DOLLAR, i);
		}
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ArnoldCProgContext arnoldCProg() {
			return getRuleContext(ArnoldCProgContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public ArnoldBlockContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAssignContext extends ComContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode DOTG() { return getToken(ImpParser.DOTG, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GlobalAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NdContext extends ComContext {
		public List<TerminalNode> LBRACE() { return getTokens(ImpParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ImpParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ImpParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ImpParser.RBRACE, i);
		}
		public TerminalNode ND() { return getToken(ImpParser.ND, 0); }
		public NdContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(ImpParser.SKIPP, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(ImpParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(ImpParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(ImpParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ImpParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ImpParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ImpParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ImpParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(ImpParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqContext extends ComContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public SeqContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ComContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutContext extends ComContext {
		public TerminalNode OUT() { return getToken(ImpParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public OutContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		return com(0);
	}

	private ComContext com(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComContext _localctx = new ComContext(_ctx, _parentState);
		ComContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_com, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(71);
				match(IF);
				setState(72);
				match(LPAR);
				setState(73);
				exp(0);
				setState(74);
				match(RPAR);
				setState(75);
				match(THEN);
				setState(76);
				match(LBRACE);
				setState(77);
				com(0);
				setState(78);
				match(RBRACE);
				setState(79);
				match(ELSE);
				setState(80);
				match(LBRACE);
				setState(81);
				com(0);
				setState(82);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(ID);
				setState(85);
				match(ASSIGN);
				setState(86);
				exp(0);
				}
				break;
			case 3:
				{
				_localctx = new GlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(ID);
				setState(88);
				match(DOTG);
				setState(89);
				match(ASSIGN);
				setState(90);
				exp(0);
				}
				break;
			case 4:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(SKIPP);
				}
				break;
			case 5:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(WHILE);
				setState(93);
				match(LPAR);
				setState(94);
				exp(0);
				setState(95);
				match(RPAR);
				setState(96);
				match(LBRACE);
				setState(97);
				com(0);
				setState(98);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(OUT);
				setState(101);
				match(LPAR);
				setState(102);
				exp(0);
				setState(103);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new NdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(LBRACE);
				setState(106);
				com(0);
				setState(107);
				match(RBRACE);
				setState(108);
				match(ND);
				setState(109);
				match(LBRACE);
				setState(110);
				com(0);
				setState(111);
				match(RBRACE);
				}
				break;
			case 8:
				{
				_localctx = new ArnoldBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(DOLLAR);
				setState(114);
				match(LBRACE);
				setState(115);
				arnoldCProg();
				setState(116);
				match(RBRACE);
				setState(117);
				match(DOLLAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(121);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(122);
					match(SEMICOLON);
					setState(123);
					com(6);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NatContext extends ExpContext {
		public TerminalNode NAT() { return getToken(ImpParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ImpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImpParser.MINUS, 0); }
		public PlusMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(ImpParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalIdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode DOTG() { return getToken(ImpParser.DOTG, 0); }
		public GlobalIdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitGlobalId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivMulModContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ImpParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(ImpParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(ImpParser.MOD, 0); }
		public DivMulModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(ImpParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQQ() { return getToken(ImpParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(ImpParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(ImpParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(ImpParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(ImpParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(ImpParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitCmpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(ImpParser.AND, 0); }
		public TerminalNode OR() { return getToken(ImpParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(ImpParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImpParser.COMMA, i);
		}
		public FuncCallContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(130);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(LPAR);
				setState(133);
				exp(0);
				setState(134);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(NOT);
				setState(137);
				exp(9);
				}
				break;
			case 5:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(ID);
				setState(139);
				match(LPAR);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921508902862888L) != 0)) {
					{
					setState(140);
					exp(0);
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(141);
						match(COMMA);
						setState(142);
						exp(0);
						}
						}
						setState(147);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(150);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new GlobalIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(ID);
				setState(152);
				match(DOTG);
				}
				break;
			case 7:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(156);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(157);
						match(POW);
						setState(158);
						exp(10);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(159);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(160);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(161);
						exp(9);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(162);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(163);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(164);
						exp(8);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(166);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 983040L) != 0)) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						exp(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(169);
						((EqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQQ || _la==NEQ) ) {
							((EqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						exp(6);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(171);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(172);
						((LogicExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCProgContext extends ParserRuleContext {
		public List<ArnoldCComContext> arnoldCCom() {
			return getRuleContexts(ArnoldCComContext.class);
		}
		public ArnoldCComContext arnoldCCom(int i) {
			return getRuleContext(ArnoldCComContext.class,i);
		}
		public ArnoldCProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnoldCProg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldCProgContext arnoldCProg() throws RecognitionException {
		ArnoldCProgContext _localctx = new ArnoldCProgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arnoldCProg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__0);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162141681213243392L) != 0)) {
				{
				{
				setState(180);
				arnoldCCom();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCComContext extends ParserRuleContext {
		public ArnoldCComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnoldCCom; }
	 
		public ArnoldCComContext() { }
		public void copyFrom(ArnoldCComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCprintContext extends ArnoldCComContext {
		public TerminalNode ARNPRINT() { return getToken(ImpParser.ARNPRINT, 0); }
		public ArnoldCexpContext arnoldCexp() {
			return getRuleContext(ArnoldCexpContext.class,0);
		}
		public ArnoldCprintContext(ArnoldCComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCprint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCifelseContext extends ArnoldCComContext {
		public TerminalNode ARNIF1() { return getToken(ImpParser.ARNIF1, 0); }
		public ArnoldCexpContext arnoldCexp() {
			return getRuleContext(ArnoldCexpContext.class,0);
		}
		public List<ArnoldCComContext> arnoldCCom() {
			return getRuleContexts(ArnoldCComContext.class);
		}
		public ArnoldCComContext arnoldCCom(int i) {
			return getRuleContext(ArnoldCComContext.class,i);
		}
		public TerminalNode ARNIF3() { return getToken(ImpParser.ARNIF3, 0); }
		public TerminalNode ARNIF2() { return getToken(ImpParser.ARNIF2, 0); }
		public ArnoldCifelseContext(ArnoldCComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCifelse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCdeclareContext extends ArnoldCComContext {
		public TerminalNode ARNDECLR1() { return getToken(ImpParser.ARNDECLR1, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNDECLR2() { return getToken(ImpParser.ARNDECLR2, 0); }
		public ArnoldCexpContext arnoldCexp() {
			return getRuleContext(ArnoldCexpContext.class,0);
		}
		public ArnoldCdeclareContext(ArnoldCComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCdeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCwhileContext extends ArnoldCComContext {
		public TerminalNode ARNWHILE1() { return getToken(ImpParser.ARNWHILE1, 0); }
		public ArnoldCexpContext arnoldCexp() {
			return getRuleContext(ArnoldCexpContext.class,0);
		}
		public TerminalNode ARNWHILE2() { return getToken(ImpParser.ARNWHILE2, 0); }
		public List<ArnoldCComContext> arnoldCCom() {
			return getRuleContexts(ArnoldCComContext.class);
		}
		public ArnoldCComContext arnoldCCom(int i) {
			return getRuleContext(ArnoldCComContext.class,i);
		}
		public ArnoldCwhileContext(ArnoldCComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCwhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCassignContext extends ArnoldCComContext {
		public TerminalNode ARNASSIGN1() { return getToken(ImpParser.ARNASSIGN1, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNASSIGN2() { return getToken(ImpParser.ARNASSIGN2, 0); }
		public ArnoldCexpContext arnoldCexp() {
			return getRuleContext(ArnoldCexpContext.class,0);
		}
		public TerminalNode ARNASSIGN3() { return getToken(ImpParser.ARNASSIGN3, 0); }
		public List<ArnoldCOpsContext> arnoldCOps() {
			return getRuleContexts(ArnoldCOpsContext.class);
		}
		public ArnoldCOpsContext arnoldCOps(int i) {
			return getRuleContext(ArnoldCOpsContext.class,i);
		}
		public ArnoldCassignContext(ArnoldCComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldCComContext arnoldCCom() throws RecognitionException {
		ArnoldCComContext _localctx = new ArnoldCComContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arnoldCCom);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNPRINT:
				_localctx = new ArnoldCprintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(ARNPRINT);
				setState(189);
				arnoldCexp();
				}
				break;
			case ARNDECLR1:
				_localctx = new ArnoldCdeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(ARNDECLR1);
				setState(191);
				match(ID);
				setState(192);
				match(ARNDECLR2);
				setState(193);
				arnoldCexp();
				}
				break;
			case ARNASSIGN1:
				_localctx = new ArnoldCassignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(ARNASSIGN1);
				setState(195);
				match(ID);
				setState(196);
				match(ARNASSIGN2);
				setState(197);
				arnoldCexp();
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(198);
					arnoldCOps();
					}
					}
					setState(201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17944029765304320L) != 0) );
				setState(203);
				match(ARNASSIGN3);
				}
				break;
			case ARNIF1:
				_localctx = new ArnoldCifelseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(ARNIF1);
				setState(206);
				arnoldCexp();
				setState(207);
				arnoldCCom();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARNIF2) {
					{
					setState(208);
					match(ARNIF2);
					setState(209);
					arnoldCCom();
					}
				}

				setState(212);
				match(ARNIF3);
				}
				break;
			case ARNWHILE1:
				_localctx = new ArnoldCwhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(ARNWHILE1);
				setState(215);
				arnoldCexp();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162141681213243392L) != 0)) {
					{
					{
					setState(216);
					arnoldCCom();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(ARNWHILE2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCOpsContext extends ParserRuleContext {
		public ArnoldCOpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnoldCOps; }
	 
		public ArnoldCOpsContext() { }
		public void copyFrom(ArnoldCOpsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCArithmeticOpContext extends ArnoldCOpsContext {
		public Token op;
		public ArnoldCexpContext arnoldCexp() {
			return getRuleContext(ArnoldCexpContext.class,0);
		}
		public TerminalNode ARNPLUS() { return getToken(ImpParser.ARNPLUS, 0); }
		public TerminalNode ARNMIN() { return getToken(ImpParser.ARNMIN, 0); }
		public TerminalNode ARNMULT() { return getToken(ImpParser.ARNMULT, 0); }
		public TerminalNode ARNDIV() { return getToken(ImpParser.ARNDIV, 0); }
		public ArnoldCArithmeticOpContext(ArnoldCOpsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCArithmeticOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCLogicalOpContext extends ArnoldCOpsContext {
		public Token op;
		public ArnoldCexpContext arnoldCexp() {
			return getRuleContext(ArnoldCexpContext.class,0);
		}
		public TerminalNode ARNEQ() { return getToken(ImpParser.ARNEQ, 0); }
		public TerminalNode ARNGT() { return getToken(ImpParser.ARNGT, 0); }
		public TerminalNode ARNOR() { return getToken(ImpParser.ARNOR, 0); }
		public TerminalNode ARNAND() { return getToken(ImpParser.ARNAND, 0); }
		public ArnoldCLogicalOpContext(ArnoldCOpsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldCOpsContext arnoldCOps() throws RecognitionException {
		ArnoldCOpsContext _localctx = new ArnoldCOpsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arnoldCOps);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNPLUS:
			case ARNMIN:
			case ARNMULT:
			case ARNDIV:
				_localctx = new ArnoldCArithmeticOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((ArnoldCArithmeticOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
					((ArnoldCArithmeticOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				arnoldCexp();
				}
				break;
			case ARNEQ:
			case ARNGT:
			case ARNOR:
			case ARNAND:
				_localctx = new ArnoldCLogicalOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				((ArnoldCLogicalOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16888498602639360L) != 0)) ) {
					((ArnoldCLogicalOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				arnoldCexp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCexpContext extends ParserRuleContext {
		public ArnoldCexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnoldCexp; }
	 
		public ArnoldCexpContext() { }
		public void copyFrom(ArnoldCexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCstringContext extends ArnoldCexpContext {
		public TerminalNode StringLiteral() { return getToken(ImpParser.StringLiteral, 0); }
		public ArnoldCstringContext(ArnoldCexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCstring(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCfloatContext extends ArnoldCexpContext {
		public TerminalNode FLOAT() { return getToken(ImpParser.FLOAT, 0); }
		public ArnoldCfloatContext(ArnoldCexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCfloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCboolContext extends ArnoldCexpContext {
		public TerminalNode ARBOOL() { return getToken(ImpParser.ARBOOL, 0); }
		public ArnoldCboolContext(ArnoldCexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCbool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldCidContext extends ArnoldCexpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public ArnoldCidContext(ArnoldCexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldCid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldCexpContext arnoldCexp() throws RecognitionException {
		ArnoldCexpContext _localctx = new ArnoldCexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arnoldCexp);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				_localctx = new ArnoldCstringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(StringLiteral);
				}
				break;
			case ARBOOL:
				_localctx = new ArnoldCboolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ARBOOL);
				}
				break;
			case FLOAT:
				_localctx = new ArnoldCfloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(FLOAT);
				}
				break;
			case ID:
				_localctx = new ArnoldCidContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return com_sempred((ComContext)_localctx, predIndex);
		case 6:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0005\u0000\u001e\b"+
		"\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u00022\b\u0002\n\u0002\f\u00025\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005x\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005}\b\u0005\n\u0005\f\u0005\u0080\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0090\b\u0006\n\u0006\f\u0006\u0093"+
		"\t\u0006\u0003\u0006\u0095\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u009b\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00af\b\u0006\n\u0006"+
		"\f\u0006\u00b2\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u00b6\b\u0007"+
		"\n\u0007\f\u0007\u00b9\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0004\b\u00c8\b\b\u000b\b\f\b\u00c9\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00d3\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00da\b\b\n\b\f\b\u00dd\t\b\u0001\b\u0001\b\u0003\b"+
		"\u00e1\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e7\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00ed\b\n\u0001\n\u0000\u0002\n\f\u000b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0007\u0001\u0000"+
		"\b\n\u0001\u0000\u0006\u0007\u0001\u0000\u0010\u0013\u0001\u0000\u000e"+
		"\u000f\u0001\u0000\f\r\u0001\u0000.1\u0001\u000025\u010a\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000"+
		"\u0000\u00066\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nw\u0001"+
		"\u0000\u0000\u0000\f\u009a\u0001\u0000\u0000\u0000\u000e\u00b3\u0001\u0000"+
		"\u0000\u0000\u0010\u00e0\u0001\u0000\u0000\u0000\u0012\u00e6\u0001\u0000"+
		"\u0000\u0000\u0014\u00ec\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002"+
		"\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001f\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0003\b\u0004\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"#\u0003\n\u0005\u0000#$\u0005\u0000\u0000\u0001$\u0001"+
		"\u0001\u0000\u0000\u0000%&\u0005\u001c\u0000\u0000&\'\u0005<\u0000\u0000"+
		"\')\u0005 \u0000\u0000(*\u0003\u0004\u0002\u0000)(\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0005!\u0000\u0000"+
		",-\u0003\u0006\u0003\u0000-\u0003\u0001\u0000\u0000\u0000.3\u0005<\u0000"+
		"\u0000/0\u0005&\u0000\u000002\u0005<\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"25\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u00004\u0005\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u00006:\u0005"+
		"\"\u0000\u000078\u0003\n\u0005\u000089\u0005%\u0000\u00009;\u0001\u0000"+
		"\u0000\u0000:7\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0005\u001d\u0000\u0000=>\u0003\f\u0006\u0000>?\u0005"+
		"#\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0005\u001e\u0000\u0000"+
		"AB\u0005<\u0000\u0000BC\u0005\u001a\u0000\u0000CD\u0003\f\u0006\u0000"+
		"DE\u0005%\u0000\u0000E\t\u0001\u0000\u0000\u0000FG\u0006\u0005\uffff\uffff"+
		"\u0000GH\u0005\u0015\u0000\u0000HI\u0005 \u0000\u0000IJ\u0003\f\u0006"+
		"\u0000JK\u0005!\u0000\u0000KL\u0005\u0016\u0000\u0000LM\u0005\"\u0000"+
		"\u0000MN\u0003\n\u0005\u0000NO\u0005#\u0000\u0000OP\u0005\u0017\u0000"+
		"\u0000PQ\u0005\"\u0000\u0000QR\u0003\n\u0005\u0000RS\u0005#\u0000\u0000"+
		"Sx\u0001\u0000\u0000\u0000TU\u0005<\u0000\u0000UV\u0005\u001a\u0000\u0000"+
		"Vx\u0003\f\u0006\u0000WX\u0005<\u0000\u0000XY\u0005\'\u0000\u0000YZ\u0005"+
		"\u001a\u0000\u0000Zx\u0003\f\u0006\u0000[x\u0005\u0019\u0000\u0000\\]"+
		"\u0005\u0018\u0000\u0000]^\u0005 \u0000\u0000^_\u0003\f\u0006\u0000_`"+
		"\u0005!\u0000\u0000`a\u0005\"\u0000\u0000ab\u0003\n\u0005\u0000bc\u0005"+
		"#\u0000\u0000cx\u0001\u0000\u0000\u0000de\u0005\u001b\u0000\u0000ef\u0005"+
		" \u0000\u0000fg\u0003\f\u0006\u0000gh\u0005!\u0000\u0000hx\u0001\u0000"+
		"\u0000\u0000ij\u0005\"\u0000\u0000jk\u0003\n\u0005\u0000kl\u0005#\u0000"+
		"\u0000lm\u0005\u001f\u0000\u0000mn\u0005\"\u0000\u0000no\u0003\n\u0005"+
		"\u0000op\u0005#\u0000\u0000px\u0001\u0000\u0000\u0000qr\u0005$\u0000\u0000"+
		"rs\u0005\"\u0000\u0000st\u0003\u000e\u0007\u0000tu\u0005#\u0000\u0000"+
		"uv\u0005$\u0000\u0000vx\u0001\u0000\u0000\u0000wF\u0001\u0000\u0000\u0000"+
		"wT\u0001\u0000\u0000\u0000wW\u0001\u0000\u0000\u0000w[\u0001\u0000\u0000"+
		"\u0000w\\\u0001\u0000\u0000\u0000wd\u0001\u0000\u0000\u0000wi\u0001\u0000"+
		"\u0000\u0000wq\u0001\u0000\u0000\u0000x~\u0001\u0000\u0000\u0000yz\n\u0005"+
		"\u0000\u0000z{\u0005%\u0000\u0000{}\u0003\n\u0005\u0006|y\u0001\u0000"+
		"\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0081\u0082\u0006\u0006\uffff\uffff\u0000\u0082"+
		"\u009b\u0005\u0003\u0000\u0000\u0083\u009b\u0005\u0005\u0000\u0000\u0084"+
		"\u0085\u0005 \u0000\u0000\u0085\u0086\u0003\f\u0006\u0000\u0086\u0087"+
		"\u0005!\u0000\u0000\u0087\u009b\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\u0014\u0000\u0000\u0089\u009b\u0003\f\u0006\t\u008a\u008b\u0005<\u0000"+
		"\u0000\u008b\u0094\u0005 \u0000\u0000\u008c\u0091\u0003\f\u0006\u0000"+
		"\u008d\u008e\u0005&\u0000\u0000\u008e\u0090\u0003\f\u0006\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u008c\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u009b\u0005!\u0000\u0000\u0097\u0098"+
		"\u0005<\u0000\u0000\u0098\u009b\u0005\'\u0000\u0000\u0099\u009b\u0005"+
		"<\u0000\u0000\u009a\u0081\u0001\u0000\u0000\u0000\u009a\u0083\u0001\u0000"+
		"\u0000\u0000\u009a\u0084\u0001\u0000\u0000\u0000\u009a\u0088\u0001\u0000"+
		"\u0000\u0000\u009a\u008a\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u00b0\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\n\n\u0000\u0000\u009d\u009e\u0005\u000b\u0000"+
		"\u0000\u009e\u00af\u0003\f\u0006\n\u009f\u00a0\n\b\u0000\u0000\u00a0\u00a1"+
		"\u0007\u0000\u0000\u0000\u00a1\u00af\u0003\f\u0006\t\u00a2\u00a3\n\u0007"+
		"\u0000\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000\u00a4\u00af\u0003\f\u0006"+
		"\b\u00a5\u00a6\n\u0006\u0000\u0000\u00a6\u00a7\u0007\u0002\u0000\u0000"+
		"\u00a7\u00af\u0003\f\u0006\u0007\u00a8\u00a9\n\u0005\u0000\u0000\u00a9"+
		"\u00aa\u0007\u0003\u0000\u0000\u00aa\u00af\u0003\f\u0006\u0006\u00ab\u00ac"+
		"\n\u0004\u0000\u0000\u00ac\u00ad\u0007\u0004\u0000\u0000\u00ad\u00af\u0003"+
		"\f\u0006\u0005\u00ae\u009c\u0001\u0000\u0000\u0000\u00ae\u009f\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a2\u0001\u0000\u0000\u0000\u00ae\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001\u0000"+
		"\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\r\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b7\u0005\u0001\u0000"+
		"\u0000\u00b4\u00b6\u0003\u0010\b\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0002\u0000\u0000"+
		"\u00bb\u000f\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005(\u0000\u0000\u00bd"+
		"\u00e1\u0003\u0014\n\u0000\u00be\u00bf\u0005)\u0000\u0000\u00bf\u00c0"+
		"\u0005<\u0000\u0000\u00c0\u00c1\u0005*\u0000\u0000\u00c1\u00e1\u0003\u0014"+
		"\n\u0000\u00c2\u00c3\u0005+\u0000\u0000\u00c3\u00c4\u0005<\u0000\u0000"+
		"\u00c4\u00c5\u0005,\u0000\u0000\u00c5\u00c7\u0003\u0014\n\u0000\u00c6"+
		"\u00c8\u0003\u0012\t\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005-\u0000\u0000\u00cc\u00e1\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"6\u0000\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf\u00d2\u0003\u0010"+
		"\b\u0000\u00d0\u00d1\u00057\u0000\u0000\u00d1\u00d3\u0003\u0010\b\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u00058\u0000\u0000\u00d5"+
		"\u00e1\u0001\u0000\u0000\u0000\u00d6\u00d7\u00059\u0000\u0000\u00d7\u00db"+
		"\u0003\u0014\n\u0000\u00d8\u00da\u0003\u0010\b\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		":\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00bc\u0001\u0000"+
		"\u0000\u0000\u00e0\u00be\u0001\u0000\u0000\u0000\u00e0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00cd\u0001\u0000\u0000\u0000\u00e0\u00d6\u0001\u0000"+
		"\u0000\u0000\u00e1\u0011\u0001\u0000\u0000\u0000\u00e2\u00e3\u0007\u0005"+
		"\u0000\u0000\u00e3\u00e7\u0003\u0014\n\u0000\u00e4\u00e5\u0007\u0006\u0000"+
		"\u0000\u00e5\u00e7\u0003\u0014\n\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u0013\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ed\u0005=\u0000\u0000\u00e9\u00ed\u0005;\u0000\u0000\u00ea\u00ed"+
		"\u0005\u0004\u0000\u0000\u00eb\u00ed\u0005<\u0000\u0000\u00ec\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u0015\u0001"+
		"\u0000\u0000\u0000\u0013\u0019\u001f)3:w~\u0091\u0094\u009a\u00ae\u00b0"+
		"\u00b7\u00c9\u00d2\u00db\u00e0\u00e6\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}