package Listas;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayOrderList<T> implements OrderedListADT<T>, Iterable<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] list; // Arreglo para almacenar elementos
    private int rear; // Número de elementos en la lista

    @SuppressWarnings("unchecked")
    public ArrayOrderList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
        rear = 0;
    }

    @Override
    public void add(T elemento) {
        if (!(elemento instanceof Comparable)) {
            throw new IllegalArgumentException("El elemento debe implementar Comparable.");
        }

        @SuppressWarnings("unchecked")
        Comparable<T> comparableElemento = (Comparable<T>) elemento;

        int posicion = 0;
        while (posicion < rear && comparableElemento.compareTo(list[posicion]) > 0) {
            posicion++;
        }

        if (rear == list.length) {
            expandCapacity();
        }

        for (int i = rear; i > posicion; i--) {
            list[i] = list[i - 1];
        }

        list[posicion] = elemento;
        rear++;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        T[] nuevoArreglo = (T[]) new Object[list.length * 2];
        System.arraycopy(list, 0, nuevoArreglo, 0, list.length);
        list = nuevoArreglo;
    }

    @Override
    public boolean remove(Object obj) {
        int index = -1;

        for (int i = 0; i < rear; i++) {
            if (list[i].equals(obj)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        for (int i = index; i < rear - 1; i++) {
            list[i] = list[i + 1];
        }

        list[rear - 1] = null; 
        rear--; 
        return true;
    }

    public int size() {
        return rear;
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < rear;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return list[current++];
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < rear; i++) {
            sb.append(list[i]);
            if (i < rear - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public boolean removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    @Override
    public T first() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'first'");
    }

    @Override
    public T last() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'last'");
    }

    @Override
    public boolean contains(T target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public boolean isEmprty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmprty'");
    }

    @Override
    public Iterator<T> itereator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itereator'");
    }
}
