// Generated from C:/Users/Taha/Desktop/compiler_prg1/src\ACTon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACTonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MSGHANDLER=1, INITIAL=2, EXTENDS=3, ACTORVARS=4, KNOWNACTORS=5, ACTOR=6, 
		PRINT=7, FOR=8, ELSE=9, IF=10, SENDER=11, SELF=12, MAIN=13, STRING=14, 
		BOOLEAN=15, INT=16, CONTINUE=17, BREAK=18, STRINGVALUE=19, INTVALUE=20, 
		BOOLEANVALUE=21, WS=22, COMMENT=23, COMMENTLINE=24, IDENTIFIER=25, COMMA=26, 
		COLON=27, SEMICOLON=28, RBRACE=29, LBRACE=30, RPARENTH=31, LPARENTH=32, 
		LSQBRACE=33, RSQBRACE=34, PLUS=35, MINUS=36, MULT=37, DIV=38, MOD=39, 
		PLUSPLUS=40, MINUSMINUS=41, ISEQUAL=42, NOTEQUAL=43, LT=44, GT=45, AND=46, 
		OR=47, NOT=48, EQUALS=49, DOT=50, QUESTION=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MSGHANDLER", "INITIAL", "EXTENDS", "ACTORVARS", "KNOWNACTORS", "ACTOR", 
			"PRINT", "FOR", "ELSE", "IF", "SENDER", "SELF", "MAIN", "STRING", "BOOLEAN", 
			"INT", "CONTINUE", "BREAK", "STRINGVALUE", "INTVALUE", "BOOLEANVALUE", 
			"WS", "COMMENT", "COMMENTLINE", "IDENTIFIER", "COMMA", "COLON", "SEMICOLON", 
			"RBRACE", "LBRACE", "RPARENTH", "LPARENTH", "LSQBRACE", "RSQBRACE", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "PLUSPLUS", "MINUSMINUS", "ISEQUAL", "NOTEQUAL", 
			"LT", "GT", "AND", "OR", "NOT", "EQUALS", "DOT", "QUESTION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'msghandler'", "'initial'", "'extends'", "'actorvars'", "'knownactors'", 
			"'actor'", "'print'", "'for'", "'else'", "'if'", "'sender'", "'self'", 
			"'main'", "'string'", "'boolean'", "'int'", "'continue'", "'break'", 
			null, null, null, null, "'//'", null, null, "','", "':'", "';'", "'}'", 
			"'{'", "')'", "'('", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'++'", "'--'", "'=='", "'!='", "'<'", "'>'", "'&&'", "'||'", "'!'", 
			"'='", "'.'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MSGHANDLER", "INITIAL", "EXTENDS", "ACTORVARS", "KNOWNACTORS", 
			"ACTOR", "PRINT", "FOR", "ELSE", "IF", "SENDER", "SELF", "MAIN", "STRING", 
			"BOOLEAN", "INT", "CONTINUE", "BREAK", "STRINGVALUE", "INTVALUE", "BOOLEANVALUE", 
			"WS", "COMMENT", "COMMENTLINE", "IDENTIFIER", "COMMA", "COLON", "SEMICOLON", 
			"RBRACE", "LBRACE", "RPARENTH", "LPARENTH", "LSQBRACE", "RSQBRACE", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "PLUSPLUS", "MINUSMINUS", "ISEQUAL", "NOTEQUAL", 
			"LT", "GT", "AND", "OR", "NOT", "EQUALS", "DOT", "QUESTION"
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


	public ACTonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ACTon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u015b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24"+
		"\u00e8\n\24\f\24\16\24\u00eb\13\24\3\24\3\24\3\25\3\25\6\25\u00f1\n\25"+
		"\r\25\16\25\u00f2\3\25\7\25\u00f6\n\25\f\25\16\25\u00f9\13\25\5\25\u00fb"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0106\n\26\3\27"+
		"\6\27\u0109\n\27\r\27\16\27\u010a\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\7\31\u0116\n\31\f\31\16\31\u0119\13\31\3\31\3\31\3\32\6\32\u011e"+
		"\n\32\r\32\16\32\u011f\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\t\3\2$$\3\2\62\62\3\2\63;\3\2\62"+
		";\5\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2\62;C\\c|\2\u0162\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5t\3\2\2\2\7|\3\2\2\2\t\u0084\3\2"+
		"\2\2\13\u008e\3\2\2\2\r\u009a\3\2\2\2\17\u00a0\3\2\2\2\21\u00a6\3\2\2"+
		"\2\23\u00aa\3\2\2\2\25\u00af\3\2\2\2\27\u00b2\3\2\2\2\31\u00b9\3\2\2\2"+
		"\33\u00be\3\2\2\2\35\u00c3\3\2\2\2\37\u00ca\3\2\2\2!\u00d2\3\2\2\2#\u00d6"+
		"\3\2\2\2%\u00df\3\2\2\2\'\u00e5\3\2\2\2)\u00fa\3\2\2\2+\u0105\3\2\2\2"+
		"-\u0108\3\2\2\2/\u010e\3\2\2\2\61\u0113\3\2\2\2\63\u011d\3\2\2\2\65\u0121"+
		"\3\2\2\2\67\u0123\3\2\2\29\u0125\3\2\2\2;\u0127\3\2\2\2=\u0129\3\2\2\2"+
		"?\u012b\3\2\2\2A\u012d\3\2\2\2C\u012f\3\2\2\2E\u0131\3\2\2\2G\u0133\3"+
		"\2\2\2I\u0135\3\2\2\2K\u0137\3\2\2\2M\u0139\3\2\2\2O\u013b\3\2\2\2Q\u013d"+
		"\3\2\2\2S\u0140\3\2\2\2U\u0143\3\2\2\2W\u0146\3\2\2\2Y\u0149\3\2\2\2["+
		"\u014b\3\2\2\2]\u014d\3\2\2\2_\u0150\3\2\2\2a\u0153\3\2\2\2c\u0155\3\2"+
		"\2\2e\u0157\3\2\2\2g\u0159\3\2\2\2ij\7o\2\2jk\7u\2\2kl\7i\2\2lm\7j\2\2"+
		"mn\7c\2\2no\7p\2\2op\7f\2\2pq\7n\2\2qr\7g\2\2rs\7t\2\2s\4\3\2\2\2tu\7"+
		"k\2\2uv\7p\2\2vw\7k\2\2wx\7v\2\2xy\7k\2\2yz\7c\2\2z{\7n\2\2{\6\3\2\2\2"+
		"|}\7g\2\2}~\7z\2\2~\177\7v\2\2\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081"+
		"\u0082\7f\2\2\u0082\u0083\7u\2\2\u0083\b\3\2\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7e\2\2\u0086\u0087\7v\2\2\u0087\u0088\7q\2\2\u0088\u0089\7t\2\2"+
		"\u0089\u008a\7x\2\2\u008a\u008b\7c\2\2\u008b\u008c\7t\2\2\u008c\u008d"+
		"\7u\2\2\u008d\n\3\2\2\2\u008e\u008f\7m\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0092\7y\2\2\u0092\u0093\7p\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7e\2\2\u0095\u0096\7v\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2"+
		"\u0098\u0099\7u\2\2\u0099\f\3\2\2\2\u009a\u009b\7c\2\2\u009b\u009c\7e"+
		"\2\2\u009c\u009d\7v\2\2\u009d\u009e\7q\2\2\u009e\u009f\7t\2\2\u009f\16"+
		"\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae\24\3\2\2\2\u00af"+
		"\u00b0\7k\2\2\u00b0\u00b1\7h\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7g\2\2"+
		"\u00b7\u00b8\7t\2\2\u00b8\30\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7"+
		"g\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7h\2\2\u00bd\32\3\2\2\2\u00be\u00bf"+
		"\7o\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\34\3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7i\2\2\u00c9\36\3\2\2\2\u00ca"+
		"\u00cb\7d\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7n\2\2"+
		"\u00ce\u00cf\7g\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7p\2\2\u00d1 \3\2\2"+
		"\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\"\3"+
		"\2\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"\u00da\7v\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7w\2\2"+
		"\u00dd\u00de\7g\2\2\u00de$\3\2\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7t\2"+
		"\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7m\2\2\u00e4&\3\2"+
		"\2\2\u00e5\u00e9\7$\2\2\u00e6\u00e8\n\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7$\2\2\u00ed(\3\2\2\2\u00ee\u00fb"+
		"\t\3\2\2\u00ef\u00f1\t\4\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\t\5"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00ee\3\2"+
		"\2\2\u00fa\u00f0\3\2\2\2\u00fb*\3\2\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe"+
		"\7t\2\2\u00fe\u00ff\7w\2\2\u00ff\u0106\7g\2\2\u0100\u0101\7h\2\2\u0101"+
		"\u0102\7c\2\2\u0102\u0103\7n\2\2\u0103\u0104\7u\2\2\u0104\u0106\7g\2\2"+
		"\u0105\u00fc\3\2\2\2\u0105\u0100\3\2\2\2\u0106,\3\2\2\2\u0107\u0109\t"+
		"\6\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b\27\2\2\u010d.\3\2\2\2"+
		"\u010e\u010f\7\61\2\2\u010f\u0110\7\61\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\b\30\2\2\u0112\60\3\2\2\2\u0113\u0117\5/\30\2\u0114\u0116\n\7\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\b\31\2\2\u011b"+
		"\62\3\2\2\2\u011c\u011e\t\b\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2"+
		"\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\64\3\2\2\2\u0121\u0122"+
		"\7.\2\2\u0122\66\3\2\2\2\u0123\u0124\7<\2\2\u01248\3\2\2\2\u0125\u0126"+
		"\7=\2\2\u0126:\3\2\2\2\u0127\u0128\7\177\2\2\u0128<\3\2\2\2\u0129\u012a"+
		"\7}\2\2\u012a>\3\2\2\2\u012b\u012c\7+\2\2\u012c@\3\2\2\2\u012d\u012e\7"+
		"*\2\2\u012eB\3\2\2\2\u012f\u0130\7]\2\2\u0130D\3\2\2\2\u0131\u0132\7_"+
		"\2\2\u0132F\3\2\2\2\u0133\u0134\7-\2\2\u0134H\3\2\2\2\u0135\u0136\7/\2"+
		"\2\u0136J\3\2\2\2\u0137\u0138\7,\2\2\u0138L\3\2\2\2\u0139\u013a\7\61\2"+
		"\2\u013aN\3\2\2\2\u013b\u013c\7\'\2\2\u013cP\3\2\2\2\u013d\u013e\7-\2"+
		"\2\u013e\u013f\7-\2\2\u013fR\3\2\2\2\u0140\u0141\7/\2\2\u0141\u0142\7"+
		"/\2\2\u0142T\3\2\2\2\u0143\u0144\7?\2\2\u0144\u0145\7?\2\2\u0145V\3\2"+
		"\2\2\u0146\u0147\7#\2\2\u0147\u0148\7?\2\2\u0148X\3\2\2\2\u0149\u014a"+
		"\7>\2\2\u014aZ\3\2\2\2\u014b\u014c\7@\2\2\u014c\\\3\2\2\2\u014d\u014e"+
		"\7(\2\2\u014e\u014f\7(\2\2\u014f^\3\2\2\2\u0150\u0151\7~\2\2\u0151\u0152"+
		"\7~\2\2\u0152`\3\2\2\2\u0153\u0154\7#\2\2\u0154b\3\2\2\2\u0155\u0156\7"+
		"?\2\2\u0156d\3\2\2\2\u0157\u0158\7\60\2\2\u0158f\3\2\2\2\u0159\u015a\7"+
		"A\2\2\u015ah\3\2\2\2\13\2\u00e9\u00f2\u00f7\u00fa\u0105\u010a\u0117\u011f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}