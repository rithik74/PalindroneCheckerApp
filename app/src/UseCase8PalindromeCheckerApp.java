import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListPalindrome {

    Node head;

    // Add character to linked list
    void add(char data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Reverse linked list
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Check palindrome
    boolean isPalindrome() {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle using fast and slow pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // Compare halves
        Node temp = secondHalf;
        while (temp != null) {
            if (firstHalf.data != temp.data)
                return false;

            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }
}

public class UseCase8PalindromeCheckerApp
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LinkedListPalindrome list = new LinkedListPalindrome();

        // Convert string to linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Check palindrome
        if (list.isPalindrome()) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}