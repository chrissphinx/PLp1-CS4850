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
      case ASSIGN:
        node = new AssignNode();
        break;
      case BODY:
        node = new BodyNode();
        break;
      case BOOL:
        node = new BoolNode();
        break;
      case CALL:
        node = new CallNode();
        break;
      case CASE:
        node = new CaseNode();
        break;
      case CASES:
        node = new CasesNode();
        break;
      case CLASS:
        node = new ClassNode();
        break;
      case CONSTS:
        node = new ConstListNode();
        break;
      case CREATE:
        node = new CreateNode();
        break;
      case DEFAULT:
        node = new DefaultNode();
        break;
      case DIV:
        node = new DivideNode();
        break;
      case EQ:
        node = new EqualNode();
        break;
      case FLOAT:
        node = new FloatNode();
        break;
      case FUNC:
        node = new FunctionNode();
        break;
      case GTEQ:
        node = new GreaterEqualNode();
        break;
      case GT:
        node = new GreaterNode();
        break;
      case IF:
        node = new IfNode();
        break;
      case INIT:
        node = new InitNode();
        break;
      case INSTANCE:
        node = new InstanceNode();
        break;
      case INT:
        node = new IntNode();
        break;
      case LAMBDA:
        node = new LambdaNode();
        break;
      case LTEQ:
        node = new LessEqualNode();
        break;
      case LT:
        node = new LessNode();
        break;
      case LETDECL:
        node = new LetDeclNode();
        break;
      case LETDECLS:
        node = new LetDeclsNode();
        break;
      case LET:
        node = new LetNode();
        break;
      case METHOD:
        node = new MethodNode();
        break;
      case METHODREF:
        node = new MethodRefNode();
        break;
      case METHODS:
        node = new MethodsNode();
        break;
      case MULT:
        node = new MultiplyNode();
        break;
      case NEQ:
        node = new NotEqualNode();
        break;
      case NOT:
        node = new NotNode();
        break;
      case NULL:
        node = new NullNode();
        break;
      case OR:
        node = new OrNode();
        break;
      case PARAMS:
        node = new ParamsNode();
        break;
      case PROGRAM:
        node = new ProgramNode();
        break;
      case STRING:
        node = new StringNode();
        break;
      case SUB:
        node = new SubNode();
        break;
      case SWITCH:
        node = new SwitchNode();
        break;
      case VARDEF:
        node = new VarDefNode();
        break;
      case VARREF:
        node = new VarRefNode();
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
