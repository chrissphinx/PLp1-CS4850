package ast;

public interface Visitor<T>
{

  public T visit(AddNode n);
  public T visit(AndNode n);
  public T visit(ArgListNode n);
  public T visit(AssignNode n);
  public T visit(BodyNode n);
  public T visit(BoolNode n);
  public T visit(CallNode n);
  public T visit(CaseNode n);
  public T visit(CasesNode n);
  public T visit(ClassNode n);
  public T visit(ConstListNode n);
  public T visit(CreateNode n);
  public T visit(DivideNode n);
  public T visit(EqualNode n);
  public T visit(FloatNode n);
  public T visit(FunctionNode n);
  public T visit(GreaterEqualNode n);
  public T visit(GreaterNode n);
  public T visit(IfNode n);
  public T visit(InstanceNode n);
  public T visit(IntNode n);
  public T visit(LambdaNode n);
  public T visit(LessEqualNode n);
  public T visit(LessNode n);
  public T visit(LetDeclNode n);
  public T visit(LetDeclsNode n);
  public T visit(LetNode n);
  public T visit(MethodNode n);
  public T visit(MethodRefNode n);
  public T visit(MethodsNode n);
  public T visit(MultiplyNode n);
  public T visit(NotEqualNode n);
  public T visit(NotNode n);
  public T visit(NullNode n);
  public T visit(OrNode n);
  public T visit(ParamsNode n);
  public T visit(ProgramNode n);
  public T visit(StringNode n);
  public T visit(SubNode n);
  public T visit(SwitchNode n);
  public T visit(VarDefNode n);
  public T visit(VarRefNode n);
}
