package visitor;

import types.*;
import types.BuiltinListP;
import java.util.HashMap;
import java.util.LinkedList;
import types.Value;

public class Environment extends LinkedList<HashMap<String, Value>>
{

  public Environment() {
    this.push(new HashMap<String, Value>(){{
      put("first", new BuiltinFirst());
      put("rest", new BuiltinRest());
      put("insert", new BuiltinInsert());
      put("list", new BuiltinList());
      put("emptyp", new BuiltinEmptyP());
      put("pairp", new BuiltinPairP());
      put("listp", new BuiltinListP());
      put("equalp", new BuiltinEqualP());
      put("length", new BuiltinLength());
      put("numberp", new BuiltinNumberP());
    }});
  }
}
