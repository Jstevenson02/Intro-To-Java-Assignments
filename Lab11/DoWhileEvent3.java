import java.util.Scanner;

public class DoWhileEvent3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        var input = scan.nextLine();
        do{
        try {
         int num = Integer.parseInt(input);
         sum += num;
        }catch(NumberFormatException  e){
                continue;
        }
            input = scan.nextLine();
        }while(!input.toLowerCase().equals("x"));

     System.out.println("Total of entered numbers is: "+sum);
     scan.close();
    }
}
