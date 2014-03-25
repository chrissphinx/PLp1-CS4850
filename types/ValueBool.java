package types;

public class ValueBool extends Value
{

  private Boolean v;

  public ValueBool(boolean v) {
    this.v = v;
  }

  public Boolean get() {
    return this.v;
  }

  @Override
  public String toString() {
    return Boolean.toString(v);
  }
}
