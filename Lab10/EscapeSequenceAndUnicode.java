package repo;

public class EscapeSequenceAndUnicode {

    public static void main(String[] args) {

        System.out.println("I delete the last 3 characterssss\b\b\b   ");
        System.out.println("\t\tI used 2 tabs here ");
        System.out.println("I printed a \" inside quotes ");

        char b = 'b';
        char bCapital = 66;
        char a = '\u0061';
        char aCapital = 0x41;
        char greekAlpha = '\u03b1';

        System.out.println("I print in latin and in greek ---> "
        + b + " " + bCapital + " " + aCapital + " " + a + greekAlpha);

    }
}
