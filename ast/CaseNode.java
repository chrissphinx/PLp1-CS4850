package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class CaseNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public CaseNode() {
  }

  public ASTNode getCondition() {
    return getFirst();
  }

  public ASTNode getExpressionList() {
    return getSecond();
  }
}
