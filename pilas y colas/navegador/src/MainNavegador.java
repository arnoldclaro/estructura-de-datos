public class MainNavegador {

    public static void main(String[] args) {

        Navegador navegador = new Navegador();

        System.out.println("===== SIMULADOR DE NAVEGADOR WEB =====\n");

        navegador.visitar("https://www.google.com");
        navegador.visitar("https://www.wikipedia.org");
        navegador.visitar("https://www.github.com");
        navegador.visitar("https://www.stackoverflow.com");

        System.out.println();
        navegador.mostrarHistorial();

        System.out.println();
        navegador.paginaActual();

        System.out.println();
        System.out.println("--- Presionando Atras ---");
        navegador.atras();

        System.out.println();
        System.out.println("--- Presionando Atras ---");
        navegador.atras();

        System.out.println();
        navegador.mostrarHistorial();

        System.out.println();
        System.out.println("--- Presionando Atras dos veces mas ---");
        navegador.atras();
        navegador.atras();

        System.out.println();
        System.out.println("--- Intento de Atras sin historial ---");
        navegador.atras();
    }
}