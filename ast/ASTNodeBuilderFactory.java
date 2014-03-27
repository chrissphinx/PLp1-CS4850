package ast;

public class ASTNodeBuilderFactory
{

  public static enum NodeType {
    ADD,
    AND,
    ARGS,
    ASSIGN,
    BODY,
    BOOL,
    CALL,
    CASE,
    CASES,
    CLASS,
    CONSTS,
    CREATE,
    DEFAULT,
    DIV,
    EQ,
    FIRST,
    FLOAT,
    FUNC,
    GTEQ,
    GT,
    IF,
    INIT,
    INSTANCE,
    INT,
    LAMBDA,
    LTEQ,
    LT,
    LETDECL,
    LETDECLS,
    LET,
    METHOD,
    METHODREF,
    METHODS,
    MULT,
    NEQ,
    NOT,
    NULL,
    OR,
    PARAMS,
    PROGRAM,
    REST,
    STRING,
    SUB,
    SWITCH,
    VARDEF,
    VARREF;
  }

  public ASTNodeBuilder makeASTNodeBuilder(NodeType t) {
    return new ASTNodeBuilder(t);
  }
}
