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

  public Value add(Value v) {
    return new ValueFloat(this.v + (Float) v.get());
  }

  public Value sub(Value v) {
    return new ValueFloat(this.v - (Float) v.get());
  }

  public Value multiply(Value v) {
    return new ValueFloat(this.v * (Float) v.get());
  }

  public Value divide(Value v) {
    return new ValueFloat(this.v / (Float) v.get());
  }

  @Override
  public String toString() {
    return Float.toString(v);
  }
}
