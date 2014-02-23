package ast;

public class IntNode extends ASTNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public IntNode() {
  }

  public int getInt() {
    return Integer.parseInt(getLabel());
  }
}
