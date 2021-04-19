package datastructures.linkedlist.java.algorithms;

public class RemoveNthNodeFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int index = size(head) - n;

        if (size(head) == 1) {
            head = null;
        }

        if (n == 0) {
            return head;
        }

        if (index == 0) {
            head = current.next;
            return head;
        }

        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }

        ListNode toRemove = current.next;
        current.next = toRemove.next;

        return head;
    }

    private static int size(ListNode head) {
        ListNode current = head;
        int size = 0;

        while (current != null) {
            size += 1;
            current = current.next;
        }

        return size;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(size(node1));
    }

}
