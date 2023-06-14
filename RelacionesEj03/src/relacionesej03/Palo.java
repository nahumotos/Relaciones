/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package relacionesej03;

/**
 *
 * @author Usuario
 */
public enum Palo {
    ESPADA("espada"),BASTOS("bastos"),COPA("copa"),ORO("oro");
    private String pinta;

    private Palo() {
    }

    private Palo(String pinta) {
        this.pinta = pinta;
    }

    public String getPinta() {
        return pinta;
    }

    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

   
    
}
