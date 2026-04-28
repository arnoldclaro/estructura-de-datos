public class Navegador {

    private Nodo top;

    public void visitar(String url) {
        Nodo nuevo = new Nodo(url);
        nuevo.siguiente = top;
        top = nuevo;
        System.out.println("Visitando: " + url);
    }

    public void atras() {
        if (top == null) {
            System.out.println("No hay paginas anteriores.");
            return;
        }
        String paginaCerrada = top.dato;
        top = top.siguiente;
        System.out.println("Saliendo de: " + paginaCerrada);

        if (top != null) {
            System.out.println("Pagina actual: " + top.dato);
        } else {
            System.out.println("No hay mas paginas en el historial.");
        }
    }

    public void paginaActual() {
        if (top == null) {
            System.out.println("El historial esta vacio.");
        } else {
            System.out.println("Pagina actual: " + top.dato);
        }
    }

    public void mostrarHistorial() {
        if (top == null) {
            System.out.println("Historial vacio.");
            return;
        }
        System.out.println("Historial de navegacion:");
        Nodo actual = top;
        int i = 1;
        while (actual != null) {
            System.out.println("   " + i++ + ". " + actual.dato);
            actual = actual.siguiente;
        }
    }
}