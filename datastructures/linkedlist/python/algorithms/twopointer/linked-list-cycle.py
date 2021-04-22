class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def has_cycle(head):
    if not head:
        return False

    slow = head
    fast = head.next

    while slow != fast:
        if not fast or not fast.next:
            return False

        slow = slow.next
        fast = fast.next.next

    return True


if __name__ == "__main__":
    node_1 = ListNode(1)
    node_2 = ListNode(2)
    node_3 = ListNode(3)
    node_4 = ListNode(4)

    node_1.next = node_2
    node_2.next = node_3
    node_3.next = node_4
    node_4.next = node_2

    print(has_cycle(node_1))
