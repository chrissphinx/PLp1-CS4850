package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class MethodRefNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public MethodRefNode() {
  }

  public ASTNode getId() {
    return getFirst();
  }

  public ASTNode getMethod() {
    return getSecond();
  }
}
