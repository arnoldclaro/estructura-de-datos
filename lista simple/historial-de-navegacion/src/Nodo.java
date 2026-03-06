public class Nodo {
    String url;
    String fecha;
    Nodo siguiente;

    public Nodo(String url, String fecha, Nodo siguiente) {
        this.url = url;
        this.fecha = fecha;
        this.siguiente = null;
    }

    public Nodo(String url, String fecha) {
    }
}
