package ast;

public class ParamsNode extends ListNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public ParamsNode() {
  }
}
