// Importamos libreria scanner
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Inicializo
        int response = 0;

        // Itero con dowhile
        do {
            System.out.println("Seleccione el numero de la opción deseada...");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                break;
                case 1:
                    System.out.println("Movies");
                break;
                case 2:
                    System.out.println("Series");
                break;
                default:
                    System.out.println("Seleccione una opción valida");
                break;
            }
        } while (response != 0);

        System.out.println("Finalizo la ejecución del programa...");
    }
}
