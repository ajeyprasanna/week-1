public class PalindromeTest {
    
}
import java.util.*;

public class PalindromeTest {

    static boolean iterative(String text) {
        int left = 0, right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    static boolean recursive(String text, int left, int right) {
        if (left >= right)
            return true;

        if (text.charAt(left) != text.charAt(right))
            return false;

        return recursive(text, left + 1, right - 1);
    }

    static boolean arrayReversal(String text) {
        char[] arr = text.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed.append(arr[i]);
        }

        return text.equals(reversed.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.next();

        System.out.println("Iterative: " +
            (iterative(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: " +
            (recursive(text, 0, text.length() - 1)
            ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: " +
            (arrayReversal(text) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}