package visitor;

import java.util.HashMap;
import types.Value;

public class Environment extends HashMap<String, Value>
{

  private Environment parent;

  public Environment() {
    super(types.Builtins.getAll());
  }

  public Environment(Environment e) {
    this.parent = e;
  }

  @Override
  public Value put(String k, Value v) {
    super.put(k, v);

    return v;
  }

  @Override
  public Value get(Object k) {
    Value v = super.get(k);

    if (v == null && parent != null) {
      v = parent.get(k);
    }

    return v;
  }
}
