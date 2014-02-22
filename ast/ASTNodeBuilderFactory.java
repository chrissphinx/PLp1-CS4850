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
    DIV,
    EQ,
    FLOAT,
    FUNC,
    GTEQ,
    GT,
    IF,
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
