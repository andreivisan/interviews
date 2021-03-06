### Linked Lists

- **Definition:** A LinkedList is a linear collection of data elements whose order is not given by their physical placement in memory. Instead, each element points to the next. It is a Data Structure consisting of a collection of nodes which together represent a sequence. In its most basic form, each Node contains: _data_ and _a reference_ to the next Node in the sequence.

- **Best to use:** LinkedList allows for efficient _insertion_ or _removal_ of elements from any position in the sequence during iteration. A drawback is that access time is linear. So it is best to use when you have a lot of inserts or removals but not a lot of reading of data.

- **Variations**

  - **Singly-Linked List:** LinkedList in which each node points to the next node and the last node points to _null_.
  - **Doubly-Linked List:** LinkedList in which each node has 2 pointers, previous and next, one pointing to the previous node and the other points to the next node. The last node's next pointer points to _null_.
  - **Circular-Linked List:** LinkedList in which each node points to the next node and the last node points to the first node.

- **Time Complexity:**

  - Access: `O(n)`
  - Search: `O(n)`
  - Insert: `O(1)`
  - Remove: `O(1)`

- **Code**:

  - `Java:`

    - [Singly-Linked List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/impl/LinkedList.java)

    - [Doubly-Linked List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/impl/DoublyLinkedList.java)

      _Note_: One small performance improvement is when an index is given establish if it is before or after mid list `(index + 1 > size - index)` and traverse from head or from tail. This also implies that besides head we need to keep a reference to the tail as well.

  - `Python:`

    - [Singly-Linked List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/linkedlist.py)

    - [Doubly-Linked List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/doubly-linked-list.py)

      _Note_: One small performance improvement is when an index is given establish if it is before or after mid list `(index + 1 > size - index)` and traverse from head or from tail. This also implies that besides head we need to keep a reference to the tail as well.

- **Algorithms**:

  - _Two-Pointer Technique_ two scenarios to use the two-pointer technique:

    - Two pointers starts at different position: one starts at the beginning while another starts at the end;
    - Two pointers are moved at different speed: one is faster while another one might be slower.

    For a singly linked list, since we can only traverse the linked list in one direction, the first scenario might not work. However, the second scenario, which is also called slow-pointer and fast-pointer technique, is really useful.

    - `Java:`

      - [Singly-Linked List -> Linked List Cycle 1](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/twopointer/LinkedListCycle.java)
      - [Singly-Linked List -> Linked List Cycle 2](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/twopointer/LinkedListCycleII.java)

        _Note_: The idea of the solution of this algorithm is that the distance from the intersection point of the slow pointer and fast pointer to the cycle begin is equal to the distance from the head of the list to the cycle begin.

      - [Singly-Linked List -> Intersection of Two Linked Lists](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/twopointer/LinkedListIntersection.java)

        _Note_: The idea of the solution of this algorithm is that in order to optimize the space, we can calculate the length of both lists and set the starting point for the longer list at the same position as the starting point for the shorter one, as the tail is always the same. And to even simplify further the code we iterate through both as long as the pointers are not equal, and when we reach null we switch list heads and like this we achieve above simpler.

      - [Singly-Linked List -> Remove Nth Node From End of List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/twopointer/RemoveNthNodeFromEnd.java)

        _Note_: There are 2 solutions. The easy one is that we need to remove the node at L-n+1. Where L is the size of the list. For this we need 2 traversals because first we need to determine the length of the list. The second and most optimal solution traverses the list only once. The idea behind this solution is to add a dummy node in front of the head node, then with the first pointer we traverse n+1 steps, then we start advancing both first and second pointer with only one step until the first becomes NULL. At this moment the second pointer points to the element behind the Nth node which needs to be removed. The dummy node is there in case the Nth element from the end is the head of the list. If we don't want to use an extra dummy, after the first node traverses N steps we check the first for null and in case is null then we return head.next .

    - `Python:`

      - [Singly-Linked List -> Linked List Cycle 1](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/twopointer/linked-list-cycle.py)
      - [Singly-Linked List -> Linked List Cycle 2](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/twopointer/linked-list-cycle-ii.py)

        _Note_: The idea of the solution of this algorithm is that the distance from the intersection point of the slow pointer and fast pointer to the cycle begin is equal to the distance from the head of the list to the cycle begin.

      - [Singly-Linked List -> Intersection of Two Linked Lists](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/twopointer/linked-list-intersection.py)

        _Note_: The idea of the solution of this algorithm is that in order to optimize the space, we can calculate the length of both lists and set the starting point for the longer list at the same position as the starting point for the shorter one, as the tail is always the same. And to even simplify further the code we iterate through both as long as the pointers are not equal, and when we reach null we switch list heads and like this we achieve above simpler.

      - [Singly-Linked List -> Remove Nth Node From End of List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/twopointer/linked-list-remove-nth-from-end.py)

        _Note_: There are 2 solutions. The easy one is that we need to remove the node at L-n+1. Where L is the size of the list. For this we need 2 traversals because first we need to determine the length of the list. The second and most optimal solution traverses the list only once. The idea behind this solution is to add a dummy node in front of the head node, then with the first pointer we traverse n+1 steps, then we start advancing both first and second pointer with only one step until the first becomes NULL. At this moment the second pointer points to the element behind the Nth node which needs to be removed. The dummy node is there in case the Nth element from the end is the head of the list. If we don't want to use an extra dummy, after the first node traverses N steps we check the first for null and in case is null then we return head.next .

  - _Classic Problems_

    - `Java:`

      - [Reverse Linked List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/classic/ReverseLinkedList.java)

        _Note_: The idea is to keep track of a previous and a next.

      - [Remove Linked List Element](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/classic/RemoveLinkedListElements.java)

        _Note_: The idea is to keep track of a previous and a next.

      - [Odd Even List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/classic/OddEvenList.java)

        _Note_: The idea is create a pointer called `odd` which points to the head, an `evenHead` pointer which points to head.next and an `even` pointer which points to evenHead. By doing that we create a separate list of evens. Iterate throught the list and switch odds and even accordingly and at the end `odd` pointer will point to `evenHead` so that we link the 2 lists together.

      - [Palindrome Linked List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/classic/PalindromeLinkedList.java)

        _Note_: The idea is to use fast and slow pointer to find the middle of the list. Then reverse the second half of the list. Then take 2 pointers one that starts at head and the other that starts at the reversed head and traverse the 2 halves and compare the values.

    - `Python:`

      - [Reverse Linked List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/classic/reverse-linked-list.py)

        _Note_: The idea is to keep track of a previous and a next.

      - [Remove Linked List Element](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/classic/remove-linked-list-element.py)

        _Note_: The idea is to keep track of a previous and a next.

      - [Odd Even List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/classic/odd-even-list.py)

        _Note_: The idea is create a pointer called `odd` which points to the head, an `evenHead` pointer which points to head.next and an `even` pointer which points to evenHead. By doing that we create a separate list of evens. Iterate throught the list and switch odds and even accordingly and at the end `odd` pointer will point to `evenHead` so that we link the 2 lists together.

      - [Palindrome Linked List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/classic/palindrome_linked_list.py)

        _Note_: The idea is to use fast and slow pointer to find the middle of the list. Then reverse the second half of the list. Then take 2 pointers one that starts at head and the other that starts at the reversed head and traverse the 2 halves and compare the values.

  - _Exercises_

    - `Java:`

      - [Merge Two Sorted Lists](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/exercises/MergeTwoSortedLists.java)

    - `Python:`

      - [Merge Two Sorted Lists](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/exercises/merge-two-sorted-lists.py)
