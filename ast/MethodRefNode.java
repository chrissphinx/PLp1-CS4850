package ast;

public class MethodRefNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public MethodRefNode() {
  }

  public ASTNode getId() {
    return getFirst();
  }

  public ASTNode getMethod() {
    return getSecond();
  }
}
