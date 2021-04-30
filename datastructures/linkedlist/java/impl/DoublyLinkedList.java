public class DoublyLinkedList<T> {

    private int size;
    private Node<T> head;

    public DoublyLinkedList() {
        head = null;
    }

    public void addAtHead(T val) {
        if (head == null) {
            head = new Node<T>(val);
        } else {
            Node<T> newNode = new Node<T>(val);
            Node<T> current = head;

            newNode.next = current;
            current.previous = newNode;
            head = newNode;
        }

        size++;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data.toString() + " ");
            current = current.next;
        }
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> previous;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
