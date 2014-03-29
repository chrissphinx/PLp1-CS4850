package errors;

public class PLp1ArgumentsError extends PLp1Error
{
  public PLp1ArgumentsError() {
  }

  public PLp1ArgumentsError(String s) {
    super(s);
  }

  public PLp1ArgumentsError(Throwable t) {
    super(t);
  }

  public PLp1ArgumentsError(String s, Throwable t) {
    super(s, t);
  }
}
