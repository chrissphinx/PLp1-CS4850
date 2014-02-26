package ast;

public abstract class TernaryNode extends ASTNode
{

  public ASTNode getFirst() {
	  return children.get(0);
  }

  public ASTNode getSecond() {
	  return children.get(1);
  }

  public ASTNode getThird() {
	  return children.get(2);
  }
}
