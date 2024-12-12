public class Main {
    public static void main(String[] args) {
        // Testando Pilha
        System.out.println("Testando Pilha:");
        Pilha pilha = new Pilha();
        pilha.push(1, 100);
        pilha.push(2, 200);
        pilha.push(3, 300);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Pop: " + pilha.pop().value);
        System.out.println("Tamanho da pilha após o pop: " + pilha.size());

        // Testando Fila
        System.out.println("\nTestando Fila:");
        Fila fila = new Fila();
        fila.enqueue(1, 100);
        fila.enqueue(2, 200);
        fila.enqueue(3, 300);
        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Dequeue: " + fila.dequeue().value);
        System.out.println("Tamanho da fila após o dequeue: " + fila.size());

        // Testando Lista Encadeada
        System.out.println("\nTestando Lista Encadeada:");
        ListaEncadeada lista = new ListaEncadeada();
        lista.push(new Node(1, 100));
        lista.push(new Node(2, 200));
        lista.push(new Node(3, 300));
        lista.printList();
        lista.pop();
        lista.printList();
        lista.insert(1, new Node(4, 400));
        lista.printList();
        lista.remove(1);
        lista.printList();
        System.out.println("Elemento no índice 1: " + lista.elementAt(1).value);

        // Testando HasMap
        System.out.println("\nTestando Mapa de Hash:");
        HashMap mapa = new HashMap();
        mapa.put(1, 100);
        mapa.put(2, 200);
        mapa.put(3, 300);
        System.out.println("Valor para chave 2: " + mapa.get(2).value);
        mapa.delete(2);
        System.out.println("Valor para chave 2 após delete: " + mapa.get(2));
        mapa.clear();
        System.out.println("Valor para chave 1 após clear: " + mapa.get(1));
    }
}
