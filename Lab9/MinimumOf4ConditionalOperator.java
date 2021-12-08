import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class MinimumOf4ConditionalOperator {

    public static void main(String[] args)
    {
      Scanner scan = new Scanner( System.in);

      while (true) { 

        System.out.println("Please neter 4 numbers to find the minimum of the 4:");

            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            int w = scan.nextInt();

            System.out.println((x < y && x < z && x < w) ? "Minimum: " + x : (y < x && y < z && y < w) ? "Minimum: " + y : (z < x && z < y && z < w) ? "Minimum " + z : "Minimum: " + w);
    }
}
}
