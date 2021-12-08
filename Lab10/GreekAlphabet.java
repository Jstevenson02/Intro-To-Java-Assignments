package repo;

import java.util.Random;

public class GreekAlphabet {
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Lowercase Greek letter: " + "αβγδεζηθικλμνξοπρστυφχψω".charAt(random.nextInt("αβγδεζηθικλμνξοπρστυφχψω".length())) + "\n");
        System.out.println("Uppercase Greek letter: " + "ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣςΤΥΦΧΨΩ".charAt(random.nextInt("ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣςΤΥΦΧΨΩ".length())) + "\n");
    }
}