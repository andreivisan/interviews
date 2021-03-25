package datastructures.linkedlist.java.test;

import datastructures.linkedlist.java.impl.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(0);

        myLinkedList.print();
    }

}
