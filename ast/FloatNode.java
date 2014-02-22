package ast;

public class FloatNode extends ASTNode {

  public Object accept(Visitor v) {
  return null;
  }

  public FloatNode() {
  }

  public float getFloat() {
  return 0.0f;
  }

}