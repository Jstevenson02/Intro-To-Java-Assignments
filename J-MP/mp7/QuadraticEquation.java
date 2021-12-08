/**
 (Algebra: quadratic equations) Design a class named
 * QuadraticEquation for a quadratic equation ax2 + bx + x = 0. The class
 * contains: 
 * ■ Private data fields a, b, and c that represent three
 * coefficients. 
 * ■ A constructor for the arguments for a, b, and c. 
 * ■ Three getter methods for a, b, and c. 
 * ■ A method named getDiscriminant() that
 * returns the discriminant, which is b2 - 4ac. 
 * ■ The methods named getRoot1()
 * and getRoot2() for returning two roots of the equation
 * 
 *  r1 = -b + SQRT( b2 - 4ac)  / 2a
    and r2 = -b - SQRT( 2b2 - 4ac ) / 2a
    These methods are useful only if the discriminant is postive. Let these methods
    return 0 if the discriminant is negative.
 */
import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation
{
    private double _A = 0;
    private double _B = 0;
    private double _C = 0;

    public QuadraticEquation(Double A, Double B, Double C)
    {
        _A = A;
        _B = B;
        _C = C;
    }

    public double getA()
    {
        return _A;
    }
    public double getB()
    {
        return _B;
    }
    public double getC()
    {
        return _C;
    }            
    
    public double getDiscriminant()
    {
        return Math.sqrt(_B) - 4*(_A*_C);
    }

    public double getRoot1()
    {
        if (getDiscriminant() > 0)
        {
            return -_B + Math.sqrt((_B*2) - 4*(_A*_C));
        }
        else
        {
            return 0;
        }
    }

    public double getRoot2()
    {
        if (getDiscriminant() > 0)
        {
            return -_B - Math.sqrt((2* (_B*2) - 4*(_A*_C)));
        }
        else
        {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " _A='" + getA() + "'" +
            ", _B='" + getB() + "'" +
            ", _C='" + getC() + "'" +
            "}";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers A, B, C: ");

        QuadraticEquation equation = new QuadraticEquation(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());

        System.out.println("A: " + equation.getA());
        System.out.println();
        System.out.println("B: " + equation.getB());
        System.out.println();
        System.out.println("C: " + equation.getC());
        System.out.println();
        System.out.println("Discriminant: " + equation.getDiscriminant());
        System.out.println();
        System.out.println("Root 1: " + equation.getRoot1());
        System.out.println();
        System.out.println("Root 2: " + equation.getRoot2());
    }
}
    
