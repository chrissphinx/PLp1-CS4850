package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.ASTGenerator;
import ast.ASTNode;
import errors.PLp1Error;
import visitor.EvalVisitor;
import visitor.SourceVisitor;
import parser.PLp1Lexer;
import parser.PLp1Parser;

public class PLp1
{

  public static void main(String args []) throws FileNotFoundException, IOException {
    if (args.length > 0) {
      processCode(new ANTLRFileStream(args[0]));
    } else {
      repl();
    }
  }

  private static String getUserInput() throws IOException {
    String line;

    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(reader);

    line = in.readLine();
    if(line == null) { System.out.print("\n"); System.exit(0); }

    return line;
  }

  private static void processCode(ANTLRInputStream code) throws IOException {
    PLp1Lexer lexer = new PLp1Lexer(code);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PLp1Parser parser = new PLp1Parser(tokens);
    ParseTree tree = parser.program();

    ASTNode ast = (ASTNode) tree.accept(new ASTGenerator());

    try {
      System.out.println(ast.accept(new SourceVisitor()));
    } catch (PLp1Error e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println("= " + ast.accept(new EvalVisitor()));
    } catch (PLp1Error e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  } 

  private static void repl() {
    System.out.print( "> ");

    try {
      processCode(new ANTLRInputStream(getUserInput()));
    } catch (IOException e) {
      System.out.println("Error reading input");
    } catch (Error e) {
      System.out.println("Uncaught Interpreter Error: " + e);
    } catch (Exception e) {
      System.out.println("Uncaught Interpreter Exception: " + e);
    }

    repl();
  }
}
