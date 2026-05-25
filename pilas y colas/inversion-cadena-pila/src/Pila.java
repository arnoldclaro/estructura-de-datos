public class Pila {

        private NodoPila tope;

        public Pila() {
            this.tope = null;
        }

        public void push(char valor) {
            NodoPila nuevo = new NodoPila(valor);
            nuevo.setAnterior(tope);
            tope = nuevo;
        }

        public char pop() {
            if (isEmpty()) throw new RuntimeException("Pila vacía");
            char valor = tope.getValor();
            tope = tope.getAnterior();
            return valor;
        }

        public boolean isEmpty() {
            return tope == null;
        }
    }
