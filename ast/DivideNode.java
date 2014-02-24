package ast;

public class DivideNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public DivideNode() {
  }
}
