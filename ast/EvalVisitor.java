package ast;

import types.*;

public class EvalVisitor implements Visitor<Value>
{

  public EvalVisitor() {
  }

  @Override
  public Value visit(AddNode n) {
    return (Value) ((Value) n.getLeft().accept(this)).add((Value) n.getRight().accept(this));
  }

  @Override
  public Value visit(AndNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(ArgListNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(AssignNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(BodyNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(BoolNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(CallNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(CaseNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(CasesNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(ClassNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(ConstListNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(CreateNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(DefaultNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(DivideNode n) {
    return (Value) ((Value) n.getLeft().accept(this)).divide((Value) n.getRight().accept(this));
  }

  @Override
  public Value visit(EqualNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(FloatNode n) {
    return new ValueFloat(n.getFloat());
  }

  @Override
  public Value visit(FunctionNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(GreaterEqualNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(GreaterNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(IfNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(InitNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(InstanceNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public ValueInt visit(IntNode n) {
    return new ValueInt(n.getInt());
  }

  @Override
  public Value visit(LambdaNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(LessEqualNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(LessNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(LetDeclNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(LetDeclsNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(LetNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(MethodNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(MethodRefNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(MethodsNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(MultiplyNode n) {
    return (Value) ((Value) n.getLeft().accept(this)).multiply((Value) n.getRight().accept(this));
  }

  @Override
  public Value visit(NotEqualNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(NotNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(NullNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(OrNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(ParamsNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(ProgramNode n) {
    return (Value) n.getList().get(0).accept(this);
  }

  @Override
  public Value visit(StringNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(SubNode n) {
    return (Value) ((Value) n.getLeft().accept(this)).sub((Value) n.getRight().accept(this));
  }

  @Override
  public Value visit(SwitchNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(VarDefNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(VarRefNode n) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
