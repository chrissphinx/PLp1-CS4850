package ast;

public class LetNode extends BinaryNode
{

  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public LetNode() {
  }

  public ASTNode getLetDecls() {
    return getChild(0);
  }

  public ASTNode getExpressionList() {
    return getChild(1);
  }
}
