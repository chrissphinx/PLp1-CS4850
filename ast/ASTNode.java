package ast;

import visitor.Visitor;
import java.util.LinkedList;
import java.util.List;
import errors.PLp1Error;

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

  public abstract Object accept(Visitor v) throws PLp1Error;
}
