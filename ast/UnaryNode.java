package ast;

public abstract class UnaryNode extends ASTNode
{

  public ASTNode getChild() {
    return getChild(0);
  }
}
