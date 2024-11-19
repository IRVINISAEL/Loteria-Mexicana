package Listas;


public interface UnorderedListADT <T> extends ListADT<T>{
    
    //addFront anade un elemento al inicio de la lista
    public void addFront(T element);

    //addToRear anade un ekemento al final de la lista
    public void addToRear(T element);

    //addAfter = agrega un elemento despues de otro especificado
    public void addToRear(T element, T target);

    //
}
