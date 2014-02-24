package ast;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import parser.PLp1Parser;
import parser.PLp1Visitor;

public class ASTGenerator extends AbstractParseTreeVisitor<ASTNode> implements PLp1Visitor<ASTNode>
{

  private ASTNodeBuilderFactory factory = new ASTNodeBuilderFactory();

  @Override
  public ASTNode visitArgumentList(@NotNull PLp1Parser.ArgumentListContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitAssignment(@NotNull PLp1Parser.AssignmentContext ctx) {
    return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.ASSIGN)
                  .addLabel(ctx.getChild(0).getText())
                  .addChild(ctx.getChild(2).accept(this))
                  .build();
  }

  @Override
  public ASTNode visitClassDef(@NotNull PLp1Parser.ClassDefContext ctx) {
    return null;
  }

  @Override
  public ASTNode visitConstantExp(@NotNull PLp1Parser.ConstantExpContext ctx) {
    if (ctx.listExp() != null) {
      return ctx.getChild(0).accept(this);
    } else if (ctx.TRUE() != null || ctx.FALSE() != null) {
      return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.BOOL)
                    .addLabel(ctx.getText())
                    .build();
    } else if (ctx.INTNUM() != null) {
      return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.INT)
                    .addLabel(ctx.getText())
                    .build();
    } else if (ctx.FLOATNUM() != null) {
      return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.FLOAT)
                    .addLabel(ctx.getText())
                    .build();
    } else if (ctx.STRING() != null) {
      return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.STRING)
                    .addLabel(ctx.getText())
                    .build();
    } else {
      return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.NULL)
                    .build();
    }
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
    if (ctx.getChildCount() == 1) {
      return ctx.getChild(0).accept(this);
    } else {
      if (ctx.INVOKE() != null) {
        return null;
      } else if (ctx.LP() != null) {
        return ctx.getChild(1).accept(this);
      } else {
        if (ctx.MULTIPLY() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.MULT)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.DIVIDE() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.DIV)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.PLUS() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.ADD)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.MINUS() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.SUB)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.EQUAL() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.EQ)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.NOTEQUAL() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.NEQ)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.LESS() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.LT)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.LESSEQUAL() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.LTEQ)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.GREATER() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.GT)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.GREATEREQUAL() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.GTEQ)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.OR() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.OR)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.AND() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.AND)
                        .addChild(ctx.getChild(0).accept(this))
                        .addChild(ctx.getChild(2).accept(this))
                        .build();
        } else if (ctx.NOT() != null) {
          return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.NOT)
                        .addChild(ctx.getChild(1).accept(this))
                        .build();
        } else return null;
      }
    }
  }

  @Override
  public ASTNode visitExpressionList(@NotNull PLp1Parser.ExpressionListContext ctx) {
    ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.BODY);
    for(int i = 0; i < ctx.getChildCount(); i++) {
      b.addChild(ctx.getChild(i).accept(this));
    } return b.build();
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
    return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.LETDECL)
                  .addLabel(ctx.getChild(1).getText())
                  .addChild(ctx.getChild(2).accept(this))
                  .build();
  }

  @Override
  public ASTNode visitLetDecls(@NotNull PLp1Parser.LetDeclsContext ctx) {
    ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.LETDECLS);
    for(int i = 0; i < ctx.getChildCount(); i++) {
      b.addChild(ctx.getChild(i).accept(this));
    } return b.build();
  }

  @Override
  public ASTNode visitLetExpr(@NotNull PLp1Parser.LetExprContext ctx) {
    return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.LET)
                  .addChild(ctx.getChild(2).accept(this))
                  .addChild(ctx.getChild(5).accept(this))
                  .build();
  }

  @Override
  public ASTNode visitListExp(@NotNull PLp1Parser.ListExpContext ctx) {
    ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.CONSTS);
    for(int i = 1; i < ctx.getChildCount(); i += 2) {
      b.addChild(ctx.getChild(i).accept(this));
    } return b.build();
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
    return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.PROGRAM)
                  .addChild(ctx.getChild(0).accept(this))
                  .build();
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
    if (ctx.getChildCount() == 1) {
      return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.VARREF)
                    .addLabel(ctx.getChild(0).getText())
                    .build();
    } else {
      return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.NodeType.METHODREF)
                    .addLabel(ctx.getChild(0).getText() +
                              ctx.getChild(1).getText() +
                              ctx.getChild(2).getText())
                    .build();
    }
  }
}
