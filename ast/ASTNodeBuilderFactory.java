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
    EMPTYP,
    EQ,
    EQUALP,
    EXIT,
    FIRST,
    FLOAT,
    FUNC,
    GTEQ,
    GT,
    IF,
    INIT,
    INSERT,
    INSTANCE,
    INT,
    LAMBDA,
    LTEQ,
    LT,
    LENGTH,
    LETDECL,
    LETDECLS,
    LET,
    LIST,
    LISTP,
    METHOD,
    METHODREF,
    METHODS,
    MULT,
    NEQ,
    NOT,
    NULL,
    NUMBERP,
    OR,
    PAIRP,
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
