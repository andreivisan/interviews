public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(-1);
        ListNode temp = l3;

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        while (l1 != null) {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }

        while (l2 != null) {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }

        return l3.next;
    }

    private static void print(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1_3 = new ListNode(4, null);
        ListNode l1_2 = new ListNode(2, l1_3);
        ListNode l1_1 = new ListNode(1, l1_2);

        ListNode l2_4 = new ListNode(4, null);
        ListNode l2_3 = new ListNode(3, l2_4);
        ListNode l2_2 = new ListNode(2, l2_3);
        ListNode l2_1 = new ListNode(1, l2_2);

        print(mergeTwoLists(l1_1, l2_1));
    }
}
