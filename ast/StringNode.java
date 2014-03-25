package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class StringNode extends ASTNode
{

	@Override
  public Object accept(Visitor v) throws PLp1Error {
	  return v.visit(this);
  }

  public StringNode() {
  }

  public String getString() {
	  return getLabel();
  }
}
