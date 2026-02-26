# Use Case 2: Palindrome Checker App (Hardcoded)

## Objective
The primary objective of this application is to demonstrate fundamental string manipulation and algorithmic comparison logic in Java. It determines whether a given string is a palindrome (reads the same forwards and backwards) without relying on advanced built-in data structures or functions, such as `StringBuilder.reverse()`.

## Use Case
**Hardcoded Palindrome Validation**
This specific use case serves as a foundational step in application logic. By using a hardcoded string literal (e.g., `"madam"`), it isolates the core palindrome-checking algorithm, making it easier to test, debug, and understand the logic before integrating dynamic user inputs or more complex architectural layers.

## Flow of the Project

1. **Program Initialization:** The Java Virtual Machine (JVM) invokes the `main()` method, acting as the entry point.
2. **Data Storage:** A hardcoded string literal is declared and stored in memory. A boolean flag (`isPalindrome`) is initialized to `true`.
3. **Optimized Iteration:** A `for` loop begins iterating through the string. To optimize performance, the loop only runs up to the mathematical midpoint of the string (`length / 2`).
4. **Character Comparison:** - Inside the loop, the algorithm compares the character at the current index from the *front* of the string with the corresponding character at the *back* of the string.
    - If `input.charAt(i)` does not match `input.charAt(input.length() - 1 - i)`, the `isPalindrome` flag is flipped to `false`, and the loop `break`s early to save processing time.
5. **Conditional Output:** An `if-else` statement evaluates the `isPalindrome` flag.
6. **Program Exit:** The final result is printed to the console via `System.out.println()`, and the program terminates successfully.



## How to Run the Program

**1. Compile the Java file:**
```bash
javac UseCase2PalindromeCheckerApp.java
