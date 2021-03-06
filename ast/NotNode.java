package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class NotNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public NotNode() {
  }

  public ASTNode getRight() {
    return getChild();
  }
}
