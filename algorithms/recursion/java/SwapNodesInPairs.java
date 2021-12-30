public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode p3 = p2.next;

        p1.next = swapPairs(p3);
        p2.next = p1;

        return p2;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode last = new ListNode(5, null);
        ListNode fourth = new ListNode(4, last);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);

        // printLinkedList(head);

        swapPairs(head);

        printLinkedList(head);
    }

}
