package ast;

public class LambdaNode extends BinaryNode
{

  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public LambdaNode() {
  }

  public ASTNode getParamList() {
    return getFirst();
  }

  public ASTNode getExpressionList() {
    return getSecond();
  }
}
