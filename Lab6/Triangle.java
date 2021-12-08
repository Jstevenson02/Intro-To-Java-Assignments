import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a point X and a point Y: ");
       double xp = input.nextDouble();
       double yp = input.nextDouble();
       double x1 = 0;
       double x2 = 0;
       double y1 = 100;
       double y2 = 0;
       double x3 = 200;
       double y3 = 0;
       double c1 = (x2-x1)*(yp-y1)-(y2-y1)*(xp-x1);
       double c2 = (x3-x2)*(yp-y2)-(y3-y2)*(xp-x2);
       double c3 = (x1-x3)*(yp-y3)-(y1-y3)*(xp-x3);
    if (c1<0 && c2<0 && c3<0 || c1>0 && c2>0 && c3>0)
    System.out.println("The point is in the triangle.");
       else
    System.out.println("The point is outside the triangle.");
    }
}