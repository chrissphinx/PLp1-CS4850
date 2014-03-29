package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class LetDeclNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public LetDeclNode() {
  }

  public String getId() {
    return getLabel();
  }

  public ASTNode getExpression() {
    return getChild();
  }

  @Override
  public ASTNode getArgumentList() {
    throw new UnsupportedOperationException("LetDeclNode doesn't have an argument list");
  }
}
