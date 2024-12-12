public class Fila {
    private Node front;
    private Node rear;
    private int size;

    public Fila() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int key, int value) {
        Node newNode = new Node(key, value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public Node dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        Node dequeuedNode = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return dequeuedNode;
    }

    public Node front() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return front;
    }

    public Node rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return rear;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }
}
