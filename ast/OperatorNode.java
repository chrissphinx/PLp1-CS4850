package ast;

public abstract class OperatorNode extends ASTNode
{

  public ASTNode getLeft() {
    return getChild(0);
  }

  public ASTNode getRight() {
    return getChild(1);
  }
}
