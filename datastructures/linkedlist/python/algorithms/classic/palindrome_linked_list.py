class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def is_palindrome(head):
    if not head:
        return True

    second_half_head = find_second_half_head(head)
    reversed_second_half_head = reverse(second_half_head.next)

    p1 = head
    p2 = reversed_second_half_head

    while p1 and p2:
        if p1.val != p2.val:
            return False

        p1 = p1.next
        p2 = p2.next

    second_half_head.next = reverse(reversed_second_half_head)

    return True


def find_second_half_head(head):
    slow = head
    fast = head

    while fast.next and fast.next.next:
        slow = slow.next
        fast = fast.next.next

    return slow


def reverse(head):
    prev = None

    while head:
        next = head.next
        head.next = prev
        prev = head
        head = next

    return prev


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
    node_5 = ListNode(3)
    node_6 = ListNode(2)
    node_7 = ListNode(1)

    node_1.next = node_2
    node_2.next = node_3
    node_3.next = node_4
    node_4.next = node_5
    node_5.next = node_6
    node_6.next = node_7

    print(is_palindrome(node_1))
    print_list(node_1)
    print(" ")
