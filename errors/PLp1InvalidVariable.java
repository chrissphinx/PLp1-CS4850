package errors;

public class PLp1InvalidVariable extends PLp1Error
{

  public PLp1InvalidVariable() {
  }

  public PLp1InvalidVariable(String s) {
    super(s);
  }

  public PLp1InvalidVariable(Throwable t) {
    super(t);
  }

  public PLp1InvalidVariable(String s, Throwable t) {
    super(s, t);
  }
  
  @Override
  public String toString() {
    return "Invalid Variable @ " + this.getMessage();
  }
}
