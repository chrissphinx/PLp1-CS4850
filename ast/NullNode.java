package ast;

public class NullNode extends ASTNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public NullNode() {
  }
}
