package Listas;

public interface OrderedListADT<T> extends ListADT<T> {

    // add-- añade unelemento especificado
    // a la lista en la ubicacion adecuada
    public void add(T element);
}
