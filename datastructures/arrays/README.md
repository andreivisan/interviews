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

- **Algorithms**:

  - `Java:`

    - [Duplicate Zeros](https://github.com/andreivisan/interviews/blob/master/datastructures/arrays/java/algorithms/DuplicateZeros.java)

      _Note_: The idea behind the algorithm is to first count the number of zeros. After that go through the array in reverse order and we insert at the index + the number of zeros as long as index + number of zeros is less than the original array's length. If the value at current index is zero, we decrease the number of zeros as we already encountered and dealt with one, and insert again just like before.

    - [Merge Sorted Array](https://github.com/andreivisan/interviews/blob/master/datastructures/arrays/java/algorithms/MergeSortedArrays.java)

      _Note_: The idea behind the algorithm is to create 3 pointers and start iterating from the end. First pointer will be initialized at `m + n - 1`, second to `m - 1` and third to `n - 1`. Then if third pointer is less than zero we break because it means we used all the elements from second array and the remaining elements in the first array are clearly already sorted so, we can stop. Then we compare the values and start adding to the first array.

    - [Two Sum II](https://github.com/andreivisan/interviews/blob/master/datastructures/arrays/java/algorithms/TwoSum2.java)

      _Note_: Two Pointer Technique Scenario 1 (See Strings)

  - `Python:`

    - [Duplicate Zeros](https://github.com/andreivisan/interviews/blob/master/datastructures/arrays/python/algorithms/duplicate_zeros.py)

      _Note_: The idea behind the algorithm is to first count the number of zeros. After that go through the array in reverse order and we insert at the index + the number of zeros as long as index + number of zeros is less than the original array's length. If the value at current index is zero, we decrease the number of zeros as we already encountered and dealt with one, and insert again just like before.

    - [Merge Sorted Array](https://github.com/andreivisan/interviews/blob/master/datastructures/arrays/python/algorithms/merge_sorted_array.py)

      _Note_: The idea behind the algorithm is to create 3 pointers and start iterating from the end. First pointer will be initialized at `m + n - 1`, second to `m - 1` and third to `n - 1`. Then if third pointer is less than zero we break because it means we used all the elements from second array and the remaining elements in the first array are clearly already sorted so, we can stop. Then we compare the values and start adding to the first array.

    - [Two Sum II](https://github.com/andreivisan/interviews/blob/master/datastructures/arrays/python/algorithms/two_sum_2.py)

      _Note_: Two Pointer Technique Scenario 1
