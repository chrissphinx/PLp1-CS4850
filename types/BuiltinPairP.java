package types;

import errors.PLp1ArgumentsError;
import errors.PLp1Error;
import errors.PLp1TypeError;
import java.util.List;
import visitor.Environment;

public class BuiltinPairP extends Builtin
{

  @Override
  public Value invoke(Environment env, List<Value> a) throws PLp1Error {
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
