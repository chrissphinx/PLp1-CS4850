package ast;

public class DefaultNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public DefaultNode() {
  }

  public ASTNode getExpressionList() {
    return getChild();
  }
}
