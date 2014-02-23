package ast;

public class AddNode extends OperatorNode
{

	@Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public AddNode() {
  }
}
