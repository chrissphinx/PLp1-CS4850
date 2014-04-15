package types;

import ast.ASTNode;
import errors.PLp1ArgumentsError;
import errors.PLp1Error;
import errors.PLp1TypeError;
import java.util.Iterator;
import java.util.List;
import visitor.Environment;
import visitor.EvalVisitor;

public class Closure extends Function
{

  private final String name;
  private final List<Value> params;
  private final ASTNode body;
  private final Environment env;

  public Closure(String name, List<Value> params, ASTNode body, Environment env) {
    this.name = name;
    this.params = params;
    this.body = body;
    this.env = env;
  }

  @Override
  public Value invoke(List<Value> args) throws PLp1Error {
    Environment e = new Environment(env);

    if (params.size() != args.size()) {
      String p = params.toString();
      throw new PLp1ArgumentsError(this.toString());
    }
    Iterator<Value> s = params.iterator();
    Iterator<Value> a = args.iterator();

    while(s.hasNext() && a.hasNext()) {
      e.put((String) s.next().get(), (Value) a.next());
    }

    try {
      return (Value) body.accept(new EvalVisitor(e));
    } catch (PLp1TypeError t) {
      throw new PLp1TypeError(this.toString());
    }
  }

  @Override
  public String toString() {
    String p = params.toString().replaceAll("\\[|\\]", "");
    if (name != null) {
      return "`" + name + " -> (" + p + ")`";
    } else {
      return "`lambda -> (" + p + ")`";
    }
  }
}
