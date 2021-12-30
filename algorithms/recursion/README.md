### Recursion

- **Definition:** Recursion is an approach to solving problems using a function that calls itself as a subroutine. Recursion solves a bigger problem by breaking it down into smaller instances and each one at a time or iteration. The solution to the bigger problem depends on solutions of the smaller instances of the same problem.

- **Structure**

  - **A base case:** which is the simplest, smallest instance of the problem, that can’t be decomposed any further. Base cases often correspond to emptiness – the empty string, the empty list, the empty set, the empty tree, zero, etc.

  - **A recursive step:** which decomposes a larger instance of the problem into one or more simpler or smaller instances that can be solved by recursive calls, and then recombines the results of those subproblems to produce the solution to the original problem.

- **Choosing the Right Decomposition for a Problem**

  The most important step is finding the right way to decompose a problem. Good decompositions are simple, short, easy to understand, safe from bugs, and ready for change.

  1. **Pick up a few examples to understand the algorithm** → Play with simple and more complex examples to understand how to reach the solution.

  2. **Find the base case** → think about situations like when the iteration ends if we had to iterate in reverse (since we are dealing with stacks), or when the input is empty or null , or the simplest case where the problem can’t be decomposed further.

  3. **Find which arguments have to be passed to the recursive function** → To find the recursive function parameters, think about which arguments are recursively decomposed.

  4. **Figure out how to break the argument in 2 pieces**

  - _Simplest case_ → Find the simplest case, or the smallest piece of the decomposed algorithm, which is not the base case.

  - _The rest_ → Also identify what is the rest of the data structure once you split it from the simplest case.

  5. **Solve the problem for the simplest case**

  6. **Find how to combine the answer for each simple case to get the final result** → This is maybe one of the trickiest part of solving a problem recursively. To help you with that think about what data structure does the recursive function return or what is the data structure you are working with and is the result of the problem. That should help you compose each solution to get to the final result.

  7. **If necessary understand what you need to return**

- **Usage**

  Recursion is made for solving problems that can be broken down into smaller, repetitive problems. It is especially good for working on problems that have many possible branches and are too complex to solve iteratively.
  A very good example is searching through a file system.

- **Problems**:

  - `Java:`

    - [Pascal Triangle 2](https://github.com/andreivisan/interviews/blob/master/algorithms/recursion/java/PascalTriangle2.java)

      _Note_: Recursion wise, the idea is to understand that the current result depends on the previous list, which is also the return type of the recursive function. Thus, we store the previous return in a variable by calling our function recursively.

  - `Python:`

    - [Pascal Triangle 2](https://github.com/andreivisan/interviews/blob/master/algorithms/recursion/python/pascal_triangle_2.py)

      _Note_: Recursion wise, the idea is to understand that the current result depends on the previous list, which is also the return type of the recursive function. Thus, we store the previous return in a variable by calling our function recursively.
