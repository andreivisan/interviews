class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def odd_even(head):
    if not head:
        return None

    odd = head
    even_head = head.next
    even = even_head

    while even and even.next:
        odd.next = even.next
        odd = odd.next
        even.next = odd.next
        even = even.next

    odd.next = even_head

    return head


def print_list(head):
    current = head

    while current:
        print(current.val)
        current = current.next


if __name__ == "__main__":
    node_1 = ListNode(2)
    node_2 = ListNode(1)
    node_3 = ListNode(3)
    node_4 = ListNode(5)
    node_5 = ListNode(6)
    node_6 = ListNode(4)
    node_7 = ListNode(7)

    node_1.next = node_2
    node_2.next = node_3
    node_3.next = node_4
    node_4.next = node_5
    node_5.next = node_6
    node_6.next = node_7

    print_list(node_1)
    print(" ")
    print_list(odd_even(node_1))
