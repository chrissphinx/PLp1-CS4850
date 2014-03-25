package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class MethodNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public MethodNode() {
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
