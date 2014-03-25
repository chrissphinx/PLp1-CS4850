package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class IfNode extends TernaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public IfNode() {
  }

  public ASTNode getIf() {
    return getFirst();
  }

  public ASTNode getThen() {
    return getSecond();
  }

  public ASTNode getElse() {
    return getThird();
  }
}
