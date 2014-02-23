package ast;

public class ProgramNode extends ListNode
{

  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public ProgramNode() {
  }
}
