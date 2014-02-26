package ast;

public class LetNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public LetNode() {
  }

  public ASTNode getLetDecls() {
    return getFirst();
  }

  public ASTNode getExpressionList() {
    return getSecond();
  }
}
