package com.br;

/**
 * Created by joao on 08/03/17.
 */
public class TresEnderecos {
    private static final char[][] precedence = {
            {'/', '1'},
            {'*', '1'},
            {'+', '2'},
            {'-', '2'},
            {'<', '2'},
            {'>', '2'}
    };

    //retorna a precedencia de um operador
    private static int precedenceOf(String t)
    {
        char token = t.charAt(0);
        for (int i=0; i < precedence.length; i++)
        {
            if (token == precedence[i][0])
            {
                return Integer.parseInt(precedence[i][1]+"");
            }
        }
        return -1;
    }

    public void adrress(String expr)
    {
        int i, j, opc=0; //contador de operadores;
        char token;
        boolean processed[];
        String[][] operators = new String[10][2];
        String  temp;

        processed = new boolean[expr.length()];
        for (i=0; i < processed.length; i++)
        {
            processed[i] = false;
        }

        //percorre a string localizando os operadores
        for (i=0; i < expr.length(); i++)
        {
            token = expr.charAt(i);
            for (j=0; j < precedence.length; j++)
            {
                if (token==precedence[j][0])
                {
                    operators[opc][0] = token+"";   //operador
                    operators[opc][1] = i+"";       //posicao do operador
                    opc++;
                    break;
                }
            }
        }


        for (i=opc-1; i >= 0; i--)
        {
            for (j=0; j < i; j++)
            {
                //compara precedencia de operadores, caso o primeiro seja maior que o segundo
                //é feito uma troca
                if (precedenceOf(operators[j][0]) > precedenceOf(operators[j+1][0]))
                {
                    temp = operators[j][0];
                    operators[j][0] = operators[j+1][0];
                    operators[j+1][0] = temp;
                    temp = operators[j][1];
                    operators[j][1] = operators[j+1][1];
                    operators[j+1][1] = temp;
                }
            }
        }

        int cont1 = 0, cont2 = 0;


        for (i=0; i < opc; i++)
        {
            j = Integer.parseInt(operators[i][1]+"");
            String op1="", op2="";
            if (processed[j-1]==true)
            {

                if (precedenceOf(operators[i-1][0]) == precedenceOf(operators[i][0]))
                {
                    op1 = "t"+i;
                }
                else
                {
                    for (int x=0; x < opc; x++)
                    {

                        if ((j-cont2 - 1) == Integer.parseInt(operators[x][1]))
                        {
                            op1 = "t"+(x+1)+"";
                        }
                    }
                }
            }
            else
            {
                int aux = j;
                int cont = 0;
                while(processed[aux - 1] != true){
                    if(isNotOperator(expr.charAt(aux-1))) {
                        String auxS = op1;
                        op1 = expr.charAt(aux - 1) + "" + auxS;
                        processed[aux-1] = true;

                    }else{
                        cont1 = cont;
                        break;
                    }
                    aux--;
                    cont++;
                    if(aux == 0) {
                        break;
                    }

                }

                j = aux + cont;

            }
            if (processed[j+1]==true)
            {

                for (int x=0; x < opc; x++)
                {
                    //System.out.println("aqui " + cont1 + " " + cont2);
                    if ((j+cont1 + 1) == Integer.parseInt(operators[x][1]))
                    {

                        op2 = "t"+(x+1)+"";
                    }
                }

            }
            else
            {
                int aux = j;
                int cont = 0;
                while(processed[aux + 1] != true){
                    if(isNotOperator(expr.charAt(aux+1))) {
                        op2 += expr.charAt(aux + 1) + "";
                        processed[aux+1] = true;

                    }else{
                        cont2 = cont;
                        break;
                    }
                    aux++;
                    cont++;
                    if(aux == expr.length()-1) {
                        break;
                    }

                }

                j = aux - cont;
            }

            //System.out.println(operators[i][0] + " |" + op1 + "|" + op2 + "|" + "t"+(i+1)); //quadrupla
            System.out.println("t"+(i+1) + " = " + op1 + " " + operators[i][0] + " "  + op2  ); //tripla
            processed[j] = processed[j-1] = processed[j+1] = true;
        }
        System.out.println();
    }

    public boolean isNotOperator(char letra){
        for(int i = 0; i < precedence.length; i++){
            if(letra == precedence[i][0])
                return false;
        }
        return true;

    }

}
