package types;

import errors.PLp1ArgumentsError;
import errors.PLp1Error;
import errors.PLp1TypeError;
import java.util.List;
import visitor.Environment;

public class BuiltinFirst extends Builtin
{

  @Override
  public Value invoke(Environment e, List<Value> a) throws PLp1Error {
    if (a.size() > 1) throw new PLp1ArgumentsError("Too Many Arguments for `first -> ()`");

    try {
      a = (List) a.get(0).get();
    } catch (ClassCastException r) {
      throw new PLp1TypeError("Invalid Type for `first -> ()`");
    } catch (IndexOutOfBoundsException r) {
      throw new PLp1ArgumentsError("Not Enough Arguments for `first -> ()`");
    }

    try {
      return (Value) a.get(0);
    } catch (IndexOutOfBoundsException r) {
      throw new PLp1ArgumentsError("Empty List Given to `first -> ()`");
    }
  }
}
