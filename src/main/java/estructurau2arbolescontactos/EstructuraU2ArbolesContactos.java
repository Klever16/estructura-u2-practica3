/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estructurau2arbolescontactos;

import estructurau2arbolescontactos.controller.ArbolContactos;
import estructurau2arbolescontactos.models.Contacto;

/**
 *
 * @author ESTUDIANTE
 */
public class EstructuraU2ArbolesContactos {
    
    
    ArbolContactos arbol = new ArbolContactos();

    public static void main(String[] args) {
        Contacto c1 = new Contacto("Juan", "12345");
        Contacto c2 = new Contacto("Juan", "12345");
        Contacto c3 = new Contacto("Juan", "12345");
        Contacto c4 = new Contacto("Juan", "12345");
        
        arbol.insert(c2);
        arbol.insert(c2);
        arbol.insert(c3);
        arbol.insert(c4);
        arbol.insert(new Contacto("Juliana","12345"));
        arbol.insert(new Contacto("Jhon", "12345"));
        
        
    }
}