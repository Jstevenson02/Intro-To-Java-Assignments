import java.util.Scanner;
public class Palindrome2 {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;
        for (low = 0; low < high; high--) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
            }
            low++;
        }
        if (isPalindrome) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
