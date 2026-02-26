import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC5 - Stack Based) ===");
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare with original string
        for (int i = 0; i < inputString.length(); i++) {
            char poppedChar = stack.pop();

            if (inputString.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}