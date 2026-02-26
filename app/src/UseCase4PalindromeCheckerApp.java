import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC4) ===");
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert string to character array
        char[] charArray = inputString.toCharArray();

        boolean isPalindrome = true;

        // Two-pointer technique
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}