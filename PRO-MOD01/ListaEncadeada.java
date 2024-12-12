public class ListaEncadeada {
    private Node head;
    private int size;

    public ListaEncadeada() {
        this.head = null;
        this.size = 0;
    }

    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public Node pop() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia");
        }
        if (head.next == null) {
            Node poppedNode = head;
            head = null;
            size--;
            return poppedNode;
        }

        Node current = head;
        while (current.next != null && current.next.next != null) {
            current = current.next;
        }
        Node poppedNode = current.next;
        current.next = null;
        size--;
        return poppedNode;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print("(" + current.key + ", " + current.value + ") ");
            current = current.next;
        }
        System.out.println();
    }
}
