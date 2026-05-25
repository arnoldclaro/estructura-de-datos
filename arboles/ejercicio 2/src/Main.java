public class Main {
    public static void main(String[] args) {

        ArbolBinario arbol = new ArbolBinario();

        arbol.raiz = new NodoBinario(192550);
        arbol.raiz.izquierdo = new NodoBinario(191830);
        arbol.raiz.derecho = new NodoBinario(191070);
        arbol.raiz.izquierdo.izquierdo = new NodoBinario(191820);
        arbol.raiz.izquierdo.derecho = new NodoBinario(191840);

        System.out.println("=== Ejercicio 2: Recorridos del Árbol ===");

        System.out.print("Preorden:  ");
        arbol.preorden(arbol.raiz);
        System.out.println();

        System.out.print("Inorden:   ");
        arbol.inorden(arbol.raiz);
        System.out.println();

        System.out.print("Postorden: ");
        arbol.postorden(arbol.raiz);
        System.out.println();

        System.out.println("\n=== Ejercicio 3: Análisis Recursivo ===");

        int totalNodos = arbol.contarNodos(arbol.raiz);
        System.out.println("Cantidad de nodos: " + totalNodos);

        int alturaArbol = arbol.altura(arbol.raiz);
        System.out.println("Altura del árbol:  " + alturaArbol);
    }
}