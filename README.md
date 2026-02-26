# PalindroneCheckerApp
# PalindromeCheckerApp


## Overview
The Palindrome Checker Management System is a console-based Java application designed to evaluate whether a given input is a palindrome.

**Current Status:** Phase 1 (Application Initialization)
Currently, the application is in its foundational stage. The palindrome evaluation logic has not yet been implemented. The primary focus of this phase is to establish a stable entry point, configure the execution environment, and output the initial application metadata to the console.

---

## How It Works (So Far)

This project currently implements **Use Case 1: Application Entry & Welcome Message**. The execution follows a straightforward linear flow:

1. **Program Initialization:** The Java Virtual Machine (JVM) launches the application.
2. **Method Invocation:** The JVM locates and triggers the `main()` method inside the `UseCase1PalindromeCheckerApp` class. Because this method is marked as `static`, the JVM can run it without needing to create an instance of the class first.
3. **Console Output:** * The application prints a formatted welcome banner indicating the software's name.
    * The application prints the current software version (Version 1.0).
4. **Flow Control:** The application prints a final status message ("Startup complete...") and then terminates, as there are no further instructions or loops implemented yet.

---

## How to Run

To run the current version of the application, follow these steps in your terminal or command prompt:

1. **Compile the Java file:**
   ```bash
   javac UseCase1PalindromeCheckerApp.java