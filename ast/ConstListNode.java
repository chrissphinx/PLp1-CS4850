package ast;

public class ConstListNode extends ListNode {

  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public ConstListNode() {
  }

}