/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurau2arbolescontactos.models;

/**
 *
 * @author ESTUDIANTE
 */
public class Nodo {
    private Contacto contacto;
    private Nodo left;
    private Nodo rigth;

    public Nodo(Contacto contacto, Nodo left, Nodo rigth) {
        this.contacto = contacto;
        left = null;
        rigth = null;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRigth() {
        return rigth;
    }

    public void setRigth(Nodo rigth) {
        this.rigth = rigth;
    }

    @Override
    public String toString() {
        return "Nodo{" + "contacto=" + contacto + ", left=" + left + ", rigth=" + rigth + '}';
    }
    
    
    
}
