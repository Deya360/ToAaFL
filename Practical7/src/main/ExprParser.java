// Generated from Expr.g by ANTLR 4.7.2
package main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, NUM=9, RONE=10, 
		RFIVE=11, RTEN=12, WHITESPACE=13, EQUALS=14, ADD=15, SUB=16, MUL=17, DIV=18, 
		LTHAN=19, GTHAN=20, LTHANEQU=21, GTHANEQU=22, ISEQUAL=23;
	public static final int
		RULE_statment = 0, RULE_command = 1, RULE_condition = 2, RULE_mprint = 3, 
		RULE_assign = 4, RULE_expr = 5, RULE_exprnor = 6, RULE_exprid = 7, RULE_idgrp = 8, 
		RULE_numbergrp = 9, RULE_roman = 10, RULE_oper = 11, RULE_cmp = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"statment", "command", "condition", "mprint", "assign", "expr", "exprnor", 
			"exprid", "idgrp", "numbergrp", "roman", "oper", "cmp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DO'", "'do'", "'WHILE'", "'while'", "';'", "'PRINT'", "'print'", 
			null, null, "'I'", "'V'", "'X'", "' '", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'<'", "'>'", "'<='", "'>='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "NUM", "RONE", 
			"RFIVE", "RTEN", "WHITESPACE", "EQUALS", "ADD", "SUB", "MUL", "DIV", 
			"LTHAN", "GTHAN", "LTHANEQU", "GTHANEQU", "ISEQUAL"
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
	public String getGrammarFileName() { return "Expr.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatmentContext extends ParserRuleContext {
		public CommandContext command;
		public List<CommandContext> cmd = new ArrayList<CommandContext>();
		public ConditionContext cond;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(28); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(27);
					((StatmentContext)_localctx).command = command();
					((StatmentContext)_localctx).cmd.add(((StatmentContext)_localctx).command);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(33);
			((StatmentContext)_localctx).cond = condition();
			setState(34);
			match(T__4);
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

	public static class CommandContext extends ParserRuleContext {
		public ExprContext ex;
		public MprintContext pr;
		public AssignContext as;
		public StatmentContext st;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MprintContext mprint() {
			return getRuleContext(MprintContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				((CommandContext)_localctx).ex = expr(0);
				setState(37);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((CommandContext)_localctx).pr = mprint();
				setState(40);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				((CommandContext)_localctx).as = assign();
				setState(43);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				((CommandContext)_localctx).st = statment();
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext l;
		public CmpContext co;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((ConditionContext)_localctx).l = expr(0);
			setState(49);
			((ConditionContext)_localctx).co = cmp();
			setState(50);
			((ConditionContext)_localctx).r = expr(0);
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

	public static class MprintContext extends ParserRuleContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MprintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mprint; }
	}

	public final MprintContext mprint() throws RecognitionException {
		MprintContext _localctx = new MprintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mprint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
			((MprintContext)_localctx).ex = expr(0);
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

	public static class AssignContext extends ParserRuleContext {
		public ExprContext l;
		public ExprContext r;
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((AssignContext)_localctx).l = expr(0);
			setState(56);
			match(EQUALS);
			setState(57);
			((AssignContext)_localctx).r = expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext l;
		public ExpridContext ei;
		public ExprnorContext ex;
		public IdgrpContext id;
		public OperContext op;
		public ExprContext r;
		public ExpridContext exprid() {
			return getRuleContext(ExpridContext.class,0);
		}
		public ExprnorContext exprnor() {
			return getRuleContext(ExprnorContext.class,0);
		}
		public IdgrpContext idgrp() {
			return getRuleContext(IdgrpContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(60);
				((ExprContext)_localctx).ei = exprid();
				}
				break;
			case 2:
				{
				setState(61);
				((ExprContext)_localctx).ex = exprnor();
				}
				break;
			case 3:
				{
				setState(62);
				((ExprContext)_localctx).id = idgrp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(65);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(66);
					((ExprContext)_localctx).op = oper();
					setState(67);
					((ExprContext)_localctx).r = expr(2);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ExprnorContext extends ParserRuleContext {
		public IdgrpContext l;
		public OperContext op;
		public IdgrpContext r;
		public List<IdgrpContext> idgrp() {
			return getRuleContexts(IdgrpContext.class);
		}
		public IdgrpContext idgrp(int i) {
			return getRuleContext(IdgrpContext.class,i);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public ExprnorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprnor; }
	}

	public final ExprnorContext exprnor() throws RecognitionException {
		ExprnorContext _localctx = new ExprnorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprnor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((ExprnorContext)_localctx).l = idgrp();
			setState(75);
			((ExprnorContext)_localctx).op = oper();
			setState(76);
			((ExprnorContext)_localctx).r = idgrp();
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

	public static class ExpridContext extends ParserRuleContext {
		public Token id;
		public OperContext op;
		public IdgrpContext r;
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public IdgrpContext idgrp() {
			return getRuleContext(IdgrpContext.class,0);
		}
		public ExpridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprid; }
	}

	public final ExpridContext exprid() throws RecognitionException {
		ExpridContext _localctx = new ExpridContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((ExpridContext)_localctx).id = match(ID);
			setState(79);
			((ExpridContext)_localctx).op = oper();
			setState(80);
			((ExpridContext)_localctx).r = idgrp();
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

	public static class IdgrpContext extends ParserRuleContext {
		public Token i;
		public NumbergrpContext n;
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public NumbergrpContext numbergrp() {
			return getRuleContext(NumbergrpContext.class,0);
		}
		public IdgrpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idgrp; }
	}

	public final IdgrpContext idgrp() throws RecognitionException {
		IdgrpContext _localctx = new IdgrpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_idgrp);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((IdgrpContext)_localctx).i = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				((IdgrpContext)_localctx).n = numbergrp();
				}
				break;
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

	public static class NumbergrpContext extends ParserRuleContext {
		public Token n1;
		public RomanContext n2;
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public RomanContext roman() {
			return getRuleContext(RomanContext.class,0);
		}
		public NumbergrpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbergrp; }
	}

	public final NumbergrpContext numbergrp() throws RecognitionException {
		NumbergrpContext _localctx = new NumbergrpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numbergrp);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((NumbergrpContext)_localctx).n1 = match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((NumbergrpContext)_localctx).n2 = roman();
				}
				break;
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

	public static class RomanContext extends ParserRuleContext {
		public List<TerminalNode> RTEN() { return getTokens(ExprParser.RTEN); }
		public TerminalNode RTEN(int i) {
			return getToken(ExprParser.RTEN, i);
		}
		public List<TerminalNode> RONE() { return getTokens(ExprParser.RONE); }
		public TerminalNode RONE(int i) {
			return getToken(ExprParser.RONE, i);
		}
		public TerminalNode RFIVE() { return getToken(ExprParser.RFIVE, 0); }
		public RomanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roman; }
	}

	public final RomanContext roman() throws RecognitionException {
		RomanContext _localctx = new RomanContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_roman);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(91);
				match(RTEN);
				}
				break;
			case 3:
				{
				setState(92);
				match(RTEN);
				setState(93);
				match(RTEN);
				}
				break;
			case 4:
				{
				setState(94);
				match(RTEN);
				setState(95);
				match(RTEN);
				setState(96);
				match(RTEN);
				}
				break;
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(99);
				match(RONE);
				setState(100);
				match(RTEN);
				}
				break;
			case 2:
				{
				setState(101);
				match(RONE);
				setState(102);
				match(RFIVE);
				}
				break;
			case 3:
				{
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(103);
					match(RFIVE);
					}
					break;
				}
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					{
					setState(107);
					match(RONE);
					}
					break;
				case 3:
					{
					setState(108);
					match(RONE);
					setState(109);
					match(RONE);
					}
					break;
				case 4:
					{
					setState(110);
					match(RONE);
					setState(111);
					match(RONE);
					setState(112);
					match(RONE);
					}
					break;
				}
				}
				break;
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

	public static class OperContext extends ParserRuleContext {
		public Token ADD;
		public List<Token> t = new ArrayList<Token>();
		public Token SUB;
		public Token MUL;
		public Token DIV;
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_oper);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((OperContext)_localctx).ADD = match(ADD);
				((OperContext)_localctx).t.add(((OperContext)_localctx).ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((OperContext)_localctx).SUB = match(SUB);
				((OperContext)_localctx).t.add(((OperContext)_localctx).SUB);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				((OperContext)_localctx).MUL = match(MUL);
				((OperContext)_localctx).t.add(((OperContext)_localctx).MUL);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				((OperContext)_localctx).DIV = match(DIV);
				((OperContext)_localctx).t.add(((OperContext)_localctx).DIV);
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

	public static class CmpContext extends ParserRuleContext {
		public Token LTHAN;
		public List<Token> t = new ArrayList<Token>();
		public Token GTHAN;
		public Token LTHANEQU;
		public Token GTHANEQU;
		public Token ISEQUAL;
		public TerminalNode LTHAN() { return getToken(ExprParser.LTHAN, 0); }
		public TerminalNode GTHAN() { return getToken(ExprParser.GTHAN, 0); }
		public TerminalNode LTHANEQU() { return getToken(ExprParser.LTHANEQU, 0); }
		public TerminalNode GTHANEQU() { return getToken(ExprParser.GTHANEQU, 0); }
		public TerminalNode ISEQUAL() { return getToken(ExprParser.ISEQUAL, 0); }
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmp);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				((CmpContext)_localctx).LTHAN = match(LTHAN);
				((CmpContext)_localctx).t.add(((CmpContext)_localctx).LTHAN);
				}
				break;
			case GTHAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				((CmpContext)_localctx).GTHAN = match(GTHAN);
				((CmpContext)_localctx).t.add(((CmpContext)_localctx).GTHAN);
				}
				break;
			case LTHANEQU:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				((CmpContext)_localctx).LTHANEQU = match(LTHANEQU);
				((CmpContext)_localctx).t.add(((CmpContext)_localctx).LTHANEQU);
				}
				break;
			case GTHANEQU:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				((CmpContext)_localctx).GTHANEQU = match(GTHANEQU);
				((CmpContext)_localctx).t.add(((CmpContext)_localctx).GTHANEQU);
				}
				break;
			case ISEQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				((CmpContext)_localctx).ISEQUAL = match(ISEQUAL);
				((CmpContext)_localctx).t.add(((CmpContext)_localctx).ISEQUAL);
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
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7B\n\7\3\7\3\7\3\7"+
		"\3\7\7\7H\n\7\f\7\16\7K\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5"+
		"\nW\n\n\3\13\3\13\5\13[\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fd\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\fk\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\ft\n\f\5\fv\n"+
		"\f\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0083\n\16\3"+
		"\16\2\3\f\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\3\4\3\2\5\6\3\2"+
		"\b\t\2\u0090\2\34\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b\66\3\2\2\2\n9\3"+
		"\2\2\2\fA\3\2\2\2\16L\3\2\2\2\20P\3\2\2\2\22V\3\2\2\2\24Z\3\2\2\2\26c"+
		"\3\2\2\2\30{\3\2\2\2\32\u0082\3\2\2\2\34\36\t\2\2\2\35\37\5\4\3\2\36\35"+
		"\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\t\3\2\2#$\5\6"+
		"\4\2$%\7\7\2\2%\3\3\2\2\2&\'\5\f\7\2\'(\7\7\2\2(\61\3\2\2\2)*\5\b\5\2"+
		"*+\7\7\2\2+\61\3\2\2\2,-\5\n\6\2-.\7\7\2\2.\61\3\2\2\2/\61\5\2\2\2\60"+
		"&\3\2\2\2\60)\3\2\2\2\60,\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\63\5\f\7"+
		"\2\63\64\5\32\16\2\64\65\5\f\7\2\65\7\3\2\2\2\66\67\t\4\2\2\678\5\f\7"+
		"\28\t\3\2\2\29:\5\f\7\2:;\7\20\2\2;<\5\f\7\2<\13\3\2\2\2=>\b\7\1\2>B\5"+
		"\20\t\2?B\5\16\b\2@B\5\22\n\2A=\3\2\2\2A?\3\2\2\2A@\3\2\2\2BI\3\2\2\2"+
		"CD\f\3\2\2DE\5\30\r\2EF\5\f\7\4FH\3\2\2\2GC\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2J\r\3\2\2\2KI\3\2\2\2LM\5\22\n\2MN\5\30\r\2NO\5\22\n\2O\17"+
		"\3\2\2\2PQ\7\n\2\2QR\5\30\r\2RS\5\22\n\2S\21\3\2\2\2TW\7\n\2\2UW\5\24"+
		"\13\2VT\3\2\2\2VU\3\2\2\2W\23\3\2\2\2X[\7\13\2\2Y[\5\26\f\2ZX\3\2\2\2"+
		"ZY\3\2\2\2[\25\3\2\2\2\\d\3\2\2\2]d\7\16\2\2^_\7\16\2\2_d\7\16\2\2`a\7"+
		"\16\2\2ab\7\16\2\2bd\7\16\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c`\3\2\2\2"+
		"du\3\2\2\2ef\7\f\2\2fv\7\16\2\2gh\7\f\2\2hv\7\r\2\2ik\7\r\2\2ji\3\2\2"+
		"\2jk\3\2\2\2ks\3\2\2\2lt\3\2\2\2mt\7\f\2\2no\7\f\2\2ot\7\f\2\2pq\7\f\2"+
		"\2qr\7\f\2\2rt\7\f\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2sp\3\2\2\2tv\3\2\2"+
		"\2ue\3\2\2\2ug\3\2\2\2uj\3\2\2\2v\27\3\2\2\2w|\7\21\2\2x|\7\22\2\2y|\7"+
		"\23\2\2z|\7\24\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\31\3\2\2\2"+
		"}\u0083\7\25\2\2~\u0083\7\26\2\2\177\u0083\7\27\2\2\u0080\u0083\7\30\2"+
		"\2\u0081\u0083\7\31\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\33\3\2\2\2\16 \60AIV"+
		"Zcjsu{\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}