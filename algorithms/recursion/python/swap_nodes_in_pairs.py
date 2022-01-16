class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def swap_pairs(head):
    if head == None or head.next == None:
        return head

    first = head
    second = head.next
    third = second.next

    first.next = swap_pairs(third)
    second.next = first

    return second
