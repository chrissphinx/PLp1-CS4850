package ast;

public class MethodsNode extends ListNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public MethodsNode() {
  }
}
