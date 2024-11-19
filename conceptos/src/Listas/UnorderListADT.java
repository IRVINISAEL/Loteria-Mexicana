package Listas;

public interface UnorderListADT<T> extends ListADT<T> {

    // añade un elemento especificado al inicio de la lista
    public void addToFront(T element);

    // añade un elemento especificado al final de la lista
    public void addToRear(T element);

    // agrega un elemento despues de otro elemento especificado
    public void addAfter(T element, T target);

}
