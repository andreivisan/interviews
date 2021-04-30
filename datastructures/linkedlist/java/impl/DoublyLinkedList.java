public class DoublyLinkedList<T> {

    private int size;
    private Node<T> head;

    public DoublyLinkedList() {
        head = null;
    }

    public T get(int index) {
        if (index > size) {
            return null;
        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current != null) {
            return current.data;
        } else {
            return null;
        }
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

    public void addAtTail(T val) {
        if (head == null) {
            head = new Node<T>(val);
        } else {
            Node<T> current = head;
            Node<T> newNode = new Node<T>(val);

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            newNode.previous = current;
        }

        size++;
    }

    public void addAtIndex(int index, T val) {
        if (head == null) {
            head = new Node<T>(val);
        } else {
            if (index == 0) {
                addAtHead(val);
            } else if (index >= size) {
                addAtTail(val);
            } else {
                Node<T> current = head;
                Node<T> newNode = new Node<T>(val);

                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }

                Node<T> next = current.next;
                newNode.previous = current;
                newNode.next = next;
                current.next = newNode;
                next.previous = newNode;

                size++;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node<T> toDelete = current.next;
        current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.previous = current;
        }

        size--;
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
