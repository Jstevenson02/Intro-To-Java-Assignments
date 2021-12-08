package lab4;
import java.util.Scanner;
        
public class Payroll {
    public static void main(String[] args) {
       
        // Initialize variables
        Scanner input = new Scanner(System.in);
        String name = " ";
        double weeklyHoursWorked = 0.0;
        double hourlyPay = 0.0;
        double federalTax = 0.0;
        double stateTax = 0.0;
        
        // Collect data
        System.out.println("What is your name? ");
        name = input.next();
        System.out.println("How many hours have you worked? " );
        weeklyHoursWorked = input.nextDouble();
        System.out.println("What is your hourly pay? ");
        hourlyPay = input.nextDouble();
        System.out.println("What is the Federal Tax rate? ");
        federalTax = input.nextDouble();
        System.out.println("What is the State Tax rate? ");
        stateTax = input.nextDouble();
        
        // Print result
        System.out.println("Employee Name: " + name);

        System.out.println("Hours Worked: " + weeklyHoursWorked);

        double grossPay = hourlyPay * weeklyHoursWorked;
        System.out.println("Pay Rate: $" + hourlyPay);
        System.out.println("Gross pay: $" + grossPay );
        
        
        double totalFed = grossPay * federalTax;
        double totalState = grossPay * stateTax;
        double totalTax = totalState + totalFed;

        System.out.println("Deductions: ");
        System.out.println("    Federal Withholding" + "(%" + federalTax * 100 + ")" +": $" + totalFed);
        System.out.println("    State Withholding" + "(%" + stateTax * 100 + ")" +": $" + totalState);
        
        System.out.println("Total Deduction: $" + totalTax);
        
        
    }
}
