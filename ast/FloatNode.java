package ast;

public class FloatNode extends ASTNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public FloatNode() {
  }

  public float getFloat() {
    return Float.parseFloat(getLabel());
  }
}
