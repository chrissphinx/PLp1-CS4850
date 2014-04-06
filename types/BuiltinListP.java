package types;

import errors.PLp1ArgumentsError;
import errors.PLp1Error;
import errors.PLp1TypeError;
import java.util.List;
import visitor.Environment;

public class BuiltinListP extends Builtin
{

  @Override
  public Value invoke(Environment env, List<Value> a) throws PLp1Error {
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
