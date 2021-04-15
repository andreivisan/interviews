package datastructures.linkedlist.java.algorithms;

public class LinkedListCycleII {

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode intersect = findIntersect(head);
        if (intersect == null) {
            return null;
        }

        ListNode pointerHead = head;
        ListNode pointerIntersect = intersect;

        while (pointerHead != pointerIntersect) {
            pointerHead = pointerHead.next;
            pointerIntersect = pointerIntersect.next;
        }

        return pointerIntersect;
    }

    private static ListNode findIntersect(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return slowPointer;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node3;

        System.out.println(detectCycle(node1).val);
    }

}
