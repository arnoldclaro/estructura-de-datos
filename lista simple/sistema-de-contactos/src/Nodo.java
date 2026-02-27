public class Nodo {
    public Nodo siguiente;
    private Contactos dato;

    public Nodo(Contactos dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Contactos getDato() {
        return dato;
    }

    public void setDato(Contactos dato) {
        this.dato = dato;
    }
}

