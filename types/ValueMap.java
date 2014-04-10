package types;

import java.util.HashMap;
import java.util.Map;

public class ValueMap extends Value<HashMap<String, Value>>
{

  public ValueMap(Map<String, Value> m) {
    this.v = new HashMap<>(m);
  }
}
