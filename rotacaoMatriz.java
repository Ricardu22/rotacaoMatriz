/*
Crie um método estático que recebe uma matriz e que faça a rotação de acordo com o angulo informado.
Por exemplo:
matriz = { { 2, 3}, { 4, 5} } 
rotacionar 90graus
resultado 
matriz = { { 4,2}, {5,3}}
Graus permitidos
0, 90, 180, 270 e 360
Rotacione sempre no sentido horário. 
Considere apenas matrizes quadradas.
Entrega
Anexe na ferramenta o link de aceso ao seu repositório no github
*/

import java.util.Scanner;
public class rotacaoMatriz {
    public static void main(String[] args){        

            int[][] matriz = new int[2][2];
            int var00 = 0;
            int var01 = 0;
            int var10 = 0;
            int var11 = 0;
            
            Scanner entrada = new Scanner(System.in);
            Scanner menu = new Scanner(System.in);
            Scanner pause = new Scanner(System.in);
           
            for(int linha = 0 ; linha < 2 ; linha++){
                for(int coluna = 0; coluna < 2 ; coluna++){
                    System.out.printf("Matriz [%d][%d]: ",linha+1,coluna+1);
                    matriz[linha][coluna] = entrada.nextInt();
                }
            }
            
            System.out.println("=======================================================");
            System.out.println("Matriz: ");
            for(int linha=0 ; linha < 2 ; linha++){
                for(int coluna = 0; coluna < 2 ; coluna ++){
                    System.out.printf(" %d ",matriz[linha][coluna]);
                }
                System.out.println();
            }

            var00 = matriz[0][0];
            var01 = matriz[0][1];
            var10 = matriz[1][0];
            var11 = matriz[1][1];

            System.out.println("=======================================================");
            System.out.println("Tecla ENTER para continuar");
            String para = pause.nextLine();

// Switch =========================================================================================

            System.out.println("=======================================================");
            System.out.println("=================== Girar Matriz ======================");
            System.out.println("=======================================================");
            System.out.println("=| 1: Girar 0ª   |=====================================");
            System.out.println("=| 2: Girar 90ª  |=====================================");
            System.out.println("=| 3: Girar 180ª |=====================================");
            System.out.println("=| 4: Girar 270ª |=====================================");
            System.out.println("=| 5: Girar 360ª |=====================================");
            System.out.println("=======================================================");
            System.out.println("Digite uma opção: ");
            int opcao = menu.nextInt();
            
            switch(opcao) {
                    case 1:
                    System.out.println("======================================================");
                    System.out.println("Rotação de 0º");
                    for(int linha = 0 ; linha < 2 ; linha++){
                        for(int coluna = 0; coluna < 2 ; coluna ++){
                            System.out.printf(" %d ",matriz[linha][coluna]);
                        }
                        System.out.println();
                    }
                break;
                case 2:
                    System.out.println("======================================================");
                    System.out.println("Rotação de 90º");
                    matriz[0][0] = var10;
                    matriz[0][1] = var00;
                    matriz[1][0] = var11;
                    matriz[1][1] = var01;
                                       
                    for(int linha = 0 ; linha < 2 ; linha++){
                        for(int coluna = 0; coluna < 2 ; coluna ++){
                            System.out.printf(" %d ",matriz[linha][coluna]);
                        }
                        System.out.println();
                    }
                    
                break;
                case 3:
                    System.out.println("======================================================");
                    System.out.println("Rotação de 180º");
                    matriz[0][0] = var11;
                    matriz[0][1] = var10;
                    matriz[1][0] = var01;
                    matriz[1][1] = var00;
                                       
                    for(int linha = 0 ; linha < 2 ; linha++){
                        for(int coluna = 0; coluna < 2 ; coluna ++){
                            System.out.printf(" %d ",matriz[linha][coluna]);
                        }
                        System.out.println();
                    }
                break;
                case 4:
                    System.out.println("======================================================");
                    System.out.println("Rotação de 270º");
                    matriz[0][0] = var01;
                    matriz[0][1] = var11;
                    matriz[1][0] = var00;
                    matriz[1][1] = var10;
                                       
                    for(int linha = 0 ; linha < 2 ; linha++){
                        for(int coluna = 0; coluna < 2 ; coluna ++){
                            System.out.printf(" %d ",matriz[linha][coluna]);
                        }
                        System.out.println();
                    }
                break;
                case 5:
                    System.out.println("======================================================");
                    System.out.println("Rotação de 360º");
                    matriz[0][0] = var00;
                    matriz[0][1] = var01;
                    matriz[1][0] = var10;
                    matriz[1][1] = var11;
                                       
                    for(int linha = 0 ; linha < 2 ; linha++){
                        for(int coluna = 0; coluna < 2 ; coluna ++){
                            System.out.printf(" %d ",matriz[linha][coluna]);
                        }
                        System.out.println();
                    }
                break;
                default:
                    System.out.println("Escolha um numero entre 1 e 5");
            
            }
            

        
    }        
        


}
