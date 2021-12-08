import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        System.out.println("Please type a score between 0 - 100 to print a letter grade: ");
        Scanner scan = new Scanner(System.in);
        double enteredGrade = scan.nextDouble();
        if (enteredGrade >= 90)
            System.out.println("A for exam score: " + enteredGrade);
        else if (enteredGrade >= 80)
            System.out.println("B for exam score: " + enteredGrade);
        else if (enteredGrade >= 70)
            System.out.println("C for exam score: " + enteredGrade);
        else if (enteredGrade >= 60)
            System.out.println("D for exam score: " + enteredGrade);
        else if (enteredGrade >= 0)
            System.out.println("F for exam score: " + enteredGrade);
    }
}