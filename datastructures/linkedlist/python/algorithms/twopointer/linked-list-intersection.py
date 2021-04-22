class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def get_intersection_node(headA, headB):
    pA = headA
    pB = headB

    while pA != pB:
        pA = headB if pA is None else pA.next
        pB = headA if pB is None else pB.next

    return pA


if __name__ == "__main__":
    head_A = ListNode(1)
    node_A1 = ListNode(2)
    node_A2 = ListNode(3)
    node_A3 = ListNode(4)

    head_A.next = node_A1
    node_A1.next = node_A2
    node_A2.next = node_A3

    head_B = ListNode(5)
    node_B1 = ListNode(6)
    node_B2 = ListNode(7)

    head_B.next = node_B1
    node_B1.next = node_B2

    tail_1 = ListNode(8)
    tail_2 = ListNode(9)
    tail_3 = ListNode(10)

    node_A3.next = tail_1
    node_B2.next = tail_1
    tail_1.next = tail_2
    tail_2.next = tail_3

    print(get_intersection_node(head_A, head_B).val)
