package types;

import errors.PLp1ArgumentsError;
import errors.PLp1Error;
import errors.PLp1TypeError;
import java.util.List;
import visitor.Environment;

public class BuiltinInsert extends Builtin
{

  @Override
  public Value invoke(Environment env, List<Value> a) throws PLp1Error {
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
