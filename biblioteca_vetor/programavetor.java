
/*
    NOME DO PROGRAMA: Programa executando as funções da biblioteca de funções
    NOME DO AUTOR: Pedro Alexandre Pinto
    CRIAÇÃO: 09/08/19
    github: https://github.com/zPASP
    ProgramacaoOrientedaaObjeto
*/

import java.io.IOException;
import java.util.Scanner;

public class programavetor {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int escolha = 1,tamanhoVetor=0;
        double vetorDouble [];
        int vetorInt []; 
        while (escolha != 0){
            System.out.println("ESCOLHA O SEU TIPO DE VETOR:");
            System.out.println("1 - VETOR DE INTEIRO");
            System.out.println("2 - VETOR DE DOUBLE");
            escolha = in.nextInt();
            System.out.println("----------------------------");
            System.out.println("DIGITE O TAMANHO DO SEU VETOR:");
            tamanhoVetor = in.nextInt();

            if(escolha==1){
                vetorInt = bibVetores.lerVetorInt(tamanhoVetor, in);//ler os valores para o vetor
                bibVetores.mostraVetorInt(vetorInt);//imprime os valores do vetor
                escolha = 0;
            }else if (escolha == 2){
                vetorDouble = bibVetores.lerVetorDouble(tamanhoVetor, in);
                bibVetores.mostraVetorDouble(vetorDouble);
                escolha = 0; 
            }
        }
        escolha=1;


        //variavais responsaveis pelos pelos retornos das funcções 
        int vetor1 [];
        int vetor2 [];
        int vetorSoma[];
        int vetorSubt[];
        int qualvetor=0;
        int maiorVetor;
        int pMaiorvetor;
        int menorVetor;
        int pMenorVetor;
        double mediaVetor;
        int vetorCrescente [];
        int vetorDecrescente [];
        int vetorUniao [];
        int vetorInterseccao [];

        
        System.out.println("\n\n\nTESTANDO AS FUNCOES DE VETORES");
        System.out.println("QUAL O TAMANHO DOS VETORES?");
        tamanhoVetor = in.nextInt();
        //ler os valores para o primeiro vetor
        System.out.println("\n--------------------------");            System.out.println("CRIE O SEU PRIMEIRO VETOR:");
        vetor1 = bibVetores.lerVetorInt(tamanhoVetor, in);
        //ler os valores para o segundo vetor
        System.out.println("--------------------------");            System.out.println("CRIE O SEU SEGUNDO VETOR:");
        vetor2 = bibVetores.lerVetorInt(tamanhoVetor, in);

        while (escolha != 0){
            System.out.println("\n\n\n");
            System.out.println("--------------------------");
            System.out.println("MENU FUNCOES:");
            System.out.println("0 - SAIR DO SISTEMA");
            System.out.println("1 = SOMA");
            System.out.println("2 = SUBTRACAO");
            System.out.println("3 = MAIOR VALOR DO VETOR");
            System.out.println("4 = POSICAO DO MAIOR VETOR");
            System.out.println("5 = MENOR VALOR DO VETOR");
            System.out.println("6 = POSICAO DO MENOR VETOR");
            System.out.println("7 = MEDIA DOS VALORES DO VETOR");
            System.out.println("8 = ORDENA O VETOR EM ORDEM CRESCENTE");
            System.out.println("9 = ORDENA O VETOR EM ORDEM DECRESCENTE");
            System.out.println("10 = ORDENA INTERNAMENTE O VETOR EM ORDEM CRESCENTE");
            System.out.println("11 = ORDENA INTERNAMENTE O VETOR EM ORDEM DECRESCENTE");
            System.out.println("12 = FAZER A UNIAO DOS VETORES");
            System.out.println("13 = FAZER A INTERSECCAO DOS VETORES");
            escolha = in.nextInt();
            
            //escolha do menu
            if(escolha == 1){
                vetorSoma = bibVetores.somaVetoresInt(vetor1, vetor2);//chamo a função para somar os vetores e atribuo o resultado ao vetor da soma
                bibVetores.mostraVetorInt(vetorSoma);//mando ele imprimir o vetor com o resultado da soma

            }else if(escolha == 2){
                vetorSubt = bibVetores.subtracaoVetoresInt(vetor1, vetor2);
                bibVetores.mostraVetorInt(vetorSubt);

            }else if(escolha == 3){
                qualvetor = bibVetores.escolhaVetor(in);//chamo a função de escolha do vetor a ser utilizado e atribuo o resultado á variavel qual escolha
                if (qualvetor == 1){//crio uma função para cada retorno que pode ter na variavel qual vetor
                    maiorVetor = bibVetores.maiorValorVetor(vetor1);//chamo a função para saber qual o maior valor no vetor
                    System.out.println(maiorVetor);//imprimo o maior vetor
                }else if(qualvetor == 2){
                    maiorVetor = bibVetores.maiorValorVetor(vetor2);
                    System.out.println(maiorVetor);
                }else{
                    System.out.println("Não foi escolhido nenhum Vetor!");
                }

            }else if(escolha == 4){//posição do maior vetor
                qualvetor = bibVetores.escolhaVetor(in);
                if (qualvetor == 1){
                    pMaiorvetor = bibVetores.posicaoMaiorValorVetor(vetor1);
                    System.out.println(pMaiorvetor);
                }else if(qualvetor == 2){
                    pMaiorvetor = bibVetores.posicaoMaiorValorVetor(vetor2);
                    System.out.println(pMaiorvetor);
                }else {
                System.out.println("Não foi escolhido nenhum Vetor!");
                }

            } else if (escolha == 5) {//valor do menor vetor
                qualvetor = bibVetores.escolhaVetor(in);;
                if (qualvetor == 1) {
                    menorVetor = bibVetores.menorValorVetor(vetor1);
                    System.out.println(menorVetor);
                } else if (qualvetor == 2) {
                    menorVetor = bibVetores.menorValorVetor(vetor2);
                    System.out.println(menorVetor);
                } else {
                    System.out.println("Não foi escolhido nenhum Vetor!");
                }

            } else if (escolha == 6) { //posição do menor vetor
                qualvetor = bibVetores.escolhaVetor(in);
                if (qualvetor == 1) {
                    pMenorVetor = bibVetores.posicaoMenorValorVetor(vetor1);
                    System.out.println(pMenorVetor);
                } else if (qualvetor == 2) {
                    pMenorVetor = bibVetores.posicaoMenorValorVetor(vetor1);
                    System.out.println(pMenorVetor);
                } else {
                    System.out.println("Não foi escolhido nenhum Vetor!");
                }
            
            }else if (escolha == 7) {//media dos valores do vetor
                qualvetor = bibVetores.escolhaVetor(in);
                if (qualvetor == 1) {
                    mediaVetor = bibVetores.mediaVetorInt(vetor1);
                    System.out.println(mediaVetor);
                } else if (qualvetor == 2) {
                    mediaVetor = bibVetores.mediaVetorInt(vetor2);
                    System.out.println(mediaVetor);
                } else {
                    System.out.println("Não foi escolhido nenhum Vetor!");
                }

            }else if (escolha == 8) { //mostro o vetor em ordem crescente
                qualvetor = bibVetores.escolhaVetor(in);
                if (qualvetor == 1) {
                    vetorCrescente = bibVetores.ordenaCrescenteVetor(vetor1);
                    bibVetores.mostraVetorInt(vetorCrescente);
                }else if (qualvetor == 2) {
                    vetorCrescente = bibVetores.ordenaCrescenteVetor(vetor2);
                    bibVetores.mostraVetorInt(vetorCrescente);
                }else {
                    System.out.println("Não foi escolhido nenhum Vetor!");
                }

            }else if (escolha == 9) { //mostro o vetor em orden decrescente
                qualvetor = bibVetores.escolhaVetor(in);
                if (qualvetor == 1) {
                    vetorDecrescente = bibVetores.ordenaDecrescenteVetor(vetor1);
                    bibVetores.mostraVetorInt(vetorDecrescente);
                }else if (qualvetor == 2) {
                    vetorDecrescente = bibVetores.ordenaDecrescenteVetor(vetor2);
                    bibVetores.mostraVetorInt(vetorDecrescente);
                }else {
                    System.out.println("Não foi escolhido nenhum Vetor!");
                }
            
            }else if (escolha == 10) { // a mesma função do 8 porem sem retorno, colocada apenas pois foi solicitada no exercicio
                qualvetor = bibVetores.escolhaVetor(in);
                if (qualvetor == 1) {
                    bibVetores.ordenaInternaCrescenteVetor(vetor1);
                }else if (qualvetor == 2) {
                    bibVetores.ordenaInternaCrescenteVetor(vetor2);
                }else {
                    System.out.println("Não foi escolhido nenhum Vetor!");
                }

            }else if (escolha == 11) {// a mesma função do 9 porem sem retorno, colocada apenas pois foi solicitada no exercicio
                qualvetor = bibVetores.escolhaVetor(in);
                if (qualvetor == 1) {
                    bibVetores.ordenaInternaDecrescenteVetor(vetor1);
                }else if (qualvetor == 2) {
                    bibVetores.ordenaInternaDecrescenteVetor(vetor2);
                }else {
                    System.out.println("Não foi escolhido nenhum Vetor!");
                }
            
            }else if (escolha == 12) { //mostra a união dos vetores.
                vetorUniao = bibVetores.uniaoVetores(vetor1, vetor2);
                bibVetores.mostraVetorInt(vetorUniao);

            }else if (escolha == 13) { //mostra a intersecção dos vetores.
                vetorInterseccao = bibVetores.interseccaoVetores(vetor1, vetor2);
                bibVetores.mostraVetorInt(vetorInterseccao);
            
            }else if (escolha == 0) {//imprime uma mensagem antes de fechar o programa
                System.out.println("********************");
                System.out.println("FECHANDO O PROGRAMA");
                System.out.println("********************");

            }else {
                System.out.println("***************");
                System.out.println("OPCAO INCORRETA");
                System.out.println("***************");
            }


        }



    }

}


/*
}else if (escolha == 9) {
                qualvetor = bibVetores.escolhaVetor(in);
                if (qualvetor == 1) {
                }else if (qualvetor == 2) {
                }else {
                    System.out.println("Não foi escolhido nenhum Vetor!");
                }
            }
*/