package ast;

public class AndNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public AndNode() {
  }
}
