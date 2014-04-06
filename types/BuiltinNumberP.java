package types;

import errors.PLp1ArgumentsError;
import errors.PLp1Error;
import errors.PLp1TypeError;
import java.util.List;
import visitor.Environment;

public class BuiltinNumberP extends Builtin
{

  @Override
  public Value invoke(Environment env, List<Value> a) throws PLp1Error {
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
