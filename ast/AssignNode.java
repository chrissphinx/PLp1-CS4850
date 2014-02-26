package ast;

public class AssignNode extends UnaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public AssignNode() {
  }

  public String getId() {
    return getLabel();
  }

  public ASTNode getExpression() {
    return getChild();
  }
}
