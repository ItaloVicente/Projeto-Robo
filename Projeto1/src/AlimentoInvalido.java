public class AlimentoInvalido extends Exception {
    private int posx;
    private int posy;
    public AlimentoInvalido(int x,int y){
        this.posx=x;
        this.posy=y;
    }
    public String toString (){
        System.out.println("Alimento nao pode ficar na posicao X: " + posx + " Y: " + posy);
        return ""; 
    }
}
