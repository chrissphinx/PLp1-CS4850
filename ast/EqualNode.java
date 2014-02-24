package ast;

public class EqualNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public EqualNode() {
  }
}
