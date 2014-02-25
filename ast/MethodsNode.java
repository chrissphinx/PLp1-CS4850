package ast;

public class MethodsNode extends ListNode
{

  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public MethodsNode() {
  }
}
