package types;

import java.util.Objects;

public class ValueInt extends Value
{

  private Integer v;

  public ValueInt(int v) {
    this.v = v;
  }

  @Override
  public Integer get() {
    return this.v;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || !(o instanceof ValueInt)) return false;
    return v == ((ValueInt) o).get();
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 73 * hash + Objects.hashCode(this.v);
    return hash;
  }

  @Override
  public String toString() {
    return Integer.toString(v);
  }
}
