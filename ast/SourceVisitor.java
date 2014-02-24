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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(CaseNode n) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(CasesNode n) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(ClassNode n) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(ConstListNode n) {
    StringBuilder s = new StringBuilder("[ ");

    for (ASTNode o : n.getList()) s.append(o.accept(this)).append(", ");
    if (n.getList().size() > 0) s.delete(s.length() - 2, s.length());
    s.append(" ]");

    return s.toString();
  }

  @Override
  public String visit(CreateNode n) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(InstanceNode n) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(IntNode n) {
    return String.valueOf(n.getInt());
  }

  @Override
  public String visit(LambdaNode n) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(MethodRefNode n) {
    return n.getId() + "." + n.getMethod();
  }

  @Override
  public String visit(MethodsNode n) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    return "~" + n.getRight().accept(this);
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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(ProgramNode n) {
    StringBuilder s = new StringBuilder();

    for (ASTNode o : n.getList()) s.append(o.accept(this));

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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(VarDefNode n) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String visit(VarRefNode n) {
    return n.getId();
  }
}
