package types;

import errors.PLp1ArgumentsError;
import errors.PLp1Error;
import errors.PLp1TypeError;
import java.util.List;
import visitor.Environment;

public class BuiltinEqualP extends Builtin
{

  @Override
  public Value invoke(Environment env, List<Value> a) throws PLp1Error {
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
