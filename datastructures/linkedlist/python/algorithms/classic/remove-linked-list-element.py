class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def remove_elements(head, val):
    sentinel = ListNode(0)
    sentinel.next = head

    previous, current = sentinel, head

    while current:
        if current.val == val:
            previous.next = current.next
        else:
            previous = current
        current = current.next

    return sentinel.next


def print_list(head):
    current = head

    while current:
        print(current.val)
        current = current.next


if __name__ == "__main__":
    node_1 = ListNode(1)
    node_2 = ListNode(2)
    node_3 = ListNode(3)
    node_4 = ListNode(4)

    node_1.next = node_2
    node_2.next = node_3
    node_3.next = node_4

    print_list(node_1)
    print("After remove: ")
    print_list(remove_elements(node_1, 1))
