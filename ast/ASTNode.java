package ast;

import java.util.List;
import java.util.LinkedList;

public abstract class ASTNode
{

  protected List<ASTNode> children;
  protected String label;

  protected ASTNode() {
    children = new LinkedList<>();
  }

  public void addChild(ASTNode n) {
    children.add(n);
  }

  public ASTNode getChild(int i) {
    return children.get(i);
  }

  public void addLabel(String l) {
    label = l;
  }

  public String getLabel() {
    return label;
  }

  public abstract Object accept(Visitor v);
}
