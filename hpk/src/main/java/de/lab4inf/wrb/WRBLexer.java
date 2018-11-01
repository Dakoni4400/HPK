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
		SCI_NO=1, ID=2, PARAMS=3, ADD=4, MUL=5, DIV=6, SUB=7, POW=8, BRACKET_BEGIN=9, 
		BRACKET_END=10, ASSIGN=11, END=12, NEWLINE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"E", "NUMBER", "SCI_NO", "ID", "PARAMS", "ADD", "MUL", "DIV", "SUB", "POW", 
		"BRACKET_BEGIN", "BRACKET_END", "ASSIGN", "END", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\6\3\'\n\3\r\3\16\3(\3\3\3\3\6\3-\n\3\r\3\16\3.\5\3\61\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\5\48\n\4\3\5\6\5;\n\5\r\5\16\5<\3\5\7\5@\n\5\f\5\16\5C\13\5"+
		"\3\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\5\13Z\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\5\20e\n\20\3\20\3\20\3\21\3\21\3\21\3\21\2\2\22\3\2\5\2\7\3\t\4\13"+
		"\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20\3\2\b\4\2G"+
		"Ggg\3\2\62;\4\2--//\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2r\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5&\3\2\2\2\7\62\3\2\2\2\t:\3"+
		"\2\2\2\13I\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25Y"+
		"\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2\37d\3\2\2\2!"+
		"h\3\2\2\2#$\t\2\2\2$\4\3\2\2\2%\'\t\3\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2"+
		"\2()\3\2\2\2)\60\3\2\2\2*,\7\60\2\2+-\t\3\2\2,+\3\2\2\2-.\3\2\2\2.,\3"+
		"\2\2\2./\3\2\2\2/\61\3\2\2\2\60*\3\2\2\2\60\61\3\2\2\2\61\6\3\2\2\2\62"+
		"\67\5\5\3\2\63\64\5\3\2\2\64\65\t\4\2\2\65\66\5\5\3\2\668\3\2\2\2\67\63"+
		"\3\2\2\2\678\3\2\2\28\b\3\2\2\29;\t\5\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=A\3\2\2\2>@\t\6\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2"+
		"\2B\n\3\2\2\2CA\3\2\2\2DE\5\t\5\2EF\7.\2\2FH\3\2\2\2GD\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\5\t\5\2M\f\3\2\2\2NO\7-\2"+
		"\2O\16\3\2\2\2PQ\7,\2\2Q\20\3\2\2\2RS\7\61\2\2S\22\3\2\2\2TU\7/\2\2U\24"+
		"\3\2\2\2VW\7,\2\2WZ\7,\2\2XZ\7`\2\2YV\3\2\2\2YX\3\2\2\2Z\26\3\2\2\2[\\"+
		"\7*\2\2\\\30\3\2\2\2]^\7+\2\2^\32\3\2\2\2_`\7?\2\2`\34\3\2\2\2ab\7=\2"+
		"\2b\36\3\2\2\2ce\7\17\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\f\2\2g \3"+
		"\2\2\2hi\t\7\2\2ij\3\2\2\2jk\b\21\2\2k\"\3\2\2\2\16\2(.\60\67:<?AIYd\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}