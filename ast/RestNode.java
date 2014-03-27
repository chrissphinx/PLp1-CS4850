package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class RestNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public RestNode() {
  }

  public ASTNode getArgumentList() {
    return getChild();
  }
}
