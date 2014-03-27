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
      LinkedList<Value> l = new LinkedList<>();

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
    throw new UnsupportedOperationException("Not supported yet.");
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
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(CasesNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
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
      LinkedList<Value> l = new LinkedList<>();

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
    throw new UnsupportedOperationException("Not supported yet.");
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
  public Value visit(FirstNode n) throws PLp1Error {
    List<Value> l = new LinkedList<>();

    try {
      l = (List) ((ValueList) ((ValueList) n.getArgumentList().accept(this)).get().get(0)).get();
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `first -> ()`");
    }

    try {
      return (Value) l.get(0);
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1BoundsError("Empty List Given to `first -> ()`");
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
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(InitNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
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
  public Value visit(OrNode n) throws PLp1Error {
    Value l = (Value) n.getLeft().accept(this);
    Value r = (Value) n.getRight().accept(this);

    try {
      return new ValueBool((Boolean) l.get() || (Boolean) r.get());
    } catch (ClassCastException e) {}

    throw new PLp1TypeError("Invalid Types for Logical Or");
  }

  @Override
  public Value visit(ParamsNode n) throws PLp1Error {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Value visit(ProgramNode n) throws PLp1Error {
    return (Value) n.getList().get(0).accept(this);
  }

  public Value visit(RestNode n) throws PLp1Error {
    List<Value> l = new LinkedList<>();

    try {
      l = (List) ((ValueList) ((ValueList) n.getArgumentList().accept(this)).get().get(0)).get();
    } catch (ClassCastException e) {
      throw new PLp1TypeError("Invalid Type for `rest -> ()`");
    }

    try {
      l.remove(0); return new ValueList(l);
    } catch (IndexOutOfBoundsException e) {
      throw new PLp1BoundsError("Empty List Given to `rest -> ()`");
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
    throw new UnsupportedOperationException("Not supported yet.");
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
