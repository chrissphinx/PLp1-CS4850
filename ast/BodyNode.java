package ast;

public class BodyNode extends ListNode {

  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public BodyNode() {
  }

}