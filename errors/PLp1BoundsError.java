package errors;

public class PLp1BoundsError extends PLp1Error
{
  public PLp1BoundsError() {
  }

  public PLp1BoundsError(String s) {
    super(s);
  }

  public PLp1BoundsError(Throwable t) {
    super(t);
  }

  public PLp1BoundsError(String s, Throwable t) {
    super(s, t);
  }
}
