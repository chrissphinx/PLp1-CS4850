package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class LengthNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public LengthNode() {
  }

  public ASTNode getArgumentList() {
    return getChild();
  }
}
