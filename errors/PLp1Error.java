package errors;

public class PLp1Error extends Exception
{

  public PLp1Error() {
  }

  public PLp1Error(String s) {
    super(s);
  }

  public PLp1Error(Throwable t) {
    super(t);
  }

  public PLp1Error(String s, Throwable t) {
    super(s, t);
  }
  
  @Override
  public String toString() {
    return this.getMessage();
  }
}
