package ast;

public class BodyNode extends ListNode
{

	@Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public BodyNode() {
  }
}
