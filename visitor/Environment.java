package visitor;

import types.BuiltinFirst;
import java.util.HashMap;
import types.Value;

public class Environment extends HashMap<String, Value>
{

  public Environment() {
    put("first", new BuiltinFirst());
  }
}
