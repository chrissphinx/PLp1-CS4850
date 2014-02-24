package ast;

public class NotNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public NotNode() {
  }

  public ASTNode getRight() {
    return getChild();
  }
}
