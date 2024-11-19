import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Questao 1
        boolean verificadorMaster=false;
        boolean verificadorAlimento=false;
        int decisao =-1;
        int posicaoAliX = -1;
        int posicaoAliY = -1;
        String opcao = "";
        int escolha = -1;
        Robo r1 = new Robo("Azul");
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner teclado = new Scanner(System.in);
        while(verificadorMaster!=true){
        try{
            while(verificadorAlimento!=true){
                System.out.println("Digite a posicao do alimento em x: ");
                System.out.println("Lembre-se que o Alimento precisa estar em uma posicao maior que 0 e menor que 5");
                posicaoAliX = teclado.nextInt();
                System.out.println("Digite a posicao do alimento em y: ");
                System.out.println("Lembre-se que o Alimento precisa estar em uma posicao maior que 0 e menor que 5");
                posicaoAliY = teclado.nextInt();
                tabuleiro.atribuir(r1, 0, 0, posicaoAliX, posicaoAliY);
                System.out.println("Voce prefere responder usando palavras (1) ou numeros(2)?");
                decisao = teclado.nextInt();
                verificadorAlimento=true;
            }
            boolean verificador = false;
            while(verificador!=true){
                System.out.println("O que voce deseja fazer? ");
                System.out.println("1. up");
                System.out.println("2. down");
                System.out.println("3. right");
                System.out.println("4. left");
                if(decisao == 1){
                    opcao = teclado.next();
                    if(opcao.equals("up") ){
                        int[] coordenadas = r1.getCoordenadas();
                        int posAntiga_x = coordenadas[0];
                        int posAntiga_y = coordenadas[1];
                        r1.mover(1);
                        tabuleiro.atribuir(r1, posAntiga_x, posAntiga_y,posicaoAliX,posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        if(r1.verificar(posicaoAliX, posicaoAliY)==true){
                            System.out.println("Parabens, voce chegou no objetivo");
                            verificador = true;
                            verificadorMaster=true;
                        }
                    }
                    else if(opcao.equals("down")){
                        int[] coordenadas = r1.getCoordenadas();
                        int posAntiga_x = coordenadas[0];
                        int posAntiga_y = coordenadas[1];
                        r1.mover(2);
                        tabuleiro.atribuir(r1, posAntiga_x, posAntiga_y,posicaoAliX,posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        if(r1.verificar(posicaoAliX, posicaoAliY)==true){
                            System.out.println("Parabens, voce chegou no objetivo");
                            verificador = true;
                            verificadorMaster=true;
                        }
                    }
                    else if(opcao.equals("right")){
                        int[] coordenadas = r1.getCoordenadas();
                        int posAntiga_x = coordenadas[0];
                        int posAntiga_y = coordenadas[1];
                        r1.mover(3);
                        tabuleiro.atribuir(r1, posAntiga_x, posAntiga_y,posicaoAliX,posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        if(r1.verificar(posicaoAliX, posicaoAliY)==true){
                            System.out.println("Parabens, voce chegou no objetivo");
                            verificador = true;
                            verificadorMaster=true;
                        }
                    }
                    else if(opcao.equals("left")){
                        int[] coordenadas = r1.getCoordenadas();
                        int posAntiga_x = coordenadas[0];
                        int posAntiga_y = coordenadas[1];
                        r1.mover(4);
                        tabuleiro.atribuir(r1, posAntiga_x, posAntiga_y,posicaoAliX,posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        if(r1.verificar(posicaoAliX, posicaoAliY)==true){
                            System.out.println("Parabens, voce chegou no objetivo");
                            verificador = true;
                            verificadorMaster=true;
                        }
                    }
                    else{
                        System.out.println("Palavra errada, tente novamente");
                    }
                }
                if(decisao == 2){
                    escolha = teclado.nextInt();
                    if(escolha == 1){
                        int[] coordenadas = r1.getCoordenadas();
                        int posAntiga_x = coordenadas[0];
                        int posAntiga_y = coordenadas[1];
                        r1.mover(1);
                        tabuleiro.atribuir(r1, posAntiga_x, posAntiga_y,posicaoAliX,posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        if(r1.verificar(posicaoAliX, posicaoAliY)==true){
                            System.out.println("Parabens, voce chegou no objetivo");
                            verificador = true;
                            verificadorMaster=true;
                        }
                    }
                    if(escolha == 2){
                        int[] coordenadas = r1.getCoordenadas();
                        int posAntiga_x = coordenadas[0];
                        int posAntiga_y = coordenadas[1];
                        r1.mover(2);
                        tabuleiro.atribuir(r1, posAntiga_x, posAntiga_y,posicaoAliX,posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        if(r1.verificar(posicaoAliX, posicaoAliY)==true){
                            System.out.println("Parabens, voce chegou no objetivo");
                            verificador = true;
                            verificadorMaster=true;
                        }
                    }
                    if(escolha == 3){
                        int[] coordenadas = r1.getCoordenadas();
                        int posAntiga_x = coordenadas[0];
                        int posAntiga_y = coordenadas[1];
                        r1.mover(3);
                        tabuleiro.atribuir(r1, posAntiga_x, posAntiga_y,posicaoAliX,posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        if(r1.verificar(posicaoAliX, posicaoAliY)==true){
                            System.out.println("Parabens, voce chegou no objetivo");
                            verificador = true;
                            verificadorMaster=true;
                        }
                    }
                    if(escolha == 4){
                        int[] coordenadas = r1.getCoordenadas();
                        int posAntiga_x = coordenadas[0];
                        int posAntiga_y = coordenadas[1];
                        r1.mover(4);
                        tabuleiro.atribuir(r1, posAntiga_x, posAntiga_y,posicaoAliX,posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        if(r1.verificar(posicaoAliX, posicaoAliY)==true){
                            System.out.println("Parabens, voce chegou no objetivo");
                            verificador = true;
                            verificadorMaster=true;
                        }
                    }
                    else{
                        System.out.println("Numero errado, tente novamente");
                    }
                }
            }
            
        }catch(MovimentoInvalidoException e){
            System.out.println(e);
        }catch(AlimentoInvalido e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
}
