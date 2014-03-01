package ast;

public class InitNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public InitNode() {
  }

  public ASTNode getParamList() {
    return getFirst();
  }

  public ASTNode getExpressionList() {
    return getSecond();
  }
}
