public class TestContinue2 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        for (; number < 20; number++) {
            if (number == 10 || number == 11) {
                continue;
            }
            number++;
            sum += number;
            break;
        }
        System.out.println("The sum is " + sum);
    }
}
