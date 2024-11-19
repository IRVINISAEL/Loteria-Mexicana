package Interfaz;

public class Main {
    public static void main(String[] args) {
        Suma s = new Suma();
        s.sumar(9, 7);
        System.out.println("El resutado es:" + s.resultado());

        MostrarResultado mr = new MostrarResultado();
        mr.imprimir(s, 15, 28);

    }

}