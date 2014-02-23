package ast;

public class VarRefNode extends ASTNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public VarRefNode() {
  }

  public String getId() {
    return getLabel();
  }
}
