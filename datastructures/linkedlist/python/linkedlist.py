from email import header


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

    def add(self, index, value):
        if index > self.size:
            self.append(value)
            return
        if index == 0 or self.is_empty():
            self.add_first(value)
            return
        iterator = 0
        current = self.head
        while iterator < index - 1:
            current = current.next
            iterator += 1
        new_node = Node(value)
        next_node = current.next
        current.next = new_node
        new_node.next = next_node
        self.size += 1
        
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
        
    def delete(self, value):
        if self.is_empty():
            print("List is empty")
            return
        current = self.head
        
        if current and current.value == value:
            self.head = current.next
            return
        
        prev = current
        while current and current.value != value:
            prev = current
            current = current.next
            
        if not current:
            print("Value was not found!")
            return
        prev.next = current.next
        self.size -= 1

    def print(self):
        current = self.head
        while current is not None:
            print(current.value)
            current = current.next


if __name__ == "__main__":
    linked_list = LinkedList()

    linked_list.append(1)
    linked_list.append(3)
    linked_list.add_first(0)
    
    linked_list.add(2, 2)
    
    linked_list.delete(4)

    linked_list.print()
