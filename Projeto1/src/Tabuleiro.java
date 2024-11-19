import java.util.ArrayList;

public class Tabuleiro{
    private String tabuleiro [] [] = new String[5][5];
    public Tabuleiro(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                tabuleiro[i][j]="   ";
            }
        }
    }
    public void atribuir(Robo robo,int posAntiga_x,int posAntiga_y,int posicaoAliX, int posicaoAliY) throws AlimentoInvalido{
        if(posicaoAliX<0||posicaoAliX>4||posicaoAliY<0||posicaoAliY>4){
            throw new AlimentoInvalido(posicaoAliX, posicaoAliY);
        }
        tabuleiro[posicaoAliX][posicaoAliY]= "0  ";
        String posicaoAntigaString= tabuleiro[posAntiga_x][posAntiga_y].strip();
        if(posicaoAntigaString.length()==2){
            char corRobo = robo.getCor().charAt(0);
            posicaoAntigaString =  posicaoAntigaString.replace(corRobo, ' ');
            tabuleiro[posAntiga_x][posAntiga_y]=posicaoAntigaString+" ";
        }
        else{
        tabuleiro[posAntiga_x][posAntiga_y]="   ";
        }
        int [] coordenadas = robo.getCoordenadas();
        int x = coordenadas[0];
        int y = coordenadas[1];
        String espacoVazio = tabuleiro[x][y];
        if(espacoVazio.equals("   ")==true){
            tabuleiro[x][y]=robo.getCor().charAt(0) + "  ";
        }   
        if(espacoVazio.equals("   ")==false){
            String cor = tabuleiro[x][y].strip();
            tabuleiro[x][y]= cor + robo.getCor().charAt(0)+ " ";
        }
    }
    public void mostrarMatriz(){
        ArrayList<String> linhaI = new ArrayList<>(); 
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                linhaI.add(this.tabuleiro[i][j]);
            }
            System.out.println(linhaI);
            linhaI= new ArrayList<>();
        }
        System.out.println("=================================");
    }
}