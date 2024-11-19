package Interfaz;

public class MostrarResultado {

    public void imprimir(Interfaz objeto, int a, int b) {
        objeto.sumar(a, b);
        System.out.println(objeto.resultado());
    }
}