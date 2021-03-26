package datastructures.linkedlist.java.test;

import datastructures.linkedlist.java.impl.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(0, 2);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(0);
        myLinkedList.addLast(3);
        myLinkedList.add(4, 7);
        myLinkedList.add(4, 5);
        myLinkedList.add(5, 6);

        myLinkedList.print();
        System.out.println("Size: " + myLinkedList.size());
    }

}
