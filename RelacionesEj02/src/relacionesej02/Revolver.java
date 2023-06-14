/*

 */
package relacionesej02;

/**
 *
 * @author Usuario
 */
public class Revolver {
    private Double pactual; //(posición el tambor que se dispara
    private Double pagua; //(la posición de tambor donde se encuentra el agua

    public Revolver() {
       
        
    }

    public Revolver(Double pactual, Double pagua) {
        this.pactual = pactual;
        this.pagua = pagua;
    }

    public Double getPactual() {
        return pactual;
    }

    public void setPactual(Double pactual) {
        this.pactual = pactual;
    }

    public Double getPagua() {
        return pagua;
    }

    public void setPagua(Double pagua) {
        this.pagua = pagua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicion actual=" + pactual + ", posicion agua=" + pagua + '}';
    }
    
    Jugador j;
    public void llenarR(){
        Double pos = Math.random()*8;
        Double pos2 = Math.random()*8;
        setPactual(pos);
        setPagua(pos2);
        
    }
    public Boolean mojar(Jugador j){
        Boolean mojadoR;
        if (getPactual().equals(getPagua())) {
            mojadoR = true;
        }else
            mojadoR = false;
       //mojadoR=getPactual().equals(getPagua());
       j.setMojado(mojadoR);
       return mojadoR;
    }
    
    public void siguiente(){
       /* Double pos = Math.random();
        setPactual(pos);*/
        if (getPactual()==7) {
            this.pactual = (double)0;
            
        } else {
            this.pactual++;
        }
         
    }

   
   

    
    
}
