// Generated from de/lab4inf/wrb/WRB.g4 by ANTLR 4.7
package de.lab4inf.wrb;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WRBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NO=1, SCIENTIFIC_NUMBER=2, ID=3, PARAMS=4, ADD=5, MUL=6, DIV=7, SUB=8, 
		BRACKET_BEGIN=9, BRACKET_END=10, ASSIGN=11, END=12, NEWLINE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SIGN", "E", "NUMBER", "NO", "SCIENTIFIC_NUMBER", "ID", "PARAMS", "ADD", 
		"MUL", "DIV", "SUB", "BRACKET_BEGIN", "BRACKET_END", "ASSIGN", "END", 
		"NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'+'", "'*'", "'/'", "'-'", "'('", "')'", 
		"'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NO", "SCIENTIFIC_NUMBER", "ID", "PARAMS", "ADD", "MUL", "DIV", 
		"SUB", "BRACKET_BEGIN", "BRACKET_END", "ASSIGN", "END", "NEWLINE", "WS"
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


	public WRBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WRB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\6\4\61\n\4\r\4\16\4\62"+
		"\5\4\65\n\4\3\5\5\58\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\6\7"+
		"D\n\7\r\7\16\7E\3\7\7\7I\n\7\f\7\16\7L\13\7\3\b\3\b\3\b\7\bQ\n\b\f\b\16"+
		"\bT\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\5\21i\n\21\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23"+
		"\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37"+
		"\16!\17#\20\3\2\7\4\2GGgg\4\2--//\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13"+
		"\"\"\2u\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7*"+
		"\3\2\2\2\t\67\3\2\2\2\13;\3\2\2\2\rC\3\2\2\2\17R\3\2\2\2\21W\3\2\2\2\23"+
		"Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2"+
		"\37e\3\2\2\2!h\3\2\2\2#l\3\2\2\2%&\7/\2\2&\4\3\2\2\2\'(\t\2\2\2(\6\3\2"+
		"\2\2)+\4\62;\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\64\3\2\2\2.\60"+
		"\7\60\2\2/\61\4\62;\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\65\3\2\2\2\64.\3\2\2\2\64\65\3\2\2\2\65\b\3\2\2\2\668\5\3\2"+
		"\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\13\6\2:\n\3\2\2\2;@\5\7\4\2"+
		"<=\5\5\3\2=>\t\3\2\2>?\5\7\4\2?A\3\2\2\2@<\3\2\2\2@A\3\2\2\2A\f\3\2\2"+
		"\2BD\t\4\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GI\t\5\2"+
		"\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\16\3\2\2\2LJ\3\2\2\2MN\5\r"+
		"\7\2NO\7.\2\2OQ\3\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2"+
		"\2\2TR\3\2\2\2UV\5\r\7\2V\20\3\2\2\2WX\7-\2\2X\22\3\2\2\2YZ\7,\2\2Z\24"+
		"\3\2\2\2[\\\7\61\2\2\\\26\3\2\2\2]^\7/\2\2^\30\3\2\2\2_`\7*\2\2`\32\3"+
		"\2\2\2ab\7+\2\2b\34\3\2\2\2cd\7?\2\2d\36\3\2\2\2ef\7=\2\2f \3\2\2\2gi"+
		"\7\17\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\f\2\2k\"\3\2\2\2lm\t\6\2\2"+
		"mn\3\2\2\2no\b\22\2\2o$\3\2\2\2\16\2,\62\64\67@CEHJRh\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}