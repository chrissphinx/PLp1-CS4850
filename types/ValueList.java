package types;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ValueList extends Value<List>
{

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
  public boolean equals(Object o) {
    if (o == null || !(o instanceof ValueList)) return false;
    List<Value> list = ((ValueList) o).get();
    if (v.size() != list.size()) return false;

    Iterator<Value> l = v.iterator();
    Iterator<Value> r = list.iterator();

    while (l.hasNext() && r.hasNext()) {
      Value lv = (Value) l.next();
      Value rv = (Value) r.next();
      
      if (!lv.equals(rv)) return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 67 * hash + Objects.hashCode(this.v);
    return hash;
  }

  @Override
  public String toString() {
    if (v.isEmpty()) {
      return "[]";
    } else {
      StringBuilder s = new StringBuilder("[ ");
      Iterator<Value> i = v.iterator();

      while (i.hasNext()) {
        Value a = (Value) i.next();
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
