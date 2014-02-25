package ast;

public class VarDefNode extends ASTNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public VarDefNode() {
  }

  public String getId() {
	  return getLabel();
  }
}
