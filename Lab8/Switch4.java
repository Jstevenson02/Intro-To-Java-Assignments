package lab8;
import java.util.Scanner;
public class Switch4 {
 
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a day of the week (Monday - Sunday): ");
        String day = input.nextLine();
        
        switch (day) {
            case "Monday": System.out.println("Monday" + " " + 1); break;
            case "Tuesday": System.out.println("Tuesday" + " " + 2); break;
            case "Wednesday": System.out.println("Wednesday" + " " + 3); break;
            case "Thursday": System.out.println("Thursday" + " " + 4); break;
            case "Friday": System.out.println("Friday" + " " + 5); break;
            case "Saturday": System.out.println("Saturday" + " " + 6); break;
            case "Sunday": System.out.println("Sunday" + " " + 7); break;
        }
    }
}