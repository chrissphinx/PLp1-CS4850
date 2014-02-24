package ast;

public class MultiplyNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public MultiplyNode() {
  }
}
