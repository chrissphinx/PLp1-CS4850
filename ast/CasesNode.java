package ast;

public class CasesNode extends ListNode
{

  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public CasesNode() {
  }
}
