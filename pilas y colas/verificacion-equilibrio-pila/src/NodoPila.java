public class NodoPila {


        private final char  valor;
        private       NodoPila anterior;

        public NodoPila(char valor) {
            this.valor    = valor;
            this.anterior = null;
        }

        public char    getValor()              { return valor; }
        public NodoPila getAnterior()          { return anterior; }
        public void     setAnterior(NodoPila n){ this.anterior = n; }
    }
