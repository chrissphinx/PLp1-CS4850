package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class ArgListNode extends ListNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public ArgListNode() {
  }
}
