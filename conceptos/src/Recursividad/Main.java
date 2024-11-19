package Recursividad;

public class Main {
    public static void main(String[] args) {
        Recursiva r = new Recursiva();

        // Pruebas en los metodos
        System.out.println("La sumatoria ascendente es: " + r.sumatoria(5));
        System.out.println("El factorial del número es: " + r.factorial(5));
        
        System.out.println("El sexto número de Fibonacci es: " + r.fibonasi(6));
        System.out.println("La potencia de 2^4 es: " + r.potencia(2, 4));

        TowerOfHanoi tower = new TowerOfHanoi(3);
        tower.solve();
    }
}
