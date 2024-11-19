package Listas;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private int id;
    private String categoria;
    private double precio;

    public Producto(String nombre, int id, String categoria, double precio) {
        this.nombre = nombre;
        this.id = id;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto otro) {
        return Integer.compare(this.id, otro.id);
    }

    @Override
    public String toString() {
        return "producto (id:" + id + ",nombre: " + nombre + ",categoria: " + categoria + ",precio: " + precio + " $)";
    }
}
