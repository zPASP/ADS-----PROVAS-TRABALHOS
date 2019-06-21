import java.io.IOException;
import java.util.Scanner;
 

public class carro {
 
    public static void main(String[] args) throws IOException {
    
        Scanner in = new Scanner(System.in);

        double info [][] = {{24,20,44,37,22,15,14,139,19,17},{2.5,2.8,3.9,3.8,2.6,1.6,1.7,12.2,5.6,2.5},{1,2,2,2,1,1,1,2,2,1}};

       /* for(int i = 0; i<info.length;i++){
            for (int j = 0 ; j< info[0].length;j++){
                System.out.print(info[i][j]+",");
            }
            System.out.println();
        }*/

        double resultado[] = new double [8];
        //DISTANCIA PERCORIDA  | DIST ESTRA MUNICIPAIS | DIST ESTRA INTERMUNICIPAIS| TRECHO MAIOR MEDIA COMBUS | TRECHO MENOR MEDIA COMUBUS | CONSUMO MEDIO | MEDIA COMBUS MUNUCIPAL | MEDIA COMBUS INTERMUNUCIPAIS

        //calculo para as distancia total
        
        //variaveis auxiliares para a media percorida
        double aux=0,mamedia=info[0][0]/info[1][0], memedia=info[0][0]/info[1][0];
        double consumototal=0,divinter=0,divmuni=0;
        resultado[3]=0;resultado[4]=0;
            for (int j = 0 ; j< info[0].length;j++){
                resultado[0] += info[0][j];
                //descobrir na matriz qual tipo de estrada é e calcular no lugar certo
                if (info[2][j] == 1){
                    resultado[1] += info[0][j];
                    divmuni++;
                    resultado[6]+=info[1][j];
                }else if (info[2][j] == 2){
                    resultado[2] += info[0][j];
                    divinter++;
                    resultado[7]+=info[1][j];
                }
                
                consumototal+=info[1][j];

                aux = info[0][j]/info[1][j];
                if (aux > mamedia){
                    mamedia=aux;
                    resultado[3]=j+1;
                }
                if (aux < memedia){
                    memedia=aux;
                    resultado[4]=j+1;
                }

        }

        resultado[5]= resultado[0]/ consumototal;
        resultado[6]= resultado[1]/ resultado[6];
        resultado[7]= resultado[2]/ resultado[7];


       
            System.out.printf("A distancia percorrida foi de %.0f Km\n",resultado[0]);
            System.out.printf("A distancia percorrida em estradas Municipais = %.0f Km\n",resultado[1]);
            System.out.printf("A distancia percorrida em estradas Intermunicipais = %.0f Km\n",resultado[2]);
            System.out.printf("O Trecho de maior media de cobustivel = %.0f\n",resultado[3]);
            System.out.printf("O Trecho de menor media de cobustivel = %.0f\n",resultado[4]);
            System.out.printf("O consumo medio do carro ao longo da viagem = %.15f\n",resultado[5]);
            System.out.printf("Media de combustivel na estrada Intermunicipal = %.15f\n",resultado[7]);
            System.out.printf("Media de combustivel na estrada Municipal = %.15f\n",resultado[6]);



        

 
 
    }
 
}