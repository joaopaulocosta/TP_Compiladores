package com.br;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;


/**
 * Created by Joao Paulo Costa on 18/10/2016.
 */
public class Main {


    public static void main (String [] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("codigo");

        FileInputStream fis = null;


        try {

            fis = new FileInputStream(file);

            ANTLRInputStream input = new ANTLRInputStream(fis);

            AlgumaLexer lexer = new AlgumaLexer(input);

            CommonTokenStream tokens = new CommonTokenStream((TokenSource)lexer);

            AlgumaParser parser = new AlgumaParser(tokens);

            AlgumaParser.ProgramaContext programaContext = parser.programa();

            //System.out.println(programaContext.getText());

            ParseTreeWalker treeWalker = new ParseTreeWalker();
            MyAlgumaListener listener = new MyAlgumaListener(parser);

            treeWalker.walk(listener, programaContext);

        }catch (Exception e) {
            System.out.println("Erro ao manipular o arquivo! " + e);
        }



    }
}

class UnderlineListener extends BaseErrorListener {

    public  void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println(" linha:" + line + " coluna:" + charPositionInLine + " " + msg);
    }
}



