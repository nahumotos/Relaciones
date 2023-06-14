/*
 
 */
package relej02;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class RelEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revolver r = new Revolver();
        Jugador j = new Jugador();
        Juego juego = new Juego();
        j.llenararray();
        juego.llenarJuego(j.getListaj(),r);
        juego.ronda();
        
                
    }
 
    }
    

