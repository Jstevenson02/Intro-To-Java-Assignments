public class TestBreak2 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        for (; number < 20; number++)
        {
            if (sum >= 100)
            {
                break;
            }
            sum += number;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    } 
}

