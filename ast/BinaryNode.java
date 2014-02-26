package ast;

public abstract class BinaryNode extends ASTNode
{

  public ASTNode getFirst() {
    return children.get(0);
  }

  public ASTNode getSecond() {
    return children.get(1);
  }
}
