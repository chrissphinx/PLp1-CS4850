package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class BoolNode extends ASTNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public BoolNode() {
  }

  public boolean getBool() {
    return Boolean.parseBoolean(getLabel());
  }
}
