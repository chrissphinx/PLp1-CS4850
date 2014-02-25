package ast;

public class InstanceNode extends ListNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public InstanceNode() {
  }
}
