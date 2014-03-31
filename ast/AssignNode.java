package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class AssignNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public AssignNode() {
  }

  public String getId() {
    return getLabel();
  }

  public ASTNode getExpression() {
    return getChild();
  }
}
