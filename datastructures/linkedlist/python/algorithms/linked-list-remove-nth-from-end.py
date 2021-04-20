class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def removeNthFromEnd(head, n):
    first, second = head, head

    for _ in range(n):
        first = first.next

    if not first:
        return head.next

    while first.next:
        first, second = first.next, second.next

    second.next = second.next.next

    return head
