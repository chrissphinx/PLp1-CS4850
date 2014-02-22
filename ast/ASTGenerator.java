package ast;

import parser.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class ASTGenerator extends AbstractParseTreeVisitor<ASTNode> implements PLp1Visitor<ASTNode>
{

  private ASTNodeBuilderFactory factory = new ASTNodeBuilderFactory();

  @Override
  public ASTNode visitArgumentList(@NotNull PLp1Parser.ArgumentListContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitAssignment(@NotNull PLp1Parser.AssignmentContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitClassDef(@NotNull PLp1Parser.ClassDefContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitConstantExp(@NotNull PLp1Parser.ConstantExpContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitCreateExpr(@NotNull PLp1Parser.CreateExprContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitDefaultCase(@NotNull PLp1Parser.DefaultCaseContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitExpression(@NotNull PLp1Parser.ExpressionContext ctx) {
    if (ctx.constantExp() != null) {
      return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.BOOL)
                    .addLabel(ctx.constantExp().getText())
                    .build();
    } return null;
  }

  @Override
  public ASTNode visitExpressionList(@NotNull PLp1Parser.ExpressionListContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitFunctionDef(@NotNull PLp1Parser.FunctionDefContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitIfExpr(@NotNull PLp1Parser.IfExprContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitInit(@NotNull PLp1Parser.InitContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitLambdaExpr(@NotNull PLp1Parser.LambdaExprContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitLetDecl(@NotNull PLp1Parser.LetDeclContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitLetDecls(@NotNull PLp1Parser.LetDeclsContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitLetExpr(@NotNull PLp1Parser.LetExprContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitListExp(@NotNull PLp1Parser.ListExpContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitMethod(@NotNull PLp1Parser.MethodContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitMethods(@NotNull PLp1Parser.MethodsContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitParamList(@NotNull PLp1Parser.ParamListContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitProgram(@NotNull PLp1Parser.ProgramContext ctx) {
    return ctx.getChild(0).accept(this);
  }

  @Override
  public ASTNode visitSwitchCase(@NotNull PLp1Parser.SwitchCaseContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitSwitchCases(@NotNull PLp1Parser.SwitchCasesContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitSwitchExpr(@NotNull PLp1Parser.SwitchExprContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitVariables(@NotNull PLp1Parser.VariablesContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitVarRef(@NotNull PLp1Parser.VarRefContext ctx) {
    return null;
  }
}
