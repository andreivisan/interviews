# Coding Interview Preparation Guide

## Introduction

Welcome to my guide on how to study and master Data Structures and Algorithms. What I try to achieve with this guide, is an easy organized way to get REALLY good with using Data Structures and Algorithms. There are lots of resources out there and there is a lot of confusion on how to approach this vast topic in order to get comfortable with solving any type of problems at any difficulty level. I will try to categorize the MUST KNOW Data Structures and Algorithms and the steps to learn them in order to create a solid toolbox in such a way that even when you get a problem that you didn't see before, you are able to use the tools you gained to solve it.
This is also a guide for future me, to help me remember things I migh forget along the way.

## Approach

My approach is to first start with the most important Data Structures. I will create "Important to Remember Cards" bellow and I will code each one individually in both Python and Java so that I can get a deep and really good understanding of each Data Structure. You don't need to do this but for me it is important to feel that I start on very solid grounds.

## 1. Data Structures

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
  - `Python:`
    - [Singly-Linked List](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/linkedlist.py)

- **Algorithms**:

  - _Two-Pointer Technique_ two scenarios to use the two-pointer technique:

    - Two pointers starts at different position: one starts at the beginning while another starts at the end;
    - Two pointers are moved at different speed: one is faster while another one might be slower.

    For a singly linked list, since we can only traverse the linked list in one direction, the first scenario might not work. However, the second scenario, which is also called slow-pointer and fast-pointer technique, is really useful.

    - `Java:`

      - [Singly-Linked List -> Linked List Cycle 1](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/LinkedListCycle.java)
      - [Singly-Linked List -> Linked List Cycle 2](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/LinkedListCycleII.java)

        _Note_: The idea of the solution of this algorithm is that the distance from the intersection point of the slow pointer and fast pointer to the cycle begin is equal to the distance from the head of the list to the cycle begin.

      - [Singly-Linked List -> Intersection of Two Linked Lists](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/java/algorithms/LinkedListIntersection.java)

        _Note_: The idea of the solution of this algorithm is that in order to optimize the space, we can calculate the length of both lists and set the starting point for the longer list at the same position as the starting point for the shorter one, as the tail is always the same. And to even simplify further the code we iterate through both as long as the pointers are not equal, and when we reach null we switch list heads and like this we achieve above simpler.

      - [Singly-Linked List -> Remove Nth Node From End of List]()

    - `Python:`

      - [Singly-Linked List -> Linked List Cycle 1](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/linked-list-cycle.py)
      - [Singly-Linked List -> Linked List Cycle 2](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/linked-list-cycle-ii.py)

        _Note_: The idea of the solution of this algorithm is that the distance from the intersection point of the slow pointer and fast pointer to the cycle begin is equal to the distance from the head of the list to the cycle begin.

      - [Singly-Linked List -> Intersection of Two Linked Lists](https://github.com/andreivisan/interviews/blob/master/datastructures/linkedlist/python/algorithms/linked-list-intersection.py)

        _Note_: The idea of the solution of this algorithm is that in order to optimize the space, we can calculate the length of both lists and set the starting point for the longer list at the same position as the starting point for the shorter one, as the tail is always the same. And to even simplify further the code we iterate through both as long as the pointers are not equal, and when we reach null we switch list heads and like this we achieve above simpler.

      - [Singly-Linked List -> Remove Nth Node From End of List]()
