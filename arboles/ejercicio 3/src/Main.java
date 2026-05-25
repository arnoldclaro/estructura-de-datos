public class Main {

    public static void main(String[] args) {

        ConstructorArbol constructor = new ConstructorArbol();
        AnalizadorArbol analizador  = new AnalizadorArbol();


        NodoBinario raiz = null;
        raiz = constructor.insertar(raiz, 10);
        raiz = constructor.insertar(raiz, 5);
        raiz = constructor.insertar(raiz, 15);
        raiz = constructor.insertar(raiz, 3);
        raiz = constructor.insertar(raiz, 7);

        System.out.println("=== Árbol Binario - Análisis ===");
        System.out.print("Recorrido in-orden: ");
        constructor.mostrarInOrden(raiz);
        System.out.println();

        System.out.println("Cantidad de nodos: " + analizador.contarNodos(raiz));
        System.out.println("Altura del árbol : " + analizador.altura(raiz));

        System.out.println("\n=== Preguntas de análisis ===");

        System.out.println("\n1. ¿Qué ocurre cuando el nodo es null?");
        System.out.println("   Es el caso base de la recursión.");
        System.out.println("   contarNodos retorna 0 y altura retorna -1.");
        System.out.println("   Esto detiene la recursión e impide un NullPointerException.");

        System.out.println("\n2. ¿Por qué la recursión simplifica el procesamiento de árboles?");
        System.out.println("   Un árbol es una estructura naturalmente recursiva:");
        System.out.println("   cada subárbol es, a su vez, otro árbol.");
        System.out.println("   La recursión permite procesarlo sin necesidad de pilas manuales.");

        System.out.println("\n3. ¿Qué complejidad temporal tienen estas funciones?");
        System.out.println("   Ambas son O(n): cada nodo se visita exactamente una vez.");
    }
}