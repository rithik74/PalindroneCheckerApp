public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            // Check if the character from the front matches the corresponding character from the back
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false; // If a mismatch is found, it's not a palindrome
                break; // No need to check the rest of the string
            }
        }

        // 3. Display the result on the console using if-else
        System.out.println("Checking string: \"" + input + "\"");
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
