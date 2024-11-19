package Colecciones;

import java.util.Iterator;
import java.util.NoSuchElementException;

class ArrayIterator<T> implements Iterator<T> {
    private T[] items;
    private int count;
    private int current;

    public ArrayIterator(T[] elements, int size) {
        items = elements;
        count = size;
        current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < count;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T result = items[current];
        current++;
        return result;
    }
}
