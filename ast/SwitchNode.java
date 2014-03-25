package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class SwitchNode extends BinaryNode
{

	@Override
  public Object accept(Visitor v) throws PLp1Error {
	  return v.visit(this);
  }

  public SwitchNode() {
  }

  public ASTNode getCases() {
	  return getFirst();
  }

  public ASTNode getDefault() {
  	return getSecond();
  }
}
