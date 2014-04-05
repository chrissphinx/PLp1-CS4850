package types;

public abstract class Value<T>
{

  protected T v;

  public T get() {
    return this.v;
  }

  public void set(T v) {
    this.v = v;
  }
}
