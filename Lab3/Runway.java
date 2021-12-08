import java.util.Scanner;

public class Runway
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed in (m/s): ");
        double velocity;
        velocity = input.nextDouble();

        // Ask for input
        System.out.println("Enter the acceleration speed in (m/s):  ");
        double acceleration;
        acceleration = input.nextDouble();

        // Calculate
        double length;
        length = (Math.pow(velocity, 2) / (2 * acceleration));
        System.out.println("The length of the runway is: " + length);

    }
}
