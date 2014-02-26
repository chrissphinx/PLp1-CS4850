package ast;

public abstract class UnaryNode extends ASTNode
{

  public ASTNode getChild() {
    return children.get(0);
  }
}
