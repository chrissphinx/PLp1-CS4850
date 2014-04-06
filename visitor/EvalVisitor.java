package visitor;

import java.util.LinkedList;
import java.util.List;

import ast.*;
import errors.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import types.*;

public class EvalVisitor implements Visitor<Value>
{

  private Environment env;

  public EvalVisitor() {
    env = new Environment();
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
    Value v = (Value) n.getArgumentList().accept(this);
    List<Value> a = (List) v.get();
    try {
      return ((Builtin) n.getVarRef().accept(this)).invoke(env, a);
    } catch (ClassCastException|NullPointerException e) {
      throw new PLp1Error("Invalid Function Call");
    }
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
  public Value visit(ExitNode n) throws PLp1Error {
    int s = 0;
    try {
      s = ((ValueInt) ((ValueList) n.getArgumentList().accept(this)).get().get(0)).get();
    } catch (IndexOutOfBoundsException|ClassCastException e) {}
    System.exit(s);
    return null;
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
    Value v = null;

    for (ASTNode a : n.getList()) v = (Value) a.accept(this);

    return v;
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
    Iterator<HashMap<String, Value>> i = env.iterator();

    while (i.hasNext()) {
      try {
        return i.next().get(n.getId());
      } catch (NullPointerException e) {}
    }
    throw new PLp1Error("Invalid Variable Reference");
  }
}
