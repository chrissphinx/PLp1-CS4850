package ast;

public class FunctionNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) {
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
