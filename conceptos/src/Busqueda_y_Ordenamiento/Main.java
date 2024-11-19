package Busqueda_y_Ordenamiento;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer[] numeros = {2, 5, 8, 6, 4, 3, 0, 9, 7};
        SortingAndSearch<Integer> s = new SortingAndSearch<>();
        System.out.println(s.linearSearch(numeros, 0, numeros.length - 1, 5));

        String[] nombres = {"juan", "luis", "alan", "paola"};
        SortingAndSearch<String> n = new SortingAndSearch<>();
        System.out.println(n.linearSearch(nombres, 0, nombres.length - 1, "pedro")); 

        Integer[] numeros2 = {2, 4, 5, 8, 14, 16, 18, 19, 20, 21, 28, 53};
        System.out.println(s.binarySearch(numeros2, 0, numeros2.length - 1, 49));

        s.selectionSort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ordenacion por seleccion: " + numeros[i]);
        }

        s.insertionSort(numeros2);
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("ordenacion por insercion: " + numeros2[i]);
        }

        s.bubbleSort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ordenacion por burbuja: " + numeros[i]);
        }

        s.quickSort(numeros, 0, numeros.length - 1);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ordenacion rapida: " + numeros[i]);
        }

        s.mergeSort(numeros, 0, numeros.length - 1);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ordenacion x mezcla: " + numeros[i]);
        }

        ArrayList<Integer> a = new ArrayList<>();
    }
}
