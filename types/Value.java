package types;

public abstract class Value<T>
{

  public abstract T get();
  public abstract T add(Value v);
  public abstract T sub(Value v);
  public abstract T multiply(Value v);
  public abstract T divide(Value v);
  public abstract String toString();
}
