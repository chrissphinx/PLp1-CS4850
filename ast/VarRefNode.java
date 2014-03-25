package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class VarRefNode extends ASTNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public VarRefNode() {
  }

  public String getId() {
    return getLabel();
  }
}
