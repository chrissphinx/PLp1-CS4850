package ast;

public class LessEqualNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public LessEqualNode() {
  }
}
