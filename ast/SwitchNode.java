package ast;

public class SwitchNode extends BinaryNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public SwitchNode() {
  }

  public ASTNode getCases() {
	  return getFirst();
  }

  public ASTNode getDefault() {
  	return getSecond();
  }
}
