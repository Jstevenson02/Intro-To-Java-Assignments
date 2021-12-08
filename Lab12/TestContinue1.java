public class TestContinue1 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            if (number == 10 || number == 11) {
                continue;
            } else {
                number++;
                sum += number;
            }
            break;
        }
        System.out.println("The sum is " + sum);
    }
}
