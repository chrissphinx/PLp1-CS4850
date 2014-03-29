package types;

import java.util.Objects;

public class ValueFloat extends Value
{

  private Float v;

  public ValueFloat(float v) {
    this.v = v;
  }

  @Override
  public Float get() {
    return this.v;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || !(o instanceof ValueFloat)) return false;
    return v == ((ValueFloat) o).get();
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 17 * hash + Objects.hashCode(this.v);
    return hash;
  }

  @Override
  public String toString() {
    return Float.toString(v);
  }
}
