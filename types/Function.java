package types;

import errors.PLp1Error;
import java.util.List;
import visitor.Environment;

public abstract class Function extends Value<Object>
{

  public abstract Value invoke(List<Value> a) throws PLp1Error;
}
