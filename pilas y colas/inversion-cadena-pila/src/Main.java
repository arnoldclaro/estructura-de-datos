public class Main {

    static void main() {

        InversorCadena inversor = new InversorCadena();

        String[] entradas = { "JAVA", "Hola Mundo", "12345", "racecar" };

        System.out.println("=== Ejercicio 6 — Inversión de cadena con pila ===");
        System.out.println();

        for (String texto : entradas) {
            String invertida = inversor.invertir(texto);
            System.out.println("Entrada : " + texto);
            System.out.println("Salida  : " + invertida);
            System.out.println();
        }
    }
}