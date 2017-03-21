package com.br;

import jdk.nashorn.internal.parser.Token;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.ConsoleErrorListener;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.TransformerException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joao on 06/03/17.
 */
public class MyAlgumaListener extends AlgumaBaseListener{
    public AlgumaParser parser;
    Map<String, MyToken> tabela = new HashMap<String, MyToken>();

    public MyAlgumaListener( AlgumaParser parser){
        this.parser = parser;
    }


    @Override
    public void enterVarDeclaracao(AlgumaParser.VarDeclaracaoContext ctx) {
        String tipo = ctx.tipoEspecificador().getText();
        String ident = ctx.ident(0).getText();

        //verifica se a variavel ainda nao foi declarada
        if(tabela.containsKey(ident)){
            System.out.println("Erro "+ ctx.start.getLine() +
                    ":"+ ctx.start.getCharPositionInLine() +" Variavel '"+ ctx.ident(0).getText() + "' ja foi declarada" );
        }
        else{
            //inseri a variavel na tabela de simbolos
            tabela.put(ident, new MyToken(tipo, null));
        }
    }


    @Override
    public void enterExpressao(AlgumaParser.ExpressaoContext ctx) {


        boolean letra = false;
        boolean inteiro = false;
        boolean flutuante = false;

        //verifica se existe uma variavel na regra
        if(ctx.var() != null) {

            if(tabela.containsKey(ctx.var().getText()) == false){
                System.out.println("Erro "+ ctx.var().start.getLine() +
                        ":"+ ctx.var().start.getCharPositionInLine() +" Variavel '"+ ctx.var().getText() + "' nao foi declarada" );

            }
            else {


                AlgumaParser.ExpressaoSimplesContext ctx2 = ctx.expressao().expressaoSimples();

                int exprSomas = ctx2.expressaoSoma().size();
                //percorre as expressoes soma
                for (int i = 0; i < exprSomas; i++) {


                    int termos = ctx2.expressaoSoma(i).termo().size();
                    //System.out.println("Expressao " + ctx2.expressaoSoma(i).getText());
                    //percorre os termos
                    for (int j = 0; j < termos; j++) {

                        AlgumaParser.TermoContext termo = ctx2.expressaoSoma(i).termo(j);

                        //verifica se ha fatores
                        if (termo.fator() != null) {
                            //percorrendo os fatores
                            for (int l = 0; l < termo.fator().size(); l++) {

                                AlgumaParser.FatorContext fator = termo.fator(l);
                                //System.out.println("Fator "+ fator.getText());

                                //verificar se o fator começa com um digito ou nao
                                if (!Character.isDigit(fator.getText().charAt(0))) {
                                    //System.out.println(fator.getText().charAt(0));
                                    //char detectado
                                    if (fator.getText().charAt(0) == '\'') {
                                        letra = true;
                                    } else if(tabela.containsKey(fator.getText())){
                                        if (tabela.get(fator.getText()).tipo.equals("char"))
                                            letra = true;
                                        else if (tabela.get(fator.getText()).tipo.equals("float"))
                                            flutuante = true;
                                        else if (tabela.get(fator.getText()).tipo.equals("int"))
                                            inteiro = true;
                                        else {
                                            letra = true;
                                            flutuante = true;
                                            inteiro = true;
                                        }
                                    }
                                } else { //detectado numero

                                    //float
                                    if (isFloat(fator.getText())) {
                                        flutuante = true;
                                    } else {    //int
                                        inteiro = true;
                                    }
                                }

                            }

                        }

                    }

                }
                MyToken myToken = tabela.get(ctx.var().getText());
                if ((myToken.tipo.equals("char") && (flutuante || inteiro)) || (letra && (flutuante || inteiro))) {
                    System.out.println("Erro " + ctx.var().start.getLine() +
                            ":" + ctx.var().start.getCharPositionInLine() + " Tipos nao sao compativeis");
                } else {
                    if (myToken.tipo.equals("int") && flutuante) {
                        System.out.println("Warning "+ ctx.var().start.getLine() +":" + ctx.var().start.getCharPositionInLine()
                                + " Transformando a variavel '" + ctx.var().getText() + "' em float ");
                        //imprimirTabela();
                        tabela.get(ctx.var().getText()).tipo = "float";



                        //imprimirTabela();
                    }

                    System.out.println("\n"+ctx.var().getText() + "=" +ctx.expressao().getText());
                    TresEnderecos end = new TresEnderecos();
                    end.adrress(ctx.expressao().getText());
                }

            }

        }
        //expressao simples com relacional
        else if(ctx.expressaoSimples().relacional()!= null){
            AlgumaParser.ExpressaoSimplesContext ctx2 = ctx.expressaoSimples();

            int exprSomas = ctx2.expressaoSoma().size();
            //percorre as expressoes soma
            for (int i = 0; i < exprSomas; i++) {


                int termos = ctx2.expressaoSoma(i).termo().size();
                //percorre os termos
                for (int j = 0; j < termos; j++) {

                    AlgumaParser.TermoContext termo = ctx2.expressaoSoma(i).termo(j);

                    //verifica se ha fatores
                    if (termo.fator() != null) {
                        //percorrendo os fatores
                        for (int l = 0; l < termo.fator().size(); l++) {

                            AlgumaParser.FatorContext fator = termo.fator(l);
                            //System.out.println("Fator "+ fator.getText());

                            //verificar se o fator começa com um digito ou nao
                            if (!Character.isDigit(fator.getText().charAt(0))) {
                                //System.out.println(fator.getText().charAt(0));
                                //char detectado
                                if (fator.getText().charAt(0) == '\'') {
                                    letra = true;
                                } else {
                                    if (tabela.get(fator.getText()).tipo.equals("char"))
                                        letra = true;
                                    else if (tabela.get(fator.getText()).tipo.equals("float"))
                                        flutuante = true;
                                    else if (tabela.get(fator.getText()).tipo.equals("int"))
                                        inteiro = true;
                                    else {
                                        letra = true;
                                        flutuante = true;
                                        inteiro = true;
                                    }
                                }
                            } else { //detectado numero

                                //float
                                if (isFloat(fator.getText())) {
                                    flutuante = true;
                                } else {    //int
                                    inteiro = true;
                                }
                            }

                        }

                    }

                }

            }
            if (letra && (inteiro || flutuante)) {
                System.out.println("Erro " + ctx.expressaoSimples().start.getLine() +
                        ":" + ctx.expressaoSimples().start.getCharPositionInLine() + " Tipos nao sao compativeis");
            }else {
                //System.out.println("\n"+ctx.expressaoSimples().getText());
                //TresEnderecos end = new TresEnderecos();
                //end.adrress(ctx.expressaoSimples().getText());
            }
        }

    }

    public void imprimirTabela(){
        System.out.println("\nImprimindo tabela\n");
        for(Map.Entry<String, MyToken>entry: tabela.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue().tipo /*+ " " + entry.getValue().valor */);
        }
        System.out.println();
    }

    //verifica se string é float
    public boolean isFloat(String num){
        for(int i = 0; i < num.length(); i++)
            if(num.charAt(i) == '.')
                return true;
        return false;
    }

    @Override
    public void enterElseR(AlgumaParser.ElseRContext ctx) {
        System.out.println("goto L4");
        System.out.print("\nL3 :");
    }


    @Override
    public void exitElseR(AlgumaParser.ElseRContext ctx) {
        System.out.println("L4: Proximo bloco");
    }

    @Override
    public void enterSelecaoDecl(AlgumaParser.SelecaoDeclContext ctx) {

        if(ctx.elseR() != null) {
            System.out.println("\n-------if-------");


            String relacional = ctx.expressao().expressaoSimples().relacional().getText();
            System.out.println("if " + ctx.expressao().expressaoSimples().expressaoSoma().get(0).getText()
                    + inverterRelacional(relacional) + ctx.expressao().expressaoSimples().expressaoSoma().get(1).getText() + " goto L3");

            relacional = ctx.expressao().expressaoSimples().relacional().getText();
        }
        else{
            System.out.println("\n-------if-------");

            String relacional = ctx.expressao().expressaoSimples().relacional().getText();
            System.out.println("if " + ctx.expressao().expressaoSimples().expressaoSoma().get(0).getText()
                    + relacional + ctx.expressao().expressaoSimples().expressaoSoma().get(1).getText() + " goto L5");

            System.out.print("L5: ");

            relacional = ctx.expressao().expressaoSimples().relacional().getText();
        }



    }

    @Override
    public void exitSelecaoDecl(AlgumaParser.SelecaoDeclContext ctx) {
        System.out.println("\n----------------");


    }

    @Override
    public void enterIteracaoDecl(AlgumaParser.IteracaoDeclContext ctx) {
        System.out.println("\n------while------");
        String relacional = ctx.expressao().expressaoSimples().relacional().getText();
        System.out.println("L1: if " + ctx.expressao().expressaoSimples().expressaoSoma().get(0).getText()
                + verificaRelacional(relacional) +ctx.expressao().expressaoSimples().expressaoSoma().get(1).getText()+ " goto L2");

    }


    @Override
    public void exitIteracaoDecl(AlgumaParser.IteracaoDeclContext ctx) {
        System.out.println("goto L1");
        System.out.println("L2: Proximo bloco");
        System.out.println("\n-----------------");
    }

    public String verificaRelacional(String relacional){
        if (relacional.equals(">")){
            return "<";
        }else if (relacional.equals("<")){
            return ">";
        }else if (relacional.equals("<=")){
            return ">=";
        }else if (relacional.equals(">=")){
            return "<=";
        }else if (relacional.equals("!=")){
            return "==";
        }else if (relacional.equals("==")){
            return "!=";
        }
        return relacional;
    }



    public String inverterRelacional(String relacional){
        if (relacional.equals(">")){
            return "<=";
        }else if (relacional.equals("<")){
            return ">=";
        }else if (relacional.equals("<=")){
            return ">";
        }else if (relacional.equals(">=")){
            return "<";
        }else if (relacional.equals("!=")){
            return "==";
        }else if (relacional.equals("==")){
            return "!=";
        }
        return relacional;
    }



    @Override
    public void enterFator(AlgumaParser.FatorContext ctx) {
        if(ctx.var() != null) {
            if(tabela.containsKey(ctx.var().getText()) == false){

                System.out.println("Erro "+ ctx.var().start.getLine() +
                        ":"+ ctx.var().start.getCharPositionInLine() +" Variavel '"+ ctx.var().getText() + "' nao foi declarada" );

            }
        }
    }



    public class MyToken{
        public String tipo;
        public String valor;

        public MyToken(String tipo, String valor){
            this.tipo = tipo;
            this.valor = valor;
        }

    }


}

