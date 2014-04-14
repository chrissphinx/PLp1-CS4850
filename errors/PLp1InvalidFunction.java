package errors;

public class PLp1InvalidFunction extends PLp1Error
{

  public PLp1InvalidFunction() {
  }

  public PLp1InvalidFunction(String s) {
    super(s);
  }

  public PLp1InvalidFunction(Throwable t) {
    super(t);
  }

  public PLp1InvalidFunction(String s, Throwable t) {
    super(s, t);
  }
  
  @Override
  public String toString() {
    return "Invalid Function @ " + this.getMessage();
  }
}
