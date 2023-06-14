package ejercicio1;

import ejercicio1.entidad.Perro;
import ejercicio1.entidad.Persona;
import ejercicio1.entidad.servi.ServicioPersonayPerro;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/

        ServicioPersonayPerro s = new ServicioPersonayPerro();
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        int op;
        do {
            System.out.println("1. crear persona");
            System.out.println("2. crear perro");
            System.out.println("3. lista personas");
            System.out.println("4. lista perros");
            System.out.println("5. adoptar perros");
            System.out.println("6. salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    s.crearPersona();
                    break;
                case 2:
                    s.crearPerro();
                    break;
                case 3:
                    s.mostrarPersona();
                    break;
                case 4:
                    s.mostrarPerro();
                    break;
                case 5:
                    s.agregarpp();
                    break;

            }
        } while (op!=6);

    }

}
