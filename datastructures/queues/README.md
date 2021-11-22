### Queues

- **Definition:** A *Queue* is a collection of elements, supporting two principle operations: *enqueue*, which inserts an element into the queue, and *dequeue*, which removes an element from the queue. A Stack is a FIFO (First In First Out) data structure, which refers at the order the data is processed. → That means that the first element added to the queue will be processed first.

- **Best to use:** Queues are useful when things don’t have to be processed immediately, but have to be processed in First In First Out order. Common scenarios where queues are used:

  1. When a resource is shared among multiple consumers → Examples include CPU Scheduling, Disk Scheduling.

  2. When data is transferred asynchronously between two processes → some examples are: IO Buffers, pipes, file IO.

  3. In Operating Systems → For Semaphores or Buffer for devices like the keyboard.

  4. In Networks → Queues in routers or switches and Mail Queues.

- **Time Complexity:**

  - Access: `O(n)`

  - Search: `O(n)`

  - Insert: `O(1)`

  - Remove: `O(1)`

- **Code**:

  - `Java:`

    - [Queue Implementation](https://github.com/andreivisan/interviews/blob/master/datastructures/queues/java/impl/MyQueue.java)
