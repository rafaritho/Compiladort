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
		LCURLY=1, RCURLY=2, LBRACKET=3, RBRACKET=4, LP=5, RP=6, CLASS=7, BOOLEAN=8, 
		INTVAR=9, VOID=10, IF=11, ELSE=12, FOR=13, RETURN=14, BREAK=15, CALLOUT=16, 
		CONTINUE=17, BOOLEANLITERAL=18, EXCLAMATION=19, OR=20, EQUAL=21, PLUS=22, 
		MINUS=23, MULT=24, AND=25, EQUALS=26, DIV=27, MOD=28, PLUSEQUAL=29, MINUSEQUAL=30, 
		SEMICOLON=31, COMMA=32, COLON=33, LESS=34, BIGGER=35, LESSEQ=36, BIGGEREQ=37, 
		DIFFERENT=38, ID=39, WS_=40, SL_COMMENT=41, CHAR=42, STRING=43, HEXLITERAL=44, 
		ERRO_HEX=45, NUM=46, C=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "LP", "RP", "CLASS", "BOOLEAN", 
		"INTVAR", "VOID", "IF", "ELSE", "FOR", "RETURN", "BREAK", "CALLOUT", "CONTINUE", 
		"BOOLEANLITERAL", "EXCLAMATION", "OR", "EQUAL", "PLUS", "MINUS", "MULT", 
		"AND", "EQUALS", "DIV", "MOD", "PLUSEQUAL", "MINUSEQUAL", "SEMICOLON", 
		"COMMA", "COLON", "LESS", "BIGGER", "LESSEQ", "BIGGEREQ", "DIFFERENT", 
		"ID", "WS_", "SL_COMMENT", "CHAR", "STRING", "HEXLITERAL", "ERRO_HEX", 
		"NUM", "C", "ESC", "CYMBALS", "INT", "UNDERLINE", "AZ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'class'", "'boolean'", 
		"'int'", "'void'", "'if'", "'else'", "'for'", "'return'", "'break'", "'callout'", 
		"'continue'", null, "'!'", "'||'", "'='", "'+'", "'-'", "'*'", "'&&'", 
		"'=='", "'/'", "'%'", "'+='", "'-='", "';'", "','", "':'", "'<'", "'>'", 
		"'>='", "'<='", "'!='", null, null, null, null, null, null, "'0x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "LP", "RP", "CLASS", 
		"BOOLEAN", "INTVAR", "VOID", "IF", "ELSE", "FOR", "RETURN", "BREAK", "CALLOUT", 
		"CONTINUE", "BOOLEANLITERAL", "EXCLAMATION", "OR", "EQUAL", "PLUS", "MINUS", 
		"MULT", "AND", "EQUALS", "DIV", "MOD", "PLUSEQUAL", "MINUSEQUAL", "SEMICOLON", 
		"COMMA", "COLON", "LESS", "BIGGER", "LESSEQ", "BIGGEREQ", "DIFFERENT", 
		"ID", "WS_", "SL_COMMENT", "CHAR", "STRING", "HEXLITERAL", "ERRO_HEX", 
		"NUM", "C"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0153\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c2"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\5(\u00f6\n(\3(\3(\3(\7(\u00fb\n(\f(\16(\u00fe\13(\3)\6)\u0101"+
		"\n)\r)\16)\u0102\3)\3)\3*\3*\3*\3*\7*\u010b\n*\f*\16*\u010e\13*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\5+\u0118\n+\3+\3+\3,\3,\3,\3,\3,\3,\7,\u0122\n,\f,"+
		"\16,\u0125\13,\3,\3,\3-\3-\3-\3-\3-\6-\u012e\n-\r-\16-\u012f\3.\3.\3."+
		"\3/\3/\7/\u0137\n/\f/\16/\u013a\13/\3\60\3\60\7\60\u013e\n\60\f\60\16"+
		"\60\u0141\13\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u014c"+
		"\n\62\3\63\3\63\3\64\3\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\2c\2e\2g\2i\2\3\2\t\5\2\13\f\17\17\"\"\3\2\f\f\4\2C"+
		"Hch\6\2$$^^ppvv\5\2..\60\60AA\4\2\'\'<<\4\2C\\c|\u0162\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2"+
		"\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21}\3\2\2\2"+
		"\23\u0085\3\2\2\2\25\u0089\3\2\2\2\27\u008e\3\2\2\2\31\u0091\3\2\2\2\33"+
		"\u0096\3\2\2\2\35\u009a\3\2\2\2\37\u00a1\3\2\2\2!\u00a7\3\2\2\2#\u00af"+
		"\3\2\2\2%\u00c1\3\2\2\2\'\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00c8\3\2\2\2"+
		"-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00ce\3\2\2\2\63\u00d0\3\2\2\2\65\u00d3"+
		"\3\2\2\2\67\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dd\3\2\2\2"+
		"?\u00e0\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E\u00e6\3\2\2\2G\u00e8\3"+
		"\2\2\2I\u00ea\3\2\2\2K\u00ed\3\2\2\2M\u00f0\3\2\2\2O\u00f5\3\2\2\2Q\u0100"+
		"\3\2\2\2S\u0106\3\2\2\2U\u0113\3\2\2\2W\u011b\3\2\2\2Y\u0128\3\2\2\2["+
		"\u0131\3\2\2\2]\u0134\3\2\2\2_\u013b\3\2\2\2a\u0142\3\2\2\2c\u014b\3\2"+
		"\2\2e\u014d\3\2\2\2g\u014f\3\2\2\2i\u0151\3\2\2\2kl\7}\2\2l\4\3\2\2\2"+
		"mn\7\177\2\2n\6\3\2\2\2op\7]\2\2p\b\3\2\2\2qr\7_\2\2r\n\3\2\2\2st\7*\2"+
		"\2t\f\3\2\2\2uv\7+\2\2v\16\3\2\2\2wx\7e\2\2xy\7n\2\2yz\7c\2\2z{\7u\2\2"+
		"{|\7u\2\2|\20\3\2\2\2}~\7d\2\2~\177\7q\2\2\177\u0080\7q\2\2\u0080\u0081"+
		"\7n\2\2\u0081\u0082\7g\2\2\u0082\u0083\7c\2\2\u0083\u0084\7p\2\2\u0084"+
		"\22\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088"+
		"\24\3\2\2\2\u0089\u008a\7x\2\2\u008a\u008b\7q\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7f\2\2\u008d\26\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7h\2\2\u0090"+
		"\30\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7g\2\2\u0095\32\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7t\2\2\u0099\34\3\2\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7w\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\36\3\2\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7"+
		"g\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7m\2\2\u00a6 \3\2\2\2\u00a7\u00a8"+
		"\7e\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae\"\3\2\2\2\u00af"+
		"\u00b0\7e\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2"+
		"\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb"+
		"\7w\2\2\u00bb\u00c2\7g\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c2\7g\2\2\u00c1\u00b8\3\2\2"+
		"\2\u00c1\u00bc\3\2\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4(\3\2\2"+
		"\2\u00c5\u00c6\7~\2\2\u00c6\u00c7\7~\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7"+
		"?\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7/"+
		"\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf\62\3\2\2\2\u00d0\u00d1"+
		"\7(\2\2\u00d1\u00d2\7(\2\2\u00d2\64\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d78\3\2\2\2\u00d8\u00d9"+
		"\7\'\2\2\u00d9:\3\2\2\2\u00da\u00db\7-\2\2\u00db\u00dc\7?\2\2\u00dc<\3"+
		"\2\2\2\u00dd\u00de\7/\2\2\u00de\u00df\7?\2\2\u00df>\3\2\2\2\u00e0\u00e1"+
		"\7=\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7"+
		"<\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7F\3\2\2\2\u00e8\u00e9\7@"+
		"\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7@\2\2\u00eb\u00ec\7?\2\2\u00ecJ\3\2\2"+
		"\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7?\2\2\u00efL\3\2\2\2\u00f0\u00f1\7"+
		"#\2\2\u00f1\u00f2\7?\2\2\u00f2N\3\2\2\2\u00f3\u00f6\5_\60\2\u00f4\u00f6"+
		"\5g\64\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00fc\3\2\2\2\u00f7"+
		"\u00fb\5_\60\2\u00f8\u00fb\5g\64\2\u00f9\u00fb\5e\63\2\u00fa\u00f7\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdP\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00ff\u0101\t\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b)\2\2\u0105"+
		"R\3\2\2\2\u0106\u0107\7\61\2\2\u0107\u0108\7\61\2\2\u0108\u010c\3\2\2"+
		"\2\u0109\u010b\n\3\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0110\7\f\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b*\2\2\u0112T\3\2\2\2\u0113"+
		"\u0117\7)\2\2\u0114\u0118\5a\61\2\u0115\u0118\5_\60\2\u0116\u0118\5e\63"+
		"\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011a\7)\2\2\u011aV\3\2\2\2\u011b\u0123\7$\2\2\u011c\u0122"+
		"\5Q)\2\u011d\u0122\5a\61\2\u011e\u0122\5_\60\2\u011f\u0122\5e\63\2\u0120"+
		"\u0122\5c\62\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0127\7$\2\2\u0127X\3\2\2\2\u0128\u0129\7\62\2\2\u0129\u012a"+
		"\7z\2\2\u012a\u012d\3\2\2\2\u012b\u012e\t\4\2\2\u012c\u012e\5e\63\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130Z\3\2\2\2\u0131\u0132\7\62\2\2\u0132\u0133"+
		"\7z\2\2\u0133\\\3\2\2\2\u0134\u0138\5e\63\2\u0135\u0137\5e\63\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139^\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013f\5i\65\2\u013c\u013e"+
		"\5i\65\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140`\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7^\2\2\u0143"+
		"\u0144\t\5\2\2\u0144b\3\2\2\2\u0145\u0146\7^\2\2\u0146\u014c\7$\2\2\u0147"+
		"\u014c\t\6\2\2\u0148\u0149\7^\2\2\u0149\u014c\7)\2\2\u014a\u014c\t\7\2"+
		"\2\u014b\u0145\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u014a"+
		"\3\2\2\2\u014cd\3\2\2\2\u014d\u014e\4\62;\2\u014ef\3\2\2\2\u014f\u0150"+
		"\7a\2\2\u0150h\3\2\2\2\u0151\u0152\t\b\2\2\u0152j\3\2\2\2\21\2\u00c1\u00f5"+
		"\u00fa\u00fc\u0102\u010c\u0117\u0121\u0123\u012d\u012f\u0138\u013f\u014b"+
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