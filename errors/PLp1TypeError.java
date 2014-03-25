package errors;

public class PLp1TypeError extends PLp1Error
{
  public PLp1TypeError() {
  }

  public PLp1TypeError(String s) {
    super(s);
  }

  public PLp1TypeError(Throwable t) {
    super(t);
  }

  public PLp1TypeError(String s, Throwable t) {
    super(s, t);
  }
}
