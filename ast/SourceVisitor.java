package ast;

import java.util.List;

public class SourceVisitor implements Visitor<String>
{

  public SourceVisitor() {
  }

  @Override
  public String visit(AddNode n) {
    return n.getLeft().accept(this) + " + " + n.getRight().accept(this);
  }

  @Override
  public String visit(AndNode n) {
    return n.getLeft().accept(this) + " & " + n.getRight().accept(this);
  }

  @Override
  public String visit(ArgListNode n) {
    if (n.getList().size() == 0) {
      return "";
    } else {
      StringBuilder s = new StringBuilder();

      for (ASTNode o : n.getList()) s.append(o.accept(this)).append(", ");
      s.delete(s.length() - 2, s.length());

      return s.toString();
    }
  }

  @Override
  public String visit(AssignNode n) {
    return n.getId() + " = " + n.getExpression().accept(this);
  }

  @Override
  public String visit(BodyNode n) {
    StringBuilder s = new StringBuilder();

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append(" ");
    s.deleteCharAt(s.length() - 1);

    return s.toString();
  }

  @Override
  public String visit(BoolNode n) {
    return String.valueOf(n.getBool());
  }

  @Override
  public String visit(CallNode n) {
    return n.getExpression().accept(this) + " -> (" + n.getArgumentList().accept(this) + ")"; 
  }

  @Override
  public String visit(CaseNode n) {
    if (n.getCondition() == null) {
      return "default: " + n.getExpressionList().accept(this);
    } else {
      return "case " + n.getCondition().accept(this) + ": " + n.getExpressionList().accept(this);
    }
  }

  @Override
  public String visit(CasesNode n) {
    StringBuilder s = new StringBuilder();

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append(" ");
    s.deleteCharAt(s.length() - 1);

    return s.toString();
  }

  @Override
  public String visit(ClassNode n) {
    return "class " + n.getId() + " { " + n.getVariables().accept(this) + " " + n.getInit().accept(this) + " " + n.getMethods().accept(this) + " }";
  }

  @Override
  public String visit(ConstListNode n) {
    if (n.getList().size() == 0) {
      return "[]";
    } else {
      StringBuilder s = new StringBuilder("[ ");

      for (ASTNode o : n.getList()) s.append(o.accept(this)).append(", ");
      if (n.getList().size() > 0) s.delete(s.length() - 2, s.length());
      s.append(" ]");

      return s.toString();
    }
  }

  @Override
  public String visit(CreateNode n) {
    return "create " + n.getId();
  }

  @Override
  public String visit(DivideNode n) {
    return n.getLeft().accept(this) + " / " + n.getRight().accept(this);
  }

  @Override
  public String visit(EqualNode n) {
    return n.getLeft().accept(this) + " == " + n.getRight().accept(this);
  }

  @Override
  public String visit(FloatNode n) {
    return String.valueOf(n.getFloat());
  }

  @Override
  public String visit(FunctionNode n) {
    return "function " + n.getId() + "(" + n.getParamList().accept(this) + ") { " + n.getExpressionList().accept(this) + " }";
  }

  @Override
  public String visit(GreaterEqualNode n) {
    return n.getLeft().accept(this) + " >= " + n.getRight().accept(this);
  }

  @Override
  public String visit(GreaterNode n) {
    return n.getLeft().accept(this) + " > " + n.getRight().accept(this);
  }

  @Override
  public String visit(IfNode n) {
    return "if " + n.getIf().accept(this) + " then " + n.getThen().accept(this) + " else " + n.getElse().accept(this) + " endif";
  }

  @Override
  public String visit(InstanceNode n) {
    StringBuilder s = new StringBuilder();

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append(" ");
    s.deleteCharAt(s.length() - 1);

    return s.toString();
  }

  @Override
  public String visit(IntNode n) {
    return String.valueOf(n.getInt());
  }

  @Override
  public String visit(LambdaNode n) {
    return "lambda (" + n.getParamList().accept(this) + ") { " + n.getExpressionList().accept(this) + " }";
  }

  @Override
  public String visit(LessEqualNode n) {
    return n.getLeft().accept(this) + " <= " + n.getRight().accept(this);
  }

  @Override
  public String visit(LessNode n) {
    return n.getLeft().accept(this) + " < " + n.getRight().accept(this);
  }

  @Override
  public String visit(LetDeclNode n) {
    return n.getId() + " " + n.getExpression().accept(this);
  }

  @Override
  public String visit(LetDeclsNode n) {
    if (n.getList().size() == 0) {
      return "";
    } else {
      StringBuilder s = new StringBuilder("[");

      for (ASTNode o : n.getList()) s.append(o.accept(this)).append("] [");
      if (n.getList().size() > 0) s.delete(s.length() - 3, s.length());
      s.append("]");

      return s.toString();
    }
  }

  @Override
  public String visit(LetNode n) {
    return "let (" + n.getLetDecls().accept(this) + ") { " + n.getExpressionList().accept(this) + " }";
  }

  @Override
  public String visit(MethodNode n) {
    return n.getId() + "(" + n.getParamList().accept(this) + ") { " + n.getExpressionList().accept(this) + " }";
  }

  @Override
  public String visit(MethodRefNode n) {
    return n.getId().accept(this) + "." + n.getMethod().accept(this);
  }

  @Override
  public String visit(MethodsNode n) {
    StringBuilder s = new StringBuilder("method ");

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append(" method ");
    s.delete(s.length() - 8, s.length());

    return s.toString();
  }

  @Override
  public String visit(MultiplyNode n) {
    return n.getLeft().accept(this) + " * " + n.getRight().accept(this);
  }

  @Override
  public String visit(NotEqualNode n) {
    return n.getLeft().accept(this) + " != " + n.getRight().accept(this);
  }

  @Override
  public String visit(NotNode n) {
    return "!" + n.getRight().accept(this);
  }

  @Override
  public String visit(NullNode n) {
    return "null";
  }

  @Override
  public String visit(OrNode n) {
    return n.getLeft().accept(this) + " | " + n.getRight().accept(this);
  }

  @Override
  public String visit(ParamsNode n) {
    if (n.getList().size() == 0) {
      return "";
    } else {
      StringBuilder s = new StringBuilder();

      for (ASTNode o : n.getList()) s.append(o.accept(this)).append(", ");
      s.delete(s.length() - 2, s.length());

      return s.toString();
    }
  }

  @Override
  public String visit(ProgramNode n) {
    StringBuilder s = new StringBuilder();

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append("\n");
    s.deleteCharAt(s.length() - 1);

    return s.toString();
  }

  @Override
  public String visit(StringNode n) {
    return n.getString();
  }

  @Override
  public String visit(SubNode n) {
    return n.getLeft().accept(this) + " - " + n.getRight().accept(this);
  }

  @Override
  public String visit(SwitchNode n) {
    return "switch { " + n.getCases().accept(this) + " " + n.getDefault().accept(this) + " }";
  }

  @Override
  public String visit(VarDefNode n) {
    return n.getId();
  }

  @Override
  public String visit(VarRefNode n) {
    return n.getId();
  }
}
