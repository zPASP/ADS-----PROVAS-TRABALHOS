
/*
    NOME DO PROGRAMA: Biblioteca com funções matematicas para vetores
    NOME DO AUTOR: Pedro Alexandre Pinto
    CRIAÇÃO: 09/08/19
    github: https://github.com/zPASP
    ProgramacaoOrientedaaObjeto
*/

import java.io.IOException;
import java.util.Scanner;

public class bibVetores {

    // funções estão com o nome de facil compreensão 
    public static double [] lerVetorDouble(int tamanho,Scanner entrada) {
        double vetor [] = new double[tamanho];
        for (int i = 0; i<vetor.length;i++){
            System.out.println("Informe um numero: ");
            vetor[i] = entrada.nextDouble();
        }
        return vetor;
        
    }

    public static int escolhaVetor (Scanner entrada ) {//da ao usuario opção de escolha entre os vetores
        int escolha;
        System.out.println("Qual vetor quer utilizar?");
        System.out.println("1 = Vetor1 |\t| 2 = Vetor2");
        escolha = entrada.nextInt();
        return escolha;
    }

    public static int [] lerVetorInt( int tamanho, Scanner entrada){
        int vetor [] = new int [tamanho];
        for (int i = 0;i<vetor.length;i++){
            System.out.println("Informe um numero:");
            vetor[i] = entrada.nextInt();
        }
        return vetor;
    }

    public static void mostraVetorDouble ( double vetor []) {
        System.out.printf("Imprimindo um vetor de %d elementos \n", vetor.length);
        for (int i = 0; i < vetor.length ; i++){
            System.out.print("|"+ vetor[i] + "|");
        }
    }

    public static void mostraVetorInt(int vetor[]) {
        System.out.printf("Imprimindo um vetor de %d elementos \n", vetor.length);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("|" + vetor[i] + "|");
        }
    }

    public static int [] somaVetoresInt (int v1 [], int v2 []) {//soma osvalores dos vetores que estão na mesma posição
        int vR [] = new int [v1.length];
        System.out.println("-SOMA DOS VETORES-");
        for (int i = 0; i < v1.length;i++){
            vR [i] = v1[i] + v2[i];
        }
        return vR;
    }

    public static int[] subtracaoVetoresInt(int v1[], int v2[]) {
        int vR[] = new int[v1.length];
        System.out.println("-SUBTRACAO DOS VETORES-");
        for (int i = 0; i < v1.length; i++) {
            vR [i] = v1[i] - v2[i];
        }
        return vR;
    }
    
    public static int maiorValorVetor(int v []) {//descobri qual o maior valor no vetor
        int resultado = v[0];
        System.out.println("=MAIOR VALOR DO VETOR-");
        for (int i = 0; i<v.length;i++){
            if( v[i]> resultado){
                resultado = v[i];
            }
        }
        return resultado;
    }

    public static int posicaoMaiorValorVetor(int v[]) {
        int resultado = v[0];
        int pMaiorValor = 0;
        System.out.println("=POSICAO MAIOR VALOR DO VETOR-");
        for (int i = 0; i < v.length; i++) {
            if (v[i] > resultado) {
                resultado = v[i];
                pMaiorValor = i;
            }
        }
        return pMaiorValor;
    }

    public static int menorValorVetor(int v[]) {
        int resultado = v[0];
        System.out.println("=MENOR VALOR DO VETOR-");
        for (int i = 0; i < v.length; i++) {
            if (v[i] < resultado) {
                resultado = v[i];
            }
        }
        return resultado;
    }

    public static int posicaoMenorValorVetor(int v[]) {
        int resultado = v[0];
        int pMenorValor = 0;
        System.out.println("=POSICAO MENOR VALOR DO VETOR-");
        for (int i = 0; i < v.length; i++) {
            if (v[i] < resultado) {
                resultado = v[i];
                pMenorValor = i;
            }
        }
        return pMenorValor;
    }

    public static double mediaVetorInt (int v[]) {//soma todos os valores dentro do vetor e faz a media dos valores.
        double media=0;
        for (int i = 0; i < v.length; i++) {
            media= media + v[i];
        }
        media = media / v.length;
        return media;
    }

    public static int [] ordenaCrescenteVetor (int ordenado[]){//função para ordenar o vetor em ordem crescente
        int aux=0;
        System.out.println("=VETOR ORDENADO EM ORDEM CRESCENTE-");
        for (int i = 0; i < ordenado.length; i++){
            for (int j = 0; j < ordenado.length; j++){
                if (ordenado[i] < ordenado[j]){
                    aux = ordenado[i];
                    ordenado[i] = ordenado[j];
                    ordenado[j] = aux;
                }
            }
        }
        return ordenado;
    }

    public static int [] ordenaDecrescenteVetor (int ordenado []){
        int aux=0;
        System.out.println("=VETOR ORDENADO EM ORDEM DESCRECENTE-");
        for (int i = 0; i < ordenado.length; i++){
            for (int j = 0; j < ordenado.length; j++){
                if (ordenado[i] > ordenado[j]){
                    aux = ordenado[i];
                    ordenado[i] = ordenado[j];
                    ordenado[j] = aux;
                }
            }
        }
        return ordenado;
    }

    public static void ordenaInternaCrescenteVetor (int ordenado[]){//função para oredenar o vetor mas sem retorna valor algum.
        int aux=0;
        System.out.println("=VETOR ORDENADO EM ORDEM CRESCENTE-");
        for (int i = 0; i < ordenado.length; i++){
            for (int j = 0; j < ordenado.length; j++){
                if (ordenado[i] < ordenado[j]){
                    aux = ordenado[i];
                    ordenado[i] = ordenado[j];
                    ordenado[j] = aux;
                }
            }
        }
    }

    public static void ordenaInternaDecrescenteVetor (int ordenado []){
        int aux=0;
        System.out.println("=VETOR ORDENADO EM ORDEM DESCRECENTE-");
        for (int i = 0; i < ordenado.length; i++){
            for (int j = 0; j < ordenado.length; j++){
                if (ordenado[i] > ordenado[j]){
                    aux = ordenado[i];
                    ordenado[i] = ordenado[j];
                    ordenado[j] = aux;
                }
            }
        }
    }

    public static int vezesRepete( int v1[] , int v2[]) {//descubro quantas vezes se repete para poder utilizar na união e na intersecção
        int vezesRepete=0;
        for(int i = 0; i < v1.length;i++){
            for (int j = 0; j< v2.length;j++){
                if (v1[i] == v2[j]){
                    vezesRepete++;
                }
            }
        }
        return vezesRepete;
    }
    
    public static int [] uniaoVetores (int v1[], int v2[]) {
        int vezesRepete = vezesRepete(v1, v2);//chamo a funcao para saber a quantidade de vezes que os valores dos vetores se repetem
        int aux=0;//aux do vetor uniao
        int vetorUniao [] = new int [((v1.length+v2.length) - vezesRepete)];//tamanho do vetor eh = os 2 vetores - a quantidade que eles se repetem
        System.out.println("=UNIAO DOS VETORES-");
        for(int i = 0;i<v1.length;i++){//coloco todos os valores contidos no vetor1 para a uniao
            vetorUniao[i] = v1[i];
            aux++;
        }
        boolean repete=false;
        for (int i = 0; i<v2.length;i++){//descubro qual o valor que se repete nos dois vetores para nao colocar no vetor uniao
            for (int j = 0;j<v1.length;j++){
                if (v2[i] == v1[j]){
                    repete=true;
                    j=v1.length;
                }else{
                    repete=false;
                }
            }            
            if(!repete){ //caso nao repita ele armazena o valor no vetor de união
                vetorUniao[aux]=v2[i];
                aux++;
            }
        }
        return vetorUniao;
    }

    
    public static int [] interseccaoVetores (int v1[],int v2 [] ) {
        int vezesRepete = vezesRepete(v1, v2);
        int vetorInter [] = new int [vezesRepete];
        int aux=0;
        System.out.println("=INTERSECCAO DOS VETORES-");
        for(int i = 0; i < v1.length;i++){//como na união passo valor por valor para descobrir qual valor esta se repedindo
            for (int j = 0; j< v2.length;j++){
                if (v1[i] == v2[j]){//caso o valor se repita eu irei salvar ele no vetor de interseccao 
                    vetorInter [aux] = v1[i];
                    aux++;
                }
            }
        }
        return vetorInter;
    }
    
}