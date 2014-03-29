package types;

import java.util.Objects;

public class ValueBool extends Value
{

  private Boolean v;

  public ValueBool(boolean v) {
    this.v = v;
  }

  @Override
  public Boolean get() {
    return this.v;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || !(o instanceof ValueBool)) return false;
    return v == ((ValueBool) o).get();
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 41 * hash + Objects.hashCode(this.v);
    return hash;
  }

  @Override
  public String toString() {
    return Boolean.toString(v);
  }
}
