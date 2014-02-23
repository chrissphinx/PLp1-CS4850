package ast;

public abstract class BinaryNode extends ASTNode
{

  public ASTNode getFirst() {
    return getChild(0);
  }

  public ASTNode getSecond() {
    return getChild(1);
  }
}
