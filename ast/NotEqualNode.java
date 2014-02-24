package ast;

public class NotEqualNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public NotEqualNode() {
  }
}
