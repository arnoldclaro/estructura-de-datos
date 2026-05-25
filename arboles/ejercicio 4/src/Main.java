//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int[]    codigos   = {40, 20, 60, 10, 30, 50, 70};
        String[] productos = {"Monitor", "Teclado", "Mouse", "Auriculares",
                "Webcam", "Micrófono", "Impresora"};

        // ── Lista Enlazada ──────────────────────────────────────
        ListaEnlazada lista = new ListaEnlazada();
        for (int i = 0; i < codigos.length; i++) lista.insertar(codigos[i], productos[i]);

        System.out.println("--- Lista Enlazada (orden de inserción) ---");
        lista.mostrar();

        NodoLista resLista = lista.buscar(50);
        System.out.println("\nBúsqueda en Lista - código 50: " +
                (resLista != null ? resLista.producto : "No encontrado"));

        // ── Árbol BST ───────────────────────────────────────────
        ArbolBST arbol = new ArbolBST();
        for (int i = 0; i < codigos.length; i++) arbol.insertar(codigos[i], productos[i]);

        System.out.println("\n--- Árbol BST (in-orden = ascendente) ---");
        arbol.mostrarInOrden();

        NodoBST resBST = arbol.buscar(50);
        System.out.println("\nBúsqueda en BST - código 50: " +
                (resBST != null ? resBST.producto : "No encontrado"));

        // ── Análisis comparativo ────────────────────────────────
        System.out.println("\n=== ANÁLISIS COMPARATIVO ===");

        System.out.println("\n1. DIFERENCIAS ESTRUCTURALES");
        System.out.println("   Lista Enlazada: secuencia lineal, cada nodo apunta al siguiente.");
        System.out.println("   No hay orden lógico; depende del orden de inserción.");
        System.out.println("   BST: estructura jerárquica. Izquierdo < Raíz < Derecho.");
        System.out.println("   Esta propiedad permite descartar mitades en la búsqueda.");

        System.out.println("\n2. BÚSQUEDA EN CADA ESTRUCTURA");
        System.out.println("   Lista: recorre nodo por nodo desde la cabeza — O(n).");
        System.out.println("   BST: compara con la raíz y baja por izquierda o derecha — O(log n).");

        System.out.println("\n3. COMPLEJIDAD TEMPORAL PROMEDIO");
        System.out.println("   Criterio           | Lista Enlazada | BST");
        System.out.println("   Organización       | Lineal         | Jerárquica");
        System.out.println("   Forma de búsqueda  | Secuencial     | Binaria");
        System.out.println("   Complejidad prom.  | O(n)           | O(log n)");
        System.out.println("   Uso de memoria     | 1 puntero/nodo | 2 punteros/nodo");
        System.out.println("   Inserción          | O(n) al final  | O(log n) prom.");

        System.out.println("\n4. VENTAJAS Y DESVENTAJAS");
        System.out.println("   Lista Enlazada:");
        System.out.println("   + Implementación simple.");
        System.out.println("   + Inserción al inicio O(1).");
        System.out.println("   - Búsqueda siempre O(n).");
        System.out.println("   BST:");
        System.out.println("   + Búsqueda e inserción O(log n) promedio.");
        System.out.println("   + In-orden entrega datos en orden ascendente.");
        System.out.println("   - Si se desbalancea, puede degradarse a O(n).");

        System.out.println("\n5. CASOS DONDE LA LISTA SIGUE SIENDO ADECUADA");
        System.out.println("   - Pocos datos (< 50 elementos).");
        System.out.println("   - Pocas búsquedas, muchas inserciones al inicio.");
        System.out.println("   - Implementar pilas (LIFO) o colas (FIFO).");
        System.out.println("   - Memoria muy limitada.");

        System.out.println("\n=== PREGUNTAS DE REFLEXIÓN ===");

        System.out.println("\n1. ¿Qué ocurre si el BST se desbalancea?");
        System.out.println("   Si se insertan valores en orden creciente/decreciente,");
        System.out.println("   el árbol degenera en lista lineal y la búsqueda pasa a O(n).");
        System.out.println("   Solución: árboles auto-balanceados como AVL o Rojo-Negro.");

        System.out.println("\n2. ¿Por qué un BST puede acercarse a O(log n)?");
        System.out.println("   Cada comparación descarta aproximadamente la mitad de los nodos.");
        System.out.println("   Un árbol con n nodos tiene altura ≈ log₂(n) si está balanceado.");

        System.out.println("\n3. ¿Cuándo la lista enlazada es suficiente o más simple?");
        System.out.println("   Cuando los datos son pocos, las búsquedas infrecuentes,");
        System.out.println("   o se necesita preservar el orden de inserción (pilas/colas).");
    }
}