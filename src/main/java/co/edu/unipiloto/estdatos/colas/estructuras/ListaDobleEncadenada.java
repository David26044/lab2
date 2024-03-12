/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.estructuras;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author ACER
 */
public class ListaDobleEncadenada<E> implements Iterable<E> {

    private NodoLista first;
    private NodoLista last;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E element) {
        NodoLista temp = new NodoLista(element);
        if (isEmpty()) {
            first = temp;
            last = temp;
        } else {
            temp.setNext(first);
            first.setPrev(temp);
            first = temp;
        }
        size++;
    }

    public void addLast(E element) {
        NodoLista temp = new NodoLista(element);
        if (isEmpty()) {
            first = temp;
            last = temp;
        } else {
            temp.setPrev(last);
            last.setNext(temp);
            last = temp;
        }
        size++;

    }

    //metodo para budcar con el indice
    public E search(int index) {
        NodoLista temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return (E) temp.getElement();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E element = (E) first.getElement();
        NodoLista temp = first;
        first = null;
        first = first.getNext();
        size--;
        return element;
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E element = (E) last.getElement();
        NodoLista temp = last;
        temp = null;
        last = last.getPrev();
        last.setNext(null);
        size--;
        return element;
    }

    public NodoLista first() {
        return first;
    }

    public NodoLista last() {
        return last;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return new ColaIterator();

    }

    private class ColaIterator implements Iterator<E> {

        private NodoLista<E> actual = first;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return actual != null;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            E ret = actual.getElement();
            actual = actual.getNext();
            return ret;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub

        }

    }
}
