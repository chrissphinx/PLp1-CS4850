package ast;

public class CallNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public CallNode() {
  }

  public ASTNode getExpression() {
    return getFirst();
  }

  public ASTNode getArgumentList() {
    return getSecond();
  }
}
