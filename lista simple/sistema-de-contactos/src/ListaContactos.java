public class ListaContactos {
    private Nodo cabeza;

    public ListaContactos(Nodo cabeza){
        cabeza = null;
    }

    public void insertarFinal(Contactos Contactos){
        Nodo nuevo = new Nodo(Contactos);

        if(cabeza == null){
            cabeza = nuevo;
        }
        else{
            Nodo actual = cabeza;
            while (actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    public Contactos buscar(String nombre){
        Nodo actual = cabeza;

        while(actual!=null){
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)){
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
    public boolean eliminar(String nombre){
        if (cabeza == null){
            return false;
        }
        //Si es el primero
        if (cabeza.getDato().getNombre().equalsIgnoreCase(nombre)){
            cabeza = cabeza.getSiguiente();
            return true;
        }

        Nodo actual = cabeza;

        while (actual.getSiguiente() != null){
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)){
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual.setSiguiente(actual.getSiguiente());
        }
        return false;
    }

    public void listar(){
        Nodo actual = cabeza;

        while(actual!=null){
            System.out.println(actual.getDato());
            actual =  actual.getSiguiente();
        }
    }
}
