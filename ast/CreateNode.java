package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class CreateNode extends ASTNode
{

	@Override
  public Object accept(Visitor v) throws PLp1Error {
	  return v.visit(this);
  }

  public CreateNode() {
  }

  public String getId() {
	  return getLabel();
  }
}
