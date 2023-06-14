/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesej03;

import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Carta {

    private Integer ncarta;
    private Palo palo;
     List<Carta> descartadas= new ArrayList();
     List<Carta> baraja;
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    public Carta() {

    }

    public Carta(Integer ncarta, Palo palo) {
        this.ncarta = ncarta;//1 y 12 (el 8 y el 9 no los incluimos)
        this.palo = palo;//(espadas, bastos, oros y copas).
    }

    public Integer getNcarta() {
        return ncarta;
    }

    public void setNcarta(Integer ncarta) {
        this.ncarta = ncarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }
    
    @Override
    public String toString() {
        return "Carta{" + "ncarta=" + ncarta + ", palo=" + palo.getPinta() + '}';
    }

    public void crearbaraja() {
      
       baraja = new ArrayList();
        ncarta = 1;
        for (Palo aux : Palo.values()) {
            for (int i = 1; i < 13; i++) {
                if (i == 8 || i == 9) {

                } else {

                    baraja.add(new Carta(i, aux));
                }
            }
        }
    }

    public void barajar() {
        shuffle(baraja);
    }

    public void siguienteCarta() {
        //baraja.clear();
        if (baraja.isEmpty()) {

        } else {
            descartadas.add(baraja.get(0));
            System.out.println(baraja.get(0));
            // baraja.remove(0);
        }
    }

    public void mostrarbaraja() {
        if (!baraja.isEmpty()) {
            for (Carta aux : baraja) {
                System.out.println(aux.toString());
            }
        } else {
            System.out.println("No hay cartas");
        }

    }

    public void cartasDisponibles() {
        System.out.println("cartas disponibles: " + baraja.size());

    }

    public void darcartas() {

        System.out.println("cuantas cartas quiere quitar?");
        int op = leer.nextInt();
        if (op <= baraja.size()) {
           
            for (int i = 0; i < op; i++) {
                System.out.println(this.baraja.get(0));
                descartadas.add(baraja.get(0));
                baraja.remove(0);
            }
        } else {
            System.out.println("la baraja no tiene suficientes cartas");
        }

    }

    public void cartasMonton() {
        if (!descartadas.isEmpty()) {
            for (Carta aux : descartadas) {
                System.out.println(aux);
            }
        } else {
            System.out.println("No hay cartas");

        }
    }
}
