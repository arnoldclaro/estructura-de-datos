package modelo;

import model.Contact;

public class Node {
    private model.Contact value;
    private Node next;

    public Node(model.Contact value) {
        this.value = value;
        this.next = null;
    }

    public model.Contact getValue() {
        return value;
    }

    public void setValue(Contact value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
