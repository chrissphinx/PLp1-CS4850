package ast;

public class GreaterNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public GreaterNode() {
  }
}
