/*
    NOME DO PROGRAMA: SYSELEV
    NOME DO AUTOR: Pedro Alexandre Pinto
    CRIAÇÃO: 30/07/19
    ProgramacaoOrientedaaObjeto
*/

import java.io.IOException;
import java.util.Scanner;

public class elevador {

    public static void main(String args[]) throws IOException {

        Scanner in = new Scanner(System.in);

        int tAndares,mPessoas;
        // mPessoas é a variavel para o maximo de pessoas no elevador
        // tAndares é a variavel par o total de andares no predio

        //Variaveis pegando os valores do vetor args que será informado na linha de execução do programa do programa
        tAndares = Integer.parseInt(args[0]);
        mPessoas = Integer.parseInt(args[1]);


        // System.out.println("Total de andares: "+tAndares);
        // System.out.println("Maximo de pessoas: "+mPessoas);

        System.out.println("******************************************");
        System.out.println("-----------------SYSELEV------------------");
        System.out.println("    CAPACIDADE TOTAL DO ELEVADOR: "+mPessoas);
        System.out.println("    TOTAL DE ANDARES NO PREDIO: "+tAndares);
        System.out.println("    ANDARES VALIDOS DE 0 ATE "+(tAndares-1));
        System.out.println("    ANDAR ATUAL DO ELEVADOR: 0");
        System.out.println("------------------------------------------");
        System.out.println("******************************************");

        int aAndar,tPessoas,tDesce,tSobe,sAndar;
        // LETRAS INICIAIS: a=atual , t=total , s=solicitado
        aAndar = tPessoas = tDesce = tSobe = sAndar = 0;//atribuição multiplas para a variavel
        
        //repetição para saber se o andar solicitado é valido
        while (sAndar >= 0 && sAndar <= (tAndares - 1)){
            System.out.print("INFORME UM ANDAR:");
            sAndar = in.nextInt();
                //condição para saber se o elevador ira subir ou descer
                if (sAndar>=0 || sAndar>(tAndares-1)){
                    if(aAndar<sAndar){
                        for(int i=(aAndar+1);i<=sAndar;i++){
                            System.out.println("----------");
                            System.out.println("|   ..   |");
                            System.out.println("|  .  .  |");
                            System.out.println("| .    . |");
                            System.out.println("| ------ |");
                            System.out.println("|   ||   |");
                            System.out.println("|   ||   |");
                            System.out.println("----------");
                            System.out.println(" SUBINDO ");
                            System.out.println(" ANDAR "+i);
                            aAndar=i;
                        }
                    }else{
                        for (int i=(aAndar-1);i>=sAndar;i--){
                            System.out.println("----------");
                            System.out.println("|   ||   |");
                            System.out.println("|   ||   |");
                            System.out.println("| ------ |");
                            System.out.println("| .    . |");
                            System.out.println("|  .  .  |");
                            System.out.println("|   ..   |");
                            System.out.println("----------");
                            System.out.println(" DESCENDO ");
                            System.out.println(" ANDAR "+i);
                            aAndar=i;    
                        }
                    }
                        System.out.println();

                        System.out.println("-----     -----");
                        System.out.println("|   |     |   |");
                        System.out.println("|   |     |   |");
                        System.out.println("| PORTA ABERTA| ");
                        System.out.println("|   |     |   |");
                        System.out.println("|   |     |   |");
                        System.out.println("-----_____-----");
                        
                        System.out.println();

                        do{
                            System.out.print("Numero de Pessoas saindo: ");
                            tDesce = in.nextInt();
                            if(tDesce>tPessoas){
                                System.out.println("Numero de Pessoas saindo maior do que o total no elevador");
                                System.out.println("CORREÇÃO: ESTA SAINDO DO ELEVADOR : "+tPessoas);
                                tDesce = tPessoas;
                            }
                        }while(tDesce>tPessoas);

                        tPessoas = tPessoas - tDesce;
                        System.out.println();

                        do{
                            System.out.print("Numero de Pessoas subindo: ");
                            tSobe = in.nextInt();
                            if(tSobe>(mPessoas-tPessoas)){
                                System.out.println("Numero de pessoas maior que o permitido");
                                System.out.println("MAXIMO DE PESSOAS QUE PODEM ENTRAR: "+(mPessoas-tPessoas));
                            }
                        }while(tSobe>(mPessoas-tPessoas));

                        tPessoas = tPessoas + tSobe;
                        System.out.println();

                        System.out.println("    --------- ");
                        System.out.println("    |   |   |");
                        System.out.println("    |   |   |");
                        System.out.println("  PORTA FECHADA ");
                        System.out.println("    |   |   |");
                        System.out.println("    |   |   |");
                        System.out.println("____---------____");
                        System.out.println();
                        System.out.println("----------  PAINEL INFORMATIVO  ----------");
                        System.out.println("**************  SYSELEV  *****************");
                        System.out.println("ELEVAOR ESTA NO ANDAR: "+aAndar);
                        System.out.println("TOTAL DE PESSOAS DENTRO DO ELEVADOR: "+tPessoas);
                        System.out.println("---------- PAINEL INFORMATIVO ----------");
                }else{
                    System.out.println("ERROR - ANDAR INVALIDO");
                }
        }

    }

}