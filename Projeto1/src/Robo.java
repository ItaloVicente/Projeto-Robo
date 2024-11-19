public class Robo{
    protected String cor;
    protected int[]coordenadas = new int[2];
    public Robo(String cor) {
        this.cor = cor;
        this.coordenadas[0]=4;
        this.coordenadas[1]=0;
    }
    public void mover (String m) throws MovimentoInvalidoException {
        int x = coordenadas[0];
        int y = coordenadas[1];
        if (m=="up"){
            coordenadas[0]--;
        }else if (m=="down"){
            coordenadas[0]++;
        }else if (m=="left"){
            coordenadas[1]--;
        }else if (m=="right"){
            coordenadas[1]++;
        }
        if (coordenadas[0]<0 || coordenadas[1]<0 || coordenadas[0]>4 || coordenadas[1]>4){
            coordenadas[0] = x;
            coordenadas[1] = y;
            throw new MovimentoInvalidoException(x, y);
        }
        
    }
    public void mover (int m) throws MovimentoInvalidoException{
        if(m==1){
            mover("up");
        }
        if(m==2){
            mover("down");
        }
        if(m==3){
            mover("right");
        }
        if(m==4){
            mover("left");
        }
    }
    public boolean verificar(int x, int y){
        if(x==coordenadas[0] && y==coordenadas[1]){
            return true;
        }
        return false;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int[] coordenadas) {
        this.coordenadas = coordenadas;
    }
}