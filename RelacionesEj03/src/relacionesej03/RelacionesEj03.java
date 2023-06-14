/*
 
 */
package relacionesej03;





/**
 *
 * @author Usuario
 */
public class RelacionesEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carta c = new Carta();
        int opc;
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        c.crearbaraja();
       do {
            System.out.println("Que desea realizar?");
            System.out.println("---------------");
            System.out.println("1) Barajar");
            System.out.println("2) Siguiente Carta");
            System.out.println("3) Ver Cartas Disponibles");
            System.out.println("4) Dar Cartas");
            System.out.println("5) Ver Descartadas");
            System.out.println("6) Ver Baraja");
            System.out.println("7) Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    c.barajar();
                    break;
                case 2:
                    c.siguienteCarta();
                    break;
                case 3:
                    c.cartasDisponibles();
                    break;
                case 4:
                    c.darcartas();
                    break;
                case 5:
                    c.cartasMonton();
                    break;
                case 6:
                    c.mostrarbaraja();
                    break;

            }
            System.out.println("");
            System.out.println("");
        } while (opc != 7);

    }
}
