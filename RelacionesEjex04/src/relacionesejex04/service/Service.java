/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesejex04.service;

import java.util.ArrayList;
import java.util.List;
import relacionesejex04.entidades.Alumno;

/**
 *
 * @author Usuario
 */
public class Service {

    List<Alumno> listaa;
    List<String> nombres = new ArrayList();
    List<String> apellidos = new ArrayList();
    Alumno a;
    int cant;
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    public void llenararray() {
        nombres.add("Nahuel ");
        nombres.add("Lionel ");
        nombres.add("Julian ");
        nombres.add("Lautaro ");
        nombres.add("Alejo ");
        apellidos.add("Messi");
        apellidos.add("Martinez");
        apellidos.add("Alvarez");
        apellidos.add("Motos");
        apellidos.add("Memoli");
    }

    public void crearAlmuno() {
        int xn;
        int xap;

        System.out.println("cuantos alumnos quiere ingresar?: ");
        cant = leer.nextInt();

        for (int i = 0; i < cant; i++) {
            a = new Alumno();
            xap = (int) (Math.random() * 5);
            xn = (int) (Math.random() * 5);
            a.setNombre(nombres.get(xn) + apellidos.get(xap));
            listaa.add(a);
        }
    }

    public void creardni() {
        int rdni;
        for (int i = 0; i < cant; i++) {

            rdni = 0;
            do {
                rdni = (int) (Math.random() * 99999999);

            } while (rdni < 9999999);
            listaa.get(i).setDni(rdni);

        }
    }

    public void crearlista() {
        listaa = new ArrayList();
        crearAlmuno();
        creardni();
    }

    public void mostrar() {
        for (Alumno aux : listaa) {
            System.out.println(aux.getNombre());
            System.out.println(aux.getDni());
        }

    }
}
