package ast;

public abstract class OperatorNode extends ASTNode
{

  public ASTNode getLeft() {
    return children.get(0);
  }

  public ASTNode getRight() {
    return children.get(1);
  }
}
