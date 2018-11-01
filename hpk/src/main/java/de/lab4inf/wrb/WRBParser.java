// Generated from de/lab4inf/wrb/WRB.g4 by ANTLR 4.7
package de.lab4inf.wrb;

	import org.antlr.v4.runtime.*;

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
		SCI_NO=1, ID=2, PARAMS=3, ADD=4, MUL=5, DIV=6, SUB=7, POW=8, BRACKET_BEGIN=9, 
		BRACKET_END=10, ASSIGN=11, END=12, NEWLINE=13, WS=14;
	public static final int
		RULE_run = 0, RULE_statement = 1, RULE_mathFunc = 2, RULE_pow = 3, RULE_expr = 4, 
		RULE_exprAdd = 5, RULE_exprSub = 6, RULE_term = 7, RULE_termMul = 8, RULE_termDiv = 9, 
		RULE_factor = 10, RULE_signedAtom = 11, RULE_atom = 12, RULE_assignVar = 13, 
		RULE_assignFunc = 14;
	public static final String[] ruleNames = {
		"run", "statement", "mathFunc", "pow", "expr", "exprAdd", "exprSub", "term", 
		"termMul", "termDiv", "factor", "signedAtom", "atom", "assignVar", "assignFunc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'+'", "'*'", "'/'", "'-'", null, "'('", "')'", 
		"'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCI_NO", "ID", "PARAMS", "ADD", "MUL", "DIV", "SUB", "POW", "BRACKET_BEGIN", 
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				((RunContext)_localctx).s = statement();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCI_NO) | (1L << ID) | (1L << ADD) | (1L << SUB) | (1L << BRACKET_BEGIN))) != 0) );
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((StatementContext)_localctx).exp = expr();
				setState(38);
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
				setState(41);
				((StatementContext)_localctx).a = assignVar();
				setState(42);
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
				setState(45);
				assignFunc();
				setState(46);
				_la = _input.LA(1);
				if ( !(_la==END || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class MathFuncContext extends ParserRuleContext {
		public double v;
		public MathFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).enterMathFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WRBListener ) ((WRBListener)listener).exitMathFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WRBVisitor ) return ((WRBVisitor<? extends T>)visitor).visitMathFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathFuncContext mathFunc() throws RecognitionException {
		MathFuncContext _localctx = new MathFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mathFunc);
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
		enterRule(_localctx, 6, RULE_pow);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(POW);
				setState(53);
				match(BRACKET_BEGIN);
				setState(54);
				((PowContext)_localctx).e = expr();
				setState(55);
				match(BRACKET_END);
				((PowContext)_localctx).v =  ((PowContext)_localctx).e.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(POW);
				setState(59);
				((PowContext)_localctx).n = match(SCI_NO);
				setState(60);
				((PowContext)_localctx).p = pow();
				((PowContext)_localctx).v =  java.lang.Math.pow(Double.parseDouble((((PowContext)_localctx).n!=null?((PowContext)_localctx).n.getText():null)), ((PowContext)_localctx).p.v);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(POW);
				setState(64);
				((PowContext)_localctx).i = match(ID);
				setState(65);
				((PowContext)_localctx).p = pow();
				((PowContext)_localctx).v =  java.lang.Math.pow(varMemory.get((((PowContext)_localctx).i!=null?((PowContext)_localctx).i.getText():null)), ((PowContext)_localctx).p.v);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(POW);
				setState(69);
				((PowContext)_localctx).n = match(SCI_NO);
				((PowContext)_localctx).v =  Double.parseDouble((((PowContext)_localctx).n!=null?((PowContext)_localctx).n.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				match(POW);
				setState(72);
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

	public static class ExprContext extends ParserRuleContext {
		public double v;
		public TermContext t;
		public TermContext t1;
		public ExprAddContext a;
		public ExprSubContext s;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				((ExprContext)_localctx).t = term();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).t.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				((ExprContext)_localctx).t1 = term();
				setState(80);
				((ExprContext)_localctx).a = exprAdd();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).t1.v + ((ExprContext)_localctx).a.v;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				((ExprContext)_localctx).t1 = term();
				setState(84);
				((ExprContext)_localctx).s = exprSub();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).t1.v - ((ExprContext)_localctx).s.v;
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
		enterRule(_localctx, 10, RULE_exprAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ADD);
			setState(90);
			((ExprAddContext)_localctx).t = term();
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
		enterRule(_localctx, 12, RULE_exprSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(SUB);
			setState(94);
			((ExprSubContext)_localctx).t = term();
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
		public FactorContext f;
		public FactorContext f1;
		public TermMulContext m;
		public TermDivContext d;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
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
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				((TermContext)_localctx).f = factor();
				((TermContext)_localctx).v =  ((TermContext)_localctx).f.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				((TermContext)_localctx).f1 = factor();
				setState(101);
				((TermContext)_localctx).m = termMul();
				((TermContext)_localctx).v =  ((TermContext)_localctx).f1.v * ((TermContext)_localctx).m.v;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				((TermContext)_localctx).f1 = factor();
				setState(105);
				((TermContext)_localctx).d = termDiv();
				((TermContext)_localctx).v =  ((TermContext)_localctx).f1.v / ((TermContext)_localctx).d.v;
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
		enterRule(_localctx, 16, RULE_termMul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(MUL);
			setState(111);
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
		enterRule(_localctx, 18, RULE_termDiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(DIV);
			setState(115);
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
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((FactorContext)_localctx).a = signedAtom();
				((FactorContext)_localctx).v =  ((FactorContext)_localctx).a.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((FactorContext)_localctx).b = signedAtom();
				setState(122);
				((FactorContext)_localctx).p = pow();
				((FactorContext)_localctx).v =  java.lang.Math.pow(((FactorContext)_localctx).b.v, ((FactorContext)_localctx).p.v);
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
		enterRule(_localctx, 22, RULE_signedAtom);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(ADD);
				setState(128);
				((SignedAtomContext)_localctx).a = atom();
				((SignedAtomContext)_localctx).v =  ((SignedAtomContext)_localctx).a.v;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(SUB);
				setState(132);
				((SignedAtomContext)_localctx).a = atom();
				((SignedAtomContext)_localctx).v =  -1*((SignedAtomContext)_localctx).a.v;
				}
				break;
			case SCI_NO:
			case ID:
			case BRACKET_BEGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
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
		public Token i;
		public ExprContext e;
		public TerminalNode SCI_NO() { return getToken(WRBParser.SCI_NO, 0); }
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_atom);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCI_NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((AtomContext)_localctx).n = match(SCI_NO);
				((AtomContext)_localctx).v =  Double.parseDouble((((AtomContext)_localctx).n!=null?((AtomContext)_localctx).n.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((AtomContext)_localctx).i = match(ID);
				((AtomContext)_localctx).v =  varMemory.get((((AtomContext)_localctx).i!=null?((AtomContext)_localctx).i.getText():null));
				}
				break;
			case BRACKET_BEGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(BRACKET_BEGIN);
				setState(145);
				((AtomContext)_localctx).e = expr();
				setState(146);
				match(BRACKET_END);
				((AtomContext)_localctx).v =  ((AtomContext)_localctx).e.v;
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
		enterRule(_localctx, 26, RULE_assignVar);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((AssignVarContext)_localctx).i = match(ID);
				setState(152);
				match(ASSIGN);
				setState(153);
				((AssignVarContext)_localctx).exp = expr();
				varMemory.put((((AssignVarContext)_localctx).i!=null?((AssignVarContext)_localctx).i.getText():null), ((AssignVarContext)_localctx).exp.v); ((AssignVarContext)_localctx).v =  ((AssignVarContext)_localctx).exp.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				((AssignVarContext)_localctx).i = match(ID);
				setState(157);
				match(ASSIGN);
				setState(158);
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

	public static class AssignFuncContext extends ParserRuleContext {
		public Token name;
		public Token params;
		public ExprContext exp;
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public TerminalNode PARAMS() { return getToken(WRBParser.PARAMS, 0); }
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
		enterRule(_localctx, 28, RULE_assignFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((AssignFuncContext)_localctx).name = match(ID);
			setState(163);
			match(BRACKET_BEGIN);
			setState(164);
			((AssignFuncContext)_localctx).params = match(PARAMS);
			setState(165);
			match(BRACKET_END);
			setState(166);
			match(ASSIGN);
			setState(167);
			((AssignFuncContext)_localctx).exp = expr();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u00ac\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0098\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00a3\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36\2\3\3\2\16\17\2\u00ad\2!\3\2\2\2\4\62\3\2"+
		"\2\2\6\64\3\2\2\2\bL\3\2\2\2\nY\3\2\2\2\f[\3\2\2\2\16_\3\2\2\2\20n\3\2"+
		"\2\2\22p\3\2\2\2\24t\3\2\2\2\26\177\3\2\2\2\30\u008c\3\2\2\2\32\u0097"+
		"\3\2\2\2\34\u00a2\3\2\2\2\36\u00a4\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\b\2\1\2&\3\3\2\2\2\'(\5\n\6\2()\t"+
		"\2\2\2)*\b\3\1\2*\63\3\2\2\2+,\5\34\17\2,-\t\2\2\2-.\b\3\1\2.\63\3\2\2"+
		"\2/\60\5\36\20\2\60\61\t\2\2\2\61\63\3\2\2\2\62\'\3\2\2\2\62+\3\2\2\2"+
		"\62/\3\2\2\2\63\5\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\66\67\7\n\2\2\67"+
		"8\7\13\2\289\5\n\6\29:\7\f\2\2:;\b\5\1\2;M\3\2\2\2<=\7\n\2\2=>\7\3\2\2"+
		">?\5\b\5\2?@\b\5\1\2@M\3\2\2\2AB\7\n\2\2BC\7\4\2\2CD\5\b\5\2DE\b\5\1\2"+
		"EM\3\2\2\2FG\7\n\2\2GH\7\3\2\2HM\b\5\1\2IJ\7\n\2\2JK\7\4\2\2KM\b\5\1\2"+
		"L\66\3\2\2\2L<\3\2\2\2LA\3\2\2\2LF\3\2\2\2LI\3\2\2\2M\t\3\2\2\2NO\5\20"+
		"\t\2OP\b\6\1\2PZ\3\2\2\2QR\5\20\t\2RS\5\f\7\2ST\b\6\1\2TZ\3\2\2\2UV\5"+
		"\20\t\2VW\5\16\b\2WX\b\6\1\2XZ\3\2\2\2YN\3\2\2\2YQ\3\2\2\2YU\3\2\2\2Z"+
		"\13\3\2\2\2[\\\7\6\2\2\\]\5\20\t\2]^\b\7\1\2^\r\3\2\2\2_`\7\t\2\2`a\5"+
		"\20\t\2ab\b\b\1\2b\17\3\2\2\2cd\5\26\f\2de\b\t\1\2eo\3\2\2\2fg\5\26\f"+
		"\2gh\5\22\n\2hi\b\t\1\2io\3\2\2\2jk\5\26\f\2kl\5\24\13\2lm\b\t\1\2mo\3"+
		"\2\2\2nc\3\2\2\2nf\3\2\2\2nj\3\2\2\2o\21\3\2\2\2pq\7\7\2\2qr\5\26\f\2"+
		"rs\b\n\1\2s\23\3\2\2\2tu\7\b\2\2uv\5\26\f\2vw\b\13\1\2w\25\3\2\2\2xy\5"+
		"\30\r\2yz\b\f\1\2z\u0080\3\2\2\2{|\5\30\r\2|}\5\b\5\2}~\b\f\1\2~\u0080"+
		"\3\2\2\2\177x\3\2\2\2\177{\3\2\2\2\u0080\27\3\2\2\2\u0081\u0082\7\6\2"+
		"\2\u0082\u0083\5\32\16\2\u0083\u0084\b\r\1\2\u0084\u008d\3\2\2\2\u0085"+
		"\u0086\7\t\2\2\u0086\u0087\5\32\16\2\u0087\u0088\b\r\1\2\u0088\u008d\3"+
		"\2\2\2\u0089\u008a\5\32\16\2\u008a\u008b\b\r\1\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0081\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0089\3\2\2\2\u008d\31\3\2\2"+
		"\2\u008e\u008f\7\3\2\2\u008f\u0098\b\16\1\2\u0090\u0091\7\4\2\2\u0091"+
		"\u0098\b\16\1\2\u0092\u0093\7\13\2\2\u0093\u0094\5\n\6\2\u0094\u0095\7"+
		"\f\2\2\u0095\u0096\b\16\1\2\u0096\u0098\3\2\2\2\u0097\u008e\3\2\2\2\u0097"+
		"\u0090\3\2\2\2\u0097\u0092\3\2\2\2\u0098\33\3\2\2\2\u0099\u009a\7\4\2"+
		"\2\u009a\u009b\7\r\2\2\u009b\u009c\5\n\6\2\u009c\u009d\b\17\1\2\u009d"+
		"\u00a3\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\7\4"+
		"\2\2\u00a1\u00a3\b\17\1\2\u00a2\u0099\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3"+
		"\35\3\2\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7\7\5\2"+
		"\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\7\r\2\2\u00a9\u00aa\5\n\6\2\u00aa\37"+
		"\3\2\2\2\13#\62LYn\177\u008c\u0097\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}