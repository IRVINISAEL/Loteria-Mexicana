package Listas;

public class Inventario extends ArrayOrderList<Producto> {

    public Producto buscarPorID(int id) {
        for (Producto p : this) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void eliminarPorID(int id) {
        Producto encontrado = buscarPorID(id);
        if (encontrado != null) {
            this.remove(encontrado);
            System.out.println("producto eliminado: " + encontrado);
        } else {
            System.out.println("producto con ID " + id + " no se encontro");
        }
    }

    public void buscarPorCategoria(String categoria) {
        boolean encontrado = false;
        for (Producto p : this) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(p);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("estos productos, nose encontraron de esta categoria : " + categoria);
        }
    }
}
