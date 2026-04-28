public class Impresora {

    private Nodo frente;
    private Nodo fin;

    public void agregarDocumento(String documento) {
        Nodo nuevo = new Nodo(documento);
        if (fin == null) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        System.out.println("Documento agregado: " + documento);
    }

    public void imprimirSiguiente() {
        if (frente == null) {
            System.out.println("No hay documentos en la cola.");
            return;
        }
        String documento = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        System.out.println("Imprimiendo: " + documento);

        if (frente != null) {
            System.out.println("Siguiente en cola: " + frente.dato);
        } else {
            System.out.println("No hay mas documentos pendientes.");
        }
    }

    public void siguienteDocumento() {
        if (frente == null) {
            System.out.println("La cola de impresion esta vacia.");
        } else {
            System.out.println("Siguiente documento: " + frente.dato);
        }
    }

    public void mostrarCola() {
        if (frente == null) {
            System.out.println("Cola de impresion vacia.");
            return;
        }
        System.out.println("Cola de impresion:");
        Nodo actual = frente;
        int i = 1;
        while (actual != null) {
            System.out.println("   " + i++ + ". " + actual.dato);
            actual = actual.siguiente;
        }
    }
}