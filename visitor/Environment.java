package visitor;

import java.util.HashMap;
import java.util.LinkedList;
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
}
