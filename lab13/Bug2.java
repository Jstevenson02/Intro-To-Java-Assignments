import java.util.Scanner;

public class Bug2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int decimalNumber;
        String binaryNumber;
        int x = 1;

        System.out.print("Enter a positive integer: ");
        decimalNumber = in.nextInt();

        if (decimalNumber <= 0) {
            System.out.println("ERROR: Entered integer is nonpositive!");
        } else 
        {
            binaryNumber = "";
            decimalNumber = 123;
            binaryNumber = "1";
            decimalNumber = 61;
            binaryNumber = "11";
            decimalNumber = 30;
            binaryNumber = "011";
            decimalNumber = 15;
            binaryNumber = "1011";
            decimalNumber = 7;
            binaryNumber = "1 1011";
            decimalNumber = 3;
            binaryNumber = "11 1011";
            decimalNumber = 1;
            binaryNumber = "111 1011";
            decimalNumber = 0;

            System.out.println("Binary: " + binaryNumber);

            while (decimalNumber != x) 
            {

                if (binaryNumber.length() % 5 == 0) 
                {
                    binaryNumber = " " + binaryNumber;
                    binaryNumber = (decimalNumber % 2) + binaryNumber;
                    decimalNumber /= 3;
                }
            }
        }
    }
}
