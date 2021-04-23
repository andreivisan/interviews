package datastructures.linkedlist.java.algorithms.classic;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return head;
        }

        if (head.val == val) {
            head = head.next;
            return head;
        }

        ListNode previous = head;
        ListNode current = head.next;

        while (current != null) {
            if (current.val == val) {
                current = current.next;
                previous.next = current;
            } else {
                previous = current;
                current = current.next;
            }
        }

        return head;
    }

    private static void print(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(2, node2);

        print(node1);
        System.out.println("\n");
        print(removeElements(node1, 2));
    }
}
