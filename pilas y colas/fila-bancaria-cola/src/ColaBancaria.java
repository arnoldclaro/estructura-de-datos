public class ColaBancaria {


        private NodoCola frente;
        private NodoCola final_;
        private int      cantidad;

        public ColaBancaria() {
            this.frente   = null;
            this.final_   = null;
            this.cantidad = 0;
        }

        public void agregarCliente(String nombre) {
            NodoCola nuevo = new NodoCola(nombre);
            if (estaVacia()) {
                frente = nuevo;
            } else {
                final_.setSiguiente(nuevo);
            }
            final_ = nuevo;
            cantidad++;
            System.out.println("Llega: " + nombre);
        }

        public void atenderCliente() {
            if (estaVacia()) throw new RuntimeException("No hay clientes en la fila");
            String nombre = frente.getCliente();
            frente = frente.getSiguiente();
            if (frente == null) final_ = null;
            cantidad--;
            System.out.println("Atendiendo: " + nombre);
        }

        public String siguienteCliente() {
            if (estaVacia()) throw new RuntimeException("No hay clientes en la fila");
            return frente.getCliente();
        }

        /** Retorna true si no hay clientes en la fila. */
        public boolean estaVacia() {
            return frente == null;
        }

        /** Retorna el número de clientes en espera. */
        public int getCantidad() {
            return cantidad;
        }
    }
