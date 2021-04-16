package datastructures.linkedlist.java.algorithms;

import java.util.HashSet;
import java.util.Set;

public class LinkedListIntersection {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();

        ListNode current = headA;
        while (current != null) {
            visited.add(current);
            current = current.next;
        }

        current = headB;
        while (current != null) {
            if (visited.contains(current)) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public static ListNode getIntersectionNodeOptimal(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        ListNode nodeA1 = new ListNode(2);
        ListNode nodeA2 = new ListNode(3);
        ListNode nodeA3 = new ListNode(4);

        headA.next = nodeA1;
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;

        ListNode headB = new ListNode(5);
        ListNode nodeB1 = new ListNode(6);
        ListNode nodeB2 = new ListNode(7);

        headB.next = nodeB1;
        nodeB1.next = nodeB2;

        ListNode node1 = new ListNode(8);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(10);

        nodeA3.next = node1;
        nodeB2.next = node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println(getIntersectionNodeOptimal(headA, headB).val);
    }

}
