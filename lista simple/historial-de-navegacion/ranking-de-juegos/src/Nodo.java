public class Nodo {
    private Jugador dato;
    private Nodo siguiente;

    // Constructor: Inicializamos el dato y aseguramos que el puntero sea nulo al iniciar
    public Nodo(Jugador dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // Métodos Getter y Setter (Encapsulamiento)
    public Jugador getDato() {
        return dato;
    }

    public void setDato(Jugador dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
