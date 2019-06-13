import java.io.IOException;
import java.util.Scanner;

 

public class brasileirao {
 
    public static void main(String[] args) throws IOException {
    
        Scanner in = new Scanner(System.in);

        String times [] = {"INTER\t","JUVENTUDE\t","GREMIO\t","PALMEIRAS\t","FLAMENGO\t","VASCO\t"};

        int pontos [][] = {{3,3,1,1,3,0,3,3,1,0,3,3,0,1,1,3,3,1,3},{1,1,1,1,3,0,3,3,1,0,3,3,0,1,1,1,1,1,3},{1,3,3,1,0,1,3,3,3,1,0,3,3,1,0,3,1,3,3},{1,3,3,1,0,1,0,3,3,3,1,3,0,3,0,1,1,3,3},{3,3,3,0,0,1,3,1,3,0,0,1,1,0,0,3,1,3,0},{3,3,3,3,3,3,3,3,3,3,1,1,3,0,0,3,1,1,0}};


        /*for(int i=0; i < times[0].length() ;i++){
            System.out.print(times[i]+"\t");
            
            for(int j = 0;j < pontos[0].length ; j++){
                System.out.print(pontos[i][j]+"\t");
            }
            System.out.println("\n");

        }*/

        int tabela [][] = new int [times.length][5];
        /*
            TIME  |  PONTOS GANHOS  |  VITORIAS  |  EMPATES  |  DERROTAS  |
        */
        

        for(int t=0; t < times.length ; t++){
        //  System.out.println(times[0].length());
        //  System.out.print("NOME DO TIME: "+times[t]+"\t");
            tabela[t][0] = t;

                for (int j = 0 ; j < pontos[0].length;j++){
                   // System.out.print("Pontos Ganhos: "+pontos[i][j]);
                   // System.out.print(pontos[t][j]+" ");
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
       /* for( int i = 0; i<times.length;i++){
            System.out.println(tabela[i][2]+"||"); 
        }*/


        for(int i = 0; i< tabela.length;i++){
            if(i == 0){
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("|NOME DO TIME \t| PONTOS GANHOS \t| VITORIAS \t| EMPATES \t| DERROTAS|");
            System.out.println("-----------------------------------------------------------------------------------");
            }
            System.out.print("|"+times[tabela[i][0]]+" \t|");
            System.out.print(tabela[i][1]+" \t\t\t|");
            System.out.print(tabela[i][2]+" \t\t|");
            System.out.print(tabela[i][3]+" \t\t|");
            System.out.print(tabela[i][4]+" \t  |\t\n");
            System.out.println("-----------------------------------------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------------");
        int classificacao [][] = new int [tabela.length][5] ;
            /* 
            Nº DO TIME  |  PONTOS DO TIME | POSIÇÃO DO TIME | SEQUENCIA MELHOR RODADA | RADADA TODOS VENCERAM
            */
            
        for(int i = 0 ; i < tabela.length;i++){
            classificacao[i][0] = tabela[i][0];
           // System.out.println("P time: "+tabela[1][i]);
            classificacao[i][1] = tabela[i][1];
        }
        /*int maior = 0;
        int mpontos [] = new int [classificacao[0].length];
        for (int i = 0; i< classificacao.length;i++){
            if(i==0){
               for (int m = 0; m < classificacao[0].length;m++){
                    if( maior < classificacao[1][m] ){
                        maior = classificacao[1][m];
                    }
                }
            }else{
                
            }
        }
        System.out.println(maior);*/
        
        
      //  System.out.println(classificacao[0].length);
      //  System.out.println(classificacao.length);
        
        int mpontos [][] = new int [classificacao.length][3];

        // pontos do time | Nº do time | rank
        
        for(int i = 0 ; i < classificacao.length;i++){
            mpontos[i][0] = classificacao[i][1];
         //   System.out.println(classificacao[i][1]);
            mpontos[i][1] = i;
            mpontos[i][2] = i;

        }

        /*for(int i = 0 ; i < mpontos.length;i++){
            System.out.print(mpontos[i][0] +"\t");
            System.out.println(times[mpontos[i][1]]);
        }*/
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
            /*System.out.print("\n");
            for ( int i = 0; i < mpontos.length;i++){
                for ( int j = 0 ; j < mpontos[0].length;j++)  {
                System.out.print(mpontos[i][j]+" | ");
        }System.out.print("\n");}*/
        for ( int i = 0; i < mpontos.length;i++){
            System.out.print(mpontos[i][2]+" | \n");
        }

            for(int i = 0 ; i < mpontos.length;i++){
                if(i == 0){
                    System.out.println("------------------------------------------");
                    System.out.println("|     CLASSIFICACAO\t\t| PONTOS |");
                    System.out.println("------------------------------------------");
                }
                System.out.print("| "+(i+1)+" | "+times[mpontos[i][1]]+"\t\t");
                System.out.print("| "+mpontos[i][0]+"     |\n");
            }
            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");

            /*
            int mpganhos = 0;
            int pganhos = 0;
            int rodada1 = 0;

            for (int i = 0 ; i<pontos.length;i++){
                for ( int j = 0; j<(pontos[0].length-2);j++){
                    pganhos = pontos[i][j]+pontos[i][j+1]+pontos[i][j+2];
                    System.out.print(pganhos+"|");
                }
                pganhos=0;
                System.out.println();
            }*/

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

            System.out.println("------------------------------------------");

            for(int i=0; i<melhorrodada.length;i++){
                for(int j=0; j<melhorrodada[0].length;j++){
                    System.out.print(melhorrodada[i][j]+"|");
                }
                System.out.println();
            }

            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");

            for (int i = 0 ; i<pontos[0].length;i++){
                for ( int j = 0; j<(pontos.length);j++){
                System.out.print(pontos[j][i]+"|");
                }
                System.out.println();
            }

            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");


            int nvitoria=0;

            int rvencedores [][] = new int [pontos[0].length][5];
            // Nº da rodada | RODADA vencida?! | TIME 1 | TIME 2 | TIME 3
            int prodada=0;
            for (int i = 0 ; i<pontos[0].length;i++){
                for ( int j = 0; j<(pontos.length);j++){
                    rvencedores[i][0] = i;
                    System.out.print(pontos[j][i]+"|");
                    prodada=pontos[j][i];
                    if( prodada == 3){
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
                System.out.println();
                nvitoria=0;
            }

            System.out.println("------------------------------------------");
            
            for(int i = 0; i<rvencedores.length;i++){
                for (int j = 0; j<rvencedores[0].length;j++){
                    System.out.print(rvencedores[i][j]+"|");
                }
            System.out.println();
            }

            for(int i = 0; i<rvencedores.length;i++){
                    if(i==0){
                        System.out.println("|RODADA\t|TIMES\t\t|");
                    }
                    if( rvencedores[i][1] != -1){
                        System.out.println("|"+i+"\t| "+times[rvencedores[i][2]]+times[rvencedores[i][3]]+times[rvencedores[i][4]]);
                    }

                
            }
            
 
    }
 
}
