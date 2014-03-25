package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class DefaultNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public DefaultNode() {
  }

  public ASTNode getExpressionList() {
    return getChild();
  }
}
