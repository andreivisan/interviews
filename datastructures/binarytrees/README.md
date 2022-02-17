### Binary Trees

- **Definition:** A Binary Tree is one of the most typical tree structure. As the name suggests, a binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child.

- **Best to use:** Binary trees are used to represent a nonlinear data structure. There are various forms of Binary trees. Binary trees play a vital role in a software application. One of the most important applications of the Binary tree is in the searching algorithm.

- **Variations**

  - **Full Tree:** is to visit the root first. Then traverse the left subtree. Finally, traverse the right subtree.
  - **Perfect Binary Tree:** a binary tree in which all interior nodes have two children and all leaves have the same depth
  - **Complete Tree:** a binary tree in which every level except possibly the last is full and all nodes in the last level are as far left as possible
  

- **Traverse a Tree**
  
  There are three ways to traverse a tree

  - **Pre-order Traversal:** is to visit the root first. Then traverse the left subtree. Finally, traverse the right subtree.
  - **In-order traversal:** is to traverse the left subtree first. Then visit the root. Finally, traverse the right subtree. Typically, for `binary search tree`, we can retrieve all the data in sorted order using in-order traversal.
  - **Post-order traversal** is to traverse the left subtree first. Then traverse the right subtree. Finally, visit the root. Deletion process will be in post-order. That is to say, when you delete a node, you will delete its left child and its right child before you delete the node itself.

  All the traversals can be done in both Recursive or Iterative manner.

- **Time Complexity:**

  - Access: `O(log(n))`
  - Search: `O(log(n))`
  - Insert: `O(log(n))`
  - Remove: `O(log(n))`

