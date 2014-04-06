package types;

import errors.PLp1ArgumentsError;
import errors.PLp1Error;
import errors.PLp1TypeError;
import java.util.Iterator;
import java.util.List;
import visitor.Environment;

public class BuiltinList extends Builtin
{

  @Override
  public Value invoke(Environment env, List<Value> a) throws PLp1Error {
    return new ValueList(a);
  }
}
