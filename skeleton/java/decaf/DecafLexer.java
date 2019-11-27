// Generated from /home/rarks/Desktop/c/Compiladort/skeleton/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCURLY=1, RCURLY=2, LBRACKET=3, RBRACKET=4, LP=5, RP=6, PROGRAM=7, CLASS=8, 
		SINAL=9, BOOLEAN=10, INTVAR=11, VOID=12, IF=13, ELSE=14, FOR=15, RETURN=16, 
		BREAK=17, CALLOUT=18, CONTINUE=19, BOOLEANLITERAL=20, EXCLAMATION=21, 
		OR=22, EQUAL=23, PLUS=24, MINUS=25, MULT=26, AND=27, EQUALS=28, DIV=29, 
		MOD=30, PLUSEQUAL=31, MINUSEQUAL=32, SEMICOLON=33, COMMA=34, COLON=35, 
		LESS=36, BIGGER=37, LESSEQ=38, BIGGEREQ=39, DIFFERENT=40, ID=41, INTLITERAL=42, 
		WS_=43, SL_COMMENT=44, CHAR=45, STRING=46, HEXLITERAL=47, ERRO_HEX=48, 
		NUM=49, C=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "LP", "RP", "PROGRAM", "CLASS", 
		"SINAL", "BOOLEAN", "INTVAR", "VOID", "IF", "ELSE", "FOR", "RETURN", "BREAK", 
		"CALLOUT", "CONTINUE", "BOOLEANLITERAL", "EXCLAMATION", "OR", "EQUAL", 
		"PLUS", "MINUS", "MULT", "AND", "EQUALS", "DIV", "MOD", "PLUSEQUAL", "MINUSEQUAL", 
		"SEMICOLON", "COMMA", "COLON", "LESS", "BIGGER", "LESSEQ", "BIGGEREQ", 
		"DIFFERENT", "ID", "INTLITERAL", "WS_", "SL_COMMENT", "CHAR", "STRING", 
		"HEXLITERAL", "ERRO_HEX", "NUM", "C", "ESC", "CYMBALS", "INT", "UNDERLINE", 
		"AZ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'Program'", "'class'", 
		null, "'boolean'", "'int'", "'void'", "'if'", "'else'", "'for'", "'return'", 
		"'break'", "'callout'", "'continue'", null, "'!'", "'||'", "'='", "'+'", 
		"'-'", "'*'", "'&&'", "'=='", "'/'", "'%'", "'+='", "'-='", "';'", "','", 
		"':'", "'<'", "'>'", "'>='", "'<='", "'!='", null, null, null, null, null, 
		null, null, "'0x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "LP", "RP", "PROGRAM", 
		"CLASS", "SINAL", "BOOLEAN", "INTVAR", "VOID", "IF", "ELSE", "FOR", "RETURN", 
		"BREAK", "CALLOUT", "CONTINUE", "BOOLEANLITERAL", "EXCLAMATION", "OR", 
		"EQUAL", "PLUS", "MINUS", "MULT", "AND", "EQUALS", "DIV", "MOD", "PLUSEQUAL", 
		"MINUSEQUAL", "SEMICOLON", "COMMA", "COLON", "LESS", "BIGGER", "LESSEQ", 
		"BIGGEREQ", "DIFFERENT", "ID", "INTLITERAL", "WS_", "SL_COMMENT", "CHAR", 
		"STRING", "HEXLITERAL", "ERRO_HEX", "NUM", "C"
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


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u0170\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00d2\n\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*"+
		"\3*\5*\u0106\n*\3*\3*\3*\7*\u010b\n*\f*\16*\u010e\13*\3+\6+\u0111\n+\r"+
		"+\16+\u0112\3+\3+\6+\u0117\n+\r+\16+\u0118\5+\u011b\n+\3,\6,\u011e\n,"+
		"\r,\16,\u011f\3,\3,\3-\3-\3-\3-\7-\u0128\n-\f-\16-\u012b\13-\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\5.\u0135\n.\3.\3.\3/\3/\3/\3/\3/\3/\7/\u013f\n/\f/\16"+
		"/\u0142\13/\3/\3/\3\60\3\60\3\60\3\60\3\60\6\60\u014b\n\60\r\60\16\60"+
		"\u014c\3\61\3\61\3\61\3\62\3\62\7\62\u0154\n\62\f\62\16\62\u0157\13\62"+
		"\3\63\3\63\7\63\u015b\n\63\f\63\16\63\u015e\13\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u0169\n\65\3\66\3\66\3\67\3\67\38\38\2"+
		"\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\2"+
		"o\2\3\2\r\5\2##..==\3\2\62;\5\2\62;CHch\5\2\13\f\17\17\"\"\3\2\f\f\7\2"+
		"\"#%(*\60\62\\`\u0080\4\2CHch\6\2$$^^ppvv\5\2..\60\60AA\4\2\'\'<<\4\2"+
		"C\\c|\u0182\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2"+
		"\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21\u0085\3\2\2\2\23\u008b"+
		"\3\2\2\2\25\u008d\3\2\2\2\27\u0095\3\2\2\2\31\u0099\3\2\2\2\33\u009e\3"+
		"\2\2\2\35\u00a1\3\2\2\2\37\u00a6\3\2\2\2!\u00aa\3\2\2\2#\u00b1\3\2\2\2"+
		"%\u00b7\3\2\2\2\'\u00bf\3\2\2\2)\u00d1\3\2\2\2+\u00d3\3\2\2\2-\u00d5\3"+
		"\2\2\2/\u00d8\3\2\2\2\61\u00da\3\2\2\2\63\u00dc\3\2\2\2\65\u00de\3\2\2"+
		"\2\67\u00e0\3\2\2\29\u00e3\3\2\2\2;\u00e6\3\2\2\2=\u00e8\3\2\2\2?\u00ea"+
		"\3\2\2\2A\u00ed\3\2\2\2C\u00f0\3\2\2\2E\u00f2\3\2\2\2G\u00f4\3\2\2\2I"+
		"\u00f6\3\2\2\2K\u00f8\3\2\2\2M\u00fa\3\2\2\2O\u00fd\3\2\2\2Q\u0100\3\2"+
		"\2\2S\u0105\3\2\2\2U\u0110\3\2\2\2W\u011d\3\2\2\2Y\u0123\3\2\2\2[\u0130"+
		"\3\2\2\2]\u0138\3\2\2\2_\u0145\3\2\2\2a\u014e\3\2\2\2c\u0151\3\2\2\2e"+
		"\u0158\3\2\2\2g\u015f\3\2\2\2i\u0168\3\2\2\2k\u016a\3\2\2\2m\u016c\3\2"+
		"\2\2o\u016e\3\2\2\2qr\7}\2\2r\4\3\2\2\2st\7\177\2\2t\6\3\2\2\2uv\7]\2"+
		"\2v\b\3\2\2\2wx\7_\2\2x\n\3\2\2\2yz\7*\2\2z\f\3\2\2\2{|\7+\2\2|\16\3\2"+
		"\2\2}~\7R\2\2~\177\7t\2\2\177\u0080\7q\2\2\u0080\u0081\7i\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7c\2\2\u0083\u0084\7o\2\2\u0084\20\3\2\2\2\u0085\u0086"+
		"\7e\2\2\u0086\u0087\7n\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7u\2\2\u008a\22\3\2\2\2\u008b\u008c\t\2\2\2\u008c\24\3\2\2\2\u008d"+
		"\u008e\7d\2\2\u008e\u008f\7q\2\2\u008f\u0090\7q\2\2\u0090\u0091\7n\2\2"+
		"\u0091\u0092\7g\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094\26\3\2"+
		"\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098\30"+
		"\3\2\2\2\u0099\u009a\7x\2\2\u009a\u009b\7q\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7f\2\2\u009d\32\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0"+
		"\34\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\"\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7g"+
		"\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7m\2\2\u00b6$\3\2\2\2\u00b7\u00b8"+
		"\7e\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7v\2\2\u00be&\3\2\2\2\u00bf"+
		"\u00c0\7e\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2"+
		"\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb"+
		"\7w\2\2\u00cb\u00d2\7g\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d2\7g\2\2\u00d1\u00c8\3\2\2"+
		"\2\u00d1\u00cc\3\2\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4,\3\2\2"+
		"\2\u00d5\u00d6\7~\2\2\u00d6\u00d7\7~\2\2\u00d7.\3\2\2\2\u00d8\u00d9\7"+
		"?\2\2\u00d9\60\3\2\2\2\u00da\u00db\7-\2\2\u00db\62\3\2\2\2\u00dc\u00dd"+
		"\7/\2\2\u00dd\64\3\2\2\2\u00de\u00df\7,\2\2\u00df\66\3\2\2\2\u00e0\u00e1"+
		"\7(\2\2\u00e1\u00e2\7(\2\2\u00e28\3\2\2\2\u00e3\u00e4\7?\2\2\u00e4\u00e5"+
		"\7?\2\2\u00e5:\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7<\3\2\2\2\u00e8\u00e9"+
		"\7\'\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7-\2\2\u00eb\u00ec\7?\2\2\u00ec@\3"+
		"\2\2\2\u00ed\u00ee\7/\2\2\u00ee\u00ef\7?\2\2\u00efB\3\2\2\2\u00f0\u00f1"+
		"\7=\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7.\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7"+
		"<\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7J\3\2\2\2\u00f8\u00f9\7@"+
		"\2\2\u00f9L\3\2\2\2\u00fa\u00fb\7@\2\2\u00fb\u00fc\7?\2\2\u00fcN\3\2\2"+
		"\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7?\2\2\u00ffP\3\2\2\2\u0100\u0101\7"+
		"#\2\2\u0101\u0102\7?\2\2\u0102R\3\2\2\2\u0103\u0106\5e\63\2\u0104\u0106"+
		"\5m\67\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u010c\3\2\2\2\u0107"+
		"\u010b\5e\63\2\u0108\u010b\5m\67\2\u0109\u010b\5k\66\2\u010a\u0107\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dT\3\2\2\2\u010e\u010c\3\2\2\2"+
		"\u010f\u0111\t\3\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011a\3\2\2\2\u0114\u0116\7z\2\2\u0115"+
		"\u0117\t\4\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0114\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011bV\3\2\2\2\u011c\u011e\t\5\2\2\u011d\u011c\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0122\b,\2\2\u0122X\3\2\2\2\u0123\u0124\7\61\2\2\u0124"+
		"\u0125\7\61\2\2\u0125\u0129\3\2\2\2\u0126\u0128\n\6\2\2\u0127\u0126\3"+
		"\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\f\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\b-\2\2\u012fZ\3\2\2\2\u0130\u0134\7)\2\2\u0131\u0135"+
		"\t\7\2\2\u0132\u0135\5k\66\2\u0133\u0135\5g\64\2\u0134\u0131\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7)"+
		"\2\2\u0137\\\3\2\2\2\u0138\u0140\7$\2\2\u0139\u013f\5W,\2\u013a\u013f"+
		"\5g\64\2\u013b\u013f\5e\63\2\u013c\u013f\5k\66\2\u013d\u013f\5i\65\2\u013e"+
		"\u0139\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7$"+
		"\2\2\u0144^\3\2\2\2\u0145\u0146\7\62\2\2\u0146\u0147\7z\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u014b\t\b\2\2\u0149\u014b\5k\66\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d`\3\2\2\2\u014e\u014f\7\62\2\2\u014f\u0150\7z\2\2\u0150b\3\2"+
		"\2\2\u0151\u0155\5k\66\2\u0152\u0154\5k\66\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156d\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0158\u015c\5o8\2\u0159\u015b\5o8\2\u015a\u0159\3"+
		"\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7^\2\2\u0160\u0161\t\t\2\2\u0161"+
		"h\3\2\2\2\u0162\u0163\7^\2\2\u0163\u0169\7$\2\2\u0164\u0169\t\n\2\2\u0165"+
		"\u0166\7^\2\2\u0166\u0169\7)\2\2\u0167\u0169\t\13\2\2\u0168\u0162\3\2"+
		"\2\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"j\3\2\2\2\u016a\u016b\4\62;\2\u016bl\3\2\2\2\u016c\u016d\7a\2\2\u016d"+
		"n\3\2\2\2\u016e\u016f\t\f\2\2\u016fp\3\2\2\2\25\2\u00d1\u0105\u010a\u010c"+
		"\u0112\u0116\u0118\u011a\u011f\u0129\u0134\u013e\u0140\u014a\u014c\u0155"+
		"\u015c\u0168\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}