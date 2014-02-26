package ast;

public class CasesNode extends ListNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public CasesNode() {
  }
}
