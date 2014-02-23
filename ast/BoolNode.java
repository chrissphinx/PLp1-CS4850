package ast;

public class BoolNode extends ASTNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public BoolNode() {
  }

  public boolean getBool() {
    return Boolean.parseBoolean(getLabel());
  }
}
