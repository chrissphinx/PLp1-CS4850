package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class VarDefNode extends ASTNode
{

	@Override
  public Object accept(Visitor v) throws PLp1Error {
	  return v.visit(this);
  }

  public VarDefNode() {
  }

  public String getId() {
	  return getLabel();
  }
}
