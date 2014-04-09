package types;

import errors.*;
import java.util.List;
import java.util.HashMap;
import visitor.Environment;

public abstract class Builtins extends Function
{

  @Override
  public String toString() { return "#builtin"; }

  static public HashMap<String, Value> getAll() {
    return new HashMap<String, Value>(){{
      put("first", new First());
      put("rest", new Rest());
      put("insert", new Insert());
      put("list", new MakeList());
      put("emptyp", new EmptyP());
      put("pairp", new PairP());
      put("listp", new ListP());
      put("equalp", new EqualP());
      put("length", new Length());
      put("numberp", new NumberP());
    }};
  }

  static public class First extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `first -> ()`");

      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError("Invalid Type for `first -> ()`");
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Not Enough Arguments for `first -> ()`");
      }

      try {
        return (Value) a.get(0);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Empty List Given to `first -> ()`");
      }
    }
  }

  static public class Rest extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `rest -> ()`");

      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError("Invalid Type for `rest -> ()`");
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Not Enough Arguments for `rest -> ()`");
      }

      try {
        a.remove(0); return new ValueList(a);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Empty List Given to `rest -> ()`");
      }
    }
  }

  static public class Insert extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 2) throw new PLp1ArgumentsError("Too Many Arguments for `insert -> ()`");
      Value v;

      try {
        v = (Value) a.get(0);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Not Enough Arguments for `insert -> ()`");
      }
       
      try {
        a = (List) a.get(1).get();
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Not Enough Arguments for `insert -> ()`");
      } catch (ClassCastException e) {
        throw new PLp1TypeError("Invalid Type for `insert -> ()`");
      }

      a.add(0, v); return new ValueList(a);
    }
  }

  static public class MakeList extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      return new ValueList(a);
    }
  }

  static public class EmptyP extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `emptyp -> ()`");

      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError("Invalid Type for `emptyp -> ()`");
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Not Enough Arguments for `emptyp -> ()`");
      }

      if (a.isEmpty()) return new ValueBool(true);
      else return new ValueBool(false);
    }
  }

  static public class PairP extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `pairp -> ()`");
      
      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError("Invalid Type for `pairp -> ()`");
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Not Enough Arguments for `pairp -> ()`");
      }

      if (!a.isEmpty()) return new ValueBool(true);
      else return new ValueBool(false);
    }
  }

  static public class ListP extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `listp -> ()`");
     
      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        return new ValueBool(false);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Not Enough Arguments for `listp -> ()`");
      }

      return new ValueBool(true);
    }
  }

  static public class EqualP extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
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
  }

  static public class Length extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `length -> ()`");

      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError("Invalid Type for `length -> ()`");
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Not Enough Arguments for `length -> ()`");
      }

      return new ValueInt(a.size());
    }
  }

  static public class NumberP extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `numberp -> ()`");
      Value v;
      
      try {
        v = a.get(0);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError("Not Enough Arguments for `numberp -> ()`");
      }

      if (v instanceof ValueInt || v instanceof ValueFloat)
        return new ValueBool(true);
      else return new ValueBool(false);
    }
  }
}
