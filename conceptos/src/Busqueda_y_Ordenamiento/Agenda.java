package Busqueda_y_Ordenamiento;
import java.util.Scanner;
public class Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Contact[] friends = {
            new Contact("Mario", "Mendez", "223811564885"),
            new Contact("Luigui", "Lormendez", "23811564877"),
            new Contact("Sonia", "Castillo", "23811564865"),
            new Contact("Marcus", "Martinez", "2381156455"),
            new Contact("Espiderman", "Lopez", "2381156484"),
            new Contact("Carlos", "MGomez", "23811564835"),
            new Contact("Lucas", "Couila", "2381156482"),
            new Contact("Mani", "Mar", "2381156484"),
            new Contact("saul", "ocmadno", "23811564835"),
            new Contact("luz", "xzhithlauh", "2381156482")
        };SortingAndSearch<Contact> lista = new SortingAndSearch<>();


        while (true) {
            System.out.println("Menu");
            System.out.println("1-lineal");
            System.out.println("2-metodos");
            System.out.println("3-salir");
            System.out.print("Seleccionar =");
            int option = scanner.nextInt();scanner.nextLine();

            if (option == 1) {
                System.out.print("Resgistre el contacto =");
                String nameToSearch = scanner.nextLine();
                int index = lista.linearSearch(friends, 0, friends.length - 1, new Contact(nameToSearch, "", ""));
                
                if (index != -1) {
                    System.out.println("Si esta el contacto =" + friends[index]);
                } else {
                    System.out.println("No esta el contacto ");
                }
            } else if (option == 2) {
                System.out.println("Selecciona el tipo de ordenación:");
                System.out.println("1-selección");
                System.out.println("2-inserción");
                System.out.println("3-Oburbuja");
                System.out.println("4-rápida");
                System.out.println("5-Omezcla");
                System.out.print("Seleccione =");
                int sortOption = scanner.nextInt();
                
                switch (sortOption) {
                    case 1:
                        lista.selectionSort(friends);
                        System.out.println("selección:");
                        break;
                    case 2:
                        lista.insertionSort(friends);
                        System.out.println("+inserción:");
                        break;
                    case 3:
                        lista.bubbleSort(friends);
                        System.out.println("burbuja:");
                        break;
                    case 4:
                        lista.quickSort(friends, 0, friends.length - 1);
                        System.out.println("rápida:");
                        break;
                    case 5:
                        lista.mergeSort(friends, 0, friends.length - 1);
                        System.out.println("mezcla:");
                        break;
                    default:
                        System.out.println("NO VALIDO");
                        continue; 
                }
                for (Contact friend : friends) {
                    System.out.println(friend);
                }
            } else if (option == 3) {
                System.out.println("SALTE");
                break;
            } else {
                System.out.println("No valido, repitalo");
            }
        }

        scanner.close(); 
    }
}
