import control.CircularLinkedList;
import modelo.Contact;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.add(new Contact("Pepito", "33333"));
        list.add(new Contact("Luis", "22222"));
        list.add(new Contact("Maria", "11111"));



    }
}