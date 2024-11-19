import java.util.Random;
public class RoboInteligente extends Robo {
    boolean errou = false;
    public RoboInteligente(String cor){
        super(cor);
    }
    @Override
    public void mover(String movimento) throws MovimentoInvalidoException{
        try{
            super.mover(movimento);
        }catch(MovimentoInvalidoException e){
            if(!errou){
                errou = true;
                throw e;
            }
            Random r = new Random();
            String[] casos = {"up", "down", "right", "left"};
            while(errou){
                try{
                    super.mover(casos[r.nextInt(4)]);
                
                    errou = false;
                }catch(MovimentoInvalidoException err)
                { }
            }
        }
    }
    @Override
    public void mover(int movimento) throws MovimentoInvalidoException{
        try{
            super.mover(movimento);
        }catch(MovimentoInvalidoException e){
            if(!errou){
                errou = true;
                throw e;
            }
            Random r = new Random();
            int[] casos = {1, 2, 3, 4};
            while(errou){
                try{
                    super.mover(casos[r.nextInt(4)]);
                
                    errou = false;
                }catch(MovimentoInvalidoException err)
                { }
            }
        }
    }
}
