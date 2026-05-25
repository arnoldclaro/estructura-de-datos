public class AnalizadorArbol {

    public int contarNodos(NodoBinario nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + contarNodos(nodo.izquierdo) + contarNodos(nodo.derecho);
    }


    public int altura(NodoBinario nodo) {
        if (nodo == null) {
            return -1;
        }
        int alturaIzq = altura(nodo.izquierdo);
        int alturaDer = altura(nodo.derecho);
        return 1 + Math.max(alturaIzq, alturaDer);
    }
}
