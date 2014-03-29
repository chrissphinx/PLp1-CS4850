// Generated from parser/PLp1.g4 by ANTLR 4.1

  package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLp1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CASE=1, CLASS=2, CREATE=3, DEFAULT=4, EMPTYP=5, EQUALP=6, ENDIF=7, ELSE=8, 
		EXIT=9, FALSE=10, FIRST=11, FUNCTION=12, IF=13, INIT=14, INSERT=15, LAMBDA=16, 
		LENGTH=17, LET=18, LIST=19, LISTP=20, METHOD=21, NULL=22, NUMBERP=23, 
		PAIRP=24, SWITCH=25, THEN=26, TRUE=27, AND=28, ASSIGN=29, COMMA=30, COLON=31, 
		DIVIDE=32, DOT=33, EQUAL=34, GREATER=35, GREATEREQUAL=36, INVOKE=37, LB=38, 
		LBK=39, LESS=40, LESSEQUAL=41, LP=42, MINUS=43, MULTIPLY=44, NOT=45, NOTEQUAL=46, 
		OR=47, PLUS=48, RB=49, RBK=50, REST=51, RP=52, ID=53, INTNUM=54, FLOATNUM=55, 
		STRING=56, NEWLINE=57, WS=58;
	public static final String[] tokenNames = {
		"<INVALID>", "'case'", "'class'", "'create'", "'default'", "'emptyp'", 
		"'equalp'", "'endif'", "'else'", "'exit'", "'false'", "'first'", "'function'", 
		"'if'", "'init'", "'insert'", "'lambda'", "'length'", "'let'", "'list'", 
		"'listp'", "'method'", "'null'", "'numberp'", "'pairp'", "'switch'", "'then'", 
		"'true'", "'&'", "'='", "','", "':'", "'/'", "'.'", "'=='", "'>'", "'>='", 
		"'->'", "'{'", "'['", "'<'", "'<='", "'('", "'-'", "'*'", "'!'", "'!='", 
		"'|'", "'+'", "'}'", "']'", "'rest'", "')'", "ID", "INTNUM", "FLOATNUM", 
		"STRING", "NEWLINE", "WS"
	};
	public static final int
		RULE_program = 0, RULE_functionDef = 1, RULE_paramList = 2, RULE_classDef = 3, 
		RULE_variables = 4, RULE_init = 5, RULE_methods = 6, RULE_method = 7, 
		RULE_expressionList = 8, RULE_expression = 9, RULE_varRef = 10, RULE_constantExp = 11, 
		RULE_listExp = 12, RULE_createExpr = 13, RULE_ifExpr = 14, RULE_lambdaExpr = 15, 
		RULE_assignment = 16, RULE_switchExpr = 17, RULE_switchCases = 18, RULE_switchCase = 19, 
		RULE_defaultCase = 20, RULE_letExpr = 21, RULE_letDecls = 22, RULE_letDecl = 23, 
		RULE_argumentList = 24, RULE_first = 25, RULE_rest = 26, RULE_insert = 27, 
		RULE_emptyp = 28, RULE_equalp = 29, RULE_exit = 30, RULE_list = 31, RULE_pairp = 32, 
		RULE_listp = 33, RULE_length = 34, RULE_numberp = 35;
	public static final String[] ruleNames = {
		"program", "functionDef", "paramList", "classDef", "variables", "init", 
		"methods", "method", "expressionList", "expression", "varRef", "constantExp", 
		"listExp", "createExpr", "ifExpr", "lambdaExpr", "assignment", "switchExpr", 
		"switchCases", "switchCase", "defaultCase", "letExpr", "letDecls", "letDecl", 
		"argumentList", "first", "rest", "insert", "emptyp", "equalp", "exit", 
		"list", "pairp", "listp", "length", "numberp"
	};

	@Override
	public String getGrammarFileName() { return "PLp1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLp1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(75);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(72); functionDef();
					}
					break;
				case CLASS:
					{
					setState(73); classDef();
					}
					break;
				case CREATE:
				case EMPTYP:
				case EQUALP:
				case EXIT:
				case FALSE:
				case FIRST:
				case IF:
				case INSERT:
				case LAMBDA:
				case LENGTH:
				case LET:
				case LIST:
				case LISTP:
				case NULL:
				case NUMBERP:
				case PAIRP:
				case SWITCH:
				case TRUE:
				case LBK:
				case LP:
				case NOT:
				case REST:
				case ID:
				case INTNUM:
				case FLOATNUM:
				case STRING:
					{
					setState(74); expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << CREATE) | (1L << EMPTYP) | (1L << EQUALP) | (1L << EXIT) | (1L << FALSE) | (1L << FIRST) | (1L << FUNCTION) | (1L << IF) | (1L << INSERT) | (1L << LAMBDA) | (1L << LENGTH) | (1L << LET) | (1L << LIST) | (1L << LISTP) | (1L << NULL) | (1L << NUMBERP) | (1L << PAIRP) | (1L << SWITCH) | (1L << TRUE) | (1L << LBK) | (1L << LP) | (1L << NOT) | (1L << REST) | (1L << ID) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0) );
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

	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(PLp1Parser.FUNCTION, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(FUNCTION);
			setState(80); match(ID);
			setState(81); match(LP);
			setState(82); paramList();
			setState(83); match(RP);
			setState(84); match(LB);
			setState(85); expressionList();
			setState(86); match(RB);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(PLp1Parser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(PLp1Parser.ID); }
		public TerminalNode COMMA(int i) {
			return getToken(PLp1Parser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(PLp1Parser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(88); match(ID);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(89); match(COMMA);
					setState(90); match(ID);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class ClassDefContext extends ParserRuleContext {
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(PLp1Parser.CLASS, 0); }
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(CLASS);
			setState(99); match(ID);
			setState(100); match(LB);
			setState(101); variables();
			setState(102); init();
			setState(103); methods();
			setState(104); match(RB);
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

	public static class VariablesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PLp1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLp1Parser.ID, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(106); match(ID);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode INIT() { return getToken(PLp1Parser.INIT, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(INIT);
			setState(113); match(LP);
			setState(114); paramList();
			setState(115); match(RP);
			setState(116); match(LB);
			setState(117); expressionList();
			setState(118); match(RB);
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

	public static class MethodsContext extends ParserRuleContext {
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD) {
				{
				{
				setState(120); method();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public TerminalNode METHOD() { return getToken(PLp1Parser.METHOD, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(METHOD);
			setState(127); match(ID);
			setState(128); match(LP);
			setState(129); paramList();
			setState(130); match(RP);
			setState(131); match(LB);
			setState(132); expressionList();
			setState(133); match(RB);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135); expression(0);
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << EMPTYP) | (1L << EQUALP) | (1L << EXIT) | (1L << FALSE) | (1L << FIRST) | (1L << IF) | (1L << INSERT) | (1L << LAMBDA) | (1L << LENGTH) | (1L << LET) | (1L << LIST) | (1L << LISTP) | (1L << NULL) | (1L << NUMBERP) | (1L << PAIRP) | (1L << SWITCH) | (1L << TRUE) | (1L << LBK) | (1L << LP) | (1L << NOT) | (1L << REST) | (1L << ID) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0) );
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public LambdaExprContext lambdaExpr() {
			return getRuleContext(LambdaExprContext.class,0);
		}
		public ListpContext listp() {
			return getRuleContext(ListpContext.class,0);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public TerminalNode AND() { return getToken(PLp1Parser.AND, 0); }
		public ConstantExpContext constantExp() {
			return getRuleContext(ConstantExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIVIDE() { return getToken(PLp1Parser.DIVIDE, 0); }
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public CreateExprContext createExpr() {
			return getRuleContext(CreateExprContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualpContext equalp() {
			return getRuleContext(EqualpContext.class,0);
		}
		public TerminalNode LESS() { return getToken(PLp1Parser.LESS, 0); }
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PLp1Parser.PLUS, 0); }
		public TerminalNode GREATER() { return getToken(PLp1Parser.GREATER, 0); }
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public TerminalNode GREATEREQUAL() { return getToken(PLp1Parser.GREATEREQUAL, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode OR() { return getToken(PLp1Parser.OR, 0); }
		public TerminalNode MINUS() { return getToken(PLp1Parser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(PLp1Parser.MULTIPLY, 0); }
		public TerminalNode EQUAL() { return getToken(PLp1Parser.EQUAL, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public EmptypContext emptyp() {
			return getRuleContext(EmptypContext.class,0);
		}
		public NumberpContext numberp() {
			return getRuleContext(NumberpContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PLp1Parser.NOT, 0); }
		public SwitchExprContext switchExpr() {
			return getRuleContext(SwitchExprContext.class,0);
		}
		public TerminalNode LESSEQUAL() { return getToken(PLp1Parser.LESSEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PLp1Parser.NOTEQUAL, 0); }
		public FirstContext first() {
			return getRuleContext(FirstContext.class,0);
		}
		public PairpContext pairp() {
			return getRuleContext(PairpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(141); match(NOT);
				setState(142); expression(22);
				}
				break;

			case 2:
				{
				setState(143); varRef();
				}
				break;

			case 3:
				{
				setState(144); constantExp();
				}
				break;

			case 4:
				{
				setState(145); createExpr();
				}
				break;

			case 5:
				{
				setState(146); ifExpr();
				}
				break;

			case 6:
				{
				setState(147); lambdaExpr();
				}
				break;

			case 7:
				{
				setState(148); assignment();
				}
				break;

			case 8:
				{
				setState(149); switchExpr();
				}
				break;

			case 9:
				{
				setState(150); letExpr();
				}
				break;

			case 10:
				{
				setState(151); match(LP);
				setState(152); expression(0);
				setState(153); match(RP);
				}
				break;

			case 11:
				{
				setState(155); first();
				}
				break;

			case 12:
				{
				setState(156); rest();
				}
				break;

			case 13:
				{
				setState(157); insert();
				}
				break;

			case 14:
				{
				setState(158); list();
				}
				break;

			case 15:
				{
				setState(159); emptyp();
				}
				break;

			case 16:
				{
				setState(160); pairp();
				}
				break;

			case 17:
				{
				setState(161); listp();
				}
				break;

			case 18:
				{
				setState(162); equalp();
				}
				break;

			case 19:
				{
				setState(163); length();
				}
				break;

			case 20:
				{
				setState(164); numberp();
				}
				break;

			case 21:
				{
				setState(165); exit();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(34 >= _localctx._p)) throw new FailedPredicateException(this, "34 >= $_p");
						setState(169); match(MULTIPLY);
						setState(170); expression(35);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(33 >= _localctx._p)) throw new FailedPredicateException(this, "33 >= $_p");
						setState(172); match(DIVIDE);
						setState(173); expression(34);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(32 >= _localctx._p)) throw new FailedPredicateException(this, "32 >= $_p");
						setState(175); match(PLUS);
						setState(176); expression(33);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(31 >= _localctx._p)) throw new FailedPredicateException(this, "31 >= $_p");
						setState(178); match(MINUS);
						setState(179); expression(32);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(30 >= _localctx._p)) throw new FailedPredicateException(this, "30 >= $_p");
						setState(181); match(EQUAL);
						setState(182); expression(31);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(29 >= _localctx._p)) throw new FailedPredicateException(this, "29 >= $_p");
						setState(184); match(NOTEQUAL);
						setState(185); expression(30);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(28 >= _localctx._p)) throw new FailedPredicateException(this, "28 >= $_p");
						setState(187); match(LESS);
						setState(188); expression(29);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(27 >= _localctx._p)) throw new FailedPredicateException(this, "27 >= $_p");
						setState(190); match(LESSEQUAL);
						setState(191); expression(28);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(26 >= _localctx._p)) throw new FailedPredicateException(this, "26 >= $_p");
						setState(193); match(GREATER);
						setState(194); expression(27);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(196); match(GREATEREQUAL);
						setState(197); expression(26);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(199); match(OR);
						setState(200); expression(25);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(202); match(AND);
						setState(203); expression(24);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(205); match(INVOKE);
						setState(206); match(LP);
						setState(207); argumentList();
						setState(208); match(RP);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class VarRefContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PLp1Parser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(PLp1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLp1Parser.ID, i);
		}
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(ID);
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(216); match(DOT);
				setState(217); match(ID);
				}
				break;
			}
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

	public static class ConstantExpContext extends ParserRuleContext {
		public TerminalNode INTNUM() { return getToken(PLp1Parser.INTNUM, 0); }
		public TerminalNode TRUE() { return getToken(PLp1Parser.TRUE, 0); }
		public ListExpContext listExp() {
			return getRuleContext(ListExpContext.class,0);
		}
		public TerminalNode FLOATNUM() { return getToken(PLp1Parser.FLOATNUM, 0); }
		public TerminalNode NULL() { return getToken(PLp1Parser.NULL, 0); }
		public TerminalNode STRING() { return getToken(PLp1Parser.STRING, 0); }
		public TerminalNode FALSE() { return getToken(PLp1Parser.FALSE, 0); }
		public ConstantExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterConstantExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitConstantExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitConstantExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpContext constantExp() throws RecognitionException {
		ConstantExpContext _localctx = new ConstantExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constantExp);
		int _la;
		try {
			setState(223);
			switch (_input.LA(1)) {
			case INTNUM:
			case FLOATNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==INTNUM || _la==FLOATNUM) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case LBK:
				enterOuterAlt(_localctx, 2);
				{
				setState(221); listExp();
				}
				break;
			case FALSE:
			case NULL:
			case TRUE:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NULL) | (1L << TRUE) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ListExpContext extends ParserRuleContext {
		public List<ConstantExpContext> constantExp() {
			return getRuleContexts(ConstantExpContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLp1Parser.COMMA); }
		public ConstantExpContext constantExp(int i) {
			return getRuleContext(ConstantExpContext.class,i);
		}
		public TerminalNode LBK() { return getToken(PLp1Parser.LBK, 0); }
		public TerminalNode RBK() { return getToken(PLp1Parser.RBK, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(PLp1Parser.COMMA, i);
		}
		public ListExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterListExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitListExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitListExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpContext listExp() throws RecognitionException {
		ListExpContext _localctx = new ListExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(LBK);
			setState(234);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NULL) | (1L << TRUE) | (1L << LBK) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0)) {
				{
				setState(226); constantExp();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227); match(COMMA);
					setState(228); constantExp();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(236); match(RBK);
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

	public static class CreateExprContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PLp1Parser.CREATE, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public CreateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterCreateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitCreateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitCreateExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateExprContext createExpr() throws RecognitionException {
		CreateExprContext _localctx = new CreateExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_createExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(CREATE);
			setState(239); match(ID);
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

	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(PLp1Parser.THEN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PLp1Parser.IF, 0); }
		public TerminalNode ELSE() { return getToken(PLp1Parser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(PLp1Parser.ENDIF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(IF);
			setState(242); expression(0);
			setState(243); match(THEN);
			setState(244); expression(0);
			setState(245); match(ELSE);
			setState(246); expression(0);
			setState(247); match(ENDIF);
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

	public static class LambdaExprContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode LAMBDA() { return getToken(PLp1Parser.LAMBDA, 0); }
		public LambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExprContext lambdaExpr() throws RecognitionException {
		LambdaExprContext _localctx = new LambdaExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lambdaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(LAMBDA);
			setState(250); match(LP);
			setState(251); paramList();
			setState(252); match(RP);
			setState(253); match(LB);
			setState(254); expressionList();
			setState(255); match(RB);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PLp1Parser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(ID);
			setState(258); match(ASSIGN);
			setState(259); expression(0);
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

	public static class SwitchExprContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(PLp1Parser.SWITCH, 0); }
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public SwitchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterSwitchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitSwitchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitSwitchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchExprContext switchExpr() throws RecognitionException {
		SwitchExprContext _localctx = new SwitchExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switchExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(SWITCH);
			setState(262); match(LB);
			setState(263); switchCases();
			setState(264); defaultCase();
			setState(265); match(RB);
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

	public static class SwitchCasesContext extends ParserRuleContext {
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterSwitchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitSwitchCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitSwitchCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267); switchCase();
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CASE() { return getToken(PLp1Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PLp1Parser.COLON, 0); }
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(CASE);
			setState(273); expression(0);
			setState(274); match(COLON);
			setState(275); expressionList();
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

	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(PLp1Parser.DEFAULT, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PLp1Parser.COLON, 0); }
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitDefaultCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitDefaultCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(DEFAULT);
			setState(278); match(COLON);
			setState(279); expressionList();
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

	public static class LetExprContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(PLp1Parser.LB, 0); }
		public TerminalNode LET() { return getToken(PLp1Parser.LET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LetDeclsContext letDecls() {
			return getRuleContext(LetDeclsContext.class,0);
		}
		public TerminalNode RB() { return getToken(PLp1Parser.RB, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public LetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitLetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetExprContext letExpr() throws RecognitionException {
		LetExprContext _localctx = new LetExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_letExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(LET);
			setState(282); match(LP);
			setState(283); letDecls();
			setState(284); match(RP);
			setState(285); match(LB);
			setState(286); expressionList();
			setState(287); match(RB);
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

	public static class LetDeclsContext extends ParserRuleContext {
		public List<LetDeclContext> letDecl() {
			return getRuleContexts(LetDeclContext.class);
		}
		public LetDeclContext letDecl(int i) {
			return getRuleContext(LetDeclContext.class,i);
		}
		public LetDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterLetDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitLetDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLetDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclsContext letDecls() throws RecognitionException {
		LetDeclsContext _localctx = new LetDeclsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_letDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBK) {
				{
				{
				setState(289); letDecl();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LetDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLp1Parser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBK() { return getToken(PLp1Parser.LBK, 0); }
		public TerminalNode RBK() { return getToken(PLp1Parser.RBK, 0); }
		public LetDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterLetDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitLetDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLetDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclContext letDecl() throws RecognitionException {
		LetDeclContext _localctx = new LetDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_letDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(LBK);
			setState(296); match(ID);
			setState(297); expression(0);
			setState(298); match(RBK);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLp1Parser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PLp1Parser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << EMPTYP) | (1L << EQUALP) | (1L << EXIT) | (1L << FALSE) | (1L << FIRST) | (1L << IF) | (1L << INSERT) | (1L << LAMBDA) | (1L << LENGTH) | (1L << LET) | (1L << LIST) | (1L << LISTP) | (1L << NULL) | (1L << NUMBERP) | (1L << PAIRP) | (1L << SWITCH) | (1L << TRUE) | (1L << LBK) | (1L << LP) | (1L << NOT) | (1L << REST) | (1L << ID) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0)) {
				{
				setState(300); expression(0);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(301); match(COMMA);
					setState(302); expression(0);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class FirstContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode FIRST() { return getToken(PLp1Parser.FIRST, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public FirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstContext first() throws RecognitionException {
		FirstContext _localctx = new FirstContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_first);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(FIRST);
			setState(311); match(INVOKE);
			setState(312); match(LP);
			setState(313); argumentList();
			setState(314); match(RP);
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

	public static class RestContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode REST() { return getToken(PLp1Parser.REST, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(REST);
			setState(317); match(INVOKE);
			setState(318); match(LP);
			setState(319); argumentList();
			setState(320); match(RP);
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

	public static class InsertContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode INSERT() { return getToken(PLp1Parser.INSERT, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(INSERT);
			setState(323); match(INVOKE);
			setState(324); match(LP);
			setState(325); argumentList();
			setState(326); match(RP);
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

	public static class EmptypContext extends ParserRuleContext {
		public TerminalNode EMPTYP() { return getToken(PLp1Parser.EMPTYP, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public EmptypContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterEmptyp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitEmptyp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitEmptyp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptypContext emptyp() throws RecognitionException {
		EmptypContext _localctx = new EmptypContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_emptyp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(EMPTYP);
			setState(329); match(INVOKE);
			setState(330); match(LP);
			setState(331); argumentList();
			setState(332); match(RP);
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

	public static class EqualpContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode EQUALP() { return getToken(PLp1Parser.EQUALP, 0); }
		public EqualpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterEqualp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitEqualp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitEqualp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualpContext equalp() throws RecognitionException {
		EqualpContext _localctx = new EqualpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_equalp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); match(EQUALP);
			setState(335); match(INVOKE);
			setState(336); match(LP);
			setState(337); argumentList();
			setState(338); match(RP);
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

	public static class ExitContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode EXIT() { return getToken(PLp1Parser.EXIT, 0); }
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitExit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(EXIT);
			setState(341); match(INVOKE);
			setState(342); match(LP);
			setState(343); argumentList();
			setState(344); match(RP);
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

	public static class ListContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode LIST() { return getToken(PLp1Parser.LIST, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(LIST);
			setState(347); match(INVOKE);
			setState(348); match(LP);
			setState(349); argumentList();
			setState(350); match(RP);
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

	public static class PairpContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode PAIRP() { return getToken(PLp1Parser.PAIRP, 0); }
		public PairpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterPairp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitPairp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitPairp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairpContext pairp() throws RecognitionException {
		PairpContext _localctx = new PairpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pairp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(PAIRP);
			setState(353); match(INVOKE);
			setState(354); match(LP);
			setState(355); argumentList();
			setState(356); match(RP);
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

	public static class ListpContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode LISTP() { return getToken(PLp1Parser.LISTP, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public ListpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterListp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitListp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitListp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListpContext listp() throws RecognitionException {
		ListpContext _localctx = new ListpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_listp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); match(LISTP);
			setState(359); match(INVOKE);
			setState(360); match(LP);
			setState(361); argumentList();
			setState(362); match(RP);
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

	public static class LengthContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public TerminalNode LENGTH() { return getToken(PLp1Parser.LENGTH, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(LENGTH);
			setState(365); match(INVOKE);
			setState(366); match(LP);
			setState(367); argumentList();
			setState(368); match(RP);
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

	public static class NumberpContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public TerminalNode NUMBERP() { return getToken(PLp1Parser.NUMBERP, 0); }
		public TerminalNode LP() { return getToken(PLp1Parser.LP, 0); }
		public TerminalNode RP() { return getToken(PLp1Parser.RP, 0); }
		public NumberpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).enterNumberp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLp1Listener ) ((PLp1Listener)listener).exitNumberp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLp1Visitor ) return ((PLp1Visitor<? extends T>)visitor).visitNumberp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberpContext numberp() throws RecognitionException {
		NumberpContext _localctx = new NumberpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numberp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(NUMBERP);
			setState(371); match(INVOKE);
			setState(372); match(LP);
			setState(373); argumentList();
			setState(374); match(RP);
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
		case 9: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 34 >= _localctx._p;

		case 1: return 33 >= _localctx._p;

		case 2: return 32 >= _localctx._p;

		case 3: return 31 >= _localctx._p;

		case 4: return 30 >= _localctx._p;

		case 5: return 29 >= _localctx._p;

		case 6: return 28 >= _localctx._p;

		case 7: return 27 >= _localctx._p;

		case 8: return 26 >= _localctx._p;

		case 9: return 25 >= _localctx._p;

		case 10: return 24 >= _localctx._p;

		case 11: return 23 >= _localctx._p;

		case 12: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3<\u017b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\6\2N\n\2\r\2\16\2O\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\5\4c\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\7\6n\n\6\f\6\16\6q\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\6\n\u008b\n\n\r\n\16\n\u008c\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a9\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d5"+
		"\n\13\f\13\16\13\u00d8\13\13\3\f\3\f\3\f\5\f\u00dd\n\f\3\r\3\r\3\r\5\r"+
		"\u00e2\n\r\3\16\3\16\3\16\3\16\7\16\u00e8\n\16\f\16\16\16\u00eb\13\16"+
		"\5\16\u00ed\n\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u010f\n\24\r\24\16\24\u0110\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\7\30\u0125\n\30\f\30\16\30\u0128\13\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\7\32\u0132\n\32\f\32\16\32\u0135\13\32\5"+
		"\32\u0137\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFH\2\4\3\289\6\2\f\f\30\30\35\35::\u0188\2M\3\2\2\2\4Q\3\2\2\2\6"+
		"b\3\2\2\2\bd\3\2\2\2\no\3\2\2\2\fr\3\2\2\2\16}\3\2\2\2\20\u0080\3\2\2"+
		"\2\22\u008a\3\2\2\2\24\u00a8\3\2\2\2\26\u00d9\3\2\2\2\30\u00e1\3\2\2\2"+
		"\32\u00e3\3\2\2\2\34\u00f0\3\2\2\2\36\u00f3\3\2\2\2 \u00fb\3\2\2\2\"\u0103"+
		"\3\2\2\2$\u0107\3\2\2\2&\u010e\3\2\2\2(\u0112\3\2\2\2*\u0117\3\2\2\2,"+
		"\u011b\3\2\2\2.\u0126\3\2\2\2\60\u0129\3\2\2\2\62\u0136\3\2\2\2\64\u0138"+
		"\3\2\2\2\66\u013e\3\2\2\28\u0144\3\2\2\2:\u014a\3\2\2\2<\u0150\3\2\2\2"+
		">\u0156\3\2\2\2@\u015c\3\2\2\2B\u0162\3\2\2\2D\u0168\3\2\2\2F\u016e\3"+
		"\2\2\2H\u0174\3\2\2\2JN\5\4\3\2KN\5\b\5\2LN\5\24\13\2MJ\3\2\2\2MK\3\2"+
		"\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QR\7\16\2\2RS\7"+
		"\67\2\2ST\7,\2\2TU\5\6\4\2UV\7\66\2\2VW\7(\2\2WX\5\22\n\2XY\7\63\2\2Y"+
		"\5\3\2\2\2Z_\7\67\2\2[\\\7 \2\2\\^\7\67\2\2][\3\2\2\2^a\3\2\2\2_]\3\2"+
		"\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bZ\3\2\2\2bc\3\2\2\2c\7\3\2\2\2de\7"+
		"\4\2\2ef\7\67\2\2fg\7(\2\2gh\5\n\6\2hi\5\f\7\2ij\5\16\b\2jk\7\63\2\2k"+
		"\t\3\2\2\2ln\7\67\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\13\3\2"+
		"\2\2qo\3\2\2\2rs\7\20\2\2st\7,\2\2tu\5\6\4\2uv\7\66\2\2vw\7(\2\2wx\5\22"+
		"\n\2xy\7\63\2\2y\r\3\2\2\2z|\5\20\t\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\17\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\27\2\2\u0081\u0082\7"+
		"\67\2\2\u0082\u0083\7,\2\2\u0083\u0084\5\6\4\2\u0084\u0085\7\66\2\2\u0085"+
		"\u0086\7(\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\63\2\2\u0088\21\3\2\2"+
		"\2\u0089\u008b\5\24\13\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\23\3\2\2\2\u008e\u008f\b\13\1"+
		"\2\u008f\u0090\7/\2\2\u0090\u00a9\5\24\13\2\u0091\u00a9\5\26\f\2\u0092"+
		"\u00a9\5\30\r\2\u0093\u00a9\5\34\17\2\u0094\u00a9\5\36\20\2\u0095\u00a9"+
		"\5 \21\2\u0096\u00a9\5\"\22\2\u0097\u00a9\5$\23\2\u0098\u00a9\5,\27\2"+
		"\u0099\u009a\7,\2\2\u009a\u009b\5\24\13\2\u009b\u009c\7\66\2\2\u009c\u00a9"+
		"\3\2\2\2\u009d\u00a9\5\64\33\2\u009e\u00a9\5\66\34\2\u009f\u00a9\58\35"+
		"\2\u00a0\u00a9\5@!\2\u00a1\u00a9\5:\36\2\u00a2\u00a9\5B\"\2\u00a3\u00a9"+
		"\5D#\2\u00a4\u00a9\5<\37\2\u00a5\u00a9\5F$\2\u00a6\u00a9\5H%\2\u00a7\u00a9"+
		"\5> \2\u00a8\u008e\3\2\2\2\u00a8\u0091\3\2\2\2\u00a8\u0092\3\2\2\2\u00a8"+
		"\u0093\3\2\2\2\u00a8\u0094\3\2\2\2\u00a8\u0095\3\2\2\2\u00a8\u0096\3\2"+
		"\2\2\u00a8\u0097\3\2\2\2\u00a8\u0098\3\2\2\2\u00a8\u0099\3\2\2\2\u00a8"+
		"\u009d\3\2\2\2\u00a8\u009e\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a0\3\2"+
		"\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8"+
		"\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00d6\3\2\2\2\u00aa\u00ab\6\13\2\3\u00ab\u00ac\7.\2\2\u00ac"+
		"\u00d5\5\24\13\2\u00ad\u00ae\6\13\3\3\u00ae\u00af\7\"\2\2\u00af\u00d5"+
		"\5\24\13\2\u00b0\u00b1\6\13\4\3\u00b1\u00b2\7\62\2\2\u00b2\u00d5\5\24"+
		"\13\2\u00b3\u00b4\6\13\5\3\u00b4\u00b5\7-\2\2\u00b5\u00d5\5\24\13\2\u00b6"+
		"\u00b7\6\13\6\3\u00b7\u00b8\7$\2\2\u00b8\u00d5\5\24\13\2\u00b9\u00ba\6"+
		"\13\7\3\u00ba\u00bb\7\60\2\2\u00bb\u00d5\5\24\13\2\u00bc\u00bd\6\13\b"+
		"\3\u00bd\u00be\7*\2\2\u00be\u00d5\5\24\13\2\u00bf\u00c0\6\13\t\3\u00c0"+
		"\u00c1\7+\2\2\u00c1\u00d5\5\24\13\2\u00c2\u00c3\6\13\n\3\u00c3\u00c4\7"+
		"%\2\2\u00c4\u00d5\5\24\13\2\u00c5\u00c6\6\13\13\3\u00c6\u00c7\7&\2\2\u00c7"+
		"\u00d5\5\24\13\2\u00c8\u00c9\6\13\f\3\u00c9\u00ca\7\61\2\2\u00ca\u00d5"+
		"\5\24\13\2\u00cb\u00cc\6\13\r\3\u00cc\u00cd\7\36\2\2\u00cd\u00d5\5\24"+
		"\13\2\u00ce\u00cf\6\13\16\3\u00cf\u00d0\7\'\2\2\u00d0\u00d1\7,\2\2\u00d1"+
		"\u00d2\5\62\32\2\u00d2\u00d3\7\66\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00aa"+
		"\3\2\2\2\u00d4\u00ad\3\2\2\2\u00d4\u00b0\3\2\2\2\u00d4\u00b3\3\2\2\2\u00d4"+
		"\u00b6\3\2\2\2\u00d4\u00b9\3\2\2\2\u00d4\u00bc\3\2\2\2\u00d4\u00bf\3\2"+
		"\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00c5\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4"+
		"\u00cb\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\25\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc"+
		"\7\67\2\2\u00da\u00db\7#\2\2\u00db\u00dd\7\67\2\2\u00dc\u00da\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\27\3\2\2\2\u00de\u00e2\t\2\2\2\u00df\u00e2"+
		"\5\32\16\2\u00e0\u00e2\t\3\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\31\3\2\2\2\u00e3\u00ec\7)\2\2\u00e4\u00e9\5"+
		"\30\r\2\u00e5\u00e6\7 \2\2\u00e6\u00e8\5\30\r\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\7\64\2\2\u00ef\33\3\2\2\2\u00f0\u00f1\7\5\2"+
		"\2\u00f1\u00f2\7\67\2\2\u00f2\35\3\2\2\2\u00f3\u00f4\7\17\2\2\u00f4\u00f5"+
		"\5\24\13\2\u00f5\u00f6\7\34\2\2\u00f6\u00f7\5\24\13\2\u00f7\u00f8\7\n"+
		"\2\2\u00f8\u00f9\5\24\13\2\u00f9\u00fa\7\t\2\2\u00fa\37\3\2\2\2\u00fb"+
		"\u00fc\7\22\2\2\u00fc\u00fd\7,\2\2\u00fd\u00fe\5\6\4\2\u00fe\u00ff\7\66"+
		"\2\2\u00ff\u0100\7(\2\2\u0100\u0101\5\22\n\2\u0101\u0102\7\63\2\2\u0102"+
		"!\3\2\2\2\u0103\u0104\7\67\2\2\u0104\u0105\7\37\2\2\u0105\u0106\5\24\13"+
		"\2\u0106#\3\2\2\2\u0107\u0108\7\33\2\2\u0108\u0109\7(\2\2\u0109\u010a"+
		"\5&\24\2\u010a\u010b\5*\26\2\u010b\u010c\7\63\2\2\u010c%\3\2\2\2\u010d"+
		"\u010f\5(\25\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\'\3\2\2\2\u0112\u0113\7\3\2\2\u0113\u0114"+
		"\5\24\13\2\u0114\u0115\7!\2\2\u0115\u0116\5\22\n\2\u0116)\3\2\2\2\u0117"+
		"\u0118\7\6\2\2\u0118\u0119\7!\2\2\u0119\u011a\5\22\n\2\u011a+\3\2\2\2"+
		"\u011b\u011c\7\24\2\2\u011c\u011d\7,\2\2\u011d\u011e\5.\30\2\u011e\u011f"+
		"\7\66\2\2\u011f\u0120\7(\2\2\u0120\u0121\5\22\n\2\u0121\u0122\7\63\2\2"+
		"\u0122-\3\2\2\2\u0123\u0125\5\60\31\2\u0124\u0123\3\2\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127/\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012a\7)\2\2\u012a\u012b\7\67\2\2\u012b\u012c\5\24"+
		"\13\2\u012c\u012d\7\64\2\2\u012d\61\3\2\2\2\u012e\u0133\5\24\13\2\u012f"+
		"\u0130\7 \2\2\u0130\u0132\5\24\13\2\u0131\u012f\3\2\2\2\u0132\u0135\3"+
		"\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u012e\3\2\2\2\u0136\u0137\3\2\2\2\u0137\63\3\2\2"+
		"\2\u0138\u0139\7\r\2\2\u0139\u013a\7\'\2\2\u013a\u013b\7,\2\2\u013b\u013c"+
		"\5\62\32\2\u013c\u013d\7\66\2\2\u013d\65\3\2\2\2\u013e\u013f\7\65\2\2"+
		"\u013f\u0140\7\'\2\2\u0140\u0141\7,\2\2\u0141\u0142\5\62\32\2\u0142\u0143"+
		"\7\66\2\2\u0143\67\3\2\2\2\u0144\u0145\7\21\2\2\u0145\u0146\7\'\2\2\u0146"+
		"\u0147\7,\2\2\u0147\u0148\5\62\32\2\u0148\u0149\7\66\2\2\u01499\3\2\2"+
		"\2\u014a\u014b\7\7\2\2\u014b\u014c\7\'\2\2\u014c\u014d\7,\2\2\u014d\u014e"+
		"\5\62\32\2\u014e\u014f\7\66\2\2\u014f;\3\2\2\2\u0150\u0151\7\b\2\2\u0151"+
		"\u0152\7\'\2\2\u0152\u0153\7,\2\2\u0153\u0154\5\62\32\2\u0154\u0155\7"+
		"\66\2\2\u0155=\3\2\2\2\u0156\u0157\7\13\2\2\u0157\u0158\7\'\2\2\u0158"+
		"\u0159\7,\2\2\u0159\u015a\5\62\32\2\u015a\u015b\7\66\2\2\u015b?\3\2\2"+
		"\2\u015c\u015d\7\25\2\2\u015d\u015e\7\'\2\2\u015e\u015f\7,\2\2\u015f\u0160"+
		"\5\62\32\2\u0160\u0161\7\66\2\2\u0161A\3\2\2\2\u0162\u0163\7\32\2\2\u0163"+
		"\u0164\7\'\2\2\u0164\u0165\7,\2\2\u0165\u0166\5\62\32\2\u0166\u0167\7"+
		"\66\2\2\u0167C\3\2\2\2\u0168\u0169\7\26\2\2\u0169\u016a\7\'\2\2\u016a"+
		"\u016b\7,\2\2\u016b\u016c\5\62\32\2\u016c\u016d\7\66\2\2\u016dE\3\2\2"+
		"\2\u016e\u016f\7\23\2\2\u016f\u0170\7\'\2\2\u0170\u0171\7,\2\2\u0171\u0172"+
		"\5\62\32\2\u0172\u0173\7\66\2\2\u0173G\3\2\2\2\u0174\u0175\7\31\2\2\u0175"+
		"\u0176\7\'\2\2\u0176\u0177\7,\2\2\u0177\u0178\5\62\32\2\u0178\u0179\7"+
		"\66\2\2\u0179I\3\2\2\2\24MO_bo}\u008c\u00a8\u00d4\u00d6\u00dc\u00e1\u00e9"+
		"\u00ec\u0110\u0126\u0133\u0136";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}