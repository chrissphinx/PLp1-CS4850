package ast;

public class MethodRefNode extends ASTNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public MethodRefNode() {
  }

  public String getId() {
    return getLabel().split("\\.")[0];
  }

  public String getMethod() {
    return getLabel().split("\\.")[1];
  }
}
