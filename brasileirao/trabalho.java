import java.io.IOException;
import java.util.Scanner;

 

public class trabalho {
 
    public static void main(String[] args) throws IOException {
    
        Scanner in = new Scanner(System.in);

        String times [] = {"INTER","JUVENTUDE","GREMIO","PALMEIRAS","FLAMENGO","VASCO"};

        int pontos [][] = {{3,1,1,3,3,3,1,3,1,0,3,3,0,1,3,3,3,1,3},{1,1,1,1,1,0,3,3,1,0,3,3,0,1,1,1,1,1,3},{1,3,3,1,0,1,3,3,3,1,0,3,3,1,0,3,1,3,3},{1,3,3,1,0,1,0,3,3,3,1,3,0,3,0,1,1,3,3},{3,3,3,0,0,1,3,1,3,0,0,1,1,0,0,3,1,3,0},{3,1,1,3,1,3,1,1,3,3,1,1,3,0,0,3,1,1,0}};


        int tabela [][] = new int [times.length][5];        

        for(int t=0; t < times.length ; t++){
            tabela[t][0] = t;
                for (int j = 0 ; j < pontos[0].length;j++){
                   tabela[t][1]+=pontos[t][j];
                   if(pontos[t][j] == 3){
                       tabela[t][2]++;
                   }else if(pontos[t][j] == 1){
                       tabela[t][3]++;
                   }else if(pontos[t][j] == 0){
                       tabela[t][4]++;
                   }
                }
        }
        int classificacao [][] = new int [tabela.length][5] ;
            /* 
            Nº DO TIME  |  PONTOS DO TIME | POSIÇÃO DO TIME | SEQUENCIA MELHOR RODADA | RADADA TODOS VENCERAM
            */
            
        for(int i = 0 ; i < tabela.length;i++){
            classificacao[i][0] = tabela[i][0];
            classificacao[i][1] = tabela[i][1];
        }
        
        int mpontos [][] = new int [classificacao.length][3];
        // pontos do time | Nº do time | rank
        
        for(int i = 0 ; i < classificacao.length;i++){
            mpontos[i][0] = classificacao[i][1];
            mpontos[i][1] = i;
            mpontos[i][2] = i;

        }

        boolean troca=true;
        int aux=0;
        while(troca){
            troca=false;
            for (int i= 0; i< (mpontos.length-1);i++) {
                if (mpontos[i][0] < mpontos[i+1][0]){
                    troca = true;
                    aux = mpontos[i][0];
                    mpontos[i][0] = mpontos[i+1][0];
                    mpontos[i+1][0] = aux;

                    aux = mpontos[i][1];
                    mpontos[i][1] = mpontos[i+1][1];
                    mpontos[i+1][1] = aux;
                    }
                }
            }

            int melhorrodada [][] = new int [times.length][5];
            //  MAIOR PONTOS | nº da rodada | Pontos 1| Pontos 2 | Pontos 3
            int pganhos=0;

            for (int i = 0 ; i<pontos.length;i++){
                for ( int j = 0; j<(pontos[0].length-2);j++){
                    pganhos = pontos[i][j]+pontos[i][j+1]+pontos[i][j+2];
                    if(melhorrodada[i][0] < pganhos){
                        melhorrodada[i][0] = pganhos;
                        melhorrodada[i][1] = j;
                        melhorrodada[i][2] = pontos[i][j];
                        melhorrodada[i][3] = pontos[i][j+1];
                        melhorrodada[i][4] = pontos[i][j+2];
                    }
                    pganhos = 0;
                }
            }

            for(int i = 0 ; i < mpontos.length;i++){
                if(i < 1){
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("|    CLASSIFICACAO\t| PONTOS \t| VITORIAS \t| EMPATES \t| DERROTAS || MELHOR RODADA \t| MELHORES PONTUACOES | PONTOS GANHOS|");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                }
                System.out.print("| "+(i+1)+" | "+times[mpontos[i][1]]+"\t\t");
                System.out.print("| "+mpontos[i][0]+"\t\t| ");
                for (int j = 0 ;j<times.length;j++){
                    if (j == mpontos[i][1]){
                    System.out.print(tabela[j][2]+"\t\t| "+tabela[j][3]+"\t\t| "+tabela[j][4]+"\t   ||");
                    System.out.println("RODADA "+((melhorrodada[j][1])+1)+","+((melhorrodada[j][1])+2)+","+((melhorrodada[j][1])+3)+" \t| "+melhorrodada[j][2]+","+melhorrodada[j][3]+","+melhorrodada[j][4]+"\t\t      |"+melhorrodada[j][0]+"\t     |");

                    }
                }
                
            }

            int nvitoria=0;
            int rvencedores [][] = new int [pontos[0].length][5];
            // Nº da rodada | RODADA vencida?! | TIME 1 | TIME 2 | TIME 3
            for (int i = 0 ; i<pontos[0].length;i++){
                for ( int j = 0; j<(pontos.length);j++){
                    rvencedores[i][0] = i;
                    if( pontos[j][i] == 3){
                        nvitoria+=1;
                        if(nvitoria == 1){
                            rvencedores[i][2] = j;
                        }else if (nvitoria == 2){
                            rvencedores[i][3] = j;
                        }else if (nvitoria == 3){
                            rvencedores[i][4] = j;
                        }
                    }

                }
                if ( nvitoria < 3){
                    rvencedores[i][1] = -1;
                }else{
                    rvencedores[i][1] = 0;
                }
                nvitoria=0;
            }

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("===========================================");
            System.out.println("||====RODADAS EM QUE VENCERAM 3 TIMES====||");

            for(int i = 0; i<rvencedores.length;i++){
                    if(i==0){
                        System.out.println("||---------------------------------------||");
                        System.out.println("||RODADA|\tTIMES\t\t\t ||");
                        System.out.println("||---------------------------------------||");
                    }
                    if( rvencedores[i][1] != -1){
                        System.out.print("||"+(i+1)+"\t|");
                        System.out.print(times[rvencedores[i][2]]+" , ");
                        System.out.print(times[rvencedores[i][3]]+" , ");
                        System.out.print(times[rvencedores[i][4]]+"\t ||\n");

                    }
            }
                        System.out.println("||---------------------------------------||");
                        System.out.println("========TADS A GENTE SE VE POR AQUI========");
            
 
    }
 
}
