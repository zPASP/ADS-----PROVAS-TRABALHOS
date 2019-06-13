import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner in = new Scanner(System.in);
        int numandar;
        do {
            System.out.println("Digite o número de andares:");
            numandar = in.nextInt();

            if (numandar == 0){
                System.out.println("Você já se encontra no andar Terreo.");
            }else if (numandar < 0){
                System.out.println("Esse elevador não possui subterraneo.");
            }
        }while (numandar < 1);

        int andaratual;
        int pasentra = 0;
        int passai = 0;
        int pasatual = 0;
        int aux = 0;
        int nummax = 15;
        int entrouma = 0;
        int entroume = 0;
        int saiuma = 0;
        int saiume = 0;
        int ensai = 0;
        int passaiuma = 0;
        int passaiume = 100;
        int pasentrouma = 0;
        int pasentroume = 100;
        int pasensai = 0;
        int andarper = 0;
        double perceandar = 0;
        int maperc = 0;
        double pasentratotal=0;
        double passaitotal=0;
        


        for (andaratual=0;andaratual<=numandar;andaratual++){
            
            if (andaratual == 0){
                do{
                    System.out.println("Você Esta no andar Térreo");
                    System.out.println("Numero de passageiros entrando: ");
                    pasentra = in.nextInt();
                }while (pasentra < 0 || pasentra > 15);
            }else {
                System.out.println("Você esta no "+andaratual+"º Andar");
                do {
                    System.out.println("Numero de passageiros entrando: ");
                    pasentra = in.nextInt();
                }while (pasentra < 0 || pasentra > 15);
                System.out.println("Numero de passageiros Saindo: ");
                passai = in.nextInt();
                aux = pasentra+pasatual;
                if (passai > aux){
                    do{
                        System.out.println("ERRO - SAIDA MAIOR QUE O TOTAL DE PASSAGEIROS");
                        System.out.println("O elevador esta com "+(pasatual+pasentra)+" passageiros");
                        System.out.println("Numero de passageiros Saindo: ");
                        passai = in.nextInt();                        
                    }while(passai < pasatual);
                }
                aux = 0;
                aux = pasatual+(pasentra-passai);
                if (aux > nummax){
                    System.out.println("EXCESSO DE PASSAGEIROS, DEVEM SAIR: "+(aux-nummax));
                    passai = passai+(aux-nummax);
                    System.out.println("O total de passageiros que sairam nesse andar foi de "+passai+" passageiros");
                    
                }
                aux = 0;
            }

            pasentratotal = pasentratotal+pasentra;
            passaitotal = passaitotal+passai;
            

            if (aux == 0){
                aux = pasentra+passai;
                if (aux > pasensai){
                ensai = andaratual;
                pasensai = aux;
            } aux = 0; }

            if (passai > passaiuma){
                saiuma = andaratual;
                passaiuma = passai;
            }

            if (passai < passaiume){
                if (andaratual != 0){
                saiume = andaratual;
                passaiume = passai;
            }}

            if (pasentra > pasentrouma){
                entrouma = andaratual;
                pasentrouma = pasentra;
            }

            if (pasentra < pasentroume){
                if (andaratual != 0){
                entroume = andaratual;
                pasentroume = pasentra;
            }}
            
            pasatual = pasatual+(pasentra-passai);
            aux = 0;
            aux = (pasatual * 100) / nummax;
            if (aux > maperc){
                maperc = aux;
                andarper = andaratual;
            }
            
            aux = 0;
            System.out.println("Numero de passageiros final = "+pasatual);
            System.out.println();

        }

        pasentratotal = pasentratotal/(numandar+1);
        passaitotal = passaitotal/numandar;

        System.out.println("Total de passageiro no ultimo andar: >"+pasatual);
        System.out.println("Andar que entrou e saiu mais passageiros: >"+ensai+" com = "+pasensai);
        System.out.println("Andar que entrou mais passageiros: >"+entrouma+" com = "+pasentrouma);
        System.out.println("Andar que Entrou menos passageiros: >"+entroume+" com = "+pasentroume);
        System.out.println("Andar que saiu mais passageiros: >"+saiuma+" com = "+passaiuma);
        System.out.println("Andar que saiu menos passageiros: >"+saiume+" com = "+passaiume);
        System.out.println("Andar com maior % de passageiros em relação ao total: >"+andarper+" com ="+ maperc);
        System.out.println("Media passageiros que entram: >"+pasentratotal);
        System.out.println("Media passageiros que saem: >"+passaitotal); 
    }
 
}