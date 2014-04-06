// Generated from parser/PLp1.g4 by ANTLR 4.1

  package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLp1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CASE=1, CLASS=2, CREATE=3, DEFAULT=4, ENDIF=5, ELSE=6, EXIT=7, FALSE=8, 
		FUNCTION=9, IF=10, INIT=11, LAMBDA=12, LET=13, METHOD=14, NULL=15, SWITCH=16, 
		THEN=17, TRUE=18, AND=19, ASSIGN=20, COMMA=21, COLON=22, DIVIDE=23, DOT=24, 
		EQUAL=25, GREATER=26, GREATEREQUAL=27, INVOKE=28, LB=29, LBK=30, LESS=31, 
		LESSEQUAL=32, LP=33, MINUS=34, MULTIPLY=35, NOT=36, NOTEQUAL=37, OR=38, 
		PLUS=39, RB=40, RBK=41, RP=42, ID=43, INTNUM=44, FLOATNUM=45, STRING=46, 
		NEWLINE=47, WS=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'case'", "'class'", "'create'", "'default'", "'endif'", "'else'", "'exit'", 
		"'false'", "'function'", "'if'", "'init'", "'lambda'", "'let'", "'method'", 
		"'null'", "'switch'", "'then'", "'true'", "'&'", "'='", "','", "':'", 
		"'/'", "'.'", "'=='", "'>'", "'>='", "'->'", "'{'", "'['", "'<'", "'<='", 
		"'('", "'-'", "'*'", "'!'", "'!='", "'|'", "'+'", "'}'", "']'", "')'", 
		"ID", "INTNUM", "FLOATNUM", "STRING", "NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"CASE", "CLASS", "CREATE", "DEFAULT", "ENDIF", "ELSE", "EXIT", "FALSE", 
		"FUNCTION", "IF", "INIT", "LAMBDA", "LET", "METHOD", "NULL", "SWITCH", 
		"THEN", "TRUE", "AND", "ASSIGN", "COMMA", "COLON", "DIVIDE", "DOT", "EQUAL", 
		"GREATER", "GREATEREQUAL", "INVOKE", "LB", "LBK", "LESS", "LESSEQUAL", 
		"LP", "MINUS", "MULTIPLY", "NOT", "NOTEQUAL", "OR", "PLUS", "RB", "RBK", 
		"RP", "ALPHA", "DIGIT", "ID", "POSITIVE", "INTNUM", "EXPONENT", "FLOATNUM", 
		"STRING", "NEWLINE", "WS"
	};


	public PLp1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PLp1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 50: NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 51: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\62\u014b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3.\7.\u0111\n.\f.\16.\u0114\13.\3/\3/\3\60\3\60\7\60\u011a"+
		"\n\60\f\60\16\60\u011d\13\60\3\60\5\60\u0120\n\60\3\61\3\61\5\61\u0124"+
		"\n\61\3\61\6\61\u0127\n\61\r\61\16\61\u0128\3\62\3\62\3\62\6\62\u012e"+
		"\n\62\r\62\16\62\u012f\3\62\5\62\u0133\n\62\3\63\3\63\7\63\u0137\n\63"+
		"\f\63\16\63\u013a\13\63\3\63\3\63\3\64\5\64\u013f\n\64\3\64\3\64\3\64"+
		"\3\64\3\65\6\65\u0146\n\65\r\65\16\65\u0147\3\65\3\65\2\66\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%"+
		"\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W\2\1Y\2\1[-\1]\2\1_.\1a\2\1c/\1e\60\1"+
		"g\61\2i\62\3\3\2\t\4\2C\\c|\3\2\62;\3\2\63;\4\2GGgg\4\2--//\3\2))\4\2"+
		"\13\13\"\"\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2[\3\2\2\2\2_\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5p\3\2\2\2\7v\3\2\2\2\t}\3\2\2\2\13"+
		"\u0085\3\2\2\2\r\u008b\3\2\2\2\17\u0090\3\2\2\2\21\u0095\3\2\2\2\23\u009b"+
		"\3\2\2\2\25\u00a4\3\2\2\2\27\u00a7\3\2\2\2\31\u00ac\3\2\2\2\33\u00b3\3"+
		"\2\2\2\35\u00b7\3\2\2\2\37\u00be\3\2\2\2!\u00c3\3\2\2\2#\u00ca\3\2\2\2"+
		"%\u00cf\3\2\2\2\'\u00d4\3\2\2\2)\u00d6\3\2\2\2+\u00d8\3\2\2\2-\u00da\3"+
		"\2\2\2/\u00dc\3\2\2\2\61\u00de\3\2\2\2\63\u00e0\3\2\2\2\65\u00e3\3\2\2"+
		"\2\67\u00e5\3\2\2\29\u00e8\3\2\2\2;\u00eb\3\2\2\2=\u00ed\3\2\2\2?\u00ef"+
		"\3\2\2\2A\u00f1\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G\u00f8\3\2\2\2I"+
		"\u00fa\3\2\2\2K\u00fc\3\2\2\2M\u00ff\3\2\2\2O\u0101\3\2\2\2Q\u0103\3\2"+
		"\2\2S\u0105\3\2\2\2U\u0107\3\2\2\2W\u0109\3\2\2\2Y\u010b\3\2\2\2[\u010d"+
		"\3\2\2\2]\u0115\3\2\2\2_\u011f\3\2\2\2a\u0121\3\2\2\2c\u012a\3\2\2\2e"+
		"\u0134\3\2\2\2g\u013e\3\2\2\2i\u0145\3\2\2\2kl\7e\2\2lm\7c\2\2mn\7u\2"+
		"\2no\7g\2\2o\4\3\2\2\2pq\7e\2\2qr\7n\2\2rs\7c\2\2st\7u\2\2tu\7u\2\2u\6"+
		"\3\2\2\2vw\7e\2\2wx\7t\2\2xy\7g\2\2yz\7c\2\2z{\7v\2\2{|\7g\2\2|\b\3\2"+
		"\2\2}~\7f\2\2~\177\7g\2\2\177\u0080\7h\2\2\u0080\u0081\7c\2\2\u0081\u0082"+
		"\7w\2\2\u0082\u0083\7n\2\2\u0083\u0084\7v\2\2\u0084\n\3\2\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7p\2\2\u0087\u0088\7f\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7h\2\2\u008a\f\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\16\3\2\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7z\2\2\u0092\u0093\7k\2\2\u0093\u0094\7v\2\2\u0094\20\3\2\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2"+
		"\u0099\u009a\7g\2\2\u009a\22\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7"+
		"w\2\2\u009d\u009e\7p\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7p\2\2\u00a3\24\3\2\2\2\u00a4\u00a5"+
		"\7k\2\2\u00a5\u00a6\7h\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9"+
		"\7p\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7v\2\2\u00ab\30\3\2\2\2\u00ac\u00ad"+
		"\7n\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7d\2\2\u00b0"+
		"\u00b1\7f\2\2\u00b1\u00b2\7c\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7n\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7v\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7o\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7q\2\2"+
		"\u00bc\u00bd\7f\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7"+
		"w\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7n\2\2\u00c2 \3\2\2\2\u00c3\u00c4"+
		"\7u\2\2\u00c4\u00c5\7y\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7e\2\2\u00c8\u00c9\7j\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"\u00cc\7j\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7p\2\2\u00ce$\3\2\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7g\2\2"+
		"\u00d3&\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5(\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7"+
		"*\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9,\3\2\2\2\u00da\u00db\7<\2\2\u00db."+
		"\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd\60\3\2\2\2\u00de\u00df\7\60\2\2\u00df"+
		"\62\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\u00e2\7?\2\2\u00e2\64\3\2\2\2\u00e3"+
		"\u00e4\7@\2\2\u00e4\66\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6\u00e7\7?\2\2\u00e7"+
		"8\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\7@\2\2\u00ea:\3\2\2\2\u00eb\u00ec"+
		"\7}\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7]\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7"+
		">\2\2\u00f0@\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7?\2\2\u00f3B\3\2"+
		"\2\2\u00f4\u00f5\7*\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7F\3\2\2"+
		"\2\u00f8\u00f9\7,\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7#\2\2\u00fbJ\3\2\2\2"+
		"\u00fc\u00fd\7#\2\2\u00fd\u00fe\7?\2\2\u00feL\3\2\2\2\u00ff\u0100\7~\2"+
		"\2\u0100N\3\2\2\2\u0101\u0102\7-\2\2\u0102P\3\2\2\2\u0103\u0104\7\177"+
		"\2\2\u0104R\3\2\2\2\u0105\u0106\7_\2\2\u0106T\3\2\2\2\u0107\u0108\7+\2"+
		"\2\u0108V\3\2\2\2\u0109\u010a\t\2\2\2\u010aX\3\2\2\2\u010b\u010c\t\3\2"+
		"\2\u010cZ\3\2\2\2\u010d\u0112\5W,\2\u010e\u0111\5W,\2\u010f\u0111\5Y-"+
		"\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\\\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\t\4\2\2\u0116^\3\2\2\2\u0117\u011b\5]/\2\u0118\u011a\5Y-\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u0120\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\7\62\2\2\u011f"+
		"\u0117\3\2\2\2\u011f\u011e\3\2\2\2\u0120`\3\2\2\2\u0121\u0123\t\5\2\2"+
		"\u0122\u0124\t\6\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126"+
		"\3\2\2\2\u0125\u0127\5Y-\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129b\3\2\2\2\u012a\u012b\5_\60\2"+
		"\u012b\u012d\7\60\2\2\u012c\u012e\5Y-\2\u012d\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u0133\5a\61\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133d\3\2\2\2"+
		"\u0134\u0138\7)\2\2\u0135\u0137\n\7\2\2\u0136\u0135\3\2\2\2\u0137\u013a"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013c\7)\2\2\u013cf\3\2\2\2\u013d\u013f\7\17\2\2"+
		"\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\7\f\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b\64\2\2\u0143h\3\2\2\2\u0144"+
		"\u0146\t\b\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b\65\3\2\u014a"+
		"j\3\2\2\2\16\2\u0110\u0112\u011b\u011f\u0123\u0128\u012f\u0132\u0138\u013e"+
		"\u0147";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}