package com.adrianwirth.lambdasolver.main;

import com.adrianwirth.lambdasolver.grammar.LambdaLexer;
import com.adrianwirth.lambdasolver.grammar.LambdaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) {
        ANTLRInputStream inputStream = new ANTLRInputStream("(\\x.xx)(\\x.xx)");

        LambdaLexer lexer = new LambdaLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LambdaParser parser = new LambdaParser(tokenStream);

        LambdaSolver solver = new LambdaSolver(parser.parse().value);
        solver.solve();
    }

}
