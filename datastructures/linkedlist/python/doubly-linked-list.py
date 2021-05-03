class Node:
    def __init__(self, value):
        self.value = value
        self.previous = None
        self.next = None


class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

    def get(self, index):
        if not self.head:
            return -1

        current = self.head
        for _ in range(index):
            current = current.next

        if current:
            return current.value
        else:
            return -1

    def add_at_head(self, val):
        if not self.head:
            self.head = Node(val)
        else:
            current = self.head
            new_node = Node(val)
            new_node.next = current
            current.previous = new_node
            self.head = new_node

        self.size += 1

    def add_at_tail(self, val):
        if not self.head:
            self.head = Node(val)
        else:
            current = self.head
            while current.next:
                current = current.next
            new_node = Node(val)
            current.next = new_node
            new_node.previous = current

        self.size += 1

    def add_at_index(self, index, val):
        if not self.head:
            self.head = Node(val)
        else:
            if index == 0:
                self.add_at_head(val)
            else:
                current = self.head
                for _ in range(index - 1):
                    current = current.next
                new_node = Node(val)
                new_node.next = current.next
                current.next = new_node
                new_node.prev = current

                self.size += 1

    def delete_at_index(self, index):
        if self.head and index < self.size:
            current = self.head
            if index == 0:
                self.head = self.head.next
            else:
                for _ in range(index - 1):
                    current = current.next
                next = current.next.next
                current.next = next
                if next:
                    next.previous = current

            self.size -= 1

    def print(self):
        current = self.head
        while current is not None:
            print(current.value)
            current = current.next


def main():
    doubly_linked_list = DoublyLinkedList()

    doubly_linked_list.add_at_tail(7)

    doubly_linked_list.print()
    # print(doubly_linked_list.get(0))


if __name__ == "__main__":
    main()
