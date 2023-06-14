/*

 */
package relej02;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Jugador implements Comparable<Jugador>{
     private Integer id;
     private String nombre;
     private boolean mojado;
     ArrayList<Jugador> listaj;
     java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    public Jugador() {
        
        
    }

    public Jugador(Integer id, boolean mojado) {
        this.id = id;
        this.nombre = "jugador "+id;
        this.mojado = mojado;
    }

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public ArrayList<Jugador> getListaj() {
        return listaj;
    }

    public void setListaj(ArrayList<Jugador> listaj) {
        this.listaj = listaj;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + ", listaj=" + listaj + '}';
    }

    public boolean disparo(Revolver r) {

        if (r.mojar()) {
            this.mojado = true;
            
        } else {
            this.mojado = false;
             r.siguienteChorro();
        }
        //this.mojado = r.mojar());

        return this.mojado;
    }
   public void llenararray(){
       listaj = new ArrayList();
         System.out.println("Cuantos jugadores son?");
       int cant = leer.nextInt();
       if (cant>6) {
           cant=6;
       }
       for (int i = 1; i < cant+1; i++) {
            listaj.add(new Jugador(i, false));
        }

   }

    @Override
    public int compareTo(Jugador t) {
        return this.getId().compareTo(t.getId());
    }
}
