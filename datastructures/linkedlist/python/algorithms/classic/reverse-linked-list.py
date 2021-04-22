class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def print_list(head):
    current = head

    while current:
        print(current.val)
        current = current.next


def reverse_list(head):
    prev = None

    while head:
        next = head.next
        head.next = prev
        prev = head
        head = next

    return prev


if __name__ == "__main__":
    node_1 = ListNode(1)
    node_2 = ListNode(2)
    node_3 = ListNode(3)
    node_4 = ListNode(4)

    node_1.next = node_2
    node_2.next = node_3
    node_3.next = node_4

    print_list(node_1)

    reversed = reverse_list(node_1)

    print("Reversed Linked List")
    print_list(reversed)
