package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class FirstNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public FirstNode() {
  }

  public ASTNode getArgumentList() {
    return getChild();
  }
}
