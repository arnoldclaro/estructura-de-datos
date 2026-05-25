public class Main {

    static void main() {

        ColaBancaria cola = new ColaBancaria();

        System.out.println("=== Ejercicio 7 — Fila de atención bancaria ===");
        System.out.println();

        // Llegan clientes
        cola.agregarCliente("Ana");
        cola.agregarCliente("Carlos");
        cola.agregarCliente("Maria");
        System.out.println();

        // Consultar siguiente sin atender
        System.out.println("Siguiente en fila : " + cola.siguienteCliente());
        System.out.println("Clientes en espera: " + cola.getCantidad());
        System.out.println();

        // Atender clientes
        cola.atenderCliente();
        cola.atenderCliente();
        System.out.println();

        // Estado final
        System.out.println("Siguiente en fila : " + cola.siguienteCliente());
        System.out.println("Clientes en espera: " + cola.getCantidad());
    }
}