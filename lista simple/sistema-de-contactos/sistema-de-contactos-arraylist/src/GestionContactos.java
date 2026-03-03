import java.util.ArrayList;

public class GestionContactos {
    private ArrayList<Contactos>Lista;

    public GestionContactos() {
        Lista = new ArrayList<>();
    }
    public void insertar(Contactos contacto) {
        Lista.add(contacto);
        System.out.println("Contacto agregado");
    }
    public Contactos buscar(String nombre) {
        for (Contactos contacto : Lista) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;

            }
        }
        return null;
    }
    public boolean eliminar(String nombre) {
        Contactos contacto = buscar(nombre);
        if (contacto != null) {
            return Lista.remove(contacto);
        }
        return false;
    }
    public void listar() {
        for (Contactos contacto : Lista) {
            System.out.println(contacto);
        }

    }
}
