### Strings

- **Definition:** A String is typically stored in memory as an array of integers where each character has been mapped to an integer. → The way this has been done is through character encoding standards like for example ASCII. In ASCII, for example, upper case A has value 65.

- **Variations**

  - **Mutable String:** In some languages like C++ Strings are mutable. That means that we can modify a String in place, there is no need to create a copy of it and alter the copy.

  - **Immutable String:** In popular languages like Python, Java, JS etc - Strings are immutable. →This means that you can't alter them once you created them. If you want to alter a String then a new one is created and the respective changes are made to it.

- **Time Complexity:**

  - Access: `O(1)` - Space and Time
  - Copy: `O(n)` - Space and Time
  - Traverse: Time: `O(n)` || Space: `O(1)`

- **Algorithms**:

  - `Java:`

    - [Add Binary](https://github.com/andreivisan/interviews/blob/master/datastructures/strings/java/algorithms/AddBinary.java)

      _Note_: Addition always starts at the end and it has to continue for the length of the longest number. Another thing to remember is to keep a carry for when the sum of 2 digits is higher than 1 (since we add binary numbers). To manipulate and add 1 or 0 depending on the value of the sum, we append sum mod 2. We update the carry to sum div 2. At the end, if carry is 1 then it needs to be appended to the final result.

  - `Python:`

    - [Add Binary](https://github.com/andreivisan/interviews/blob/master/datastructures/strings/python/algorithms/add_binary.py)

      _Note_: Addition always starts at the end and it has to continue for the length of the longest number. Another thing to remember is to keep a carry for when the sum of 2 digits is higher than 1 (since we add binary numbers). To manipulate and add 1 or 0 depending on the value of the sum, we append sum mod 2. We update the carry to sum div 2. At the end, if carry is 1 then it needs to be appended to the final result.

  - _Two-Pointer Technique_

    - **_Scenario 1_** : one of the typical scenarios to use two-pointer technique is that you want to _Iterate the array from two ends to the middle_ . So you can use the two-pointer technique: _One pointer starts from the beginning while the other pointer starts from the end_ .

    - **_Scenario 2_** : _One slow-runner and one fast-runner at the same time_ . The key to solving this kind of problems is to _Determine the movement strategy for both pointers_ . Similar to the previous scenario, you might sometimes need to sort the array before using the two-pointer technique. And you might need a greedy thought to determine your movement strategy.

    - `Java:`

      - [Reverse String](https://github.com/andreivisan/interviews/blob/master/datastructures/strings/java/algorithms/ReverseString.java)

        _Note_: Two Pointer Technique Scenario 1

    - `Python:`

      - [Reverse String](https://github.com/andreivisan/interviews/blob/master/datastructures/strings/python/algorithms/reverse_string.py)

        _Note_: Two Pointer Technique Scenario 1
