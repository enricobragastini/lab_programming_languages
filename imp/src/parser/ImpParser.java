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
		RBRACE=35, DOLLAR=36, SEMICOLON=37, COMMA=38, DOTG=39, ID=40, ARNPRINT=41, 
		ARNDECLR1=42, ARNDECLR2=43, ARNASSIGN1=44, ARNASSIGN2=45, ARNASSIGN3=46, 
		ARNPLUS=47, ARNMIN=48, ARNMULT=49, ARNDIV=50, ARNEQ=51, ARNGT=52, ARNOR=53, 
		ARNAND=54, ARNIF1=55, ARNIF2=56, ARNIF3=57, ARNWHILE1=58, ARNWHILE2=59, 
		ARBOOL=60, StringLiteral=61, WS=62;
	public static final int
		RULE_prog = 0, RULE_funcDef = 1, RULE_params = 2, RULE_funcBody = 3, RULE_com = 4, 
		RULE_exp = 5, RULE_arnoldCProg = 6, RULE_arnoldCCom = 7, RULE_arnoldCOps = 8, 
		RULE_arnoldCexp = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "funcDef", "params", "funcBody", "com", "exp", "arnoldCProg", 
			"arnoldCCom", "arnoldCOps", "arnoldCexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", "'|'", "'=='", "'!='", 
			"'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", "'else'", "'while'", 
			"'skip'", "'='", "'out'", "'fun'", "'return'", "'global'", "'nd'", "'('", 
			"')'", "'{'", "'}'", "'$'", "';'", "','", "'.g'", null, "'TALK TO THE HAND'", 
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
			"COMMA", "DOTG", "ID", "ARNPRINT", "ARNDECLR1", "ARNDECLR2", "ARNASSIGN1", 
			"ARNASSIGN2", "ARNASSIGN3", "ARNPLUS", "ARNMIN", "ARNMULT", "ARNDIV", 
			"ARNEQ", "ARNGT", "ARNOR", "ARNAND", "ARNIF1", "ARNIF2", "ARNIF3", "ARNWHILE1", 
			"ARNWHILE2", "ARBOOL", "StringLiteral", "WS"
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(20);
				funcDef();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			com(0);
			setState(27);
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
			setState(29);
			match(FUN);
			setState(30);
			match(ID);
			setState(31);
			match(LPAR);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(32);
				params();
				}
			}

			setState(35);
			match(RPAR);
			setState(36);
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
			setState(38);
			match(ID);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(39);
				match(COMMA);
				setState(40);
				match(ID);
				}
				}
				setState(45);
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
			setState(46);
			match(LBRACE);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1190967377960L) != 0)) {
				{
				setState(47);
				com(0);
				setState(48);
				match(SEMICOLON);
				}
			}

			setState(52);
			match(RETURN);
			setState(53);
			exp(0);
			setState(54);
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
	public static class GlobalDeclareContext extends ComContext {
		public TerminalNode GLOBAL() { return getToken(ImpParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GlobalDeclareContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitGlobalDeclare(this);
			else return visitor.visitChildren(this);
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
	public static class ExpCmdContext extends ComContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpCmdContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitExpCmd(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_com, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				match(IF);
				setState(58);
				match(LPAR);
				setState(59);
				exp(0);
				setState(60);
				match(RPAR);
				setState(61);
				match(THEN);
				setState(62);
				match(LBRACE);
				setState(63);
				com(0);
				setState(64);
				match(RBRACE);
				setState(65);
				match(ELSE);
				setState(66);
				match(LBRACE);
				setState(67);
				com(0);
				setState(68);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(ID);
				setState(71);
				match(ASSIGN);
				setState(72);
				exp(0);
				}
				break;
			case 3:
				{
				_localctx = new GlobalDeclareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(GLOBAL);
				setState(74);
				match(ID);
				setState(75);
				match(ASSIGN);
				setState(76);
				exp(0);
				}
				break;
			case 4:
				{
				_localctx = new GlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(ID);
				setState(78);
				match(DOTG);
				setState(79);
				match(ASSIGN);
				setState(80);
				exp(0);
				}
				break;
			case 5:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(SKIPP);
				}
				break;
			case 6:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(WHILE);
				setState(83);
				match(LPAR);
				setState(84);
				exp(0);
				setState(85);
				match(RPAR);
				setState(86);
				match(LBRACE);
				setState(87);
				com(0);
				setState(88);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(OUT);
				setState(91);
				match(LPAR);
				setState(92);
				exp(0);
				setState(93);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new NdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(LBRACE);
				setState(96);
				com(0);
				setState(97);
				match(RBRACE);
				setState(98);
				match(ND);
				setState(99);
				match(LBRACE);
				setState(100);
				com(0);
				setState(101);
				match(RBRACE);
				}
				break;
			case 9:
				{
				_localctx = new ArnoldBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(DOLLAR);
				setState(104);
				match(LBRACE);
				setState(105);
				arnoldCProg();
				setState(106);
				match(RBRACE);
				setState(107);
				match(DOLLAR);
				}
				break;
			case 10:
				{
				_localctx = new ExpCmdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				exp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(112);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(113);
					match(SEMICOLON);
					setState(114);
					com(7);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(LPAR);
				setState(124);
				exp(0);
				setState(125);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(NOT);
				setState(128);
				exp(9);
				}
				break;
			case 5:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(ID);
				setState(130);
				match(LPAR);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1103807643688L) != 0)) {
					{
					setState(131);
					exp(0);
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(132);
						match(COMMA);
						setState(133);
						exp(0);
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(141);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new GlobalIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(ID);
				setState(143);
				match(DOTG);
				}
				break;
			case 7:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(147);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(148);
						match(POW);
						setState(149);
						exp(10);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(150);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(151);
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
						setState(152);
						exp(9);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(154);
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
						setState(155);
						exp(8);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
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
						setState(158);
						exp(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
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
						setState(161);
						exp(6);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
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
						setState(164);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 12, RULE_arnoldCProg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__0);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 324283362426486784L) != 0)) {
				{
				{
				setState(171);
				arnoldCCom();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
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
		enterRule(_localctx, 14, RULE_arnoldCCom);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNPRINT:
				_localctx = new ArnoldCprintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(ARNPRINT);
				setState(180);
				arnoldCexp();
				}
				break;
			case ARNDECLR1:
				_localctx = new ArnoldCdeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ARNDECLR1);
				setState(182);
				match(ID);
				setState(183);
				match(ARNDECLR2);
				setState(184);
				arnoldCexp();
				}
				break;
			case ARNASSIGN1:
				_localctx = new ArnoldCassignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(ARNASSIGN1);
				setState(186);
				match(ID);
				setState(187);
				match(ARNASSIGN2);
				setState(188);
				arnoldCexp();
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(189);
					arnoldCOps();
					}
					}
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35888059530608640L) != 0) );
				setState(194);
				match(ARNASSIGN3);
				}
				break;
			case ARNIF1:
				_localctx = new ArnoldCifelseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(ARNIF1);
				setState(197);
				arnoldCexp();
				setState(198);
				arnoldCCom();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARNIF2) {
					{
					setState(199);
					match(ARNIF2);
					setState(200);
					arnoldCCom();
					}
				}

				setState(203);
				match(ARNIF3);
				}
				break;
			case ARNWHILE1:
				_localctx = new ArnoldCwhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(ARNWHILE1);
				setState(206);
				arnoldCexp();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 324283362426486784L) != 0)) {
					{
					{
					setState(207);
					arnoldCCom();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
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
		enterRule(_localctx, 16, RULE_arnoldCOps);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNPLUS:
			case ARNMIN:
			case ARNMULT:
			case ARNDIV:
				_localctx = new ArnoldCArithmeticOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((ArnoldCArithmeticOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2111062325329920L) != 0)) ) {
					((ArnoldCArithmeticOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
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
				setState(219);
				((ArnoldCLogicalOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33776997205278720L) != 0)) ) {
					((ArnoldCLogicalOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
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
		enterRule(_localctx, 18, RULE_arnoldCexp);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				_localctx = new ArnoldCstringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(StringLiteral);
				}
				break;
			case ARBOOL:
				_localctx = new ArnoldCboolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(ARBOOL);
				}
				break;
			case FLOAT:
				_localctx = new ArnoldCfloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(FLOAT);
				}
				break;
			case ID:
				_localctx = new ArnoldCidContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
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
		case 4:
			return com_sempred((ComContext)_localctx, predIndex);
		case 5:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
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
		"\u0004\u0001>\u00e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"*\b\u0002\n\u0002\f\u0002-\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00033\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004o\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004t\b\u0004\n\u0004\f\u0004w\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0087\b\u0005\n\u0005\f\u0005\u008a\t\u0005\u0003\u0005\u008c"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0092"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00a6\b\u0005\n\u0005\f\u0005\u00a9\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00ad\b\u0006\n\u0006\f\u0006\u00b0\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u00bf\b\u0007\u000b\u0007\f\u0007\u00c0\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00ca\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00d1\b\u0007\n\u0007\f\u0007\u00d4\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00d8\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00de\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e4\b\t"+
		"\u0001\t\u0000\u0002\b\n\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0000\u0007\u0001\u0000\b\n\u0001\u0000\u0006\u0007\u0001\u0000\u0010"+
		"\u0013\u0001\u0000\u000e\u000f\u0001\u0000\f\r\u0001\u0000/2\u0001\u0000"+
		"36\u0103\u0000\u0017\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004&\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b"+
		"n\u0001\u0000\u0000\u0000\n\u0091\u0001\u0000\u0000\u0000\f\u00aa\u0001"+
		"\u0000\u0000\u0000\u000e\u00d7\u0001\u0000\u0000\u0000\u0010\u00dd\u0001"+
		"\u0000\u0000\u0000\u0012\u00e3\u0001\u0000\u0000\u0000\u0014\u0016\u0003"+
		"\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0003\b\u0004\u0000\u001b\u001c\u0005\u0000"+
		"\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u001c"+
		"\u0000\u0000\u001e\u001f\u0005(\u0000\u0000\u001f!\u0005 \u0000\u0000"+
		" \"\u0003\u0004\u0002\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\u0005!\u0000\u0000$%\u0003\u0006\u0003"+
		"\u0000%\u0003\u0001\u0000\u0000\u0000&+\u0005(\u0000\u0000\'(\u0005&\u0000"+
		"\u0000(*\u0005(\u0000\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0005\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.2\u0005\"\u0000\u0000/0\u0003"+
		"\b\u0004\u000001\u0005%\u0000\u000013\u0001\u0000\u0000\u00002/\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0005\u001d\u0000\u000056\u0003\n\u0005\u000067\u0005#\u0000\u0000"+
		"7\u0007\u0001\u0000\u0000\u000089\u0006\u0004\uffff\uffff\u00009:\u0005"+
		"\u0015\u0000\u0000:;\u0005 \u0000\u0000;<\u0003\n\u0005\u0000<=\u0005"+
		"!\u0000\u0000=>\u0005\u0016\u0000\u0000>?\u0005\"\u0000\u0000?@\u0003"+
		"\b\u0004\u0000@A\u0005#\u0000\u0000AB\u0005\u0017\u0000\u0000BC\u0005"+
		"\"\u0000\u0000CD\u0003\b\u0004\u0000DE\u0005#\u0000\u0000Eo\u0001\u0000"+
		"\u0000\u0000FG\u0005(\u0000\u0000GH\u0005\u001a\u0000\u0000Ho\u0003\n"+
		"\u0005\u0000IJ\u0005\u001e\u0000\u0000JK\u0005(\u0000\u0000KL\u0005\u001a"+
		"\u0000\u0000Lo\u0003\n\u0005\u0000MN\u0005(\u0000\u0000NO\u0005\'\u0000"+
		"\u0000OP\u0005\u001a\u0000\u0000Po\u0003\n\u0005\u0000Qo\u0005\u0019\u0000"+
		"\u0000RS\u0005\u0018\u0000\u0000ST\u0005 \u0000\u0000TU\u0003\n\u0005"+
		"\u0000UV\u0005!\u0000\u0000VW\u0005\"\u0000\u0000WX\u0003\b\u0004\u0000"+
		"XY\u0005#\u0000\u0000Yo\u0001\u0000\u0000\u0000Z[\u0005\u001b\u0000\u0000"+
		"[\\\u0005 \u0000\u0000\\]\u0003\n\u0005\u0000]^\u0005!\u0000\u0000^o\u0001"+
		"\u0000\u0000\u0000_`\u0005\"\u0000\u0000`a\u0003\b\u0004\u0000ab\u0005"+
		"#\u0000\u0000bc\u0005\u001f\u0000\u0000cd\u0005\"\u0000\u0000de\u0003"+
		"\b\u0004\u0000ef\u0005#\u0000\u0000fo\u0001\u0000\u0000\u0000gh\u0005"+
		"$\u0000\u0000hi\u0005\"\u0000\u0000ij\u0003\f\u0006\u0000jk\u0005#\u0000"+
		"\u0000kl\u0005$\u0000\u0000lo\u0001\u0000\u0000\u0000mo\u0003\n\u0005"+
		"\u0000n8\u0001\u0000\u0000\u0000nF\u0001\u0000\u0000\u0000nI\u0001\u0000"+
		"\u0000\u0000nM\u0001\u0000\u0000\u0000nQ\u0001\u0000\u0000\u0000nR\u0001"+
		"\u0000\u0000\u0000nZ\u0001\u0000\u0000\u0000n_\u0001\u0000\u0000\u0000"+
		"ng\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000ou\u0001\u0000\u0000"+
		"\u0000pq\n\u0006\u0000\u0000qr\u0005%\u0000\u0000rt\u0003\b\u0004\u0007"+
		"sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v\t\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0006\u0005\uffff\uffff\u0000y\u0092\u0005\u0003\u0000"+
		"\u0000z\u0092\u0005\u0005\u0000\u0000{|\u0005 \u0000\u0000|}\u0003\n\u0005"+
		"\u0000}~\u0005!\u0000\u0000~\u0092\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0014\u0000\u0000\u0080\u0092\u0003\n\u0005\t\u0081\u0082\u0005"+
		"(\u0000\u0000\u0082\u008b\u0005 \u0000\u0000\u0083\u0088\u0003\n\u0005"+
		"\u0000\u0084\u0085\u0005&\u0000\u0000\u0085\u0087\u0003\n\u0005\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0092\u0005!\u0000\u0000\u008e"+
		"\u008f\u0005(\u0000\u0000\u008f\u0092\u0005\'\u0000\u0000\u0090\u0092"+
		"\u0005(\u0000\u0000\u0091x\u0001\u0000\u0000\u0000\u0091z\u0001\u0000"+
		"\u0000\u0000\u0091{\u0001\u0000\u0000\u0000\u0091\u007f\u0001\u0000\u0000"+
		"\u0000\u0091\u0081\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u00a7\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\n\n\u0000\u0000\u0094\u0095\u0005\u000b\u0000\u0000"+
		"\u0095\u00a6\u0003\n\u0005\n\u0096\u0097\n\b\u0000\u0000\u0097\u0098\u0007"+
		"\u0000\u0000\u0000\u0098\u00a6\u0003\n\u0005\t\u0099\u009a\n\u0007\u0000"+
		"\u0000\u009a\u009b\u0007\u0001\u0000\u0000\u009b\u00a6\u0003\n\u0005\b"+
		"\u009c\u009d\n\u0006\u0000\u0000\u009d\u009e\u0007\u0002\u0000\u0000\u009e"+
		"\u00a6\u0003\n\u0005\u0007\u009f\u00a0\n\u0005\u0000\u0000\u00a0\u00a1"+
		"\u0007\u0003\u0000\u0000\u00a1\u00a6\u0003\n\u0005\u0006\u00a2\u00a3\n"+
		"\u0004\u0000\u0000\u00a3\u00a4\u0007\u0004\u0000\u0000\u00a4\u00a6\u0003"+
		"\n\u0005\u0005\u00a5\u0093\u0001\u0000\u0000\u0000\u00a5\u0096\u0001\u0000"+
		"\u0000\u0000\u00a5\u0099\u0001\u0000\u0000\u0000\u00a5\u009c\u0001\u0000"+
		"\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u000b\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ae\u0005\u0001"+
		"\u0000\u0000\u00ab\u00ad\u0003\u000e\u0007\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0002"+
		"\u0000\u0000\u00b2\r\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005)\u0000"+
		"\u0000\u00b4\u00d8\u0003\u0012\t\u0000\u00b5\u00b6\u0005*\u0000\u0000"+
		"\u00b6\u00b7\u0005(\u0000\u0000\u00b7\u00b8\u0005+\u0000\u0000\u00b8\u00d8"+
		"\u0003\u0012\t\u0000\u00b9\u00ba\u0005,\u0000\u0000\u00ba\u00bb\u0005"+
		"(\u0000\u0000\u00bb\u00bc\u0005-\u0000\u0000\u00bc\u00be\u0003\u0012\t"+
		"\u0000\u00bd\u00bf\u0003\u0010\b\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005.\u0000\u0000\u00c3\u00d8\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u00057\u0000\u0000\u00c5\u00c6\u0003\u0012\t\u0000\u00c6\u00c9"+
		"\u0003\u000e\u0007\u0000\u00c7\u00c8\u00058\u0000\u0000\u00c8\u00ca\u0003"+
		"\u000e\u0007\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"9\u0000\u0000\u00cc\u00d8\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005:\u0000"+
		"\u0000\u00ce\u00d2\u0003\u0012\t\u0000\u00cf\u00d1\u0003\u000e\u0007\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005;\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7"+
		"\u00b3\u0001\u0000\u0000\u0000\u00d7\u00b5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00b9\u0001\u0000\u0000\u0000\u00d7\u00c4\u0001\u0000\u0000\u0000\u00d7"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d8\u000f\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0007\u0005\u0000\u0000\u00da\u00de\u0003\u0012\t\u0000\u00db\u00dc"+
		"\u0007\u0006\u0000\u0000\u00dc\u00de\u0003\u0012\t\u0000\u00dd\u00d9\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u0011\u0001"+
		"\u0000\u0000\u0000\u00df\u00e4\u0005=\u0000\u0000\u00e0\u00e4\u0005<\u0000"+
		"\u0000\u00e1\u00e4\u0005\u0004\u0000\u0000\u00e2\u00e4\u0005(\u0000\u0000"+
		"\u00e3\u00df\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u0013\u0001\u0000\u0000\u0000\u0012\u0017!+2nu\u0088\u008b\u0091"+
		"\u00a5\u00a7\u00ae\u00c0\u00c9\u00d2\u00d7\u00dd\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}