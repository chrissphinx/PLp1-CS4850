package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class FunctionNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public void FunctionNode() {
  }

  public String getId() {
    return getLabel();
  }

  public ASTNode getParamList() {
    return getFirst();
  }

  public ASTNode getExpressionList() {
    return getSecond();
  }
}
