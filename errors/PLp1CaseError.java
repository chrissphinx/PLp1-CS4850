package errors;

public class PLp1CaseError extends PLp1Error
{
  public PLp1CaseError() {
  }

  public PLp1CaseError(String s) {
    super(s);
  }

  public PLp1CaseError(Throwable t) {
    super(t);
  }

  public PLp1CaseError(String s, Throwable t) {
    super(s, t);
  }
}
