package ast;

import ast.ASTNodeBuilderFactory.NodeType;

public class ASTNodeBuilder
{

  private ASTNode node;

  protected ASTNodeBuilder(NodeType type) {
    node = null;
    switch (type)
    {
      case ADD:
        node = new AddNode();
        break;
      case AND:
        node = new AndNode();
        break;
      case ARGS:
        node = new ArgListNode();
        break;
      // etc ...
      case BODY:
        node = new BodyNode();
        break;
      case BOOL:
        node = new BoolNode();
        break;
      case CONSTS:
        node = new ConstListNode();
        break;
      case PROGRAM:
        node = new ProgramNode();
        break;
    }
  }

  public ASTNodeBuilder addLabel(String s) {
    node.addLabel(s);
    return this;
  }

  public ASTNodeBuilder addChild(ASTNode n) {
    node.addChild(n);
    return this;
  }

  public ASTNode build() {
    return node;
  }
}