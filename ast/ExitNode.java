package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class ExitNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public ExitNode() {
  }

  public ASTNode getArgumentList() {
    return getChild();
  }
}
