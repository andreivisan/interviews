package datastructures.linkedlist.java.impl;

public class LinkedList<T> {

    private int size = 0;
    private Node<T> head = null;

    public void addFirst(T element) {
        if (isEmpty()) {
            head = new Node<T>(element);
            head.next = null;
        } else {
            Node<T> oldHead = head;
            head = new Node<T>(element);
            head.next = oldHead;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
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

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
