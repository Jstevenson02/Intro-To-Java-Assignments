import java.util.Arrays;

public class SortCharsInString {

    public static String sort(String s) {
        char[] chars = s.toCharArray();

        for (int j = 0; j < chars.length - 1; j++) {

            if (chars[j] > chars[j + 1]) {

                char temp = chars[j];
                chars[j] = chars[j + 1];
                chars[j + 1] = temp;
                j = -1;
            }
        }
        return Arrays.toString(chars);
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Sorted string is " + sort(s));
    }
}
