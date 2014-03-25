package types;

public class ValueInt extends Value
{

  private Integer v;

  public ValueInt(int v) {
    this.v = v;
  }

  public Integer get() {
    return this.v;
  }

  public Value add(Value v) {
    return new ValueInt(this.v + (Integer) v.get());
  }

  public Value sub(Value v) {
    return new ValueInt(this.v - (Integer) v.get());
  }

  public Value multiply(Value v) {
    return new ValueInt(this.v * (Integer) v.get());
  }

  public Value divide(Value v) {
    return new ValueInt(this.v / (Integer) v.get());
  }

  @Override
  public String toString() {
    return Integer.toString(v);
  }
}
