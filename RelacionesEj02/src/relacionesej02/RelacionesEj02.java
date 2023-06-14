/*

 */
package relacionesej02;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class RelacionesEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        ArrayList<Jugador> jugadores= new ArrayList();
        Revolver r= new Revolver();
        Jugador j;
        juego.llenarjuego(jugadores, r);
        juego.ronda();
        
    }
    
}
