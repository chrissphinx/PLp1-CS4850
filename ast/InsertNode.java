package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class InsertNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public InsertNode() {
  }

  public ASTNode getArgumentList() {
    return getChild();
  }
}
