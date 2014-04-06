package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class CallNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public CallNode() {
  }

  public ASTNode getVarRef() {
    return getFirst();
  }

  public ASTNode getArgumentList() {
    return getSecond();
  }
}
