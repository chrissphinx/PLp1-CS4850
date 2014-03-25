package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class IntNode extends ASTNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public IntNode() {
  }

  public int getInt() {
    return Integer.parseInt(getLabel());
  }
}
