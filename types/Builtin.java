package types;

import errors.PLp1Error;
import java.util.List;
import visitor.Environment;

public abstract class Builtin extends Value<Object>
{

  public abstract Value invoke(Environment e, List<Value> a) throws PLp1Error;
}
