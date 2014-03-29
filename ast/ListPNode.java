package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class ListPNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public ListPNode() {
  }

  public ASTNode getArgumentList() {
    return getChild();
  }
}
