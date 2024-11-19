package Listas;

public interface IndexListADT<T> extends ListADT<T> {

    // insertar un elemento en la posicion del index
    public void add(int index, T element);

    // configura el elemento situado en un indice concreto
    public void set(int index, T element);

    // examina el elemento situado en un indice concreto
    public void get(int index);

    // determina el indice de un elemento de la lista
    public int indexOf(T element);

    // elimina el elemento situado en el indice concreto
    public T remove(int index);
}
