/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.estructuras;

/**
 *
 * @author ACER
 */
public class NodoLista<E> {

    private E element;
    private NodoLista next;
    private NodoLista prev;
    // Constructor

    public NodoLista(E item) {
        this.element = item;
        this.next = null;
        this.prev = null;
    }

    public NodoLista() {
        this.next = null;
        this.prev = null;
        this.element = null;
    }

    /**
     * @return the element
     */
    public E getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(E element) {
        this.element = element;
    }

    /**
     * @return the next
     */
    public NodoLista getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoLista next) {
        this.next = next;
    }

    /**
     * @return the prev
     */
    public NodoLista getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(NodoLista prev) {
        this.prev = prev;
    }

}
