package ast;

public class CreateNode extends ASTNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public CreateNode() {
  }

  public String getId() {
	  return getLabel();
  }
}
