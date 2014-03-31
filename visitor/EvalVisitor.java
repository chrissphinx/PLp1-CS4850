package visitor;

import java.util.LinkedList;
import java.util.List;

import ast.*;
import errors.*;
import types.*;

public class EvalVisitor implements Visitor<Value>
{

  public EvalVisitor() {
  }

  @Override
  public Value visit(AddNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueInt((Integer) l.get() + (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Integer) l.get() + (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Float) l.get() + (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Float) l.get() + (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Addition");
  }

  @Override
  public Value visit(AndNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool((Boolean) l.get() && (Boolean) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Logical And");
  }

  @Override
  public Value visit(ArgListNode n) throws PLp1Error {
    if (n.getList().isEmpty()) {
      return new ValueList();
    } else {
      List<Value> l = new LinkedList<>();

      for (ASTNode o : n.getList()) l.add((Value) o.accept(this));

      return new ValueList(l);
    }
  }

  @Override
  public Value visit(AssignNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(BodyNode n) throws PLp1Error {
    Value v = null;

    for (ASTNode a : n.getList()) v = (Value) a.accept(this);

    return v;
  }

  @Override
  public Value visit(BoolNode n) throws PLp1Error {
    return new ValueBool(n.getBool());
  }

  @Override
  public Value visit(CallNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(CaseNode n) throws PLp1Error {
    ValueBool v;

    try {
      v = (ValueBool) n.getCondition().accept(this);
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `case` Condition");
    }

    if (v.get())
      return (Value) n.getExpressionList().accept(this);
    else throw new PLp1CaseError();
  }

  @Override
  public Value visit(CasesNode n) throws PLp1Error {
    for (ASTNode o : n.getList()) {
      try {
        return (Value) o.accept(this);
      } catch (PLp1CaseError e) {}
    }

    throw new PLp1CaseError();
  }

  @Override
  public Value visit(ClassNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(ConstListNode n) throws PLp1Error {
    if (n.getList().isEmpty()) {
      return new ValueList();
    } else {
      List<Value> l = new LinkedList<>();

      for (ASTNode o : n.getList()) l.add((Value) o.accept(this));

      return new ValueList(l);
    }
  }

  @Override
  public Value visit(CreateNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(DefaultNode n) throws PLp1Error {
    return (Value) n.getExpressionList().accept(this);
  }

  @Override
  public Value visit(DivideNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueInt((Integer) l.get() / (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Integer) l.get() / (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Float) l.get() / (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Float) l.get() / (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Division");
  }

  @Override
  public Value visit(EmptyPNode n) throws PLp1Error {
    List<Value> l = ((ValueList) n.getArgumentList().accept(this)).get();
    if (l.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `emptyp -> ()`");

    try {
      l = (List) l.get(0).get();
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `emptyp -> ()`");
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `emptyp -> ()`");
    }

    if (l.isEmpty()) return new ValueBool(true);
    else return new ValueBool(false);
  }

  @Override
  public Value visit(EqualNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool((Integer) l.get() == (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool(((Integer) l.get()).floatValue() == (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() == ((Integer) r.get()).floatValue());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() == (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Equal To");
  }

  @Override
  public Value visit(EqualPNode n) throws PLp1Error {
    List<Value> a = ((ValueList) n.getArgumentList().accept(this)).get();
    if (a.size() > 2) throw new PLp1ArgumentsError("Too Many Arguments for `equalp -> ()`");
    ValueList l;
    ValueList r;
 
    try {
      l = ((ValueList) a.get(0));
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `equalp -> ()`");
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `equalp -> ()`");
    }

    try {
      r = ((ValueList) a.get(1));
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `equalp -> ()`");
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `equalp -> ()`");
    }

    return new ValueBool((Boolean) l.equals(r));
  }

  @Override
  public Value visit(ExitNode n) throws PLp1Error {
    int s = 0;
    try {
      s = ((ValueInt) ((ValueList) n.getArgumentList().accept(this)).get().get(0)).get();
    } catch (IndexOutOfBoundsException|ClassCastException e) {}
    System.exit(s);
    return null;
  }
  
  @Override
  public Value visit(FirstNode n) throws PLp1Error {
    List<Value> l = ((ValueList) n.getArgumentList().accept(this)).get();
    if (l.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `first -> ()`");

    try {
      l = (List) l.get(0).get();
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `first -> ()`");
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `first -> ()`");
    }

    try {
      return (Value) l.get(0);
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Empty List Given to `first -> ()`");
    }
  }

  @Override
  public Value visit(FloatNode n) throws PLp1Error {
    return new ValueFloat(n.getFloat());
  }

  @Override
  public Value visit(FunctionNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(GreaterEqualNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool((Integer) l.get() >= (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Integer) l.get() >= (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() >= (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() >= (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Greater Than or Equal To");
  }

  @Override
  public Value visit(GreaterNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool((Integer) l.get() > (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Integer) l.get() > (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() > (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() > (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Greater Than");
  }

  @Override
  public Value visit(IfNode n) throws PLp1Error {
    ValueBool v;

    try {
      v = (ValueBool) n.getIf().accept(this);
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `if` Condition");
    }

    if (v.get()) return (Value) n.getThen().accept(this);
    else return (Value) n.getElse().accept(this);
  }

  @Override
  public Value visit(InitNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(InsertNode n) throws PLp1Error {
    List<Value> l = ((ValueList) n.getArgumentList().accept(this)).get();
    if (l.size() > 2) throw new PLp1ArgumentsError("Too Many Arguments for `insert -> ()`");
    Value v;

    try {
      v = (Value) l.get(0);
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1BoundsError("Not Enough Arguments for `insert -> ()`");
    }
      
    try {
      l = (List) l.get(1).get();
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1BoundsError("Not Enough Arguments for `insert -> ()`");
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `insert -> ()`");
    }

    l.add(0, v); return new ValueList(l);
  }

  @Override
  public Value visit(InstanceNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public ValueInt visit(IntNode n) throws PLp1Error {
    return new ValueInt(n.getInt());
  }

  @Override
  public Value visit(LambdaNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(LengthNode n) throws PLp1Error {
    List<Value> l = ((ValueList) n.getArgumentList().accept(this)).get();
    if (l.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `length -> ()`");
    
    try {
      l = (List) l.get(0).get();
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `length -> ()`");
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `length -> ()`");
    }

    return new ValueInt(l.size());
  }

  @Override
  public Value visit(LessEqualNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool((Integer) l.get() <= (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Integer) l.get() <= (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() <= (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() <= (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Less Than or Equal To");
  }

  @Override
  public Value visit(LessNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool((Integer) l.get() < (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Integer) l.get() < (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() < (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() < (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Less Than");
  }

  @Override
  public Value visit(LetDeclNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(LetDeclsNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(LetNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(ListPNode n) throws PLp1Error {
    List<Value> l = ((ValueList) n.getArgumentList().accept(this)).get();
    if (l.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `listp -> ()`");
    
    try {
      l = (List) l.get(0).get();
    } catch (ClassCastException e) {
      return new ValueBool(false);
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `listp -> ()`");
    }

    return new ValueBool(true);
  }

  @Override
  public Value visit(MakeListNode n) throws PLp1Error {
    return (ValueList) n.getArgumentList().accept(this);
  }

  @Override
  public Value visit(MethodNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(MethodRefNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(MethodsNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(MultiplyNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueInt((Integer) l.get() * (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Integer) l.get() * (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Float) l.get() * (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Float) l.get() * (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Multiplication");
  }

  @Override
  public Value visit(NotEqualNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool((Integer) l.get() != (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool(((Integer) l.get()).floatValue() != (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() != ((Integer) r.get()).floatValue());
    } catch (ClassCastException e) {}
    try {
      return new ValueBool((Float) l.get() != (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Not Equal To");
  }

  @Override
  public Value visit(NotNode n) throws PLp1Error {
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool(!(Boolean) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Logical Not");
  }

  @Override
  public Value visit(NullNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(NumberPNode n) throws PLp1Error {
    List<Value> l = ((ValueList) n.getArgumentList().accept(this)).get();
    if (l.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `numberp -> ()`");
    Value v;
    
    try {
      v = l.get(0);
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `numberp -> ()`");
    }

    if (v instanceof ValueInt || v instanceof ValueFloat)
      return new ValueBool(true);
    else return new ValueBool(false);
  }

  @Override
  public Value visit(OrNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool((Boolean) l.get() || (Boolean) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Logical Or");
  }

  @Override
  public Value visit(PairPNode n) throws PLp1Error {
    List<Value> l = ((ValueList) n.getArgumentList().accept(this)).get();
    if (l.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `pairp -> ()`");
    
    try {
      l = (List) l.get(0).get();
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `pairp -> ()`");
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `pairp -> ()`");
    }

    if (!l.isEmpty()) return new ValueBool(true);
    else return new ValueBool(false);
  }

  @Override
  public Value visit(ParamsNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(ProgramNode n) throws PLp1Error {
    Value v = null;

    for (ASTNode a : n.getList()) v = (Value) a.accept(this);

    return v;
  }

  public Value visit(RestNode n) throws PLp1Error {
    List<Value> l = ((ValueList) n.getArgumentList().accept(this)).get();
    if (l.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `rest -> ()`");

    try {
      l = (List) l.get(0).get();
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `rest -> ()`");
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `rest -> ()`");
    }

    try {
      l.remove(0); return new ValueList(l);
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1ArgumentsError("Empty List Given to `rest -> ()`");
    }
  }

  @Override
  public Value visit(StringNode n) throws PLp1Error {
    return new ValueString(n.getString());
  }

  @Override
  public Value visit(SubNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueInt((Integer) l.get() - (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Integer) l.get() - (Float) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Float) l.get() - (Integer) r.get());
    } catch (ClassCastException e) {}
    try {
      return new ValueFloat((Float) l.get() - (Float) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Subtraction");
  }

  @Override
  public Value visit(SwitchNode n) throws PLp1Error {
    try {
      return (Value) n.getCases().accept(this);
    } catch (PLp1CaseError e) {
      return (Value) n.getDefault().accept(this);
    }
  }

  @Override
  public Value visit(VarDefNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(VarRefNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
