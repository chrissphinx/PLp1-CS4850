package types;

public class ValueString extends Value
{

  private String v;

  public ValueString(String s) {
    this.v = new String(s);
  }

  public String get() {
    return this.v;
  }

  @Override
  public String toString() {
    return v;
  }
}
