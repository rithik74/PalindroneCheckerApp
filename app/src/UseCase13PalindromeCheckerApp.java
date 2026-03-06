import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Reverse String Method
    public static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Two Pointer Method
    public static boolean twoPointerMethod(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 3: Stack Method
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse Method Timing
        long startTime1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long endTime1 = System.nanoTime();

        // Two Pointer Timing
        long startTime2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long endTime2 = System.nanoTime();

        // Stack Method Timing
        long startTime3 = System.nanoTime();
        boolean result3 = stackMethod(input);
        long endTime3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1 + " | Time: " + (endTime1 - startTime1) + " ns");
        System.out.println("Two Pointer Method: " + result2 + " | Time: " + (endTime2 - startTime2) + " ns");
        System.out.println("Stack Method: " + result3 + " | Time: " + (endTime3 - startTime3) + " ns");

        sc.close();
    }
}