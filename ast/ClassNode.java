package ast;

public class ClassNode extends TernaryNode
{

  @Override
  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public ClassNode() {
  }

  public String getId() {
    return getLabel();
  }

  public ASTNode getVariables() {
    return getFirst();
  }

  public ASTNode getInit() {
    return getSecond();
  }

  public ASTNode getMethods() {
    return getThird();
  }
}
