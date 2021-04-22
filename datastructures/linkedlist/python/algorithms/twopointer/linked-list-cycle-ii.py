class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def get_intersect(head):
    slow = head
    fast = head

    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

        if fast == slow:
            return slow

    return None


def detect_cycle(head):
    if not head:
        return None

    intersect = get_intersect(head)
    if not intersect:
        return None

    pointer_head = head
    pointer_intersect = intersect

    while pointer_head != pointer_intersect:
        pointer_head = pointer_head.next
        pointer_intersect = pointer_intersect.next

    return pointer_intersect


if __name__ == "__main__":
    node_1 = ListNode(1)
    node_2 = ListNode(2)
    node_3 = ListNode(3)
    node_4 = ListNode(4)

    node_1.next = node_2
    node_2.next = node_3
    node_3.next = node_4
    node_4.next = node_3

    print(detect_cycle(node_1).val)
