package ast;

import java.util.List;

public class ConstListNode extends ListNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public ConstListNode() {
  }

  public List<ASTNode> getExpressions() {
    return children;
  }
}
