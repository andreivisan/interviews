public class ReverseLinkedList {

    public static ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev = null;

        while (head != null) {
            ListNode2 next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    private static void print(ListNode2 head) {
        ListNode2 current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode2 node4 = new ListNode2(4, null);
        ListNode2 node3 = new ListNode2(3, node4);
        ListNode2 node2 = new ListNode2(2, node3);
        ListNode2 node1 = new ListNode2(1, node2);

        print(node1);

        ListNode2 reversed = reverseList(node1);

        System.out.println("\n Reversed Linked List: ");
        print(reversed);
    }
}
