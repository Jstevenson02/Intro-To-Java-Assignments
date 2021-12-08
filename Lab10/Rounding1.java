package repo;

public class Rounding1 {
    public static void main(String[] args) {
        System.out.println("Math.ceil(2.1) returns " + Math.ceil(2.1));
        System.out.println("Math.ceil(2.0) returns " + Math.ceil(2.0));
        System.out.println("Math.ceil(-2.0) returns " + Math.ceil(-2.0));
        System.out.println("Math.ceil(-2.1) returns " + Math.ceil(-2.1));

        System.out.println("Math.floor(2.1) returns " + Math.floor(2.1));
        System.out.println("Math.floor(2.0) returns " + Math.floor(2.0));
        System.out.println("Math.floor(-2.0) returns " + Math.floor(-2.0));
        System.out.println("Math.floor(-2.1) returns " + Math.floor(-2.1));

        System.out.println("Math.rint(2.1) returns " + Math.rint(2.1));
        System.out.println("Math.rint(2.0) returns " + Math.rint(2.0));
        System.out.println("Math.rint(-2.0) returns " + Math.rint(-2.0));
        System.out.println("Math.rint(-2.1) returns " + Math.rint(-2.1));
        System.out.println("Math.rint(2.5) returns " + Math.rint(2.5));
        System.out.println("Math.rint(-2.5) returns " + Math.rint(-2.5));

        System.out.println("Math.rint(-2.6f) returns " + Math.round(-2.6f));
        System.out.println("Math.rint(2.6) returns " + Math.round(2.0));
        System.out.println("Math.rint(-2.0f) returns " + Math.round(-2.0f));
        System.out.println("Math.rint(-2.6) returns " + Math.round(-2.6));
    }
}
