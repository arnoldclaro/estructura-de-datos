public class ArbolBST {

        private NodoBST raiz;

        public ArbolBST() {
            this.raiz = null;
        }

        public void insertar(int codigo, String producto) {
            raiz = insertarRec(raiz, codigo, producto);
        }

        private NodoBST insertarRec(NodoBST nodo, int codigo, String producto) {
            if (nodo == null) return new NodoBST(codigo, producto);
            if (codigo < nodo.codigo)
                nodo.izquierdo = insertarRec(nodo.izquierdo, codigo, producto);
            else if (codigo > nodo.codigo)
                nodo.derecho = insertarRec(nodo.derecho, codigo, producto);
            return nodo;
        }

        public NodoBST buscar(int codigo) {
            return buscarRec(raiz, codigo);
        }

        private NodoBST buscarRec(NodoBST nodo, int codigo) {
            if (nodo == null || nodo.codigo == codigo) return nodo;
            if (codigo < nodo.codigo) return buscarRec(nodo.izquierdo, codigo);
            else                      return buscarRec(nodo.derecho,    codigo);
        }

        public void mostrarInOrden() {
            mostrarRec(raiz);
        }

        private void mostrarRec(NodoBST nodo) {
            if (nodo != null) {
                mostrarRec(nodo.izquierdo);
                System.out.println("  Código: " + nodo.codigo + " | Producto: " + nodo.producto);
                mostrarRec(nodo.derecho);
            }
        }
    }

