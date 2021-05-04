class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def merge_two_lists(l1, l2):
    l3 = ListNode(-1)
    temp = l3

    while l1 and l2:
        if l1.val <= l2.val:
            temp.next = l1
            l1 = l1.next
        else:
            temp.next = l2
            l2 = l2.next
        temp = temp.next

    temp.next = l1 if l1 else l2

    return l3.next


def print_list(head):
    current = head

    while current:
        print(current.val)
        current = current.next


def main():
    l1_3 = ListNode(4, None)
    l1_2 = ListNode(2, l1_3)
    l1_1 = ListNode(1, l1_2)

    l2_3 = ListNode(4, None)
    l2_2 = ListNode(3, l2_3)
    l2_1 = ListNode(1, l2_2)

    print_list(merge_two_lists(l1_1, l2_1))


if __name__ == "__main__":
    main()
