package types;

import java.util.Objects;

public class ValueString extends Value
{

  private String v;

  public ValueString(String s) {
    this.v = s;
  }

  @Override
  public String get() {
    return this.v;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || !(o instanceof ValueString)) return false;
    return v.equals(((ValueString) o).get());
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 37 * hash + Objects.hashCode(this.v);
    return hash;
  }

  @Override
  public String toString() {
    return v;
  }
}
