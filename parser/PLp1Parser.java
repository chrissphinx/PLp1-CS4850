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
		CASE=1, CLASS=2, CREATE=3, DEFAULT=4, ENDIF=5, ELSE=6, FALSE=7, FIRST=8, 
		FUNCTION=9, IF=10, INIT=11, LAMBDA=12, LET=13, METHOD=14, NULL=15, SWITCH=16, 
		THEN=17, TRUE=18, AND=19, ASSIGN=20, COMMA=21, COLON=22, DIVIDE=23, DOT=24, 
		EQUAL=25, GREATER=26, GREATEREQUAL=27, INVOKE=28, LB=29, LBK=30, LESS=31, 
		LESSEQUAL=32, LP=33, MINUS=34, MULTIPLY=35, NOT=36, NOTEQUAL=37, OR=38, 
		PLUS=39, RB=40, RBK=41, REST=42, RP=43, ID=44, INTNUM=45, FLOATNUM=46, 
		STRING=47, NEWLINE=48, WS=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'case'", "'class'", "'create'", "'default'", "'endif'", 
		"'else'", "'false'", "'first'", "'function'", "'if'", "'init'", "'lambda'", 
		"'let'", "'method'", "'null'", "'switch'", "'then'", "'true'", "'&'", 
		"'='", "','", "':'", "'/'", "'.'", "'=='", "'>'", "'>='", "'->'", "'{'", 
		"'['", "'<'", "'<='", "'('", "'-'", "'*'", "'!'", "'!='", "'|'", "'+'", 
		"'}'", "']'", "'rest'", "')'", "ID", "INTNUM", "FLOATNUM", "STRING", "NEWLINE", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_functionDef = 1, RULE_paramList = 2, RULE_classDef = 3, 
		RULE_variables = 4, RULE_init = 5, RULE_methods = 6, RULE_method = 7, 
		RULE_expressionList = 8, RULE_expression = 9, RULE_varRef = 10, RULE_constantExp = 11, 
		RULE_listExp = 12, RULE_createExpr = 13, RULE_ifExpr = 14, RULE_lambdaExpr = 15, 
		RULE_assignment = 16, RULE_switchExpr = 17, RULE_switchCases = 18, RULE_switchCase = 19, 
		RULE_defaultCase = 20, RULE_letExpr = 21, RULE_letDecls = 22, RULE_letDecl = 23, 
		RULE_argumentList = 24, RULE_first = 25, RULE_rest = 26;
	public static final String[] ruleNames = {
		"program", "functionDef", "paramList", "classDef", "variables", "init", 
		"methods", "method", "expressionList", "expression", "varRef", "constantExp", 
		"listExp", "createExpr", "ifExpr", "lambdaExpr", "assignment", "switchExpr", 
		"switchCases", "switchCase", "defaultCase", "letExpr", "letDecls", "letDecl", 
		"argumentList", "first", "rest"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(57);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(54); functionDef();
					}
					break;
				case CLASS:
					{
					setState(55); classDef();
					}
					break;
				case CREATE:
				case FALSE:
				case FIRST:
				case IF:
				case LAMBDA:
				case LET:
				case NULL:
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
					setState(56); expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << CREATE) | (1L << FALSE) | (1L << FIRST) | (1L << FUNCTION) | (1L << IF) | (1L << LAMBDA) | (1L << LET) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE) | (1L << LBK) | (1L << LP) | (1L << NOT) | (1L << REST) | (1L << ID) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0) );
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
			setState(61); match(FUNCTION);
			setState(62); match(ID);
			setState(63); match(LP);
			setState(64); paramList();
			setState(65); match(RP);
			setState(66); match(LB);
			setState(67); expressionList();
			setState(68); match(RB);
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
			setState(78);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(70); match(ID);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(71); match(COMMA);
					setState(72); match(ID);
					}
					}
					setState(77);
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
			setState(80); match(CLASS);
			setState(81); match(ID);
			setState(82); match(LB);
			setState(83); variables();
			setState(84); init();
			setState(85); methods();
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(88); match(ID);
				}
				}
				setState(93);
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
			setState(94); match(INIT);
			setState(95); match(LP);
			setState(96); paramList();
			setState(97); match(RP);
			setState(98); match(LB);
			setState(99); expressionList();
			setState(100); match(RB);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD) {
				{
				{
				setState(102); method();
				}
				}
				setState(107);
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
			setState(108); match(METHOD);
			setState(109); match(ID);
			setState(110); match(LP);
			setState(111); paramList();
			setState(112); match(RP);
			setState(113); match(LB);
			setState(114); expressionList();
			setState(115); match(RB);
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
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117); expression(0);
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << FALSE) | (1L << FIRST) | (1L << IF) | (1L << LAMBDA) | (1L << LET) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE) | (1L << LBK) | (1L << LP) | (1L << NOT) | (1L << REST) | (1L << ID) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0) );
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
		public CreateExprContext createExpr() {
			return getRuleContext(CreateExprContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(PLp1Parser.LESS, 0); }
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
		public TerminalNode INVOKE() { return getToken(PLp1Parser.INVOKE, 0); }
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PLp1Parser.NOT, 0); }
		public SwitchExprContext switchExpr() {
			return getRuleContext(SwitchExprContext.class,0);
		}
		public TerminalNode LESSEQUAL() { return getToken(PLp1Parser.LESSEQUAL, 0); }
		public FirstContext first() {
			return getRuleContext(FirstContext.class,0);
		}
		public TerminalNode NOTEQUAL() { return getToken(PLp1Parser.NOTEQUAL, 0); }
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
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(123); match(NOT);
				setState(124); expression(13);
				}
				break;

			case 2:
				{
				setState(125); varRef();
				}
				break;

			case 3:
				{
				setState(126); constantExp();
				}
				break;

			case 4:
				{
				setState(127); createExpr();
				}
				break;

			case 5:
				{
				setState(128); ifExpr();
				}
				break;

			case 6:
				{
				setState(129); lambdaExpr();
				}
				break;

			case 7:
				{
				setState(130); assignment();
				}
				break;

			case 8:
				{
				setState(131); switchExpr();
				}
				break;

			case 9:
				{
				setState(132); letExpr();
				}
				break;

			case 10:
				{
				setState(133); match(LP);
				setState(134); expression(0);
				setState(135); match(RP);
				}
				break;

			case 11:
				{
				setState(137); first();
				}
				break;

			case 12:
				{
				setState(138); rest();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(142); match(MULTIPLY);
						setState(143); expression(26);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(145); match(DIVIDE);
						setState(146); expression(25);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(148); match(PLUS);
						setState(149); expression(24);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(151); match(MINUS);
						setState(152); expression(23);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(154); match(EQUAL);
						setState(155); expression(22);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(157); match(NOTEQUAL);
						setState(158); expression(21);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(160); match(LESS);
						setState(161); expression(20);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(163); match(LESSEQUAL);
						setState(164); expression(19);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(166); match(GREATER);
						setState(167); expression(18);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(169); match(GREATEREQUAL);
						setState(170); expression(17);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(172); match(OR);
						setState(173); expression(16);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(175); match(AND);
						setState(176); expression(15);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(178); match(INVOKE);
						setState(179); match(LP);
						setState(180); argumentList();
						setState(181); match(RP);
						}
						break;
					}
					} 
				}
				setState(187);
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
			setState(188); match(ID);
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(189); match(DOT);
				setState(190); match(ID);
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
			setState(196);
			switch (_input.LA(1)) {
			case INTNUM:
			case FLOATNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
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
				setState(194); listExp();
				}
				break;
			case FALSE:
			case NULL:
			case TRUE:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
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
			setState(198); match(LBK);
			setState(207);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NULL) | (1L << TRUE) | (1L << LBK) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0)) {
				{
				setState(199); constantExp();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(200); match(COMMA);
					setState(201); constantExp();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(209); match(RBK);
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
			setState(211); match(CREATE);
			setState(212); match(ID);
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
			setState(214); match(IF);
			setState(215); expression(0);
			setState(216); match(THEN);
			setState(217); expression(0);
			setState(218); match(ELSE);
			setState(219); expression(0);
			setState(220); match(ENDIF);
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
			setState(222); match(LAMBDA);
			setState(223); match(LP);
			setState(224); paramList();
			setState(225); match(RP);
			setState(226); match(LB);
			setState(227); expressionList();
			setState(228); match(RB);
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
			setState(230); match(ID);
			setState(231); match(ASSIGN);
			setState(232); expression(0);
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
			setState(234); match(SWITCH);
			setState(235); match(LB);
			setState(236); switchCases();
			setState(237); defaultCase();
			setState(238); match(RB);
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
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240); switchCase();
				}
				}
				setState(243); 
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
			setState(245); match(CASE);
			setState(246); expression(0);
			setState(247); match(COLON);
			setState(248); expressionList();
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
			setState(250); match(DEFAULT);
			setState(251); match(COLON);
			setState(252); expressionList();
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
			setState(254); match(LET);
			setState(255); match(LP);
			setState(256); letDecls();
			setState(257); match(RP);
			setState(258); match(LB);
			setState(259); expressionList();
			setState(260); match(RB);
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
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBK) {
				{
				{
				setState(262); letDecl();
				}
				}
				setState(267);
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
			setState(268); match(LBK);
			setState(269); match(ID);
			setState(270); expression(0);
			setState(271); match(RBK);
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
			setState(281);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << FALSE) | (1L << FIRST) | (1L << IF) | (1L << LAMBDA) | (1L << LET) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE) | (1L << LBK) | (1L << LP) | (1L << NOT) | (1L << REST) | (1L << ID) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << STRING))) != 0)) {
				{
				setState(273); expression(0);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(274); match(COMMA);
					setState(275); expression(0);
					}
					}
					setState(280);
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
			setState(283); match(FIRST);
			setState(284); match(INVOKE);
			setState(285); match(LP);
			setState(286); argumentList();
			setState(287); match(RP);
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
			setState(289); match(REST);
			setState(290); match(INVOKE);
			setState(291); match(LP);
			setState(292); argumentList();
			setState(293); match(RP);
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
		case 0: return 25 >= _localctx._p;

		case 1: return 24 >= _localctx._p;

		case 2: return 23 >= _localctx._p;

		case 3: return 22 >= _localctx._p;

		case 4: return 21 >= _localctx._p;

		case 5: return 20 >= _localctx._p;

		case 6: return 19 >= _localctx._p;

		case 7: return 18 >= _localctx._p;

		case 8: return 17 >= _localctx._p;

		case 9: return 16 >= _localctx._p;

		case 10: return 15 >= _localctx._p;

		case 11: return 14 >= _localctx._p;

		case 12: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\63\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\6\2<\n\2\r\2\16\2=\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\5\4Q"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\6\ny\n\n\r\n\16\nz\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00ba\n\13\f\13\16\13\u00bd\13\13\3\f\3\f\3\f\5\f\u00c2\n\f"+
		"\3\r\3\r\3\r\5\r\u00c7\n\r\3\16\3\16\3\16\3\16\7\16\u00cd\n\16\f\16\16"+
		"\16\u00d0\13\16\5\16\u00d2\n\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00f4\n\24\r\24"+
		"\16\24\u00f5\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\7\30\u010a\n\30\f\30\16\30\u010d\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0117\n\32\f\32\16\32"+
		"\u011a\13\32\5\32\u011c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\4\3\2/\60\6\2\t\t\21\21\24\24\61\61\u0137\2;\3\2"+
		"\2\2\4?\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\n]\3\2\2\2\f`\3\2\2\2\16k\3\2\2"+
		"\2\20n\3\2\2\2\22x\3\2\2\2\24\u008d\3\2\2\2\26\u00be\3\2\2\2\30\u00c6"+
		"\3\2\2\2\32\u00c8\3\2\2\2\34\u00d5\3\2\2\2\36\u00d8\3\2\2\2 \u00e0\3\2"+
		"\2\2\"\u00e8\3\2\2\2$\u00ec\3\2\2\2&\u00f3\3\2\2\2(\u00f7\3\2\2\2*\u00fc"+
		"\3\2\2\2,\u0100\3\2\2\2.\u010b\3\2\2\2\60\u010e\3\2\2\2\62\u011b\3\2\2"+
		"\2\64\u011d\3\2\2\2\66\u0123\3\2\2\28<\5\4\3\29<\5\b\5\2:<\5\24\13\2;"+
		"8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2"+
		"?@\7\13\2\2@A\7.\2\2AB\7#\2\2BC\5\6\4\2CD\7-\2\2DE\7\37\2\2EF\5\22\n\2"+
		"FG\7*\2\2G\5\3\2\2\2HM\7.\2\2IJ\7\27\2\2JL\7.\2\2KI\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PH\3\2\2\2PQ\3\2\2\2Q\7\3\2\2"+
		"\2RS\7\4\2\2ST\7.\2\2TU\7\37\2\2UV\5\n\6\2VW\5\f\7\2WX\5\16\b\2XY\7*\2"+
		"\2Y\t\3\2\2\2Z\\\7.\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3"+
		"\2\2\2_]\3\2\2\2`a\7\r\2\2ab\7#\2\2bc\5\6\4\2cd\7-\2\2de\7\37\2\2ef\5"+
		"\22\n\2fg\7*\2\2g\r\3\2\2\2hj\5\20\t\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2k"+
		"l\3\2\2\2l\17\3\2\2\2mk\3\2\2\2no\7\20\2\2op\7.\2\2pq\7#\2\2qr\5\6\4\2"+
		"rs\7-\2\2st\7\37\2\2tu\5\22\n\2uv\7*\2\2v\21\3\2\2\2wy\5\24\13\2xw\3\2"+
		"\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\23\3\2\2\2|}\b\13\1\2}~\7&\2\2~\u008e"+
		"\5\24\13\2\177\u008e\5\26\f\2\u0080\u008e\5\30\r\2\u0081\u008e\5\34\17"+
		"\2\u0082\u008e\5\36\20\2\u0083\u008e\5 \21\2\u0084\u008e\5\"\22\2\u0085"+
		"\u008e\5$\23\2\u0086\u008e\5,\27\2\u0087\u0088\7#\2\2\u0088\u0089\5\24"+
		"\13\2\u0089\u008a\7-\2\2\u008a\u008e\3\2\2\2\u008b\u008e\5\64\33\2\u008c"+
		"\u008e\5\66\34\2\u008d|\3\2\2\2\u008d\177\3\2\2\2\u008d\u0080\3\2\2\2"+
		"\u008d\u0081\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u0084"+
		"\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0087\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u00bb\3\2\2\2\u008f\u0090\6\13"+
		"\2\3\u0090\u0091\7%\2\2\u0091\u00ba\5\24\13\2\u0092\u0093\6\13\3\3\u0093"+
		"\u0094\7\31\2\2\u0094\u00ba\5\24\13\2\u0095\u0096\6\13\4\3\u0096\u0097"+
		"\7)\2\2\u0097\u00ba\5\24\13\2\u0098\u0099\6\13\5\3\u0099\u009a\7$\2\2"+
		"\u009a\u00ba\5\24\13\2\u009b\u009c\6\13\6\3\u009c\u009d\7\33\2\2\u009d"+
		"\u00ba\5\24\13\2\u009e\u009f\6\13\7\3\u009f\u00a0\7\'\2\2\u00a0\u00ba"+
		"\5\24\13\2\u00a1\u00a2\6\13\b\3\u00a2\u00a3\7!\2\2\u00a3\u00ba\5\24\13"+
		"\2\u00a4\u00a5\6\13\t\3\u00a5\u00a6\7\"\2\2\u00a6\u00ba\5\24\13\2\u00a7"+
		"\u00a8\6\13\n\3\u00a8\u00a9\7\34\2\2\u00a9\u00ba\5\24\13\2\u00aa\u00ab"+
		"\6\13\13\3\u00ab\u00ac\7\35\2\2\u00ac\u00ba\5\24\13\2\u00ad\u00ae\6\13"+
		"\f\3\u00ae\u00af\7(\2\2\u00af\u00ba\5\24\13\2\u00b0\u00b1\6\13\r\3\u00b1"+
		"\u00b2\7\25\2\2\u00b2\u00ba\5\24\13\2\u00b3\u00b4\6\13\16\3\u00b4\u00b5"+
		"\7\36\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\5\62\32\2\u00b7\u00b8\7-\2\2"+
		"\u00b8\u00ba\3\2\2\2\u00b9\u008f\3\2\2\2\u00b9\u0092\3\2\2\2\u00b9\u0095"+
		"\3\2\2\2\u00b9\u0098\3\2\2\2\u00b9\u009b\3\2\2\2\u00b9\u009e\3\2\2\2\u00b9"+
		"\u00a1\3\2\2\2\u00b9\u00a4\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9\u00aa\3\2"+
		"\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b3\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\25\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\7.\2\2\u00bf\u00c0\7\32\2\2\u00c0\u00c2"+
		"\7.\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\27\3\2\2\2\u00c3"+
		"\u00c7\t\2\2\2\u00c4\u00c7\5\32\16\2\u00c5\u00c7\t\3\2\2\u00c6\u00c3\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\31\3\2\2\2\u00c8"+
		"\u00d1\7 \2\2\u00c9\u00ce\5\30\r\2\u00ca\u00cb\7\27\2\2\u00cb\u00cd\5"+
		"\30\r\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00c9\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7+\2\2\u00d4"+
		"\33\3\2\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\7.\2\2\u00d7\35\3\2\2\2\u00d8"+
		"\u00d9\7\f\2\2\u00d9\u00da\5\24\13\2\u00da\u00db\7\23\2\2\u00db\u00dc"+
		"\5\24\13\2\u00dc\u00dd\7\b\2\2\u00dd\u00de\5\24\13\2\u00de\u00df\7\7\2"+
		"\2\u00df\37\3\2\2\2\u00e0\u00e1\7\16\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3"+
		"\5\6\4\2\u00e3\u00e4\7-\2\2\u00e4\u00e5\7\37\2\2\u00e5\u00e6\5\22\n\2"+
		"\u00e6\u00e7\7*\2\2\u00e7!\3\2\2\2\u00e8\u00e9\7.\2\2\u00e9\u00ea\7\26"+
		"\2\2\u00ea\u00eb\5\24\13\2\u00eb#\3\2\2\2\u00ec\u00ed\7\22\2\2\u00ed\u00ee"+
		"\7\37\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\5*\26\2\u00f0\u00f1\7*\2\2\u00f1"+
		"%\3\2\2\2\u00f2\u00f4\5(\25\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\'\3\2\2\2\u00f7\u00f8\7"+
		"\3\2\2\u00f8\u00f9\5\24\13\2\u00f9\u00fa\7\30\2\2\u00fa\u00fb\5\22\n\2"+
		"\u00fb)\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7\30\2\2\u00fe\u00ff\5"+
		"\22\n\2\u00ff+\3\2\2\2\u0100\u0101\7\17\2\2\u0101\u0102\7#\2\2\u0102\u0103"+
		"\5.\30\2\u0103\u0104\7-\2\2\u0104\u0105\7\37\2\2\u0105\u0106\5\22\n\2"+
		"\u0106\u0107\7*\2\2\u0107-\3\2\2\2\u0108\u010a\5\60\31\2\u0109\u0108\3"+
		"\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"/\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7 \2\2\u010f\u0110\7.\2\2\u0110"+
		"\u0111\5\24\13\2\u0111\u0112\7+\2\2\u0112\61\3\2\2\2\u0113\u0118\5\24"+
		"\13\2\u0114\u0115\7\27\2\2\u0115\u0117\5\24\13\2\u0116\u0114\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011b\u0113\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\63\3\2\2\2\u011d\u011e\7\n\2\2\u011e\u011f\7\36\2\2\u011f\u0120\7#\2"+
		"\2\u0120\u0121\5\62\32\2\u0121\u0122\7-\2\2\u0122\65\3\2\2\2\u0123\u0124"+
		"\7,\2\2\u0124\u0125\7\36\2\2\u0125\u0126\7#\2\2\u0126\u0127\5\62\32\2"+
		"\u0127\u0128\7-\2\2\u0128\67\3\2\2\2\24;=MP]kz\u008d\u00b9\u00bb\u00c1"+
		"\u00c6\u00ce\u00d1\u00f5\u010b\u0118\u011b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}