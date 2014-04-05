package visitor;

import ast.*;
import errors.PLp1Error;

public class SourceVisitor implements Visitor<String>
{

  public SourceVisitor() {
  }

  @Override
  public String visit(AddNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " + " + n.getRight().accept(this);
  }

  @Override
  public String visit(AndNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " & " + n.getRight().accept(this);
  }

  @Override
  public String visit(ArgListNode n) throws PLp1Error {
    if (n.getList().isEmpty()) {
      return "";
    } else {
      StringBuilder s = new StringBuilder();

      for (ASTNode o : n.getList()) s.append(o.accept(this)).append(", ");
      s.delete(s.length() - 2, s.length());

      return s.toString();
    }
  }

  @Override
  public String visit(AssignNode n) throws PLp1Error {
    return n.getId() + " = " + n.getExpression().accept(this);
  }

  @Override
  public String visit(BodyNode n) throws PLp1Error {
    StringBuilder s = new StringBuilder();

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append(" ");
    s.deleteCharAt(s.length() - 1);

    return s.toString();
  }

  @Override
  public String visit(BoolNode n) throws PLp1Error {
    return String.valueOf(n.getBool());
  }

  @Override
  public String visit(CallNode n) throws PLp1Error {
    return n.getExpression().accept(this) + " -> (" + n.getArgumentList().accept(this) + ")"; 
  }

  @Override
  public String visit(CaseNode n) throws PLp1Error {
    return "case " + n.getCondition().accept(this) + ": " + n.getExpressionList().accept(this);
  }

  @Override
  public String visit(CasesNode n) throws PLp1Error {
    StringBuilder s = new StringBuilder();

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append(" ");
    s.deleteCharAt(s.length() - 1);

    return s.toString();
  }

  @Override
  public String visit(ClassNode n) throws PLp1Error {
    return "class " + n.getId() + " { " + n.getVariables().accept(this) + " " + n.getInit().accept(this) + " " + n.getMethods().accept(this) + " }";
  }

  @Override
  public String visit(ConstListNode n) throws PLp1Error {
    if (n.getList().isEmpty()) {
      return "[]";
    } else {
      StringBuilder s = new StringBuilder("[ ");

      for (ASTNode o : n.getList()) {
        int l = s.length();
        s.append(o.accept(this)).append(", ");
        if (s.charAt(l) == '[' && s.charAt(l - 2) != ',') s.deleteCharAt(l - 1);
      }
      s.delete(s.length() - 2, s.length());
      if (s.charAt(s.length() - 1) == ']') s.append("]");
      else s.append(" ]");

      return s.toString();
    }
  }

  @Override
  public String visit(CreateNode n) throws PLp1Error {
    return "create " + n.getId();
  }

  @Override
  public String visit(DefaultNode n) throws PLp1Error {
    return "default: " + n.getChild().accept(this);
  }

  @Override
  public String visit(DivideNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " / " + n.getRight().accept(this);
  }

  @Override
  public String visit(EmptyPNode n) throws PLp1Error {
    return builtin(n);
  }

  @Override
  public String visit(EqualNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " == " + n.getRight().accept(this);
  }

  @Override
  public String visit(EqualPNode n) throws PLp1Error {
    return builtin(n);
  }

  @Override
  public String visit(ExitNode n) throws PLp1Error {
    return builtin(n);
  }
  
//  @Override
//  public String visit(FirstNode n) throws PLp1Error {
//    return builtin(n);
//  }

  @Override
  public String visit(FloatNode n) throws PLp1Error {
    return String.valueOf(n.getFloat());
  }

  @Override
  public String visit(FunctionNode n) throws PLp1Error {
    return "function " + n.getId() + "(" + n.getParamList().accept(this) + ") { " + n.getExpressionList().accept(this) + " }";
  }

  @Override
  public String visit(GreaterEqualNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " >= " + n.getRight().accept(this);
  }

  @Override
  public String visit(GreaterNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " > " + n.getRight().accept(this);
  }

  @Override
  public String visit(IfNode n) throws PLp1Error {
    return "if " + n.getIf().accept(this) + " then " + n.getThen().accept(this) + " else " + n.getElse().accept(this) + " endif";
  }

  @Override
  public String visit(InitNode n) throws PLp1Error {
    return "init(" + n.getParamList().accept(this) + ") { " + n.getExpressionList().accept(this) + " }";
  }

  @Override
  public String visit(InsertNode n) throws PLp1Error {
    return builtin(n);
  }

  @Override
  public String visit(InstanceNode n) throws PLp1Error {
    StringBuilder s = new StringBuilder();

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append(" ");
    s.deleteCharAt(s.length() - 1);

    return s.toString();
  }

  @Override
  public String visit(IntNode n) throws PLp1Error {
    return String.valueOf(n.getInt());
  }

  @Override
  public String visit(LengthNode n) throws PLp1Error {
    return builtin(n);
  }

  @Override
  public String visit(LambdaNode n) throws PLp1Error {
    return "lambda (" + n.getParamList().accept(this) + ") { " + n.getExpressionList().accept(this) + " }";
  }

  @Override
  public String visit(LessEqualNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " <= " + n.getRight().accept(this);
  }

  @Override
  public String visit(LessNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " < " + n.getRight().accept(this);
  }

  @Override
  public String visit(LetDeclNode n) throws PLp1Error {
    return n.getId() + " " + n.getExpression().accept(this);
  }

  @Override
  public String visit(LetDeclsNode n) throws PLp1Error {
    if (n.getList().isEmpty()) {
      return "";
    } else {
      StringBuilder s = new StringBuilder("[");

      for (ASTNode o : n.getList()) s.append(o.accept(this)).append("] [");
      s.delete(s.length() - 3, s.length()).append("]");

      return s.toString();
    }
  }

  @Override
  public String visit(LetNode n) throws PLp1Error {
    return "let (" + n.getLetDecls().accept(this) + ") { " + n.getExpressionList().accept(this) + " }";
  }

  @Override
  public String visit(ListPNode n) throws PLp1Error {
    return builtin(n);
  }

  @Override
  public String visit(MakeListNode n) throws PLp1Error {
    return builtin(n);
  }

  @Override
  public String visit(MethodNode n) throws PLp1Error {
    return n.getId() + "(" + n.getParamList().accept(this) + ") { " + n.getExpressionList().accept(this) + " }";
  }

  @Override
  public String visit(MethodRefNode n) throws PLp1Error {
    return n.getId().accept(this) + "." + n.getMethod().accept(this);
  }

  @Override
  public String visit(MethodsNode n) throws PLp1Error {
    StringBuilder s = new StringBuilder("method ");

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append(" method ");
    s.delete(s.length() - 8, s.length());

    return s.toString();
  }

  @Override
  public String visit(MultiplyNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " * " + n.getRight().accept(this);
  }

  @Override
  public String visit(NotEqualNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " != " + n.getRight().accept(this);
  }

  @Override
  public String visit(NotNode n) throws PLp1Error {
    return "!" + n.getRight().accept(this);
  }

  @Override
  public String visit(NullNode n) throws PLp1Error {
    return "null";
  }

  @Override
  public String visit(NumberPNode n) throws PLp1Error {
    return builtin(n);
  }

  @Override
  public String visit(OrNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " | " + n.getRight().accept(this);
  }

  @Override
  public String visit(PairPNode n) throws PLp1Error {
    return builtin(n);
  }

  @Override
  public String visit(ParamsNode n) throws PLp1Error {
    if (n.getList().isEmpty()) {
      return "";
    } else {
      StringBuilder s = new StringBuilder();

      for (ASTNode o : n.getList()) s.append(o.accept(this)).append(", ");
      s.delete(s.length() - 2, s.length());

      return s.toString();
    }
  }

  @Override
  public String visit(ProgramNode n) throws PLp1Error {
    StringBuilder s = new StringBuilder();

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append("\n");
    s.deleteCharAt(s.length() - 1);

    return s.toString();
  }

  @Override
  public String visit(RestNode n) throws PLp1Error {
    return builtin(n);
  }

  @Override
  public String visit(StringNode n) throws PLp1Error {
    return n.getString();
  }

  @Override
  public String visit(SubNode n) throws PLp1Error {
    return n.getLeft().accept(this) + " - " + n.getRight().accept(this);
  }

  @Override
  public String visit(SwitchNode n) throws PLp1Error {
    return "switch { " + n.getCases().accept(this) + " " + n.getDefault().accept(this) + " }";
  }

  @Override
  public String visit(VarDefNode n) throws PLp1Error {
    return n.getId();
  }

  @Override
  public String visit(VarRefNode n) throws PLp1Error {
    return n.getId();
  }

  private String builtin(UnaryNode n) throws PLp1Error {
    return n.getLabel() + " -> (" + n.getChild().accept(this) + ")";
  }
}
