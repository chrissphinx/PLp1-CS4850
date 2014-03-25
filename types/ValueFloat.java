package types;

public class ValueFloat extends Value
{

  private Float v;

  public ValueFloat(float v) {
    this.v = v;
  }

  public Float get() {
    return this.v;
  }

  @Override
  public String toString() {
    return Float.toString(v);
  }
}
