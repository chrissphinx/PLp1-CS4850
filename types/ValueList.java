package types;

import java.util.LinkedList;
import java.util.List;

public class ValueList extends Value
{

  private List<Value> v;

  public ValueList() {
    this.v = new LinkedList<>();
  }

  public ValueList(List v) {
    this.v = new LinkedList<>(v);
  }

  @Override
  public List<Value> get() {
    return this.v;
  }

  @Override
  public String toString() {
    if (v.isEmpty()) {
      return "[]";
    } else {
      StringBuilder s = new StringBuilder("[ ");

      for (Value a : v) {
        int l = s.length();
        s.append(a).append(", ");
        if (s.charAt(l) == '[' && s.charAt(l - 2) != ',') s.deleteCharAt(l - 1);
      }
      s.delete(s.length() - 2, s.length());
      if (s.charAt(s.length() - 1) == ']') s.append("]");
      else s.append(" ]");

      return s.toString();
    }
  }
}
