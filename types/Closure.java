package types;

import ast.ASTNode;
import errors.PLp1Error;
import java.util.List;
import visitor.Environment;

public class Closure extends Function
{

  private String name;
  private String args;
  private ASTNode body;
  private Environment env;

  public Closure(String name, String args, ASTNode body, Environment env) {
  }

  @Override
  public Value invoke(List<Value> args) throws PLp1Error {
    return null;
  }
}
