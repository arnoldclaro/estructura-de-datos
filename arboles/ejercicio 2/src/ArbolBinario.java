public class ArbolBinario {

    NodoBinario raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    void preorden(NodoBinario nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    void inorden(NodoBinario nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            inorden(nodo.derecho);
        }
    }

    void postorden(NodoBinario nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }

    int contarNodos(NodoBinario nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + contarNodos(nodo.izquierdo) + contarNodos(nodo.derecho);
    }

    int altura(NodoBinario nodo) {
        if (nodo == null) {
            return -1;
        }
        int altIzq = altura(nodo.izquierdo);
        int altDer = altura(nodo.derecho);
        return 1 + Math.max(altIzq, altDer);
    }
}
