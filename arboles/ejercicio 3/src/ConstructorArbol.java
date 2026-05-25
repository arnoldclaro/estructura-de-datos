public class ConstructorArbol {

    public NodoBinario insertar(NodoBinario nodo, int valor) {
        if (nodo == null) {
            return new NodoBinario(valor);
        }
        if (valor < nodo.dato) {
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        } else if (valor > nodo.dato) {
            nodo.derecho = insertar(nodo.derecho, valor);
        }
        return nodo;
    }

    public void mostrarInOrden(NodoBinario nodo) {
        if (nodo != null) {
            mostrarInOrden(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            mostrarInOrden(nodo.derecho);
        }
    }
}
