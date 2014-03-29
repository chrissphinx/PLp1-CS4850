package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class MakeListNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public MakeListNode() {
  }

  public ASTNode getArgumentList() {
    return getChild();
  }
}
