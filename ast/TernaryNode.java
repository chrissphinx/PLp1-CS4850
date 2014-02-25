package ast;

public abstract class TernaryNode extends ASTNode
{

  public ASTNode getFirst() {
	  return getChild(0);
  }

  public ASTNode getSecond() {
	  return getChild(1);
  }

  public ASTNode getThird() {
	  return getChild(2);
  }
}
