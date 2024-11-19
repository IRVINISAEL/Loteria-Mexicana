package Recursividad;

public class Recursiva {

    // Sumatoria de un número
    public int sumatoria(int num) {
        int resultado;

        if (num == 1) {
            resultado = 1;
        } else {
            resultado = num + sumatoria(num - 1);
        }
        return resultado;
    }

    // Método factorial de un número
    public int factorial(int num) {
        int resultado;

        if (num == 1) {
            resultado = 1;
        } else {
            resultado = num * factorial(num - 1);
        }
        return resultado;
    }

    // Método recursivo para calcular el n-ésimo número de Fibonacci
    public int fibonasi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonasi(n - 1) + fibonasi(n - 2);
        }
    }

    // Método recursivo para calcular la potencia de un número (base^exp)
    public int potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * potencia(base, exp - 1);
        }
    }
}
