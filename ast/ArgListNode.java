package ast;

public class ArgListNode extends ListNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public ArgListNode() {
  }
}
