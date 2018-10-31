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
		NO=1, ID=2, PARAMS=3, ADD=4, MUL=5, DIV=6, SUB=7, BRACKET_BEGIN=8, BRACKET_END=9, 
		ASSIGN=10, END=11, NEWLINE=12, WS=13;
	public static final int
		RULE_run = 0, RULE_statement = 1, RULE_mathFunc = 2, RULE_expr = 3, RULE_assignVar = 4, 
		RULE_assignFunc = 5;
	public static final String[] ruleNames = {
		"run", "statement", "mathFunc", "expr", "assignVar", "assignFunc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'+'", "'*'", "'/'", "'-'", "'('", "')'", "'='", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NO", "ID", "PARAMS", "ADD", "MUL", "DIV", "SUB", "BRACKET_BEGIN", 
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(12);
					((RunContext)_localctx).s = statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(15); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				((StatementContext)_localctx).exp = expr(0);
				setState(20);
				_la = _input.LA(1);
				if ( !(_la==END || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((StatementContext)_localctx).v =  ((StatementContext)_localctx).exp.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				assignVar();
				setState(24);
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				assignFunc();
				setState(27);
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public double value;
		public ExprContext mul1;
		public ExprContext div1;
		public ExprContext sum1;
		public ExprContext sub1;
		public Token n;
		public Token i;
		public ExprContext exp;
		public MathFuncContext f;
		public ExprContext mul2;
		public ExprContext div2;
		public ExprContext sum2;
		public ExprContext sub2;
		public TerminalNode NO() { return getToken(WRBParser.NO, 0); }
		public TerminalNode ID() { return getToken(WRBParser.ID, 0); }
		public TerminalNode BRACKET_BEGIN() { return getToken(WRBParser.BRACKET_BEGIN, 0); }
		public TerminalNode BRACKET_END() { return getToken(WRBParser.BRACKET_END, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MathFuncContext mathFunc() {
			return getRuleContext(MathFuncContext.class,0);
		}
		public TerminalNode MUL() { return getToken(WRBParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(WRBParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(WRBParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(WRBParser.SUB, 0); }
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(35);
				((ExprContext)_localctx).n = match(NO);
				((ExprContext)_localctx).value =  Double.parseDouble((((ExprContext)_localctx).n!=null?((ExprContext)_localctx).n.getText():null));
				}
				break;
			case 2:
				{
				setState(37);
				((ExprContext)_localctx).i = match(ID);
				((ExprContext)_localctx).value =  varMemory.get((((ExprContext)_localctx).i!=null?((ExprContext)_localctx).i.getText():null));
				}
				break;
			case 3:
				{
				setState(39);
				match(BRACKET_BEGIN);
				setState(40);
				((ExprContext)_localctx).exp = expr(0);
				setState(41);
				match(BRACKET_END);
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).exp.value;
				}
				break;
			case 4:
				{
				setState(44);
				((ExprContext)_localctx).f = mathFunc();
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).f.v;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.mul1 = _prevctx;
						_localctx.mul1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(49);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(50);
						match(MUL);
						setState(51);
						((ExprContext)_localctx).mul2 = expr(6);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).mul1.value * ((ExprContext)_localctx).mul2.value;
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.div1 = _prevctx;
						_localctx.div1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(55);
						match(DIV);
						setState(56);
						((ExprContext)_localctx).div2 = expr(5);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).div1.value / ((ExprContext)_localctx).div2.value;
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.sum1 = _prevctx;
						_localctx.sum1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(60);
						match(ADD);
						setState(61);
						((ExprContext)_localctx).sum2 = expr(4);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).sum1.value + ((ExprContext)_localctx).sum2.value;
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.sub1 = _prevctx;
						_localctx.sub1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(65);
						match(SUB);
						setState(66);
						((ExprContext)_localctx).sub2 = expr(3);
						((ExprContext)_localctx).value =  ((ExprContext)_localctx).sub1.value - ((ExprContext)_localctx).sub2.value;
						}
						break;
					}
					} 
				}
				setState(73);
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

	public static class AssignVarContext extends ParserRuleContext {
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
		enterRule(_localctx, 8, RULE_assignVar);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((AssignVarContext)_localctx).i = match(ID);
				setState(75);
				match(ASSIGN);
				setState(76);
				((AssignVarContext)_localctx).exp = expr(0);
				varMemory.put((((AssignVarContext)_localctx).i!=null?((AssignVarContext)_localctx).i.getText():null), ((AssignVarContext)_localctx).exp.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				((AssignVarContext)_localctx).i = match(ID);
				setState(80);
				match(ASSIGN);
				setState(81);
				((AssignVarContext)_localctx).j = match(ID);
				varMemory.put((((AssignVarContext)_localctx).i!=null?((AssignVarContext)_localctx).i.getText():null), varMemory.get((((AssignVarContext)_localctx).j!=null?((AssignVarContext)_localctx).j.getText():null)));
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
		enterRule(_localctx, 10, RULE_assignFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((AssignFuncContext)_localctx).name = match(ID);
			setState(86);
			match(BRACKET_BEGIN);
			setState(87);
			((AssignFuncContext)_localctx).params = match(PARAMS);
			setState(88);
			match(BRACKET_END);
			setState(89);
			match(ASSIGN);
			setState(90);
			((AssignFuncContext)_localctx).exp = expr(0);
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
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\62\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"H\n\5\f\5\16\5K\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6V\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\2\3\b\b\2\4\6\b\n\f\2\3\3\2\r\16\2d\2\17"+
		"\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b\61\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16"+
		"\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22"+
		"\23\3\2\2\2\23\24\b\2\1\2\24\3\3\2\2\2\25\26\5\b\5\2\26\27\t\2\2\2\27"+
		"\30\b\3\1\2\30!\3\2\2\2\31\32\5\n\6\2\32\33\t\2\2\2\33!\3\2\2\2\34\35"+
		"\5\f\7\2\35\36\t\2\2\2\36!\3\2\2\2\37!\7\16\2\2 \25\3\2\2\2 \31\3\2\2"+
		"\2 \34\3\2\2\2 \37\3\2\2\2!\5\3\2\2\2\"#\3\2\2\2#\7\3\2\2\2$%\b\5\1\2"+
		"%&\7\3\2\2&\62\b\5\1\2\'(\7\4\2\2(\62\b\5\1\2)*\7\n\2\2*+\5\b\5\2+,\7"+
		"\13\2\2,-\b\5\1\2-\62\3\2\2\2./\5\6\4\2/\60\b\5\1\2\60\62\3\2\2\2\61$"+
		"\3\2\2\2\61\'\3\2\2\2\61)\3\2\2\2\61.\3\2\2\2\62I\3\2\2\2\63\64\f\7\2"+
		"\2\64\65\7\7\2\2\65\66\5\b\5\b\66\67\b\5\1\2\67H\3\2\2\289\f\6\2\29:\7"+
		"\b\2\2:;\5\b\5\7;<\b\5\1\2<H\3\2\2\2=>\f\5\2\2>?\7\6\2\2?@\5\b\5\6@A\b"+
		"\5\1\2AH\3\2\2\2BC\f\4\2\2CD\7\t\2\2DE\5\b\5\5EF\b\5\1\2FH\3\2\2\2G\63"+
		"\3\2\2\2G8\3\2\2\2G=\3\2\2\2GB\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J"+
		"\t\3\2\2\2KI\3\2\2\2LM\7\4\2\2MN\7\f\2\2NO\5\b\5\2OP\b\6\1\2PV\3\2\2\2"+
		"QR\7\4\2\2RS\7\f\2\2ST\7\4\2\2TV\b\6\1\2UL\3\2\2\2UQ\3\2\2\2V\13\3\2\2"+
		"\2WX\7\4\2\2XY\7\n\2\2YZ\7\5\2\2Z[\7\13\2\2[\\\7\f\2\2\\]\5\b\5\2]\r\3"+
		"\2\2\2\b\21 \61GIU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}