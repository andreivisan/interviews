class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

    def size(self):
        return self.size

    def is_empty(self):
        return self.size == 0

    def add(self, value):
        self.append(value)

    def append(self, value):
        if self.is_empty():
            self.head = Node(value)
            self.size += 1
            return
        current = self.head
        while current.next is not None:
            current = current.next
        current.next = Node(value)
        self.size += 1

    def add_first(self, value):
        if self.is_empty():
            self.head = Node(value)
            self.size += 1
            return
        new_node = Node(value)
        new_node.next = self.head
        self.head = new_node
        self.size += 1

    def print(self):
        current = self.head
        while current is not None:
            print(current.value)
            current = current.next


if __name__ == "__main__":
    linked_list = LinkedList()

    linked_list.add(1)
    linked_list.add(2)
    linked_list.add_first(0)

    linked_list.print()
