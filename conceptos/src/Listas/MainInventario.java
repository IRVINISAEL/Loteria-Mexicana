package Listas;

public class MainInventario {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.add(new Producto("Victus GAming", 1, "Laptops", 20500.99));
        inventario.add(new Producto("samsung", 3, "Tabletas", 8000.99));
        inventario.add(new Producto("Lenovo 2024", 4, "Laptops", 7000.00));
        inventario.add(new Producto("Motorola Pro", 6, "Smartphones", 7560.00));
        inventario.add(new Producto("Nokia", 5, "Smartphones", 1600.00));
        inventario.add(new Producto("iPhone 12", 2, "Smartphones", 1000.00));

        System.out.println("inventario");
        for (Producto p : inventario) {
            System.out.println(p);
        }

        System.out.println("\nproducto buscado por id 5:");
        Producto p = inventario.buscarPorID(5);
        System.out.println(p != null ? p : "producto no encontrado");

        System.out.println("\nproductos buscados de categoria'Laptops':");
        inventario.buscarPorCategoria("Laptops");

        System.out.println("\nproducto eliminado :id 2");
        inventario.eliminarPorID(2);

        System.out.println("\nproducto eliminado :id 8");
        inventario.eliminarPorID(8);

        System.out.println("\nactualizacion de inventario");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }
}
