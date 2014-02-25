package ast;

public class ParamsNode extends ListNode {

  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public ParamsNode() {
  }
}
