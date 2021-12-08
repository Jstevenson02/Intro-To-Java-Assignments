import java.util.Scanner;

public class WhileEvent3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;

        while (true) {
            var input = scan.nextLine();
            try {
                int number = Integer.parseInt(input);
                total += number;
            } catch (NumberFormatException e) {
                if (input.toLowerCase().equals("x")) {
                    System.out.print("Total entered numbers: " + String.valueOf(total));
                    break;
                }
            }
            continue;
        }
        scan.close();
    }
}
