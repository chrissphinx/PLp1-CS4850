package ast;

import errors.PLp1Error;
import visitor.Visitor;

public class LetNode extends BinaryNode
{

  @Override
  public Object accept(Visitor v) throws PLp1Error {
    return v.visit(this);
  }

  public LetNode() {
  }

  public ASTNode getLetDecls() {
    return getFirst();
  }

  public ASTNode getBody() {
    return getSecond();
  }
}
