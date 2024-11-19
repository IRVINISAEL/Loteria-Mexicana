package Colecciones;

import java.util.Iterator;

interface SetADT<T> {
    void add(T element);

    void addAll(SetADT<T> set);

    T removeRandom();

    T remove(T element);

    SetADT<T> union(SetADT<T> set);

    boolean contains(T element);

    boolean equals(SetADT<T> set);

    boolean isEmpty();

    int size();

    Iterator<T> iterator();
}