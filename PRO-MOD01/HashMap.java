public class HashMap {
    private Node[] table;
    private static final int SIZE = 10;

    public HashMap() {
        this.table = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node get(int key) {
        int index = hash(key);
        Node current = table[index];
        while (current != null) {
            if (current.key == key) {
                return current;
            }
            current = current.next;
        }
        return null; // Chave não encontrada
    }

    public void delete(int key) {
        int index = hash(key);
        Node current = table[index];
        Node previous = null;
        while (current != null) {
            if (current.key == key) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void clear() {
        table = new Node[SIZE];
    }
}
