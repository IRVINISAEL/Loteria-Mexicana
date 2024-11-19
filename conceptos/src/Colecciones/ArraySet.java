package Colecciones;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Random;

class ArraySet<T> implements SetADT<T> {
    private final int DEFAULT_CAPACITY = 50;
    @SuppressWarnings("unused")
    private final int NOT_FOUND = -1;
    private int count;
    private T[] elements;
    private Random rand = new Random();

    @SuppressWarnings("unchecked")
    public ArraySet() {
        count = 0;
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArraySet(int initialCapacity) {
        count = 0;
        elements = (T[]) new Object[initialCapacity];
    }

    @Override
    public void add(T element) {
        if (!contains(element)) {
            if (size() == elements.length) {
                expandCapacity();
            }
            elements[count] = element;
            count++;
        }
    }

    private void expandCapacity() {
        @SuppressWarnings("unchecked")
        T[] larger = (T[]) new Object[elements.length * 2];
        for (int index = 0; index < elements.length; index++) {
            larger[index] = elements[index];
        }
        elements = larger;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T removeRandom() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int choice = rand.nextInt(count);
        T result = elements[choice];
        elements[choice] = elements[count - 1];
        elements[count - 1] = null;
        count--;
        return result;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(elements, count);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(elements[i]).append("\n");
        }
        return result.toString();
    }

    @Override
    public void addAll(SetADT<T> set) {
        // Método no implementado
    }

    @Override
    public T remove(T element) {
        // Método no implementado
        return null;
    }

    @Override
    public SetADT<T> union(SetADT<T> set) {
        // Método no implementado
        return null;
    }

    @Override
    public boolean equals(SetADT<T> set) {
        // Método no implementado
        return false;
    }
}