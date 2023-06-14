/*

 */
package relacionesej02;

/**
 *
 * @author Usuario
 */
public class Jugador {
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        private int id;
        private String nombre;
        private Boolean mojado;

    public Jugador() {
         System.out.println("Indique la cantidad de jugadores");
        int cantj = leer.nextInt();
        for (int i = 0; i < cantj; i++) {
           Jugador j = new Jugador(i);
            
        }
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador"+id;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
     public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void disparo( Revolver r){
        //Revolver r = new Revolver();
        if (r.mojar(this)) {
            System.out.println("Te mojaste");
        }else{   
        r.siguiente();
        
      }   
    }
        
        

    

        
        
}
