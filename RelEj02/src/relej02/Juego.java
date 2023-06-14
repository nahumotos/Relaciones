/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relej02;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Juego {
   Revolver r;
   TreeSet <Jugador> jugadores;
   Jugador j;
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
    
   public void llenarJuego(ArrayList<Jugador>listaj, Revolver r){
      // r= new Revolver();
       jugadores = new TreeSet();
       for (int i = 0; i < listaj.size(); i++) {
           jugadores.add(listaj.get(i));
       }
   }
   
    public void ronda() {
        r = new Revolver();
        r.llenarR();
        boolean band = false;
        do {

            for (Jugador aux : jugadores) {
                if (aux.disparo(r)) {
                    System.out.println("se mojo " + aux.getNombre());
                    band = true;
                    break;
                }else{
                    System.out.println("NO se mojo " + aux.getNombre());       
             }
            }
        } while (!band);
    }
}
