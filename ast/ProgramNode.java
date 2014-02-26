package ast;

public class ProgramNode extends ListNode
{

	@Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public ProgramNode() {
  }
}
