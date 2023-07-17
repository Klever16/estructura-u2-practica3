/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurau2arbolescontactos.controller;

import estructurau2arbolescontactos.models.Contacto;
import estructurau2arbolescontactos.models.Nodo;

/**
 *
 * @author ESTUDIANTE
 */
public class ArbolContactos {
    private Nodo raiz;
    private Contacto contacto;
    
    public ArbolContactos(){
        this.raiz = null;
    }
    
    public void insert(Contacto newContacto){
        if(raiz == null){
            raiz = new Nodo(contacto, raiz, raiz);
        }else{
            insertarRecursivo(raiz, newContacto);
        }
    }
    private void insertarRecursivo(Nodo nodo, Contacto newContacto){
        
        if(newContacto.getNombre().compareTo(nodo.getContacto().getNombre()) < 0){
            if(nodo.getLeft() == null){
                nodo.setLeft(new Nodo(contacto, nodo, raiz));
            }else{
                insertarRecursivo(nodo.getLeft(), newContacto);
            }
        
        }else if(newContacto.getNombre().compareTo(nodo.getContacto().getNombre()) > 0){
            if(nodo.getRigth() == null){
                nodo.getRigth(new Nodo(contacto, nodo, raiz));
            }else {
                insertarRecursivo(nodo.getRigth(), newContacto);
            }
            
        }else{
            ////Si el nombre del contacto nuevo es igual a uno existente 
        }
    }
    public boolean estaEquilibrado(){
        return verificarBalance(raiz);
    }
    private boolean verificarBalance(Nodo nodo){
        if(nodo == null){
            return true; //// arbol vacio, se considera equilibrado
        }
        
        int alturaIzquierda = obtenerAltura(nodo.getLeft());
        int alturaDerecha = obtenerAltura(nodo.getRigth());
                
        int diferencia = Math.abs( alturaIzquierda - alturaDerecha);
     /// verificamos la diferencia de  las altura
        if (diferencia > 1){
            return false;
        }
        
        return verificarBalance(nodo.getLeft()) && verificarBalance(nodo.getRigth());
        
    }
    private int obtenerAltura(Nodo nodo){
        if(nodo == null){
            return 0;
        }
        int alturaIzquierda = obtenerAltura(nodo.getLeft());
        int alturaDerecha = obtenerAltura(nodo.getRigth());
        
        return Math.max(alturaDerecha, alturaDerecha)+1;
    }
    
}
