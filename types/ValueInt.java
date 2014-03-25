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

  @Override
  public String toString() {
    return Integer.toString(v);
  }
}
