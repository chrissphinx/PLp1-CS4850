package main;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.ASTGenerator;
import ast.ASTNode;
import errors.PLp1Error;
import jline.console.ConsoleReader;
import jline.console.UserInterruptException;
import visitor.EvalVisitor;
import visitor.SourceVisitor;
import parser.PLp1Lexer;
import parser.PLp1Parser;
import visitor.Environment;

public class PLp1
{

  public static Environment global = new Environment();

  public static void main(String[] args) throws Exception {
    if (args.length > 0) {
      processCode(new ANTLRFileStream(args[0]));
    } else {
      ConsoleReader console = new ConsoleReader();
      console.setPrompt("> ");
      console.setHandleUserInterrupt(true);
      String line;

      try {
        while ((line = console.readLine()) != null) {
          if (line.toLowerCase().startsWith(":exit"))
            System.exit(0);
          if (line.toLowerCase().startsWith(":load")) {
            String f = line.substring(6, line.length());
            processCode(new ANTLRFileStream(f));
            continue;
          }
          if (line.toLowerCase().startsWith(":reset")) {
            global = new Environment();
            continue;
          }

          processCode(new ANTLRInputStream(line));
        } console.println();
      } catch (UserInterruptException e) {}
      console.flush(); System.exit(0);
    }
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
      System.out.println("= " + ast.accept(new EvalVisitor(global)));
    } catch (PLp1Error e) {
      System.err.println("ERROR: " + e);
    } catch (StackOverflowError e) {
      System.err.println("ERROR: Recursion Depth");
    }
  }
}
