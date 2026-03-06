public class SistemaNavegacion {

        private Nodo cabeza;
        private Nodo cola;

        public void SistemaNavegacion() {
            this.cabeza = null;
            this.cola = null;
        }

        public void visitarPagina(String url, String fecha) {
            Nodo nuevoNodo = new Nodo(url, fecha);

            if (cabeza == null) {
                cabeza = nuevoNodo;
                cola = nuevoNodo;
            } else {
                cola.siguiente = nuevoNodo;
                cola = nuevoNodo;
            }
            System.out.println("✔ Página guardada en el historial: " + url);
        }

        public void buscarEnHistorial(String url) {
            if (cabeza == null) {
                System.out.println("⚠ El historial está vacío.");
                return;
            }

            Nodo actual = cabeza;
            boolean encontrado = false;

            System.out.println("\n--- Resultados de búsqueda ---");
            while (actual != null) {
                if (actual.url.equalsIgnoreCase(url)) {
                    System.out.println("📍 Coincidencia: " + actual.url + " [Fecha: " + actual.fecha + "]");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }

            if (!encontrado) {
                System.out.println("❌ No se encontraron registros para: " + url);
            }
        }

        public void vaciarHistorial() {
            cabeza = null;
            cola = null;
            System.out.println("\n🗑 Historial eliminado completamente.");
        }

        public void mostrarHistorial() {
            if (cabeza == null) {
                System.out.println("El historial está vacío.");
                return;
            }

            Nodo actual = cabeza;
            System.out.println("\n--- Historial Completo ---");
            while (actual != null) {
                System.out.println("🔗 " + actual.url + " (" + actual.fecha + ")");
                actual = actual.siguiente;
            }
            System.out.println("--------------------------");
        }
    }