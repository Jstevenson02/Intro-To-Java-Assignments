import java.util.Scanner;

import javax.print.event.PrintEvent;

public class theAlphabets
{
    public static void mainTest(String[] args) {
      // menu();
     /* String s = generateChars(65, 65+26);
      String u = generateChars(410, 410+32);
      String x = generateChars(391, 391+25);

      System.out.println(s);
      System.out.println(u);
      System.out.println(x); */
      printAlphabet("1");
    }

    public static void main(String[] args) {
        String choice = menu();
        String alphabet = "";
        while (choice.compareTo("0") != 0)
            {
                printAlphabet(choice);
                choice = menu();
            }
    }

    public static void printAlphabet (String choiceOfAlphabet)
    {
        final int START_ENGLISH_CAPS = 65;
        final int START_ENGLISH_CASE = 97;
        final int START_CYRILLIC_CAPS = 0x410;
        final int START_CYRILLIC_CASE = 0x430;
        final int START_GREEK_CAPS = 0x391;
        final int START_GREEK_CASE = 0x3b1;

        String alphabet = "";
        switch (choiceOfAlphabet)
        {

            case "1":
            alphabet = generateChars(START_ENGLISH_CAPS, START_CYRILLIC_CAPS+26);
            System.out.println(alphabet);
            break;
            
            case "2":
            alphabet = generateChars(START_ENGLISH_CASE, START_CYRILLIC_CASE+26);
            System.out.println(alphabet);
            break;

            case "3":
            alphabet = generateChars(START_CYRILLIC_CAPS, START_CYRILLIC_CAPS+26);
            System.out.println(alphabet);
            break;

            case "4":
            alphabet = generateChars(START_CYRILLIC_CASE, START_CYRILLIC_CASE+26);
            System.out.println(alphabet);
            break;

            case "5":
            alphabet = generateChars( START_GREEK_CAPS, START_GREEK_CAPS+ 24 + 1);
            System.out.println(alphabet);
            break;
            
            case "6":
            alphabet = generateChars( START_GREEK_CASE, START_GREEK_CASE+24 + 1);
            System.out.println(alphabet);
            break;
        }
     }

    public static String generateChars(int ch1, int ch2)
    {
        String chars = "";
        for (int i = ch1; i < ch2; ++i)
        {
            chars += (char) i + " ";
        }
        return chars;
    }

    public static String menu()
    {
        String s = "";
        do
        {
            System.out.println("\n\t0 to quit this program. ");
            System.out.println("\t1 --> Latin alphabet capitals ");
            System.out.println("\t2 --> Latin alphabet lower case ");
            System.out.println("\t3 --> Cyrillic alphabet capitals ");
            System.out.println("\t4 --> Cyrillic alphabet lower case ");
            System.out.println("\t5 --> Greek alphabet capitals ");
            System.out.println("\t6 --> Greek alphabet lower case ");

            System.out.print("Your choice ------>");

            s = new Scanner(System.in).next();
            if ( s.compareTo("0") < 0 || s.compareTo("6") > 0)
            {
                System.out.println("\tplease type 0 to 6");

            }

        }while (s.compareTo("0") < 0 || s.compareTo("6") > 0);
        return s;
    }
}