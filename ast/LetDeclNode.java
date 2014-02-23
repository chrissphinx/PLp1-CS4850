package ast;

public class LetDeclNode extends UnaryNode
{

  public Object accept(Visitor v) {
    return v.visit(this);
  }

  public LetDeclNode() {
  }

  public String getId() {
    return getLabel();
  }

  public ASTNode getExpression() {
    return getChild(0);
  }
}
