import java.io.IOException;
import java.util.Scanner;
 

public class conjuntos {
 
    public static void main(String[] args) throws IOException {
    
        Scanner in = new Scanner(System.in);

        int vetorA [] = {1,5,8,9,2,7,11,3,12};
        int vetorB [] = {4,3,7,6,15,14,10,11,8};

        int vetorUniao [] = new int [(vetorA.length)+(vetorB.length)];

        for (int i = 0; i<vetorA.length;i++){
            vetorUniao[i] = vetorA[i]; 
        }
        int aux = vetorA.length;
        
        boolean repete=false;

        for (int i = 0; i<vetorB.length;i++){
            for (int j = 0;j<vetorA.length;j++){
            //    System.out.print(vetorB[i]+" = "+vetorA[j]+" ");
                if (vetorB[i] == vetorA[j]){
             //       System.out.print("REPETIDO\n");
                    repete=true;
                    j=vetorA.length;
                }else{
                 //   System.out.print("DIFERENTE\n");
                    repete=false;
                }
            }            
            if(!repete){
                vetorUniao[aux]=vetorB[i];
                aux++;
            }
          //  System.out.println("");
        }

        System.out.println("UNIÃO DOS VETORES A & B");
        for(int i = 0; i<vetorUniao.length;i++){
            if(vetorUniao[i]!=0){
            System.out.print(vetorUniao[i]+" ");}
        }
        System.out.println();


        int interseccao [] = new int [vetorA.length];
        aux=0;

        for(int i=0;i<vetorA.length;i++){
            for(int j=0;j<vetorB.length;j++){
                if (vetorA[i] == vetorB[j]){
                    interseccao[aux]=vetorA[i];
                    aux++;
                }
            }
        }

        System.out.println("INTERSECÇÃO DE A & B");
        for(int i = 0; i<interseccao.length;i++){
            if(interseccao[i]!=0){
            System.out.print(interseccao[i]+" ");}
        }
 
    }
 
}