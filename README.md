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
