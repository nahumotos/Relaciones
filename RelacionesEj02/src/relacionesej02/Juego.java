/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesej02;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Juego {
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador>jugadores= new ArrayList();
    Revolver r= new Revolver();;
    Jugador j;
    public void llenarjuego(ArrayList<Jugador>jugadores, Revolver r) {
        
            for (int i = 0; i < jugadores.size(); i++) {
                jugadores.add(j);
        }
      
        
    }
   public void ronda() {
        do {
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println(jugadores.get(i).getNombre());
                j.disparo(r);
                if (r.mojar(j)) {
                    System.out.println("se mojo"+jugadores.get(i).getNombre());
                    break;
                }
            }
        } while (!r.mojar(j));
    }
}
