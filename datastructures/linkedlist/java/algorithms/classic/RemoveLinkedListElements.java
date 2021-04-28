class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
        next = null;
    }

    ListNode2(int x, ListNode2 next) {
        val = x;
        this.next = next;
    }
}

public class RemoveLinkedListElements {

    public static ListNode2 removeElements(ListNode2 head, int val) {
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

        ListNode2 previous = head;
        ListNode2 current = head.next;

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

    private static void print(ListNode2 head) {
        ListNode2 current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode2 node4 = new ListNode2(4, null);
        ListNode2 node3 = new ListNode2(2, node4);
        ListNode2 node2 = new ListNode2(2, node3);
        ListNode2 node1 = new ListNode2(2, node2);

        print(node1);
        System.out.println("\n");
        print(removeElements(node1, 2));
    }
}
