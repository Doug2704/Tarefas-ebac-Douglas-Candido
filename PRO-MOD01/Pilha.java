public class Pilha {
    private Node top;
    private int size;

    public Pilha() {
        this.top = null;
        this.size = 0;
    }

    public void push(int key, int value) {
        Node newNode = new Node(key, value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Node pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        Node poppedNode = top;
        top = top.next;
        size--;
        return poppedNode;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
