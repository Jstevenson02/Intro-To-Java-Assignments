import java.util.Scanner;
public class FIndUnicodeOfCharacter {
    public static void main(String[] args) {
     String uniconv = "";
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter a character to recieve the Unicode equivalent: ");
     uniconv = input.nextLine();
     int a = (int)uniconv.charAt(0);

     System.out.println("Your string " + uniconv + " is " + a + " in unicode!");

     input.close();
    }
}