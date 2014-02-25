package ast;

public class IfNode extends TernaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public IfNode() {
  }

  public ASTNode getIf() {
    return getFirst();
  }

  public ASTNode getThen() {
    return getSecond();
  }

  public ASTNode getElse() {
    return getThird();
  }
}
