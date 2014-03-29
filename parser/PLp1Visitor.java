// Generated from parser/PLp1.g4 by ANTLR 4.1

  package parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLp1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLp1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull PLp1Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(@NotNull PLp1Parser.MethodsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(@NotNull PLp1Parser.FunctionDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(@NotNull PLp1Parser.ClassDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull PLp1Parser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(@NotNull PLp1Parser.DefaultCaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(@NotNull PLp1Parser.ParamListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#varRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(@NotNull PLp1Parser.VarRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#lambdaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(@NotNull PLp1Parser.LambdaExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#letDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDecl(@NotNull PLp1Parser.LetDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(@NotNull PLp1Parser.IfExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#letExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpr(@NotNull PLp1Parser.LetExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#numberp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberp(@NotNull PLp1Parser.NumberpContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull PLp1Parser.LengthContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#createExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExpr(@NotNull PLp1Parser.CreateExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#listp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListp(@NotNull PLp1Parser.ListpContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#listExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExp(@NotNull PLp1Parser.ListExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#switchExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpr(@NotNull PLp1Parser.SwitchExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#equalp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualp(@NotNull PLp1Parser.EqualpContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#letDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDecls(@NotNull PLp1Parser.LetDeclsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull PLp1Parser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull PLp1Parser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#pairp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairp(@NotNull PLp1Parser.PairpContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull PLp1Parser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit(@NotNull PLp1Parser.ExitContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(@NotNull PLp1Parser.VariablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull PLp1Parser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(@NotNull PLp1Parser.SwitchCaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull PLp1Parser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#emptyp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyp(@NotNull PLp1Parser.EmptypContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#constantExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExp(@NotNull PLp1Parser.ConstantExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull PLp1Parser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest(@NotNull PLp1Parser.RestContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(@NotNull PLp1Parser.InsertContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(@NotNull PLp1Parser.FirstContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#switchCases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCases(@NotNull PLp1Parser.SwitchCasesContext ctx);
}