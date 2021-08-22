### Arrays

- **Definition:** A linear collection of data values that are accessible at numbered indices, starting at index 0.

- **Variations**

  - **Static array:** is an implementation of an array that allocates a fixed amount of memory to be used for storying the array's values.

  - **Dynamic arrays:** is an implementation of an array that preemptively allocates double the amount of memory needed to store the array's values. Thus appending values to an array is a constant time operation until the allocated memory is filled up, at which point the array is copied and double the memory is once again allocated for it. 2 things to note:

    1. In some languages arrays are automatically implemented as dynamic arrays (e.g. Python and Javascript).

    2. Some operating systems might allocate different than double the amount of memory needed. But for the sake of simplicity we consider double the memory.

  **Best to use:** Array allows for efficient _reading_ of elements from any position in the sequence during iteration. A drawback is that _writing_ time is linear. So it is best to use when you have a lot of reading and not a lot of writing of data.

- **Time Complexity:**

  - Access: `O(1)`
  - Update: `O(1)`
  - Insert: `O(n)`

        Exception when inserting at the end for a dynamic array: `O(1)`

  - Remove: `O(n)`

        Exception when remove a value at the end: `O(1)`

- **Code**:

  - `Java:`

    - [Array Operations](https://github.com/andreivisan/interviews/blob/master/datastructures/arrays/java/impl/Operations.java)

  - `Python:`

    - [Array Operations](https://github.com/andreivisan/interviews/blob/master/datastructures/arrays/python/operations.py)
