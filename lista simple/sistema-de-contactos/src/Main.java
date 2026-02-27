//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaContactos lista = new ListaContactos();

        lista.insertarFinal(
                new Contactos("Ana", "3150000", "ana@mail.com")
        );
        lista.insertarFinal(
                new Contactos("luis", "3160000",  "luis@mail.com")
        );
        lista.insertarFinal(
              new Contactos( "carlos",  "3170000", "carlos@mail.com")
        );
     System.out.println("lista actual");
     lista.listar();

     System.out.println("Buscar Ana: ");


    }
}