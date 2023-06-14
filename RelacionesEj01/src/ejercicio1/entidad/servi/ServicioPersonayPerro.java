package ejercicio1.entidad.servi;

import ejercicio1.entidad.Perro;
import ejercicio1.entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioPersonayPerro {

    
    Persona persona;
    Perro perro;
    Scanner cr = new Scanner(System.in).useDelimiter("\n");
    List<Persona> lpersona = new ArrayList();
    List<Perro> lperro = new ArrayList();
    public ServicioPersonayPerro() {
        persona = new Persona();
        perro = new Perro();
    }

    //y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.
    public Persona crearPersona() {
        persona=new Persona();
        System.out.println("Ingresar nombre: ");
        persona.setNombre(cr.next());
        System.out.println("Ingresar apellido: ");
        persona.setApellido(cr.next());
        System.out.println("Ingresar edad: ");
        persona.setEdad(cr.nextInt());
        System.out.println("Ingresar documento: ");
        persona.setDocumento(cr.nextLong());
       // persona.setPerro(crearPerro());
       lpersona.add(persona);
        return persona;
    }
    //Perro, que tendrá como atributos: nombre, raza, edad y tamaño;

    public Perro crearPerro() {
        perro = new Perro();
        System.out.println("Ingresar nombre perro: ");
        perro.setNombre(cr.next());
        System.out.println("Ingresar raza: ");
        perro.setRaza(cr.next());
        System.out.println("Ingresar edad: ");
        perro.setEdad(cr.nextInt());
        System.out.println("Ingresar tamaño: ");
        perro.setTamanio(cr.nextDouble());
        lperro.add(perro);
        return perro;
    }
    public void  mostrarPersona(){
        System.out.println("Lista de personas");
        for (Persona aux : lpersona) {
            if (aux.getPerro()!=null) {
                System.out.println(aux.getNombre()+" perro: "+aux.getPerro().getNombre());
            }else{
            System.out.println(aux.getNombre()+" no tiene perro ");
            }
        }
       
    }
    public void  mostrarPerro(){
        System.out.println("Lista de perros en adopcion: ");
        for (Perro aux : lperro) {
            System.out.println(aux.getNombre());
        }
    }
    public void agregarpp(){
        boolean cd= false ;
        mostrarPersona();
        System.out.println("ingrese su nombre: ");
        String n = cr.next();
        mostrarPerro();
        System.out.println("Que perro desea adoptar: ");
        String adp= cr.next();
        for (Perro aux : lperro) {
            if (adp.equals(aux.getNombre())) {
                perro=aux;
            }
            
        }
        
        for (int i = 0; i < lpersona.size(); i++) {
            if (n.equals(lpersona.get(i).getNombre())&&(lpersona.get(i).getPerro()==null)) {
                lpersona.get(i).setPerro(perro);
                System.out.println("se adopto el perro");
                lperro.remove(perro);
                cd = true;
            }
            
        }
        if (!cd) {
            System.out.println("no se pudo adoptar el perro");
        }
    }
}
