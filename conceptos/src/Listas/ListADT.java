package Listas;

import java.util.Iterator;

public interface ListADT<T> {

    public boolean removeFirst();

    public boolean removeLast();

    public boolean remove(T element);

    // examina el primer elemento de la lista
    public T first();

    // examina el ultimo elemento de la lista
    public T last();

    // determinar si la lista contiene un valor especifico
    public boolean contains(T target);

    public boolean isEmprty();

    public int size();

    public Iterator<T> itereator();

    public String toString();

}
