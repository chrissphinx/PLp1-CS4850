package visitor;

import ast.*;
import errors.PLp1Error;

public interface Visitor<T>
{

  public T visit(AddNode n) throws PLp1Error;
  public T visit(AndNode n) throws PLp1Error;
  public T visit(ArgListNode n) throws PLp1Error;
  public T visit(AssignNode n) throws PLp1Error;
  public T visit(BodyNode n) throws PLp1Error;
  public T visit(BoolNode n) throws PLp1Error;
  public T visit(CallNode n) throws PLp1Error;
  public T visit(CaseNode n) throws PLp1Error;
  public T visit(CasesNode n) throws PLp1Error;
  public T visit(ClassNode n) throws PLp1Error;
  public T visit(ConstListNode n) throws PLp1Error;
  public T visit(CreateNode n) throws PLp1Error;
  public T visit(DefaultNode n) throws PLp1Error;
  public T visit(DivideNode n) throws PLp1Error;
  public T visit(EqualNode n) throws PLp1Error;
  public T visit(FloatNode n) throws PLp1Error;
  public T visit(FunctionNode n) throws PLp1Error;
  public T visit(GreaterEqualNode n) throws PLp1Error;
  public T visit(GreaterNode n) throws PLp1Error;
  public T visit(IfNode n) throws PLp1Error;
  public T visit(InitNode n) throws PLp1Error;
  public T visit(InstanceNode n) throws PLp1Error;
  public T visit(IntNode n) throws PLp1Error;
  public T visit(LambdaNode n) throws PLp1Error;
  public T visit(LessEqualNode n) throws PLp1Error;
  public T visit(LessNode n) throws PLp1Error;
  public T visit(LetDeclNode n) throws PLp1Error;
  public T visit(LetDeclsNode n) throws PLp1Error;
  public T visit(LetNode n) throws PLp1Error;
  public T visit(MethodNode n) throws PLp1Error;
  public T visit(MethodRefNode n) throws PLp1Error;
  public T visit(MethodsNode n) throws PLp1Error;
  public T visit(MultiplyNode n) throws PLp1Error;
  public T visit(NotEqualNode n) throws PLp1Error;
  public T visit(NotNode n) throws PLp1Error;
  public T visit(NullNode n) throws PLp1Error;
  public T visit(OrNode n) throws PLp1Error;
  public T visit(ParamsNode n) throws PLp1Error;
  public T visit(ProgramNode n) throws PLp1Error;
  public T visit(StringNode n) throws PLp1Error;
  public T visit(SubNode n) throws PLp1Error;
  public T visit(SwitchNode n) throws PLp1Error;
  public T visit(VarDefNode n) throws PLp1Error;
  public T visit(VarRefNode n) throws PLp1Error;
}
