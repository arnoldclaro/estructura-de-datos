public class GestionRanking {
    private Nodo cabeza;

    public GestionRanking() {
        this.cabeza = null;
    }

    // 1. insercion (Agregar un nuevo jugador al final de la lista)
    public void insertarJugador(Jugador nuevoJugador) {
        Nodo nuevoNodo = new Nodo(nuevoJugador);

        // Si la lista está vacía, el nuevo nodo es la cabeza
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            // Si ya hay nodos, recorremos hasta llegar al último
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            // Conectamos el último nodo con el nuevo
            actual.setSiguiente(nuevoNodo);
        }
    }

    // 2. buscar jugador (Lo buscaremos por su nombre)
    public Jugador buscarJugador(String nombreBuscado) {
        Nodo actual = cabeza;

        // Recorremos la lista nodo por nodo
        while (actual != null) {
            // Comparamos el nombre del jugador actual con el que buscamos
            // Usamos equalsIgnoreCase para que no importe si escribes en mayúsculas o minúsculas
            if (actual.getDato().getNombre().equalsIgnoreCase(nombreBuscado)) {
                return actual.getDato(); // ¡Lo encontramos! Retornamos el jugador
            }
            actual = actual.getSiguiente();
        }

        return null; // Si terminamos de recorrer y no lo encontramos, retornamos null
    }

    // 3. ordenar ranking (De mayor a menor según su 'posicion' o puntaje)
    public void ordenarRanking() {
        // Si la lista está vacía o solo tiene un jugador, ya está ordenada
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return;
        }

        boolean huboIntercambio;
        do {
            huboIntercambio = false;
            Nodo actual = cabeza;

            // Recorremos la lista comparando pares de nodos
            while (actual.getSiguiente() != null) {
                // Si la posición del jugador actual es MENOR que la del siguiente...
                if (actual.getDato().getPosicion() < actual.getSiguiente().getDato().getPosicion()) {

                    // ...entonces intercambiamos los DATOS (los objetos Jugador), no los nodos enteros
                    Jugador temp = actual.getDato();
                    actual.setDato(actual.getSiguiente().getDato());
                    actual.getSiguiente().setDato(temp);

                    huboIntercambio = true; // Marcamos que hicimos un cambio
                }
                actual = actual.getSiguiente();
            }
            // Repetimos hasta dar una pasada completa sin hacer ningún intercambio
        } while (huboIntercambio);
    }

    // Método extra: Mostrar el ranking para que puedas ver si funciona
    public void mostrarRanking() {
        Nodo actual = cabeza;
        int top = 1;
        System.out.println("--- RANKING ACTUAL ---");
        while (actual != null) {
            Jugador j = actual.getDato();
            System.out.println(top + ". Nombre: " + j.getNombre() + " | Tipo: " + j.getTipo() + " | Posición/Puntaje: " + j.getPosicion());
            actual = actual.getSiguiente();
            top++;
        }
        System.out.println("----------------------");
    }
}
