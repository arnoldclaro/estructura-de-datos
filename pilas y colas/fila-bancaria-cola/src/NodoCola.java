public class NodoCola {


        private final String  cliente;
        private       NodoCola siguiente;

        public NodoCola(String cliente) {
            this.cliente   = cliente;
            this.siguiente = null;
        }

        public String   getCliente()              { return cliente; }
        public NodoCola getSiguiente()            { return siguiente; }
        public void     setSiguiente(NodoCola n)  { this.siguiente = n; }
    }
