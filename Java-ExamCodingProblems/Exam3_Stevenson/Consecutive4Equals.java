public class Consecutive4Equals {
    public static boolean isConsecutiveFor(int[] values) {
        int count = 1;

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1])
                count++;

            if (count >= 4)
                return true;

            if (values[i] != values[i + 1])
                count = 1;
        }
        return false;
    }
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("\nEnter the number of values, -1 to quit.");
            int size = input.nextInt();

            if (size == -1) {
                System.out.println("goodbye!");
                break;
            }

            int[] values = new int[size];
            System.out.println("Enter the values: ");

            for (int i = 0; i < values.length; i++) {
                values[i] = input.nextInt();
            }

            if (isConsecutiveFor(values)) {
                System.out.println("The list has consecutive fours");
            } else {
                System.out.println("The list has no consecutive fours");
            }
        }
    }
}
