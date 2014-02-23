package ast;

public class StringNode extends ASTNode
{

	@Override
  public Object accept(Visitor v) {
	  return v.visit(this);
  }

  public StringNode() {
  }

  public String getString() {
	  return getLabel();
  }
}
