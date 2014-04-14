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
      if (a.size() > 1) throw new PLp1ArgumentsError(this.toString());

      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError(this.toString());
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }

      try {
        return (Value) a.get(0);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }
    }

    @Override
    public String toString() {
      return "`first -> (L)`";
    }
  }

  static public class Rest extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError(this.toString());

      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError(this.toString());
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }

      try {
        a.remove(0); return new ValueList(a);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }
    }

    @Override
    public String toString() {
      return "`rest -> (L)`";
    }
  }

  static public class Insert extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 2) throw new PLp1ArgumentsError(this.toString());
      Value v;

      try {
        v = (Value) a.get(0);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }
       
      try {
        a = (List) a.get(1).get();
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      } catch (ClassCastException e) {
        throw new PLp1TypeError(this.toString());
      }

      a.add(0, v); return new ValueList(a);
    }

    @Override
    public String toString() {
      return "`insert -> (L, v)`";
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
      if (a.size() > 1) throw new PLp1ArgumentsError(this.toString());

      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError(this.toString());
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }

      if (a.isEmpty()) return new ValueBool(true);
      else return new ValueBool(false);
    }

    @Override
    public String toString() {
      return "`emptyp -> (L)`";
    }
  }

  static public class PairP extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError(this.toString());
      
      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError(this.toString());
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }

      if (!a.isEmpty()) return new ValueBool(true);
      else return new ValueBool(false);
    }

    @Override
    public String toString() {
      return "`pairp -> (L)`";
    }
  }

  static public class ListP extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError(this.toString());
     
      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        return new ValueBool(false);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }

      return new ValueBool(true);
    }

    @Override
    public String toString() {
      return "`listp -> (L)`";
    }
  }

  static public class EqualP extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 2) throw new PLp1ArgumentsError(this.toString());
      ValueList l;
      ValueList r;

      try {
        l = ((ValueList) a.get(0));
      } catch (ClassCastException e) {
        throw new PLp1TypeError(this.toString());
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }

      try {
        r = ((ValueList) a.get(1));
      } catch (ClassCastException e) {
        throw new PLp1TypeError(this.toString());
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }

      return new ValueBool((Boolean) l.equals(r));
    }

    @Override
    public String toString() {
      return "`equalp -> (L, L)`";
    }
  }

  static public class Length extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError(this.toString());

      try {
        a = (List) a.get(0).get();
      } catch (ClassCastException e) {
        throw new PLp1TypeError(this.toString());
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }

      return new ValueInt(a.size());
    }

    @Override
    public String toString() {
      return "`length -> (L)`";
    }
  }

  static public class NumberP extends Builtins
  {

    @Override
    public Value invoke(List<Value> a) throws PLp1Error {
      if (a.size() > 1) throw new PLp1ArgumentsError(this.toString());
      Value v;
      
      try {
        v = a.get(0);
      } catch (IndexOutOfBoundsException e) {
        throw new PLp1ArgumentsError(this.toString());
      }

      if (v instanceof ValueInt || v instanceof ValueFloat)
        return new ValueBool(true);
      else return new ValueBool(false);
    }

    @Override
    public String toString() {
      return "`numberp -> (L)`";
    }
  }
}
