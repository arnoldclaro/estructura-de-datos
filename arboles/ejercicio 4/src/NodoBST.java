public class NodoBST {
        int codigo;
        String producto;
        NodoBST izquierdo;
        NodoBST derecho;

        public NodoBST(int codigo, String producto) {
            this.codigo    = codigo;
            this.producto  = producto;
            this.izquierdo = null;
            this.derecho   = null;
        }
    }

