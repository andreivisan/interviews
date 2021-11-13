### Stacks

- **Definition:** A Stack is a collection of elements, with two principle operations: push, which adds to the collection, and pop, which removes the most recently added element. A Stack is a LIFO (Last In First Out) data structure, which refers at the order the data is processed. → That means that the newest element added to the queue will be processed first.

- **Best to use:** Stacks are useful when the order of actions is important. They ensure that a system does not move to a new action before completing those before. Common examples where stacks are used:

  1. Reversing → By default a data stack will reverse whatever is input.

  2. Undo / Redo → This approach is used in editors to implement the undo redo functionality.

  3. Backtracking → Can be used to solve problems involving choosing paths, like a maze. This is an algorithm we will learn together during this course towards the end.

  4. Call Stack → Programming languages use a data stack to execute code.

- **Time Complexity:**

  - Access: `O(n)`

  - Search: `O(n)`

  - Insert: `O(1)`

  - Remove: `O(1)`

- **Code**:

  - `Java:`

    - [Stack Implementation](https://github.com/andreivisan/interviews/blob/master/datastructures/stacks/java/impl/MyStack.java)

- **Algorithms**:

  - `Java:`

    - [Min Stack](https://github.com/andreivisan/interviews/blob/master/datastructures/stacks/java/algorithms/MinStack.java)

      _Note_: The idea behind the algorithm is to use 2 stacks, one that holds the main data and one that holds the minimums. Once we find a new minimum we add it to both stacks.

    - [Valid Parentheses](https://github.com/andreivisan/interviews/blob/master/datastructures/stacks/java/algorithms/ValidateParentheses.java)

      _Note_: The idea behind the algorithm is to use a map to hold the 3 pairs of parentheses. Iterate through the String and if the top the stack is an open parentheses and the current element in the string is it's closing pair then we pop from the stack. Otherwise we push the element into the stack. We return True if the stack is empty and False otherwise.

  - `Python:`

    - [Min Stack](https://github.com/andreivisan/interviews/blob/master/datastructures/stacks/python/algorithms/min_stack.py)

      _Note_: The idea behind the algorithm is to use 2 stacks, one that holds the main data and one that holds the minimums. Once we find a new minimum we add it to both stacks.

    - [Valid Parentheses](https://github.com/andreivisan/interviews/blob/master/datastructures/stacks/python/algorithms/validate_parentheses.py)

      _Note_: The idea behind the algorithm is to use a map to hold the 3 pairs of parentheses. Iterate through the String and if the top the stack is an open parentheses and the current element in the string is it's closing pair then we pop from the stack. Otherwise we push the element into the stack. We return True if the stack is empty and False otherwise.
