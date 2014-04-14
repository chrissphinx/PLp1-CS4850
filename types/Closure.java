package types;

import ast.ASTNode;
import errors.PLp1ArgumentsError;
import errors.PLp1Error;
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

    if (params.size() != args.size()) throw new PLp1ArgumentsError((String) this.toString());
    Iterator<Value> s = params.iterator();
    Iterator<Value> a = args.iterator();

    while(s.hasNext() && a.hasNext()) {
      e.put((String) s.next().get(), (Value) a.next());
    }

    return (Value) body.accept(new EvalVisitor(e));
  }

  @Override
  public String toString() {
    if (name != null) {
      StringBuilder p = new StringBuilder(params.toString());
      return "`" + name + " -> (" + p.substring(1, p.length() - 1) + ")`";
    } else {
      return "#function";
    }
  }
}
