/*
 
 */
package relej02;

/**
 *
 * @author Usuario
 */
public class Revolver {
    
    private int pActual;
    private int pAgua;

    public Revolver() {
    }

    public Revolver(int pActual, int pAgua) {
        this.pActual = pActual;
        this.pAgua = pAgua;
    }

    public int getpActual() {
        return pActual;
    }

    public void setpActual(int pActual) {
        this.pActual = pActual;
    }

    public int getpAgua() {
        return pAgua;
    }

    public void setpAgua(int pAgua) {
        this.pAgua = pAgua;
    }
    

    @Override
    public String toString() {
        return "Revolver{" + "pActual=" + pActual + ", pAgua=" + pAgua + '}';
    }
    
    
    public void llenarR(){
        pActual =(int) (Math.random()*8+1);
        pAgua = (int)(Math.random()*8+1);
        
    }
    public boolean mojar(){
        
        return pActual==(pAgua);
    }
    public void siguienteChorro(){
        if (pActual>8) {
            pActual=1;
        }else{
             pActual++;
        }
       
    }
}
