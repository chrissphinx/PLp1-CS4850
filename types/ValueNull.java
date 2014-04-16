package types;

public class ValueNull extends Value<Object>
{

  public ValueNull() {
    this.v = null;
  }

  @Override
  public String toString() {
    return "null";
  }
}
