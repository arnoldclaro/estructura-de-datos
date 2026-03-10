public class GestionRanking {
    private Nodo cabeza;

    // insercion
    // buscar jugador
    // ordenar ranking
    public GestionRanking() {
        this.cabeza = null;
    }

    public void insertarJugador(Jugador nuevoJugador) {
        Nodo nuevoNodo = new Nodo(nuevoJugador);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public Jugador buscarJugador(String nombreBuscado) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombreBuscado)) {
                return =actual.getSiguiente();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public void ordenarRanking() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return;
        }

        boolean huboIntercambio;
        do {
            huboIntercambio = false;
            Nodo actual = cabeza;

            while (actual.getSiguiente() != null) {
                if (actual.getDato().getPosicion() < actual.getSiguiente().getDato().getPosicion()) {

                    Jugador temp = actual.getDato();
                    actual.setDato(actual.getSiguiente().getDato());
                    actual.getSiguiente().setDato(temp);

                    huboIntercambio = true;
                }
                actual = actual.getSiguiente();
            }
        } while (huboIntercambio);
    }
 public void mostrarRanking(){
        Nodo actual = cabeza;
        int top = 1;
        System.out.println("----- RANKING ACTUAL -----")
        while (actual != null) {
            Jugador j = actual.getDato();
            System.out.println(top + ". Nombre: " + j.getNombre() + " | Tipo: " + j.getTipo() +" | Posicion/Puntaje:" + j.getPosicion());
            actual = actual.getSiguiente();
            top++;
        }
        System.out.println("----- RANKING FINAL -----")
 }
}
