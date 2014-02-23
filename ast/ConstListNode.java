package ast;

public class ConstListNode extends ListNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public ConstListNode() {
  }
}
