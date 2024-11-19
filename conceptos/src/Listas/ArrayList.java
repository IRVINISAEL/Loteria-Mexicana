package Listas;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements ListADT<T> {
    protected final int NOT_FOUND = -1;
    protected int rear;
    protected T[] list;

    private final int DEFAULT_CAPACITY = 50;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        rear = 0;
        list = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public boolean removeFirst() {
        return remove(list[0]);
    }

    public boolean removeLast() {
        return remove(list[rear - 1]);
    }

    public boolean remove(T element) {
        T result;
        int index = find(element);

        if (index == NOT_FOUND) {
            throw new NoSuchElementException("list");
        }
        result = list[index];
        rear--;
        for (int scan = index; scan < rear; scan++) {
            list[scan] = list[scan + 1];
        }
        list[rear] = null;
        return (boolean) result;
    }

    private int find(T element) {
        int scan = 0, result = NOT_FOUND;
        boolean found = false;

        if (!isEmpty()) {
            while (!found && scan < rear) {
                if (element.equals(list[scan])) {
                    found = true;
                } else {
                    scan++;
                }
            }
        }
        if (found) {
            result = scan;
        }
        return result;
    }

    public T first() {
        return list[0];
    }

    public T last() {
        return list[rear - 1];
    }

    public boolean contains(T target) {
        int scan = 0;
        @SuppressWarnings("unused")
        int result = NOT_FOUND;
        boolean found = false;

        if (!isEmpty()) {

            while (!found && scan < rear) {
                if (target.equals(list[scan])) {
                    found = true;
                } else {
                    scan++;
                }
            }
        }
        return found;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return rear;
    }

    public Iterator<T> iterator() {
            return null;

    }

    public String toString() {
        String lista = "";
        for (int i = 0; i < rear; i++) {
            lista = lista + list[i] + "-";
        }
        return lista;
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
