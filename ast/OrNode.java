package ast;

public class OrNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public OrNode() {
  }
}
