package ast;

public class LessNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public LessNode() {
  }
}
