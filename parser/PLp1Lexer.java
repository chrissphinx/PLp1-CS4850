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
		CASE=1, CLASS=2, CREATE=3, DEFAULT=4, ENDIF=5, ELSE=6, FALSE=7, FUNCTION=8, 
		IF=9, INIT=10, LAMBDA=11, LET=12, METHOD=13, NULL=14, SWITCH=15, THEN=16, 
		TRUE=17, AND=18, ASSIGN=19, COMMA=20, COLON=21, DIVIDE=22, DOT=23, EQUAL=24, 
		GREATER=25, GREATEREQUAL=26, INVOKE=27, LB=28, LBK=29, LESS=30, LESSEQUAL=31, 
		LP=32, MINUS=33, MULTIPLY=34, NOT=35, NOTEQUAL=36, OR=37, PLUS=38, RB=39, 
		RBK=40, RP=41, ID=42, INTNUM=43, FLOATNUM=44, STRING=45, NEWLINE=46, WS=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'case'", "'class'", "'create'", "'default'", "'endif'", "'else'", "'false'", 
		"'function'", "'if'", "'init'", "'lambda'", "'let'", "'method'", "'null'", 
		"'switch'", "'then'", "'true'", "'&'", "'='", "','", "':'", "'/'", "'.'", 
		"'=='", "'>'", "'>='", "'->'", "'{'", "'['", "'<'", "'<='", "'('", "'-'", 
		"'*'", "'!'", "'!='", "'|'", "'+'", "'}'", "']'", "')'", "ID", "INTNUM", 
		"FLOATNUM", "STRING", "NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"CASE", "CLASS", "CREATE", "DEFAULT", "ENDIF", "ELSE", "FALSE", "FUNCTION", 
		"IF", "INIT", "LAMBDA", "LET", "METHOD", "NULL", "SWITCH", "THEN", "TRUE", 
		"AND", "ASSIGN", "COMMA", "COLON", "DIVIDE", "DOT", "EQUAL", "GREATER", 
		"GREATEREQUAL", "INVOKE", "LB", "LBK", "LESS", "LESSEQUAL", "LP", "MINUS", 
		"MULTIPLY", "NOT", "NOTEQUAL", "OR", "PLUS", "RB", "RBK", "RP", "ALPHA", 
		"DIGIT", "ID", "POSITIVE", "INTNUM", "EXPONENT", "FLOATNUM", "STRING", 
		"NEWLINE", "WS"
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
		case 49: NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 50: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\61\u0144\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\7-\u010a\n-\f-\16"+
		"-\u010d\13-\3.\3.\3/\3/\7/\u0113\n/\f/\16/\u0116\13/\3/\5/\u0119\n/\3"+
		"\60\3\60\5\60\u011d\n\60\3\60\6\60\u0120\n\60\r\60\16\60\u0121\3\61\3"+
		"\61\3\61\6\61\u0127\n\61\r\61\16\61\u0128\3\61\5\61\u012c\n\61\3\62\3"+
		"\62\7\62\u0130\n\62\f\62\16\62\u0133\13\62\3\62\3\62\3\63\5\63\u0138\n"+
		"\63\3\63\3\63\3\63\3\63\3\64\6\64\u013f\n\64\r\64\16\64\u0140\3\64\3\64"+
		"\2\65\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26"+
		"\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?"+
		"!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U\2\1W\2\1Y,\1[\2\1]-\1_"+
		"\2\1a.\1c/\1e\60\2g\61\3\3\2\t\4\2C\\c|\3\2\62;\3\2\63;\4\2GGgg\4\2--"+
		"//\3\2))\4\2\13\13\"\"\u014a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5n\3\2\2\2\7t\3\2\2\2\t{\3\2\2\2\13"+
		"\u0083\3\2\2\2\r\u0089\3\2\2\2\17\u008e\3\2\2\2\21\u0094\3\2\2\2\23\u009d"+
		"\3\2\2\2\25\u00a0\3\2\2\2\27\u00a5\3\2\2\2\31\u00ac\3\2\2\2\33\u00b0\3"+
		"\2\2\2\35\u00b7\3\2\2\2\37\u00bc\3\2\2\2!\u00c3\3\2\2\2#\u00c8\3\2\2\2"+
		"%\u00cd\3\2\2\2\'\u00cf\3\2\2\2)\u00d1\3\2\2\2+\u00d3\3\2\2\2-\u00d5\3"+
		"\2\2\2/\u00d7\3\2\2\2\61\u00d9\3\2\2\2\63\u00dc\3\2\2\2\65\u00de\3\2\2"+
		"\2\67\u00e1\3\2\2\29\u00e4\3\2\2\2;\u00e6\3\2\2\2=\u00e8\3\2\2\2?\u00ea"+
		"\3\2\2\2A\u00ed\3\2\2\2C\u00ef\3\2\2\2E\u00f1\3\2\2\2G\u00f3\3\2\2\2I"+
		"\u00f5\3\2\2\2K\u00f8\3\2\2\2M\u00fa\3\2\2\2O\u00fc\3\2\2\2Q\u00fe\3\2"+
		"\2\2S\u0100\3\2\2\2U\u0102\3\2\2\2W\u0104\3\2\2\2Y\u0106\3\2\2\2[\u010e"+
		"\3\2\2\2]\u0118\3\2\2\2_\u011a\3\2\2\2a\u0123\3\2\2\2c\u012d\3\2\2\2e"+
		"\u0137\3\2\2\2g\u013e\3\2\2\2ij\7e\2\2jk\7c\2\2kl\7u\2\2lm\7g\2\2m\4\3"+
		"\2\2\2no\7e\2\2op\7n\2\2pq\7c\2\2qr\7u\2\2rs\7u\2\2s\6\3\2\2\2tu\7e\2"+
		"\2uv\7t\2\2vw\7g\2\2wx\7c\2\2xy\7v\2\2yz\7g\2\2z\b\3\2\2\2{|\7f\2\2|}"+
		"\7g\2\2}~\7h\2\2~\177\7c\2\2\177\u0080\7w\2\2\u0080\u0081\7n\2\2\u0081"+
		"\u0082\7v\2\2\u0082\n\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7f\2\2\u0086\u0087\7k\2\2\u0087\u0088\7h\2\2\u0088\f\3\2\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2"+
		"\u008d\16\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7"+
		"n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\20\3\2\2\2\u0094\u0095"+
		"\7h\2\2\u0095\u0096\7w\2\2\u0096\u0097\7p\2\2\u0097\u0098\7e\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7k\2\2\u009a\u009b\7q\2\2\u009b\u009c\7p\2\2"+
		"\u009c\22\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7h\2\2\u009f\24\3\2\2"+
		"\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4"+
		"\7v\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8"+
		"\7o\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7c\2\2\u00ab"+
		"\30\3\2\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af"+
		"\32\3\2\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7j\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7f\2\2\u00b6\34\3\2\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7n\2\2"+
		"\u00bb\36\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7y\2\2\u00be\u00bf\7"+
		"k\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7j\2\2\u00c2 "+
		"\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc$\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce"+
		"&\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2*"+
		"\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6"+
		".\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7?\2\2\u00da"+
		"\u00db\7?\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7@\2\2\u00dd\64\3\2\2\2\u00de"+
		"\u00df\7@\2\2\u00df\u00e0\7?\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2"+
		"\u00e3\7@\2\2\u00e38\3\2\2\2\u00e4\u00e5\7}\2\2\u00e5:\3\2\2\2\u00e6\u00e7"+
		"\7]\2\2\u00e7<\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7"+
		">\2\2\u00eb\u00ec\7?\2\2\u00ec@\3\2\2\2\u00ed\u00ee\7*\2\2\u00eeB\3\2"+
		"\2\2\u00ef\u00f0\7/\2\2\u00f0D\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2F\3\2\2"+
		"\2\u00f3\u00f4\7#\2\2\u00f4H\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\7"+
		"?\2\2\u00f7J\3\2\2\2\u00f8\u00f9\7~\2\2\u00f9L\3\2\2\2\u00fa\u00fb\7-"+
		"\2\2\u00fbN\3\2\2\2\u00fc\u00fd\7\177\2\2\u00fdP\3\2\2\2\u00fe\u00ff\7"+
		"_\2\2\u00ffR\3\2\2\2\u0100\u0101\7+\2\2\u0101T\3\2\2\2\u0102\u0103\t\2"+
		"\2\2\u0103V\3\2\2\2\u0104\u0105\t\3\2\2\u0105X\3\2\2\2\u0106\u010b\5U"+
		"+\2\u0107\u010a\5U+\2\u0108\u010a\5W,\2\u0109\u0107\3\2\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"Z\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\t\4\2\2\u010f\\\3\2\2\2\u0110"+
		"\u0114\5[.\2\u0111\u0113\5W,\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0119\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0117\u0119\7\62\2\2\u0118\u0110\3\2\2\2\u0118\u0117\3\2\2\2"+
		"\u0119^\3\2\2\2\u011a\u011c\t\5\2\2\u011b\u011d\t\6\2\2\u011c\u011b\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120\5W,\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122`\3\2\2\2\u0123\u0124\5]/\2\u0124\u0126\7\60\2\2\u0125\u0127"+
		"\5W,\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u012c\5_\60\2\u012b\u012a\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012cb\3\2\2\2\u012d\u0131\7)\2\2\u012e\u0130"+
		"\n\7\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7)"+
		"\2\2\u0135d\3\2\2\2\u0136\u0138\7\17\2\2\u0137\u0136\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\f\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\b\63\2\2\u013cf\3\2\2\2\u013d\u013f\t\b\2\2\u013e\u013d\3\2\2\2"+
		"\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0143\b\64\3\2\u0143h\3\2\2\2\16\2\u0109\u010b\u0114\u0118"+
		"\u011c\u0121\u0128\u012b\u0131\u0137\u0140";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}