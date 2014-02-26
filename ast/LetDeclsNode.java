package ast;

public class LetDeclsNode extends ListNode
{

	@Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public LetDeclsNode() {
  }
}
