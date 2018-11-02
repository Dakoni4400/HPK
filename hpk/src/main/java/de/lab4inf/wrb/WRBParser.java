// Generated from de/lab4inf/wrb/WRB.g4 by ANTLR 4.7
package de.lab4inf.wrb;

	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WRBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ABS=2, ACOS=3, ASIN=4, ATAN=5, ATAN2=6, CBRT=7, CEIL=8, COS=9, 
		COSH=10, EXP=11, EXPM1=12, FLOOR=13, FLOORDIV=14, FLOORMOD=15, HYPOD=16, 
		LN=17, LOG=18, LOGE=19, LOG10=20, LOG2=21, LB=22, LD=23, LOG1P=24, MAX=25, 
		MIN=26, POWFUNC=27, RINT=28, ROUND=29, SCALB=30, SIGNUM=31, SIN=32, SINH=33, 
		SQRT=34, TAN=35, TANH=36, SCI_NO=37, DIGIT=38, ID=39, ADD=40, MUL=41, 
		DIV=42, SUB=43, POW=44, BRACKET_BEGIN=45, BRACKET_END=46, ASSIGN=47, END=48, 
		NEWLINE=49, WS=50;
	public static final int
		RULE_run = 0, RULE_statement = 1, RULE_expr = 2, RULE_exprAdd = 3, RULE_exprSub = 4, 
		RULE_term = 5, RULE_termMul = 6, RULE_termDiv = 7, RULE_factor = 8, RULE_pow = 9, 
		RULE_signedAtom = 10, RULE_atom = 11, RULE_function = 12, RULE_mathFunction = 13, 
		RULE_min = 14, RULE_max = 15, RULE_evalUserFunc = 16, RULE_evalParams = 17, 
		RULE_assignFunc = 18, RULE_params = 19, RULE_userFunction = 20, RULE_assignVar = 21;
	public static final String[] ruleNames = {
		"run", "statement", "expr", "exprAdd", "exprSub", "term", "termMul", "termDiv", 
		"factor", "pow", "signedAtom", "atom", "function", "mathFunction", "min", 
		"max", "evalUserFunc", "evalParams", "assignFunc", "params", "userFunction", 
		"assignVar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'+'", "'*'", "'/'", "'-'", null, "'('", "')'", 
		"'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ABS", "ACOS", "ASIN", "ATAN", "ATAN2", "CBRT", "CEIL", "COS", 
		"COSH", "EXP", "EXPM1", "FLOOR", "FLOORDIV", "FLOORMOD", "HYPOD", "LN", 
		"LOG", "LOGE", "LOG10", "LOG2", "LB", "LD", "LOG1P", "MAX", "MIN", "POWFUNC", 
		"RINT", "ROUND", "SCALB", "SIGNUM", "SIN", "SINH", "SQRT", "TAN", "TANH", 
		"SCI_NO", "DIGIT", "ID", "ADD", "MUL", "DIV", "SUB", "POW", "BRACKET_BEGIN", 
		"BRACKET_END", "ASSIGN", "END", "NEWLINE", "WS"
	};
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
	public String getGrammarFileName() { return "WRB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		java.util.HashMap<String, Double> varMemory = new java.util.HashMap<String, Double>();

	public WRBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RunContext extends ParserRuleContext {
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_run);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				((RunContext)_localctx).s = statement();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << CBRT) | (1L << CEIL) | (1L << COS) | (1L << COSH) | (1L << EXP) | (1L << EXPM1) | (1L << FLOOR) | (1L << LN) | (1L << LOG) | (1L << LOGE) | (1L << LOG10) | (1L << LOG2) | (1L << LB) | (1L << LD) | (1L << MAX) | (1L << MIN) | (1L << POWFUNC) | (1L << RINT) | (1L << ROUND) | (1L << SIGNUM) | (1L << SIN) | (1L << SINH) | (1L << SQRT) | (1L << TAN) | (1L << TANH) | (1L << SCI_NO) | (1L << ID) | (1L << ADD) | (1L << SUB) | (1L << BRACKET_BEGIN))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public double v;
		public ExprContext exp;
		public AssignVarContext a;
		public AssignFuncContext f;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(WRBParser.NEWLINE, 0); }
		public TerminalNode END() { return getToken(WRBParser.END, 0); }
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
		}
		public AssignFuncContext assignFunc() {
			return getRuleContext(AssignFuncContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((StatementContext)_localctx).exp = expr(0);
				setState(50);
				_la = _input.LA(1);
				if ( !(_la==END || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((StatementContext)_localctx).v =  ((StatementContext)_localctx).exp.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((StatementContext)_localctx).a = assignVar();
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==END || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((StatementContext)_localctx).v =  ((StatementContext)_localctx).a.v;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				((StatementContext)_localctx).f = assignFunc();
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==END || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((StatementContext)_localctx).v =  ((StatementContext)_localctx).f.v;
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

	public static class ExprContext extends ParserRuleContext {
		public double v;
		public ExprContext t1;
		public TermContext t;
		public ExprAddContext a;
		public ExprSubContext s;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EvalUserFuncContext evalUserFunc() {
			return getRuleContext(EvalUserFuncContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprAddContext exprAdd() {
			return getRuleContext(ExprAddContext.class,0);
		}
		public ExprSubContext exprSub() {
			return getRuleContext(ExprSubContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(64);
				((ExprContext)_localctx).t = term(0);
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).t.v;
				}
				break;
			case 2:
				{
				setState(67);
				evalUserFunc();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(71);
						((ExprContext)_localctx).a = exprAdd();
						((ExprContext)_localctx).v =  ((ExprContext)_localctx).t1.v + ((ExprContext)_localctx).a.v;
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(75);
						((ExprContext)_localctx).s = exprSub();
						((ExprContext)_localctx).v =  ((ExprContext)_localctx).t1.v - ((ExprContext)_localctx).s.v;
						}
						break;
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ExprAddContext extends ParserRuleContext {
		public double v;
		public TermContext t;
		public TerminalNode ADD() { return getToken(WRBParser.ADD, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAddContext exprAdd() throws RecognitionException {
		ExprAddContext _localctx = new ExprAddContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ADD);
			setState(84);
			((ExprAddContext)_localctx).t = term(0);
			((ExprAddContext)_localctx).v =  ((ExprAddContext)_localctx).t.v;
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

	public static class ExprSubContext extends ParserRuleContext {
		public double v;
		public TermContext t;
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterExprSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitExprSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitExprSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSubContext exprSub() throws RecognitionException {
		ExprSubContext _localctx = new ExprSubContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SUB);
			setState(88);
			((ExprSubContext)_localctx).t = term(0);
			((ExprSubContext)_localctx).v =  ((ExprSubContext)_localctx).t.v;
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

	public static class TermContext extends ParserRuleContext {
		public double v;
		public TermContext f1;
		public FactorContext f;
		public TermMulContext m;
		public TermDivContext d;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermMulContext termMul() {
			return getRuleContext(TermMulContext.class,0);
		}
		public TermDivContext termDiv() {
			return getRuleContext(TermDivContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(92);
			((TermContext)_localctx).f = factor();
			((TermContext)_localctx).v =  ((TermContext)_localctx).f.v;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(95);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(96);
						((TermContext)_localctx).m = termMul();
						((TermContext)_localctx).v =  ((TermContext)_localctx).f1.v * ((TermContext)_localctx).m.v;
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(99);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(100);
						((TermContext)_localctx).d = termDiv();
						((TermContext)_localctx).v =  ((TermContext)_localctx).f1.v / ((TermContext)_localctx).d.v;
						}
						break;
					}
					} 
				}
				setState(107);
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

	public static class TermMulContext extends ParserRuleContext {
		public double v;
		public FactorContext f;
		public TerminalNode MUL() { return getToken(WRBParser.MUL, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termMul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterTermMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitTermMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitTermMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermMulContext termMul() throws RecognitionException {
		TermMulContext _localctx = new TermMulContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termMul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(MUL);
			setState(109);
			((TermMulContext)_localctx).f = factor();
			((TermMulContext)_localctx).v =  ((TermMulContext)_localctx).f.v;
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

	public static class TermDivContext extends ParserRuleContext {
		public double v;
		public FactorContext f;
		public TerminalNode DIV() { return getToken(WRBParser.DIV, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterTermDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitTermDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitTermDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermDivContext termDiv() throws RecognitionException {
		TermDivContext _localctx = new TermDivContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_termDiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(DIV);
			setState(113);
			((TermDivContext)_localctx).f = factor();
			((TermDivContext)_localctx).v =  ((TermDivContext)_localctx).f.v;
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

	public static class FactorContext extends ParserRuleContext {
		public double v;
		public SignedAtomContext a;
		public SignedAtomContext b;
		public PowContext p;
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((FactorContext)_localctx).a = signedAtom();
				((FactorContext)_localctx).v =  ((FactorContext)_localctx).a.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((FactorContext)_localctx).b = signedAtom();
				setState(120);
				((FactorContext)_localctx).p = pow();
				((FactorContext)_localctx).v =  Math.pow(((FactorContext)_localctx).b.v, ((FactorContext)_localctx).p.v);
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

	public static class PowContext extends ParserRuleContext {
		public double v;
		public ExprContext e;
		public Token n;
		public PowContext p;
		public Token i;
		public TerminalNode POW() { return getToken(WRBParser.POW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCI_NO() { return getToken(WRBParser.SCI_NO, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pow);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(POW);
				setState(126);
				match(BRACKET_BEGIN);
				setState(127);
				((PowContext)_localctx).e = expr(0);
				setState(128);
				match(BRACKET_END);
				((PowContext)_localctx).v =  ((PowContext)_localctx).e.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(POW);
				setState(132);
				((PowContext)_localctx).n = match(SCI_NO);
				setState(133);
				((PowContext)_localctx).p = pow();
				((PowContext)_localctx).v =  Math.pow(Double.parseDouble((((PowContext)_localctx).n!=null?((PowContext)_localctx).n.getText():null)), ((PowContext)_localctx).p.v);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(POW);
				setState(137);
				((PowContext)_localctx).i = match(ID);
				setState(138);
				((PowContext)_localctx).p = pow();
				((PowContext)_localctx).v =  Math.pow(varMemory.get((((PowContext)_localctx).i!=null?((PowContext)_localctx).i.getText():null)), ((PowContext)_localctx).p.v);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(POW);
				setState(142);
				((PowContext)_localctx).n = match(SCI_NO);
				((PowContext)_localctx).v =  Double.parseDouble((((PowContext)_localctx).n!=null?((PowContext)_localctx).n.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(POW);
				setState(145);
				((PowContext)_localctx).i = match(ID);
				((PowContext)_localctx).v =  varMemory.get((((PowContext)_localctx).i!=null?((PowContext)_localctx).i.getText():null));
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

	public static class SignedAtomContext extends ParserRuleContext {
		public double v;
		public AtomContext a;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterSignedAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitSignedAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitSignedAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signedAtom);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(ADD);
				setState(150);
				((SignedAtomContext)_localctx).a = atom();
				((SignedAtomContext)_localctx).v =  ((SignedAtomContext)_localctx).a.v;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(SUB);
				setState(154);
				((SignedAtomContext)_localctx).a = atom();
				((SignedAtomContext)_localctx).v =  -1*((SignedAtomContext)_localctx).a.v;
				}
				break;
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CBRT:
			case CEIL:
			case COS:
			case COSH:
			case EXP:
			case EXPM1:
			case FLOOR:
			case LN:
			case LOG:
			case LOGE:
			case LOG10:
			case LOG2:
			case LB:
			case LD:
			case MAX:
			case MIN:
			case POWFUNC:
			case RINT:
			case ROUND:
			case SIGNUM:
			case SIN:
			case SINH:
			case SQRT:
			case TAN:
			case TANH:
			case SCI_NO:
			case ID:
			case BRACKET_BEGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				((SignedAtomContext)_localctx).a = atom();
				((SignedAtomContext)_localctx).v =  ((SignedAtomContext)_localctx).a.v;
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

	public static class AtomContext extends ParserRuleContext {
		public double v;
		public Token n;
		public ExprContext e;
		public FunctionContext f;
		public Token i;
		public TerminalNode SCI_NO() { return getToken(WRBParser.SCI_NO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCI_NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				((AtomContext)_localctx).n = match(SCI_NO);
				((AtomContext)_localctx).v =  Double.parseDouble((((AtomContext)_localctx).n!=null?((AtomContext)_localctx).n.getText():null));
				}
				break;
			case BRACKET_BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(BRACKET_BEGIN);
				setState(165);
				((AtomContext)_localctx).e = expr(0);
				setState(166);
				match(BRACKET_END);
				((AtomContext)_localctx).v =  ((AtomContext)_localctx).e.v;
				}
				break;
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CBRT:
			case CEIL:
			case COS:
			case COSH:
			case EXP:
			case EXPM1:
			case FLOOR:
			case LN:
			case LOG:
			case LOGE:
			case LOG10:
			case LOG2:
			case LB:
			case LD:
			case MAX:
			case MIN:
			case POWFUNC:
			case RINT:
			case ROUND:
			case SIGNUM:
			case SIN:
			case SINH:
			case SQRT:
			case TAN:
			case TANH:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				((AtomContext)_localctx).f = function();
				((AtomContext)_localctx).v =  ((AtomContext)_localctx).f.v;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				((AtomContext)_localctx).i = match(ID);
				((AtomContext)_localctx).v =  varMemory.get((((AtomContext)_localctx).i!=null?((AtomContext)_localctx).i.getText():null));
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

	public static class FunctionContext extends ParserRuleContext {
		public double v;
		public MathFunctionContext m;
		public MathFunctionContext mathFunction() {
			return getRuleContext(MathFunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((FunctionContext)_localctx).m = mathFunction();
			((FunctionContext)_localctx).v =  ((FunctionContext)_localctx).m.v;
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

	public static class MathFunctionContext extends ParserRuleContext {
		public double v;
		public ExprContext e;
		public MaxContext a;
		public MinContext i;
		public ExprContext e1;
		public ExprContext e2;
		public TerminalNode ABS() { return getToken(WRBParser.ABS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ACOS() { return getToken(WRBParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(WRBParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(WRBParser.ATAN, 0); }
		public TerminalNode CBRT() { return getToken(WRBParser.CBRT, 0); }
		public TerminalNode CEIL() { return getToken(WRBParser.CEIL, 0); }
		public TerminalNode COS() { return getToken(WRBParser.COS, 0); }
		public TerminalNode COSH() { return getToken(WRBParser.COSH, 0); }
		public TerminalNode EXP() { return getToken(WRBParser.EXP, 0); }
		public TerminalNode EXPM1() { return getToken(WRBParser.EXPM1, 0); }
		public TerminalNode FLOOR() { return getToken(WRBParser.FLOOR, 0); }
		public TerminalNode LN() { return getToken(WRBParser.LN, 0); }
		public TerminalNode LOGE() { return getToken(WRBParser.LOGE, 0); }
		public TerminalNode LOG() { return getToken(WRBParser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(WRBParser.LOG10, 0); }
		public TerminalNode LOG2() { return getToken(WRBParser.LOG2, 0); }
		public TerminalNode LD() { return getToken(WRBParser.LD, 0); }
		public TerminalNode LB() { return getToken(WRBParser.LB, 0); }
		public MaxContext max() {
			return getRuleContext(MaxContext.class,0);
		}
		public MinContext min() {
			return getRuleContext(MinContext.class,0);
		}
		public TerminalNode POWFUNC() { return getToken(WRBParser.POWFUNC, 0); }
		public TerminalNode RINT() { return getToken(WRBParser.RINT, 0); }
		public TerminalNode ROUND() { return getToken(WRBParser.ROUND, 0); }
		public TerminalNode SIGNUM() { return getToken(WRBParser.SIGNUM, 0); }
		public TerminalNode SIN() { return getToken(WRBParser.SIN, 0); }
		public TerminalNode SINH() { return getToken(WRBParser.SINH, 0); }
		public TerminalNode SQRT() { return getToken(WRBParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(WRBParser.TAN, 0); }
		public TerminalNode TANH() { return getToken(WRBParser.TANH, 0); }
		public MathFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterMathFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitMathFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitMathFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathFunctionContext mathFunction() throws RecognitionException {
		MathFunctionContext _localctx = new MathFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mathFunction);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(ABS);
				setState(180);
				match(BRACKET_BEGIN);
				setState(181);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(182);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.abs(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(ACOS);
				setState(186);
				match(BRACKET_BEGIN);
				setState(187);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(188);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.acos(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case ASIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(ASIN);
				setState(192);
				match(BRACKET_BEGIN);
				setState(193);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(194);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.asin(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case ATAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(ATAN);
				setState(198);
				match(BRACKET_BEGIN);
				setState(199);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(200);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.atan(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case CBRT:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				match(CBRT);
				setState(204);
				match(BRACKET_BEGIN);
				setState(205);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(206);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.cbrt(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case CEIL:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				match(CEIL);
				setState(210);
				match(BRACKET_BEGIN);
				setState(211);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(212);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.ceil(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				match(COS);
				setState(216);
				match(BRACKET_BEGIN);
				setState(217);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(218);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.cos(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case COSH:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				match(COSH);
				setState(222);
				match(BRACKET_BEGIN);
				setState(223);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(224);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.cosh(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 9);
				{
				setState(227);
				match(EXP);
				setState(228);
				match(BRACKET_BEGIN);
				setState(229);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(230);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.exp(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case EXPM1:
				enterOuterAlt(_localctx, 10);
				{
				setState(233);
				match(EXPM1);
				setState(234);
				match(BRACKET_BEGIN);
				setState(235);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(236);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.expm1(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case FLOOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(239);
				match(FLOOR);
				setState(240);
				match(BRACKET_BEGIN);
				setState(241);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(242);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.floor(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case LN:
			case LOGE:
				enterOuterAlt(_localctx, 12);
				{
				setState(245);
				_la = _input.LA(1);
				if ( !(_la==LN || _la==LOGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				match(BRACKET_BEGIN);
				setState(247);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(248);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.log(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case LOG:
			case LOG10:
				enterOuterAlt(_localctx, 13);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==LOG || _la==LOG10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				match(BRACKET_BEGIN);
				setState(253);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(254);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.log10(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case LOG2:
			case LB:
			case LD:
				enterOuterAlt(_localctx, 14);
				{
				setState(257);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOG2) | (1L << LB) | (1L << LD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				match(BRACKET_BEGIN);
				setState(259);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(260);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.log(((MathFunctionContext)_localctx).e.v)/Math.log(2);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 15);
				{
				setState(263);
				((MathFunctionContext)_localctx).a = max();
				((MathFunctionContext)_localctx).v =  ((MathFunctionContext)_localctx).a.v;
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 16);
				{
				setState(266);
				((MathFunctionContext)_localctx).i = min();
				((MathFunctionContext)_localctx).v =  ((MathFunctionContext)_localctx).i.v;
				}
				break;
			case POWFUNC:
				enterOuterAlt(_localctx, 17);
				{
				setState(269);
				match(POWFUNC);
				setState(270);
				match(BRACKET_BEGIN);
				setState(271);
				((MathFunctionContext)_localctx).e1 = expr(0);
				setState(272);
				match(T__0);
				setState(273);
				((MathFunctionContext)_localctx).e2 = expr(0);
				setState(274);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.pow(((MathFunctionContext)_localctx).e1.v,((MathFunctionContext)_localctx).e2.v);
				}
				break;
			case RINT:
				enterOuterAlt(_localctx, 18);
				{
				setState(277);
				match(RINT);
				setState(278);
				match(BRACKET_BEGIN);
				setState(279);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(280);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.rint(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case ROUND:
				enterOuterAlt(_localctx, 19);
				{
				setState(283);
				match(ROUND);
				setState(284);
				match(BRACKET_BEGIN);
				setState(285);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(286);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.round(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case SIGNUM:
				enterOuterAlt(_localctx, 20);
				{
				setState(289);
				match(SIGNUM);
				setState(290);
				match(BRACKET_BEGIN);
				setState(291);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(292);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.signum(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 21);
				{
				setState(295);
				match(SIN);
				setState(296);
				match(BRACKET_BEGIN);
				setState(297);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(298);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.sin(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case SINH:
				enterOuterAlt(_localctx, 22);
				{
				setState(301);
				match(SINH);
				setState(302);
				match(BRACKET_BEGIN);
				setState(303);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(304);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.sinh(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 23);
				{
				setState(307);
				match(SQRT);
				setState(308);
				match(BRACKET_BEGIN);
				setState(309);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(310);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.sqrt(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 24);
				{
				setState(313);
				match(TAN);
				setState(314);
				match(BRACKET_BEGIN);
				setState(315);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(316);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.tan(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case TANH:
				enterOuterAlt(_localctx, 25);
				{
				setState(319);
				match(TANH);
				setState(320);
				match(BRACKET_BEGIN);
				setState(321);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(322);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.tanh(((MathFunctionContext)_localctx).e.v);
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

	public static class MinContext extends ParserRuleContext {
		public double v;
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public ExprContext e4;
		public TerminalNode MIN() { return getToken(WRBParser.MIN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinContext min() throws RecognitionException {
		MinContext _localctx = new MinContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_min);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(MIN);
				setState(328);
				match(BRACKET_BEGIN);
				setState(329);
				((MinContext)_localctx).e1 = expr(0);
				setState(330);
				match(T__0);
				setState(331);
				((MinContext)_localctx).e2 = expr(0);
				setState(332);
				match(BRACKET_END);
				((MinContext)_localctx).v =  Math.min(((MinContext)_localctx).e1.v,((MinContext)_localctx).e2.v);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(MIN);
				setState(336);
				match(BRACKET_BEGIN);
				setState(337);
				((MinContext)_localctx).e1 = expr(0);
				setState(338);
				match(T__0);
				setState(339);
				((MinContext)_localctx).e2 = expr(0);
				setState(340);
				match(T__0);
				setState(341);
				((MinContext)_localctx).e3 = expr(0);
				setState(342);
				match(BRACKET_END);
				((MinContext)_localctx).v =  Math.min(Math.min(((MinContext)_localctx).e1.v,((MinContext)_localctx).e2.v),((MinContext)_localctx).e3.v);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(MIN);
				setState(346);
				match(BRACKET_BEGIN);
				setState(347);
				((MinContext)_localctx).e1 = expr(0);
				setState(348);
				match(T__0);
				setState(349);
				((MinContext)_localctx).e2 = expr(0);
				setState(350);
				match(T__0);
				setState(351);
				((MinContext)_localctx).e3 = expr(0);
				setState(352);
				match(T__0);
				setState(353);
				((MinContext)_localctx).e4 = expr(0);
				setState(354);
				match(BRACKET_END);
				((MinContext)_localctx).v =  Math.min(Math.min(((MinContext)_localctx).e1.v,((MinContext)_localctx).e2.v),Math.min(((MinContext)_localctx).e3.v,((MinContext)_localctx).e4.v));
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

	public static class MaxContext extends ParserRuleContext {
		public double v;
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public ExprContext e4;
		public TerminalNode MAX() { return getToken(WRBParser.MAX, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitMax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxContext max() throws RecognitionException {
		MaxContext _localctx = new MaxContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_max);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(MAX);
				setState(360);
				match(BRACKET_BEGIN);
				setState(361);
				((MaxContext)_localctx).e1 = expr(0);
				setState(362);
				match(T__0);
				setState(363);
				((MaxContext)_localctx).e2 = expr(0);
				setState(364);
				match(BRACKET_END);
				((MaxContext)_localctx).v =  Math.max(((MaxContext)_localctx).e1.v,((MaxContext)_localctx).e2.v);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(MAX);
				setState(368);
				match(BRACKET_BEGIN);
				setState(369);
				((MaxContext)_localctx).e1 = expr(0);
				setState(370);
				match(T__0);
				setState(371);
				((MaxContext)_localctx).e2 = expr(0);
				setState(372);
				match(T__0);
				setState(373);
				((MaxContext)_localctx).e3 = expr(0);
				setState(374);
				match(BRACKET_END);
				((MaxContext)_localctx).v =  Math.max(Math.max(((MaxContext)_localctx).e1.v,((MaxContext)_localctx).e2.v),((MaxContext)_localctx).e3.v);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(MAX);
				setState(378);
				match(BRACKET_BEGIN);
				setState(379);
				((MaxContext)_localctx).e1 = expr(0);
				setState(380);
				match(T__0);
				setState(381);
				((MaxContext)_localctx).e2 = expr(0);
				setState(382);
				match(T__0);
				setState(383);
				((MaxContext)_localctx).e3 = expr(0);
				setState(384);
				match(T__0);
				setState(385);
				((MaxContext)_localctx).e4 = expr(0);
				setState(386);
				match(BRACKET_END);
				((MaxContext)_localctx).v =  Math.max(Math.max(((MaxContext)_localctx).e1.v,((MaxContext)_localctx).e2.v),Math.max(((MaxContext)_localctx).e3.v,((MaxContext)_localctx).e4.v));
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

	public static class EvalUserFuncContext extends ParserRuleContext {
		public Token i;
		public EvalParamsContext p;
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public EvalParamsContext evalParams() {
			return getRuleContext(EvalParamsContext.class,0);
		}
		public EvalUserFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalUserFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterEvalUserFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitEvalUserFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitEvalUserFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalUserFuncContext evalUserFunc() throws RecognitionException {
		EvalUserFuncContext _localctx = new EvalUserFuncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_evalUserFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((EvalUserFuncContext)_localctx).i = match(ID);
			setState(392);
			match(BRACKET_BEGIN);
			setState(393);
			((EvalUserFuncContext)_localctx).p = evalParams();
			setState(394);
			match(BRACKET_END);
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

	public static class EvalParamsContext extends ParserRuleContext {
		public List<TerminalNode> SCI_NO() { return getTokens(WRBParser.SCI_NO); }
		public TerminalNode SCI_NO(int i) {
			return getToken(WRBParser.SCI_NO, i);
		}
		public EvalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterEvalParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitEvalParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitEvalParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalParamsContext evalParams() throws RecognitionException {
		EvalParamsContext _localctx = new EvalParamsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_evalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(SCI_NO);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(397);
				match(T__0);
				setState(398);
				match(SCI_NO);
				}
				}
				setState(403);
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

	public static class AssignFuncContext extends ParserRuleContext {
		public double v;
		public Token i;
		public ParamsContext p;
		public ExprContext e;
		public TerminalNode ASSIGN() { return getToken(WRBParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterAssignFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitAssignFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitAssignFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignFuncContext assignFunc() throws RecognitionException {
		AssignFuncContext _localctx = new AssignFuncContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			((AssignFuncContext)_localctx).i = match(ID);
			setState(405);
			match(BRACKET_BEGIN);
			setState(406);
			((AssignFuncContext)_localctx).p = params();
			setState(407);
			match(BRACKET_END);

					//Putting all params in varMemory to avoid NullPointerException
					String p = (((AssignFuncContext)_localctx).p!=null?_input.getText(((AssignFuncContext)_localctx).p.start,((AssignFuncContext)_localctx).p.stop):null);
					String[] params = p.split(",");
					for(String param : params) {
						varMemory.put(param, 0.);
					}
				
			setState(409);
			match(ASSIGN);
			setState(410);
			((AssignFuncContext)_localctx).e = expr(0);

					((AssignFuncContext)_localctx).v =  1;
				
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(WRBParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WRBParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(ID);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(414);
				match(T__0);
				setState(415);
				match(ID);
				}
				}
				setState(420);
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

	public static class UserFunctionContext extends ParserRuleContext {
		public UserFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterUserFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitUserFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitUserFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserFunctionContext userFunction() throws RecognitionException {
		UserFunctionContext _localctx = new UserFunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_userFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class AssignVarContext extends ParserRuleContext {
		public double v;
		public Token i;
		public ExprContext exp;
		public Token j;
		public TerminalNode ASSIGN() { return getToken(WRBParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(WRBParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WRBParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignVar);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				((AssignVarContext)_localctx).i = match(ID);
				setState(424);
				match(ASSIGN);
				setState(425);
				((AssignVarContext)_localctx).exp = expr(0);
				varMemory.put((((AssignVarContext)_localctx).i!=null?((AssignVarContext)_localctx).i.getText():null), ((AssignVarContext)_localctx).exp.v); ((AssignVarContext)_localctx).v =  ((AssignVarContext)_localctx).exp.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				((AssignVarContext)_localctx).i = match(ID);
				setState(429);
				match(ASSIGN);
				setState(430);
				((AssignVarContext)_localctx).j = match(ID);
				varMemory.put((((AssignVarContext)_localctx).i!=null?((AssignVarContext)_localctx).i.getText():null), varMemory.get((((AssignVarContext)_localctx).j!=null?((AssignVarContext)_localctx).j.getText():null))); ((AssignVarContext)_localctx).v =  varMemory.get((((AssignVarContext)_localctx).j!=null?((AssignVarContext)_localctx).j.getText():null));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u01b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4"+
		"\16\4T\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0096\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00a3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00b1\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0148"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0168\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0188\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\7\23\u0192\n\23\f\23\16\23\u0195\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u01a3\n\25"+
		"\f\25\16\25\u01a6\13\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u01b3\n\27\3\27\2\4\6\f\30\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,\2\6\3\2\62\63\4\2\23\23\25\25\4\2\24\24\26\26\3\2\27"+
		"\31\2\u01cf\2/\3\2\2\2\4?\3\2\2\2\6F\3\2\2\2\bU\3\2\2\2\nY\3\2\2\2\f]"+
		"\3\2\2\2\16n\3\2\2\2\20r\3\2\2\2\22}\3\2\2\2\24\u0095\3\2\2\2\26\u00a2"+
		"\3\2\2\2\30\u00b0\3\2\2\2\32\u00b2\3\2\2\2\34\u0147\3\2\2\2\36\u0167\3"+
		"\2\2\2 \u0187\3\2\2\2\"\u0189\3\2\2\2$\u018e\3\2\2\2&\u0196\3\2\2\2(\u019f"+
		"\3\2\2\2*\u01a7\3\2\2\2,\u01b2\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\64\5\6\4\2\64\65\t\2\2"+
		"\2\65\66\b\3\1\2\66@\3\2\2\2\678\5,\27\289\t\2\2\29:\b\3\1\2:@\3\2\2\2"+
		";<\5&\24\2<=\t\2\2\2=>\b\3\1\2>@\3\2\2\2?\63\3\2\2\2?\67\3\2\2\2?;\3\2"+
		"\2\2@\5\3\2\2\2AB\b\4\1\2BC\5\f\7\2CD\b\4\1\2DG\3\2\2\2EG\5\"\22\2FA\3"+
		"\2\2\2FE\3\2\2\2GR\3\2\2\2HI\f\5\2\2IJ\5\b\5\2JK\b\4\1\2KQ\3\2\2\2LM\f"+
		"\4\2\2MN\5\n\6\2NO\b\4\1\2OQ\3\2\2\2PH\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2S\7\3\2\2\2TR\3\2\2\2UV\7*\2\2VW\5\f\7\2WX\b\5\1\2X\t"+
		"\3\2\2\2YZ\7-\2\2Z[\5\f\7\2[\\\b\6\1\2\\\13\3\2\2\2]^\b\7\1\2^_\5\22\n"+
		"\2_`\b\7\1\2`k\3\2\2\2ab\f\4\2\2bc\5\16\b\2cd\b\7\1\2dj\3\2\2\2ef\f\3"+
		"\2\2fg\5\20\t\2gh\b\7\1\2hj\3\2\2\2ia\3\2\2\2ie\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l\r\3\2\2\2mk\3\2\2\2no\7+\2\2op\5\22\n\2pq\b\b\1\2q\17"+
		"\3\2\2\2rs\7,\2\2st\5\22\n\2tu\b\t\1\2u\21\3\2\2\2vw\5\26\f\2wx\b\n\1"+
		"\2x~\3\2\2\2yz\5\26\f\2z{\5\24\13\2{|\b\n\1\2|~\3\2\2\2}v\3\2\2\2}y\3"+
		"\2\2\2~\23\3\2\2\2\177\u0080\7.\2\2\u0080\u0081\7/\2\2\u0081\u0082\5\6"+
		"\4\2\u0082\u0083\7\60\2\2\u0083\u0084\b\13\1\2\u0084\u0096\3\2\2\2\u0085"+
		"\u0086\7.\2\2\u0086\u0087\7\'\2\2\u0087\u0088\5\24\13\2\u0088\u0089\b"+
		"\13\1\2\u0089\u0096\3\2\2\2\u008a\u008b\7.\2\2\u008b\u008c\7)\2\2\u008c"+
		"\u008d\5\24\13\2\u008d\u008e\b\13\1\2\u008e\u0096\3\2\2\2\u008f\u0090"+
		"\7.\2\2\u0090\u0091\7\'\2\2\u0091\u0096\b\13\1\2\u0092\u0093\7.\2\2\u0093"+
		"\u0094\7)\2\2\u0094\u0096\b\13\1\2\u0095\177\3\2\2\2\u0095\u0085\3\2\2"+
		"\2\u0095\u008a\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\25"+
		"\3\2\2\2\u0097\u0098\7*\2\2\u0098\u0099\5\30\r\2\u0099\u009a\b\f\1\2\u009a"+
		"\u00a3\3\2\2\2\u009b\u009c\7-\2\2\u009c\u009d\5\30\r\2\u009d\u009e\b\f"+
		"\1\2\u009e\u00a3\3\2\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\b\f\1\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\7\'\2\2\u00a5\u00b1\b\r\1\2\u00a6\u00a7"+
		"\7/\2\2\u00a7\u00a8\5\6\4\2\u00a8\u00a9\7\60\2\2\u00a9\u00aa\b\r\1\2\u00aa"+
		"\u00b1\3\2\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\b\r\1\2\u00ad\u00b1\3"+
		"\2\2\2\u00ae\u00af\7)\2\2\u00af\u00b1\b\r\1\2\u00b0\u00a4\3\2\2\2\u00b0"+
		"\u00a6\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\31\3\2\2"+
		"\2\u00b2\u00b3\5\34\17\2\u00b3\u00b4\b\16\1\2\u00b4\33\3\2\2\2\u00b5\u00b6"+
		"\7\4\2\2\u00b6\u00b7\7/\2\2\u00b7\u00b8\5\6\4\2\u00b8\u00b9\7\60\2\2\u00b9"+
		"\u00ba\b\17\1\2\u00ba\u0148\3\2\2\2\u00bb\u00bc\7\5\2\2\u00bc\u00bd\7"+
		"/\2\2\u00bd\u00be\5\6\4\2\u00be\u00bf\7\60\2\2\u00bf\u00c0\b\17\1\2\u00c0"+
		"\u0148\3\2\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c4\5\6"+
		"\4\2\u00c4\u00c5\7\60\2\2\u00c5\u00c6\b\17\1\2\u00c6\u0148\3\2\2\2\u00c7"+
		"\u00c8\7\7\2\2\u00c8\u00c9\7/\2\2\u00c9\u00ca\5\6\4\2\u00ca\u00cb\7\60"+
		"\2\2\u00cb\u00cc\b\17\1\2\u00cc\u0148\3\2\2\2\u00cd\u00ce\7\t\2\2\u00ce"+
		"\u00cf\7/\2\2\u00cf\u00d0\5\6\4\2\u00d0\u00d1\7\60\2\2\u00d1\u00d2\b\17"+
		"\1\2\u00d2\u0148\3\2\2\2\u00d3\u00d4\7\n\2\2\u00d4\u00d5\7/\2\2\u00d5"+
		"\u00d6\5\6\4\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8\b\17\1\2\u00d8\u0148\3"+
		"\2\2\2\u00d9\u00da\7\13\2\2\u00da\u00db\7/\2\2\u00db\u00dc\5\6\4\2\u00dc"+
		"\u00dd\7\60\2\2\u00dd\u00de\b\17\1\2\u00de\u0148\3\2\2\2\u00df\u00e0\7"+
		"\f\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e2\5\6\4\2\u00e2\u00e3\7\60\2\2\u00e3"+
		"\u00e4\b\17\1\2\u00e4\u0148\3\2\2\2\u00e5\u00e6\7\r\2\2\u00e6\u00e7\7"+
		"/\2\2\u00e7\u00e8\5\6\4\2\u00e8\u00e9\7\60\2\2\u00e9\u00ea\b\17\1\2\u00ea"+
		"\u0148\3\2\2\2\u00eb\u00ec\7\16\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ee\5\6"+
		"\4\2\u00ee\u00ef\7\60\2\2\u00ef\u00f0\b\17\1\2\u00f0\u0148\3\2\2\2\u00f1"+
		"\u00f2\7\17\2\2\u00f2\u00f3\7/\2\2\u00f3\u00f4\5\6\4\2\u00f4\u00f5\7\60"+
		"\2\2\u00f5\u00f6\b\17\1\2\u00f6\u0148\3\2\2\2\u00f7\u00f8\t\3\2\2\u00f8"+
		"\u00f9\7/\2\2\u00f9\u00fa\5\6\4\2\u00fa\u00fb\7\60\2\2\u00fb\u00fc\b\17"+
		"\1\2\u00fc\u0148\3\2\2\2\u00fd\u00fe\t\4\2\2\u00fe\u00ff\7/\2\2\u00ff"+
		"\u0100\5\6\4\2\u0100\u0101\7\60\2\2\u0101\u0102\b\17\1\2\u0102\u0148\3"+
		"\2\2\2\u0103\u0104\t\5\2\2\u0104\u0105\7/\2\2\u0105\u0106\5\6\4\2\u0106"+
		"\u0107\7\60\2\2\u0107\u0108\b\17\1\2\u0108\u0148\3\2\2\2\u0109\u010a\5"+
		" \21\2\u010a\u010b\b\17\1\2\u010b\u0148\3\2\2\2\u010c\u010d\5\36\20\2"+
		"\u010d\u010e\b\17\1\2\u010e\u0148\3\2\2\2\u010f\u0110\7\35\2\2\u0110\u0111"+
		"\7/\2\2\u0111\u0112\5\6\4\2\u0112\u0113\7\3\2\2\u0113\u0114\5\6\4\2\u0114"+
		"\u0115\7\60\2\2\u0115\u0116\b\17\1\2\u0116\u0148\3\2\2\2\u0117\u0118\7"+
		"\36\2\2\u0118\u0119\7/\2\2\u0119\u011a\5\6\4\2\u011a\u011b\7\60\2\2\u011b"+
		"\u011c\b\17\1\2\u011c\u0148\3\2\2\2\u011d\u011e\7\37\2\2\u011e\u011f\7"+
		"/\2\2\u011f\u0120\5\6\4\2\u0120\u0121\7\60\2\2\u0121\u0122\b\17\1\2\u0122"+
		"\u0148\3\2\2\2\u0123\u0124\7!\2\2\u0124\u0125\7/\2\2\u0125\u0126\5\6\4"+
		"\2\u0126\u0127\7\60\2\2\u0127\u0128\b\17\1\2\u0128\u0148\3\2\2\2\u0129"+
		"\u012a\7\"\2\2\u012a\u012b\7/\2\2\u012b\u012c\5\6\4\2\u012c\u012d\7\60"+
		"\2\2\u012d\u012e\b\17\1\2\u012e\u0148\3\2\2\2\u012f\u0130\7#\2\2\u0130"+
		"\u0131\7/\2\2\u0131\u0132\5\6\4\2\u0132\u0133\7\60\2\2\u0133\u0134\b\17"+
		"\1\2\u0134\u0148\3\2\2\2\u0135\u0136\7$\2\2\u0136\u0137\7/\2\2\u0137\u0138"+
		"\5\6\4\2\u0138\u0139\7\60\2\2\u0139\u013a\b\17\1\2\u013a\u0148\3\2\2\2"+
		"\u013b\u013c\7%\2\2\u013c\u013d\7/\2\2\u013d\u013e\5\6\4\2\u013e\u013f"+
		"\7\60\2\2\u013f\u0140\b\17\1\2\u0140\u0148\3\2\2\2\u0141\u0142\7&\2\2"+
		"\u0142\u0143\7/\2\2\u0143\u0144\5\6\4\2\u0144\u0145\7\60\2\2\u0145\u0146"+
		"\b\17\1\2\u0146\u0148\3\2\2\2\u0147\u00b5\3\2\2\2\u0147\u00bb\3\2\2\2"+
		"\u0147\u00c1\3\2\2\2\u0147\u00c7\3\2\2\2\u0147\u00cd\3\2\2\2\u0147\u00d3"+
		"\3\2\2\2\u0147\u00d9\3\2\2\2\u0147\u00df\3\2\2\2\u0147\u00e5\3\2\2\2\u0147"+
		"\u00eb\3\2\2\2\u0147\u00f1\3\2\2\2\u0147\u00f7\3\2\2\2\u0147\u00fd\3\2"+
		"\2\2\u0147\u0103\3\2\2\2\u0147\u0109\3\2\2\2\u0147\u010c\3\2\2\2\u0147"+
		"\u010f\3\2\2\2\u0147\u0117\3\2\2\2\u0147\u011d\3\2\2\2\u0147\u0123\3\2"+
		"\2\2\u0147\u0129\3\2\2\2\u0147\u012f\3\2\2\2\u0147\u0135\3\2\2\2\u0147"+
		"\u013b\3\2\2\2\u0147\u0141\3\2\2\2\u0148\35\3\2\2\2\u0149\u014a\7\34\2"+
		"\2\u014a\u014b\7/\2\2\u014b\u014c\5\6\4\2\u014c\u014d\7\3\2\2\u014d\u014e"+
		"\5\6\4\2\u014e\u014f\7\60\2\2\u014f\u0150\b\20\1\2\u0150\u0168\3\2\2\2"+
		"\u0151\u0152\7\34\2\2\u0152\u0153\7/\2\2\u0153\u0154\5\6\4\2\u0154\u0155"+
		"\7\3\2\2\u0155\u0156\5\6\4\2\u0156\u0157\7\3\2\2\u0157\u0158\5\6\4\2\u0158"+
		"\u0159\7\60\2\2\u0159\u015a\b\20\1\2\u015a\u0168\3\2\2\2\u015b\u015c\7"+
		"\34\2\2\u015c\u015d\7/\2\2\u015d\u015e\5\6\4\2\u015e\u015f\7\3\2\2\u015f"+
		"\u0160\5\6\4\2\u0160\u0161\7\3\2\2\u0161\u0162\5\6\4\2\u0162\u0163\7\3"+
		"\2\2\u0163\u0164\5\6\4\2\u0164\u0165\7\60\2\2\u0165\u0166\b\20\1\2\u0166"+
		"\u0168\3\2\2\2\u0167\u0149\3\2\2\2\u0167\u0151\3\2\2\2\u0167\u015b\3\2"+
		"\2\2\u0168\37\3\2\2\2\u0169\u016a\7\33\2\2\u016a\u016b\7/\2\2\u016b\u016c"+
		"\5\6\4\2\u016c\u016d\7\3\2\2\u016d\u016e\5\6\4\2\u016e\u016f\7\60\2\2"+
		"\u016f\u0170\b\21\1\2\u0170\u0188\3\2\2\2\u0171\u0172\7\33\2\2\u0172\u0173"+
		"\7/\2\2\u0173\u0174\5\6\4\2\u0174\u0175\7\3\2\2\u0175\u0176\5\6\4\2\u0176"+
		"\u0177\7\3\2\2\u0177\u0178\5\6\4\2\u0178\u0179\7\60\2\2\u0179\u017a\b"+
		"\21\1\2\u017a\u0188\3\2\2\2\u017b\u017c\7\33\2\2\u017c\u017d\7/\2\2\u017d"+
		"\u017e\5\6\4\2\u017e\u017f\7\3\2\2\u017f\u0180\5\6\4\2\u0180\u0181\7\3"+
		"\2\2\u0181\u0182\5\6\4\2\u0182\u0183\7\3\2\2\u0183\u0184\5\6\4\2\u0184"+
		"\u0185\7\60\2\2\u0185\u0186\b\21\1\2\u0186\u0188\3\2\2\2\u0187\u0169\3"+
		"\2\2\2\u0187\u0171\3\2\2\2\u0187\u017b\3\2\2\2\u0188!\3\2\2\2\u0189\u018a"+
		"\7)\2\2\u018a\u018b\7/\2\2\u018b\u018c\5$\23\2\u018c\u018d\7\60\2\2\u018d"+
		"#\3\2\2\2\u018e\u0193\7\'\2\2\u018f\u0190\7\3\2\2\u0190\u0192\7\'\2\2"+
		"\u0191\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194%\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7)\2\2\u0197\u0198"+
		"\7/\2\2\u0198\u0199\5(\25\2\u0199\u019a\7\60\2\2\u019a\u019b\b\24\1\2"+
		"\u019b\u019c\7\61\2\2\u019c\u019d\5\6\4\2\u019d\u019e\b\24\1\2\u019e\'"+
		"\3\2\2\2\u019f\u01a4\7)\2\2\u01a0\u01a1\7\3\2\2\u01a1\u01a3\7)\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5)\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8+\3\2"+
		"\2\2\u01a9\u01aa\7)\2\2\u01aa\u01ab\7\61\2\2\u01ab\u01ac\5\6\4\2\u01ac"+
		"\u01ad\b\27\1\2\u01ad\u01b3\3\2\2\2\u01ae\u01af\7)\2\2\u01af\u01b0\7\61"+
		"\2\2\u01b0\u01b1\7)\2\2\u01b1\u01b3\b\27\1\2\u01b2\u01a9\3\2\2\2\u01b2"+
		"\u01ae\3\2\2\2\u01b3-\3\2\2\2\23\61?FPRik}\u0095\u00a2\u00b0\u0147\u0167"+
		"\u0187\u0193\u01a4\u01b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}