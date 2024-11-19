package Colecciones;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

@SuppressWarnings("unused")
public class Loteria {
    public static void main(String[] args) {
        // Crear conjunto para las cartas de la lotería
        ArraySet<Carta> loteria = new ArraySet<>();

        // Agregar las cartas de la lotería mexicana
        String[] nombresCartas = {
            "El Gallo", "El Diablito", "La Dama", "El Catrín", "El Paraguas",
            "La Sirena", "La Escalera", "La Botella", "El Barril", "El Árbol",
            "El Melón", "El Valiente", "El Gorrito", "La Muerte", "La Pera",
            "La Bandera", "El Bandolón", "El Violoncello", "La Garza", "El Pájaro",
            "La Mano", "La Bota", "La Luna", "El Cotorro", "El Borracho",
            "El Negrito", "El Corazón", "La Sandía", "El Tambor", "El Camarón",
            "Las Jaras", "El Músico", "La Araña", "El Soldado", "La Estrella",
            "El Cazo", "El Mundo", "El Apache", "El Nopal", "El Alacrán",
            "La Rosa", "La Calavera", "La Campana", "El Cantarito", "El Venado",
            "El Sol", "La Corona", "La Chalupa", "El Pino", "El Pescado",
            "La Palma", "La Maceta", "El Arpa", "La Rana"
        };

        // Agregar cartas al conjunto
        for (String nombre : nombresCartas) {
            loteria.add(new Carta(nombre));
        }  

        // Imprimir las cartas en el orden en que se agregaron
        System.out.println("Cartas agregadas:");
        System.out.println(loteria);

        // Sacar y mostrar cartas de manera aleatoria
        System.out.println("\nCartas en orden aleatorio:");
        while (!loteria.isEmpty()) {
            System.out.println(loteria.removeRandom());
        }
    }
}