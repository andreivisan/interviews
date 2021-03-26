package datastructures.linkedlist.java.test;

import datastructures.linkedlist.java.impl.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.addFirst(9);
        myLinkedList.add(1, 1);
        myLinkedList.add(1, 7);
        myLinkedList.delete(1);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(4);
        myLinkedList.delete(1);
        myLinkedList.add(1, 4);
        myLinkedList.addFirst(2);
        myLinkedList.delete(5);

        myLinkedList.print();
        System.out.println(myLinkedList.peek(0));
    }

}
