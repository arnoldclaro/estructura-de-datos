public class Main {

    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static class Lista {
        Nodo cabeza;

        Lista() {
            this.cabeza = null;
        }

        void insertarAlFinal(int valor) {
            Nodo nuevo = new Nodo(valor);

            if (cabeza == null) {
                cabeza = nuevo;
                System.out.println("Insertado " + valor + " como primer nodo.");
                return;
            }

            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            System.out.println("Insertado " + valor + " al final.");
        }

        void mostrar() {
            if (cabeza == null) {
                System.out.println("La lista está vacía.");
                return;
            }

            System.out.print("Lista: ");
            Nodo temp = cabeza;
            while (temp != null) {
                System.out.print(temp.dato);
                if (temp.siguiente != null) System.out.print(" → ");
                temp = temp.siguiente;
            }
            System.out.println(" → null");
        }
    }

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.insertarAlFinal(10);
        lista.insertarAlFinal(25);
        lista.insertarAlFinal(7);
        lista.insertarAlFinal(43);
        lista.insertarAlFinal(18);

        System.out.println();
        lista.mostrar();
    }
}