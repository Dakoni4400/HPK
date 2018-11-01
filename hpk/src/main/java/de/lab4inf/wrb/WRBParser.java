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
		RULE_min = 14, RULE_max = 15, RULE_userFunction = 16, RULE_assignVar = 17;
	public static final String[] ruleNames = {
		"run", "statement", "expr", "exprAdd", "exprSub", "term", "termMul", "termDiv", 
		"factor", "pow", "signedAtom", "atom", "function", "mathFunction", "min", 
		"max", "userFunction", "assignVar"
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
		public double v;
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				((RunContext)_localctx).s = statement();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << CBRT) | (1L << CEIL) | (1L << COS) | (1L << COSH) | (1L << EXP) | (1L << EXPM1) | (1L << FLOOR) | (1L << LN) | (1L << LOG) | (1L << LOGE) | (1L << LOG10) | (1L << LOG2) | (1L << LB) | (1L << LD) | (1L << MAX) | (1L << MIN) | (1L << POWFUNC) | (1L << RINT) | (1L << ROUND) | (1L << SIGNUM) | (1L << SIN) | (1L << SINH) | (1L << SQRT) | (1L << TAN) | (1L << TANH) | (1L << SCI_NO) | (1L << ID) | (1L << ADD) | (1L << SUB) | (1L << BRACKET_BEGIN))) != 0) );
			((RunContext)_localctx).v =  ((RunContext)_localctx).s.v;
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(WRBParser.NEWLINE, 0); }
		public TerminalNode END() { return getToken(WRBParser.END, 0); }
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((StatementContext)_localctx).exp = expr(0);
				setState(44);
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
				setState(47);
				((StatementContext)_localctx).a = assignVar();
				setState(48);
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
			{
			setState(54);
			((ExprContext)_localctx).t = term(0);
			((ExprContext)_localctx).v =  ((ExprContext)_localctx).t.v;
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(58);
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
						setState(61);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(62);
						((ExprContext)_localctx).s = exprSub();
						((ExprContext)_localctx).v =  ((ExprContext)_localctx).t1.v - ((ExprContext)_localctx).s.v;
						}
						break;
					}
					} 
				}
				setState(69);
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
			setState(70);
			match(ADD);
			setState(71);
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
			setState(74);
			match(SUB);
			setState(75);
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
			setState(79);
			((TermContext)_localctx).f = factor();
			((TermContext)_localctx).v =  ((TermContext)_localctx).f.v;
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(82);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(83);
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
						setState(86);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(87);
						((TermContext)_localctx).d = termDiv();
						((TermContext)_localctx).v =  ((TermContext)_localctx).f1.v / ((TermContext)_localctx).d.v;
						}
						break;
					}
					} 
				}
				setState(94);
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
			setState(95);
			match(MUL);
			setState(96);
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
			setState(99);
			match(DIV);
			setState(100);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((FactorContext)_localctx).a = signedAtom();
				((FactorContext)_localctx).v =  ((FactorContext)_localctx).a.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				((FactorContext)_localctx).b = signedAtom();
				setState(107);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(POW);
				setState(113);
				match(BRACKET_BEGIN);
				setState(114);
				((PowContext)_localctx).e = expr(0);
				setState(115);
				match(BRACKET_END);
				((PowContext)_localctx).v =  ((PowContext)_localctx).e.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(POW);
				setState(119);
				((PowContext)_localctx).n = match(SCI_NO);
				setState(120);
				((PowContext)_localctx).p = pow();
				((PowContext)_localctx).v =  Math.pow(Double.parseDouble((((PowContext)_localctx).n!=null?((PowContext)_localctx).n.getText():null)), ((PowContext)_localctx).p.v);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(POW);
				setState(124);
				((PowContext)_localctx).i = match(ID);
				setState(125);
				((PowContext)_localctx).p = pow();
				((PowContext)_localctx).v =  Math.pow(varMemory.get((((PowContext)_localctx).i!=null?((PowContext)_localctx).i.getText():null)), ((PowContext)_localctx).p.v);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(POW);
				setState(129);
				((PowContext)_localctx).n = match(SCI_NO);
				((PowContext)_localctx).v =  Double.parseDouble((((PowContext)_localctx).n!=null?((PowContext)_localctx).n.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(POW);
				setState(132);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(ADD);
				setState(137);
				((SignedAtomContext)_localctx).a = atom();
				((SignedAtomContext)_localctx).v =  ((SignedAtomContext)_localctx).a.v;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(SUB);
				setState(141);
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
				setState(144);
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCI_NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((AtomContext)_localctx).n = match(SCI_NO);
				((AtomContext)_localctx).v =  Double.parseDouble((((AtomContext)_localctx).n!=null?((AtomContext)_localctx).n.getText():null));
				}
				break;
			case BRACKET_BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(BRACKET_BEGIN);
				setState(152);
				((AtomContext)_localctx).e = expr(0);
				setState(153);
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
				setState(156);
				((AtomContext)_localctx).f = function();
				((AtomContext)_localctx).v =  ((AtomContext)_localctx).f.v;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
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
			setState(163);
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
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(ABS);
				setState(167);
				match(BRACKET_BEGIN);
				setState(168);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(169);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.abs(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(ACOS);
				setState(173);
				match(BRACKET_BEGIN);
				setState(174);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(175);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.acos(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case ASIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(ASIN);
				setState(179);
				match(BRACKET_BEGIN);
				setState(180);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(181);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.asin(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case ATAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(ATAN);
				setState(185);
				match(BRACKET_BEGIN);
				setState(186);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(187);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.atan(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case CBRT:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(CBRT);
				setState(191);
				match(BRACKET_BEGIN);
				setState(192);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(193);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.cbrt(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case CEIL:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(CEIL);
				setState(197);
				match(BRACKET_BEGIN);
				setState(198);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(199);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.ceil(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				match(COS);
				setState(203);
				match(BRACKET_BEGIN);
				setState(204);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(205);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.cos(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case COSH:
				enterOuterAlt(_localctx, 8);
				{
				setState(208);
				match(COSH);
				setState(209);
				match(BRACKET_BEGIN);
				setState(210);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(211);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.cosh(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 9);
				{
				setState(214);
				match(EXP);
				setState(215);
				match(BRACKET_BEGIN);
				setState(216);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(217);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.exp(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case EXPM1:
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				match(EXPM1);
				setState(221);
				match(BRACKET_BEGIN);
				setState(222);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(223);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.expm1(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case FLOOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(226);
				match(FLOOR);
				setState(227);
				match(BRACKET_BEGIN);
				setState(228);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(229);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.floor(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case LN:
			case LOGE:
				enterOuterAlt(_localctx, 12);
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==LN || _la==LOGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				match(BRACKET_BEGIN);
				setState(234);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(235);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.log(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case LOG:
			case LOG10:
				enterOuterAlt(_localctx, 13);
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==LOG || _la==LOG10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				match(BRACKET_BEGIN);
				setState(240);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(241);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.log10(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case LOG2:
			case LB:
			case LD:
				enterOuterAlt(_localctx, 14);
				{
				setState(244);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOG2) | (1L << LB) | (1L << LD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				match(BRACKET_BEGIN);
				setState(246);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(247);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.log(((MathFunctionContext)_localctx).e.v)/Math.log(2);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 15);
				{
				setState(250);
				((MathFunctionContext)_localctx).a = max();
				((MathFunctionContext)_localctx).v =  ((MathFunctionContext)_localctx).a.v;
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 16);
				{
				setState(253);
				((MathFunctionContext)_localctx).i = min();
				((MathFunctionContext)_localctx).v =  ((MathFunctionContext)_localctx).i.v;
				}
				break;
			case POWFUNC:
				enterOuterAlt(_localctx, 17);
				{
				setState(256);
				match(POWFUNC);
				setState(257);
				match(BRACKET_BEGIN);
				setState(258);
				((MathFunctionContext)_localctx).e1 = expr(0);
				setState(259);
				match(T__0);
				setState(260);
				((MathFunctionContext)_localctx).e2 = expr(0);
				setState(261);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.pow(((MathFunctionContext)_localctx).e1.v,((MathFunctionContext)_localctx).e2.v);
				}
				break;
			case RINT:
				enterOuterAlt(_localctx, 18);
				{
				setState(264);
				match(RINT);
				setState(265);
				match(BRACKET_BEGIN);
				setState(266);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(267);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.rint(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case ROUND:
				enterOuterAlt(_localctx, 19);
				{
				setState(270);
				match(ROUND);
				setState(271);
				match(BRACKET_BEGIN);
				setState(272);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(273);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.round(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case SIGNUM:
				enterOuterAlt(_localctx, 20);
				{
				setState(276);
				match(SIGNUM);
				setState(277);
				match(BRACKET_BEGIN);
				setState(278);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(279);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.signum(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 21);
				{
				setState(282);
				match(SIN);
				setState(283);
				match(BRACKET_BEGIN);
				setState(284);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(285);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.sin(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case SINH:
				enterOuterAlt(_localctx, 22);
				{
				setState(288);
				match(SINH);
				setState(289);
				match(BRACKET_BEGIN);
				setState(290);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(291);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.sinh(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 23);
				{
				setState(294);
				match(SQRT);
				setState(295);
				match(BRACKET_BEGIN);
				setState(296);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(297);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.sqrt(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 24);
				{
				setState(300);
				match(TAN);
				setState(301);
				match(BRACKET_BEGIN);
				setState(302);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(303);
				match(BRACKET_END);
				((MathFunctionContext)_localctx).v =  Math.tan(((MathFunctionContext)_localctx).e.v);
				}
				break;
			case TANH:
				enterOuterAlt(_localctx, 25);
				{
				setState(306);
				match(TANH);
				setState(307);
				match(BRACKET_BEGIN);
				setState(308);
				((MathFunctionContext)_localctx).e = expr(0);
				setState(309);
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
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(MIN);
				setState(315);
				match(BRACKET_BEGIN);
				setState(316);
				((MinContext)_localctx).e1 = expr(0);
				setState(317);
				match(T__0);
				setState(318);
				((MinContext)_localctx).e2 = expr(0);
				setState(319);
				match(BRACKET_END);
				((MinContext)_localctx).v =  Math.min(((MinContext)_localctx).e1.v,((MinContext)_localctx).e2.v);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(MIN);
				setState(323);
				match(BRACKET_BEGIN);
				setState(324);
				((MinContext)_localctx).e1 = expr(0);
				setState(325);
				match(T__0);
				setState(326);
				((MinContext)_localctx).e2 = expr(0);
				setState(327);
				match(T__0);
				setState(328);
				((MinContext)_localctx).e3 = expr(0);
				setState(329);
				match(BRACKET_END);
				((MinContext)_localctx).v =  Math.min(Math.min(((MinContext)_localctx).e1.v,((MinContext)_localctx).e2.v),((MinContext)_localctx).e3.v);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(MIN);
				setState(333);
				match(BRACKET_BEGIN);
				setState(334);
				((MinContext)_localctx).e1 = expr(0);
				setState(335);
				match(T__0);
				setState(336);
				((MinContext)_localctx).e2 = expr(0);
				setState(337);
				match(T__0);
				setState(338);
				((MinContext)_localctx).e3 = expr(0);
				setState(339);
				match(T__0);
				setState(340);
				((MinContext)_localctx).e4 = expr(0);
				setState(341);
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
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(MAX);
				setState(347);
				match(BRACKET_BEGIN);
				setState(348);
				((MaxContext)_localctx).e1 = expr(0);
				setState(349);
				match(T__0);
				setState(350);
				((MaxContext)_localctx).e2 = expr(0);
				setState(351);
				match(BRACKET_END);
				((MaxContext)_localctx).v =  Math.max(((MaxContext)_localctx).e1.v,((MaxContext)_localctx).e2.v);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(MAX);
				setState(355);
				match(BRACKET_BEGIN);
				setState(356);
				((MaxContext)_localctx).e1 = expr(0);
				setState(357);
				match(T__0);
				setState(358);
				((MaxContext)_localctx).e2 = expr(0);
				setState(359);
				match(T__0);
				setState(360);
				((MaxContext)_localctx).e3 = expr(0);
				setState(361);
				match(BRACKET_END);
				((MaxContext)_localctx).v =  Math.max(Math.max(((MaxContext)_localctx).e1.v,((MaxContext)_localctx).e2.v),((MaxContext)_localctx).e3.v);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(MAX);
				setState(365);
				match(BRACKET_BEGIN);
				setState(366);
				((MaxContext)_localctx).e1 = expr(0);
				setState(367);
				match(T__0);
				setState(368);
				((MaxContext)_localctx).e2 = expr(0);
				setState(369);
				match(T__0);
				setState(370);
				((MaxContext)_localctx).e3 = expr(0);
				setState(371);
				match(T__0);
				setState(372);
				((MaxContext)_localctx).e4 = expr(0);
				setState(373);
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
		enterRule(_localctx, 32, RULE_userFunction);
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
		enterRule(_localctx, 34, RULE_assignVar);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				((AssignVarContext)_localctx).i = match(ID);
				setState(381);
				match(ASSIGN);
				setState(382);
				((AssignVarContext)_localctx).exp = expr(0);
				varMemory.put((((AssignVarContext)_localctx).i!=null?((AssignVarContext)_localctx).i.getText():null), ((AssignVarContext)_localctx).exp.v); ((AssignVarContext)_localctx).v =  ((AssignVarContext)_localctx).exp.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				((AssignVarContext)_localctx).i = match(ID);
				setState(386);
				match(ASSIGN);
				setState(387);
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
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u018a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4D\n"+
		"\4\f\4\16\4G\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0089\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00a4\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013b"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u015b\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u017b\n\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0188\n\23\3\23\2\4\6\f"+
		"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\6\3\2\62\63\4\2\23\23"+
		"\25\25\4\2\24\24\26\26\3\2\27\31\2\u01a4\2\'\3\2\2\2\4\65\3\2\2\2\6\67"+
		"\3\2\2\2\bH\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16a\3\2\2\2\20e\3\2\2\2\22p"+
		"\3\2\2\2\24\u0088\3\2\2\2\26\u0095\3\2\2\2\30\u00a3\3\2\2\2\32\u00a5\3"+
		"\2\2\2\34\u013a\3\2\2\2\36\u015a\3\2\2\2 \u017a\3\2\2\2\"\u017c\3\2\2"+
		"\2$\u0187\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2"+
		"*+\3\2\2\2+,\b\2\1\2,\3\3\2\2\2-.\5\6\4\2./\t\2\2\2/\60\b\3\1\2\60\66"+
		"\3\2\2\2\61\62\5$\23\2\62\63\t\2\2\2\63\64\b\3\1\2\64\66\3\2\2\2\65-\3"+
		"\2\2\2\65\61\3\2\2\2\66\5\3\2\2\2\678\b\4\1\289\5\f\7\29:\b\4\1\2:E\3"+
		"\2\2\2;<\f\4\2\2<=\5\b\5\2=>\b\4\1\2>D\3\2\2\2?@\f\3\2\2@A\5\n\6\2AB\b"+
		"\4\1\2BD\3\2\2\2C;\3\2\2\2C?\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7"+
		"\3\2\2\2GE\3\2\2\2HI\7*\2\2IJ\5\f\7\2JK\b\5\1\2K\t\3\2\2\2LM\7-\2\2MN"+
		"\5\f\7\2NO\b\6\1\2O\13\3\2\2\2PQ\b\7\1\2QR\5\22\n\2RS\b\7\1\2S^\3\2\2"+
		"\2TU\f\4\2\2UV\5\16\b\2VW\b\7\1\2W]\3\2\2\2XY\f\3\2\2YZ\5\20\t\2Z[\b\7"+
		"\1\2[]\3\2\2\2\\T\3\2\2\2\\X\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r"+
		"\3\2\2\2`^\3\2\2\2ab\7+\2\2bc\5\22\n\2cd\b\b\1\2d\17\3\2\2\2ef\7,\2\2"+
		"fg\5\22\n\2gh\b\t\1\2h\21\3\2\2\2ij\5\26\f\2jk\b\n\1\2kq\3\2\2\2lm\5\26"+
		"\f\2mn\5\24\13\2no\b\n\1\2oq\3\2\2\2pi\3\2\2\2pl\3\2\2\2q\23\3\2\2\2r"+
		"s\7.\2\2st\7/\2\2tu\5\6\4\2uv\7\60\2\2vw\b\13\1\2w\u0089\3\2\2\2xy\7."+
		"\2\2yz\7\'\2\2z{\5\24\13\2{|\b\13\1\2|\u0089\3\2\2\2}~\7.\2\2~\177\7)"+
		"\2\2\177\u0080\5\24\13\2\u0080\u0081\b\13\1\2\u0081\u0089\3\2\2\2\u0082"+
		"\u0083\7.\2\2\u0083\u0084\7\'\2\2\u0084\u0089\b\13\1\2\u0085\u0086\7."+
		"\2\2\u0086\u0087\7)\2\2\u0087\u0089\b\13\1\2\u0088r\3\2\2\2\u0088x\3\2"+
		"\2\2\u0088}\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089\25\3"+
		"\2\2\2\u008a\u008b\7*\2\2\u008b\u008c\5\30\r\2\u008c\u008d\b\f\1\2\u008d"+
		"\u0096\3\2\2\2\u008e\u008f\7-\2\2\u008f\u0090\5\30\r\2\u0090\u0091\b\f"+
		"\1\2\u0091\u0096\3\2\2\2\u0092\u0093\5\30\r\2\u0093\u0094\b\f\1\2\u0094"+
		"\u0096\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u0092\3\2"+
		"\2\2\u0096\27\3\2\2\2\u0097\u0098\7\'\2\2\u0098\u00a4\b\r\1\2\u0099\u009a"+
		"\7/\2\2\u009a\u009b\5\6\4\2\u009b\u009c\7\60\2\2\u009c\u009d\b\r\1\2\u009d"+
		"\u00a4\3\2\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\b\r\1\2\u00a0\u00a4\3"+
		"\2\2\2\u00a1\u00a2\7)\2\2\u00a2\u00a4\b\r\1\2\u00a3\u0097\3\2\2\2\u00a3"+
		"\u0099\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\31\3\2\2"+
		"\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7\b\16\1\2\u00a7\33\3\2\2\2\u00a8\u00a9"+
		"\7\4\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab\5\6\4\2\u00ab\u00ac\7\60\2\2\u00ac"+
		"\u00ad\b\17\1\2\u00ad\u013b\3\2\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0\7"+
		"/\2\2\u00b0\u00b1\5\6\4\2\u00b1\u00b2\7\60\2\2\u00b2\u00b3\b\17\1\2\u00b3"+
		"\u013b\3\2\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\7/\2\2\u00b6\u00b7\5\6"+
		"\4\2\u00b7\u00b8\7\60\2\2\u00b8\u00b9\b\17\1\2\u00b9\u013b\3\2\2\2\u00ba"+
		"\u00bb\7\7\2\2\u00bb\u00bc\7/\2\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\7\60"+
		"\2\2\u00be\u00bf\b\17\1\2\u00bf\u013b\3\2\2\2\u00c0\u00c1\7\t\2\2\u00c1"+
		"\u00c2\7/\2\2\u00c2\u00c3\5\6\4\2\u00c3\u00c4\7\60\2\2\u00c4\u00c5\b\17"+
		"\1\2\u00c5\u013b\3\2\2\2\u00c6\u00c7\7\n\2\2\u00c7\u00c8\7/\2\2\u00c8"+
		"\u00c9\5\6\4\2\u00c9\u00ca\7\60\2\2\u00ca\u00cb\b\17\1\2\u00cb\u013b\3"+
		"\2\2\2\u00cc\u00cd\7\13\2\2\u00cd\u00ce\7/\2\2\u00ce\u00cf\5\6\4\2\u00cf"+
		"\u00d0\7\60\2\2\u00d0\u00d1\b\17\1\2\u00d1\u013b\3\2\2\2\u00d2\u00d3\7"+
		"\f\2\2\u00d3\u00d4\7/\2\2\u00d4\u00d5\5\6\4\2\u00d5\u00d6\7\60\2\2\u00d6"+
		"\u00d7\b\17\1\2\u00d7\u013b\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\7"+
		"/\2\2\u00da\u00db\5\6\4\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\b\17\1\2\u00dd"+
		"\u013b\3\2\2\2\u00de\u00df\7\16\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1\5\6"+
		"\4\2\u00e1\u00e2\7\60\2\2\u00e2\u00e3\b\17\1\2\u00e3\u013b\3\2\2\2\u00e4"+
		"\u00e5\7\17\2\2\u00e5\u00e6\7/\2\2\u00e6\u00e7\5\6\4\2\u00e7\u00e8\7\60"+
		"\2\2\u00e8\u00e9\b\17\1\2\u00e9\u013b\3\2\2\2\u00ea\u00eb\t\3\2\2\u00eb"+
		"\u00ec\7/\2\2\u00ec\u00ed\5\6\4\2\u00ed\u00ee\7\60\2\2\u00ee\u00ef\b\17"+
		"\1\2\u00ef\u013b\3\2\2\2\u00f0\u00f1\t\4\2\2\u00f1\u00f2\7/\2\2\u00f2"+
		"\u00f3\5\6\4\2\u00f3\u00f4\7\60\2\2\u00f4\u00f5\b\17\1\2\u00f5\u013b\3"+
		"\2\2\2\u00f6\u00f7\t\5\2\2\u00f7\u00f8\7/\2\2\u00f8\u00f9\5\6\4\2\u00f9"+
		"\u00fa\7\60\2\2\u00fa\u00fb\b\17\1\2\u00fb\u013b\3\2\2\2\u00fc\u00fd\5"+
		" \21\2\u00fd\u00fe\b\17\1\2\u00fe\u013b\3\2\2\2\u00ff\u0100\5\36\20\2"+
		"\u0100\u0101\b\17\1\2\u0101\u013b\3\2\2\2\u0102\u0103\7\35\2\2\u0103\u0104"+
		"\7/\2\2\u0104\u0105\5\6\4\2\u0105\u0106\7\3\2\2\u0106\u0107\5\6\4\2\u0107"+
		"\u0108\7\60\2\2\u0108\u0109\b\17\1\2\u0109\u013b\3\2\2\2\u010a\u010b\7"+
		"\36\2\2\u010b\u010c\7/\2\2\u010c\u010d\5\6\4\2\u010d\u010e\7\60\2\2\u010e"+
		"\u010f\b\17\1\2\u010f\u013b\3\2\2\2\u0110\u0111\7\37\2\2\u0111\u0112\7"+
		"/\2\2\u0112\u0113\5\6\4\2\u0113\u0114\7\60\2\2\u0114\u0115\b\17\1\2\u0115"+
		"\u013b\3\2\2\2\u0116\u0117\7!\2\2\u0117\u0118\7/\2\2\u0118\u0119\5\6\4"+
		"\2\u0119\u011a\7\60\2\2\u011a\u011b\b\17\1\2\u011b\u013b\3\2\2\2\u011c"+
		"\u011d\7\"\2\2\u011d\u011e\7/\2\2\u011e\u011f\5\6\4\2\u011f\u0120\7\60"+
		"\2\2\u0120\u0121\b\17\1\2\u0121\u013b\3\2\2\2\u0122\u0123\7#\2\2\u0123"+
		"\u0124\7/\2\2\u0124\u0125\5\6\4\2\u0125\u0126\7\60\2\2\u0126\u0127\b\17"+
		"\1\2\u0127\u013b\3\2\2\2\u0128\u0129\7$\2\2\u0129\u012a\7/\2\2\u012a\u012b"+
		"\5\6\4\2\u012b\u012c\7\60\2\2\u012c\u012d\b\17\1\2\u012d\u013b\3\2\2\2"+
		"\u012e\u012f\7%\2\2\u012f\u0130\7/\2\2\u0130\u0131\5\6\4\2\u0131\u0132"+
		"\7\60\2\2\u0132\u0133\b\17\1\2\u0133\u013b\3\2\2\2\u0134\u0135\7&\2\2"+
		"\u0135\u0136\7/\2\2\u0136\u0137\5\6\4\2\u0137\u0138\7\60\2\2\u0138\u0139"+
		"\b\17\1\2\u0139\u013b\3\2\2\2\u013a\u00a8\3\2\2\2\u013a\u00ae\3\2\2\2"+
		"\u013a\u00b4\3\2\2\2\u013a\u00ba\3\2\2\2\u013a\u00c0\3\2\2\2\u013a\u00c6"+
		"\3\2\2\2\u013a\u00cc\3\2\2\2\u013a\u00d2\3\2\2\2\u013a\u00d8\3\2\2\2\u013a"+
		"\u00de\3\2\2\2\u013a\u00e4\3\2\2\2\u013a\u00ea\3\2\2\2\u013a\u00f0\3\2"+
		"\2\2\u013a\u00f6\3\2\2\2\u013a\u00fc\3\2\2\2\u013a\u00ff\3\2\2\2\u013a"+
		"\u0102\3\2\2\2\u013a\u010a\3\2\2\2\u013a\u0110\3\2\2\2\u013a\u0116\3\2"+
		"\2\2\u013a\u011c\3\2\2\2\u013a\u0122\3\2\2\2\u013a\u0128\3\2\2\2\u013a"+
		"\u012e\3\2\2\2\u013a\u0134\3\2\2\2\u013b\35\3\2\2\2\u013c\u013d\7\34\2"+
		"\2\u013d\u013e\7/\2\2\u013e\u013f\5\6\4\2\u013f\u0140\7\3\2\2\u0140\u0141"+
		"\5\6\4\2\u0141\u0142\7\60\2\2\u0142\u0143\b\20\1\2\u0143\u015b\3\2\2\2"+
		"\u0144\u0145\7\34\2\2\u0145\u0146\7/\2\2\u0146\u0147\5\6\4\2\u0147\u0148"+
		"\7\3\2\2\u0148\u0149\5\6\4\2\u0149\u014a\7\3\2\2\u014a\u014b\5\6\4\2\u014b"+
		"\u014c\7\60\2\2\u014c\u014d\b\20\1\2\u014d\u015b\3\2\2\2\u014e\u014f\7"+
		"\34\2\2\u014f\u0150\7/\2\2\u0150\u0151\5\6\4\2\u0151\u0152\7\3\2\2\u0152"+
		"\u0153\5\6\4\2\u0153\u0154\7\3\2\2\u0154\u0155\5\6\4\2\u0155\u0156\7\3"+
		"\2\2\u0156\u0157\5\6\4\2\u0157\u0158\7\60\2\2\u0158\u0159\b\20\1\2\u0159"+
		"\u015b\3\2\2\2\u015a\u013c\3\2\2\2\u015a\u0144\3\2\2\2\u015a\u014e\3\2"+
		"\2\2\u015b\37\3\2\2\2\u015c\u015d\7\33\2\2\u015d\u015e\7/\2\2\u015e\u015f"+
		"\5\6\4\2\u015f\u0160\7\3\2\2\u0160\u0161\5\6\4\2\u0161\u0162\7\60\2\2"+
		"\u0162\u0163\b\21\1\2\u0163\u017b\3\2\2\2\u0164\u0165\7\33\2\2\u0165\u0166"+
		"\7/\2\2\u0166\u0167\5\6\4\2\u0167\u0168\7\3\2\2\u0168\u0169\5\6\4\2\u0169"+
		"\u016a\7\3\2\2\u016a\u016b\5\6\4\2\u016b\u016c\7\60\2\2\u016c\u016d\b"+
		"\21\1\2\u016d\u017b\3\2\2\2\u016e\u016f\7\33\2\2\u016f\u0170\7/\2\2\u0170"+
		"\u0171\5\6\4\2\u0171\u0172\7\3\2\2\u0172\u0173\5\6\4\2\u0173\u0174\7\3"+
		"\2\2\u0174\u0175\5\6\4\2\u0175\u0176\7\3\2\2\u0176\u0177\5\6\4\2\u0177"+
		"\u0178\7\60\2\2\u0178\u0179\b\21\1\2\u0179\u017b\3\2\2\2\u017a\u015c\3"+
		"\2\2\2\u017a\u0164\3\2\2\2\u017a\u016e\3\2\2\2\u017b!\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d#\3\2\2\2\u017e\u017f\7)\2\2\u017f\u0180\7\61\2\2\u0180"+
		"\u0181\5\6\4\2\u0181\u0182\b\23\1\2\u0182\u0188\3\2\2\2\u0183\u0184\7"+
		")\2\2\u0184\u0185\7\61\2\2\u0185\u0186\7)\2\2\u0186\u0188\b\23\1\2\u0187"+
		"\u017e\3\2\2\2\u0187\u0183\3\2\2\2\u0188%\3\2\2\2\20)\65CE\\^p\u0088\u0095"+
		"\u00a3\u013a\u015a\u017a\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}