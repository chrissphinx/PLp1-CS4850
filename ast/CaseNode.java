package ast;

public class CaseNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public CaseNode() {
  }

  public ASTNode getCondition() {
    return getFirst();
  }

  public ASTNode getExpressionList() {
    return getSecond();
  }
}
