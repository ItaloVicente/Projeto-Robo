import java.util.Random;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        //Questao 2
        boolean verificadorMaster = false;
        boolean verificadorAlimento=false;
        Robo r1 = new Robo("Preto");
        Robo r2 = new Robo("Vermelho");
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner teclado = new Scanner(System.in);
        int posicaoAliX = -1;
        int posicaoAliY = -1;
        int movR1=0;
        int movR2=0;
        int movInvR1=0;
        int movInvR2=0;
        while(verificadorAlimento!=true){
            try{
                System.out.println("Digite a posicao do alimento em x: ");
                System.out.println("Lembre-se que o Alimento precisa estar em uma posicao maior que 0 e menor que 5");
                posicaoAliX = teclado.nextInt();
                System.out.println("Digite a posicao do alimento em y: ");
                System.out.println("Lembre-se que o Alimento precisa estar em uma posicao maior que 0 e menor que 5");
                posicaoAliY = teclado.nextInt();
                verificadorAlimento=true;
                tabuleiro.atribuir(r1, 3,3, posicaoAliX, posicaoAliY);
                tabuleiro.atribuir(r2, 3, 3, posicaoAliX, posicaoAliY);
                tabuleiro.mostrarMatriz();
            }catch(AlimentoInvalido e){
                System.out.println(e);
            }
        }
        while(verificadorMaster!=true){
            try{
                boolean verificador = false;
                while(verificador!=true){
                    int[] coordenadasR1 = r1.getCoordenadas();
                    int posAntigaR1_x = coordenadasR1[0];
                    int posAntigaR1_y = coordenadasR1[1];
                    int[] coordenadasR2 = r2.getCoordenadas();
                    int posAntigaR2_x = coordenadasR2[0];
                    int posAntigaR2_y = coordenadasR2[1];
                    Random numRandom = new Random();
                    try{
                        r1.mover(numRandom.nextInt(4)+1);
                        movR1=movR1+1;
                        tabuleiro.atribuir(r1, posAntigaR1_x, posAntigaR1_y, posicaoAliX, posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        Thread.sleep(600);
                    }catch(MovimentoInvalidoException e){
                        movInvR1++;
                    }
                    boolean win1 = r1.verificar(posicaoAliX, posicaoAliY);
                    if(win1==true){
                        System.out.println("Robo1 venceu");
                        System.out.println("Quantidade de Acertos/Erros do Robo 1: " + movR1 + " / " + movInvR1);
                        System.out.println("Quantidade de Acertos/Erros do Robo 2: " + movR2 + " / " + movInvR2);
                        verificador=true;
                        verificadorMaster=true;
                    }
                    try{
                        r2.mover(numRandom.nextInt(4)+1);
                        movR2=movR2+1;
                        tabuleiro.atribuir(r2, posAntigaR2_x, posAntigaR2_y, posicaoAliX, posicaoAliY);
                        tabuleiro.mostrarMatriz();
                        Thread.sleep(600);
                    }catch(MovimentoInvalidoException e){
                        movInvR2++;
                    }
                    boolean win2 = r2.verificar(posicaoAliX, posicaoAliY);
                    if(win2==true){
                        System.out.println("Robo2 venceu");
                        System.out.println("Quantidade de Acertos/Erros do Robo 1: " + movR1 + " / " + movInvR1);
                        System.out.println("Quantidade de Acertos/Erros do Robo 2: " + movR2 + " / " + movInvR2);
                        verificador=true;
                        verificadorMaster=true;
                    }
                }
            }catch(AlimentoInvalido e){
                System.out.println(e);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
