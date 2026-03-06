import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        SistemaNavegacion historial = new SistemaNavegacion();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("🌐 Bienvenido al Gestor de Historial de Navegación");

        while (!salir) {
            System.out.println("\n==================================");
            System.out.println("1. Visitar nueva página (Insertar)");
            System.out.println("2. Buscar una página en el historial");
            System.out.println("3. Ver todo el historial");
            System.out.println("4. Borrar todo el historial");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la URL (ej. www.google.com): ");
                    String url = scanner.nextLine();
                    String fechaActual = LocalDate.now().format(dtf);
                    historial.visitarPagina(url, fechaActual);
                    break;
                case 2:
                    System.out.print("Ingresa la URL a buscar: ");
                    String urlBuscar = scanner.nextLine();
                    historial.buscarEnHistorial(urlBuscar);
                    break;
                case 3:
                    historial.mostrarHistorial();
                    break;
                case 4:
                    historial.vaciarHistorial();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Cerrando el navegador... ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("⚠ Opción no válida. Intenta de nuevo.");
            }
        }
        scanner.close();
    }
}