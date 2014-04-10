package types;

import java.util.AbstractMap;
import java.util.Map;

public class ValueMapEntry extends Value<Map.Entry<String, Value>>
{

  public ValueMapEntry(String s, Value v) {
    this.v = new AbstractMap.SimpleEntry<>(s, v);
  }
}
