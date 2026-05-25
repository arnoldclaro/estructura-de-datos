public class ListaEnlazada {

        private NodoLista cabeza;

        public ListaEnlazada() {
            this.cabeza = null;
        }


        public void insertar(int codigo, String producto) {
            NodoLista nuevo = new NodoLista(codigo, producto);
            if (cabeza == null) {
                cabeza = nuevo;
                return;
            }
            NodoLista actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }


        public NodoLista buscar(int codigo) {
            NodoLista actual = cabeza;
            while (actual != null) {
                if (actual.codigo == codigo) return actual;
                actual = actual.siguiente;
            }
            return null;
        }

        public void mostrar() {
            NodoLista actual = cabeza;
            while (actual != null) {
                System.out.println("  Código: " + actual.codigo + " | Producto: " + actual.producto);
                actual = actual.siguiente;
            }
        }
    }

