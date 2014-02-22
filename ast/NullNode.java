package ast;

public class NullNode extends ASTNode {

  public Object accept(Visitor v) {
  return null;
  }

  public NullNode() {
  }

}