//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestionContactos gestion = new GestionContactos();

        gestion.insertar(
                new Contactos("Ana", "310000000", "Ana@mail.com")
        );
        gestion.insertar(
                new Contactos("luis", "32000000", "luis@mail.com")
        );

        System.out.println("Lista de contactos: ");
        gestion.listar();

        System.out.println("Buscar a ana ");
        gestion.buscar("Ana");

        System.out.println("Eliminar a luis");
        gestion.eliminar("luis");

        System.out.println("Lista de contactos final: ");
        gestion.listar();

    }
}