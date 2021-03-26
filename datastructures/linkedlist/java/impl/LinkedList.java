package datastructures.linkedlist.java.impl;

import java.util.Optional;

public class LinkedList<T> {

    private int size = 0;
    private Node<T> head = null;

    public void add(T element) {
        addLast(element);
    }

    public void add(int index, T element) {
        if (index > size) {
            System.out.println("Index greater than list size!");
            return;
        }
        if (isEmpty()) {
            addFirst(element);
            return;
        }
        int iterator = 0;
        Node<T> current = head;
        while (iterator < index - 1) {
            current = current.next;
            iterator++;
        }
        Node<T> newNode = new Node<T>(element);
        Node<T> nextNode = current.next;
        current.next = newNode;
        newNode.next = nextNode;
        size++;
    }

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

    public void addLast(T element) {
        if (isEmpty()) {
            addFirst(element);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node<T> newNode = new Node<T>(element);
            current.next = newNode;
        }
        size++;
    }

    public Optional<T> peek(int index) {
        if (isEmpty()) {
            System.out.println("The list is empty!");
            return Optional.empty();
        }
        if (index > size - 1) {
            System.out.println("Index greater than list size!");
            return Optional.empty();
        }
        Node<T> current = head;
        int iterator = 0;
        while (iterator < index) {
            current = current.next;
            iterator++;
        }
        return Optional.of(current.data);
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
