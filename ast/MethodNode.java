package ast;

public class MethodNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) {
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
