package ast;

public class GreaterEqualNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public GreaterEqualNode() {
  }
}
