/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesejex04.entidades;

/**
 *
 * @author Usuario
 */
public class Alumno {
    private String nombre;
    private int dni;
    private int cantvotos;

    public Alumno() {
    }

    public Alumno(String nombre, int dni, int cantvotos) {
        this.nombre = nombre;
        this.dni = dni;
        this.cantvotos = cantvotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantvotos() {
        return cantvotos;
    }

    public void setCantvotos(int cantvotos) {
        this.cantvotos = cantvotos;
    }
    
}
