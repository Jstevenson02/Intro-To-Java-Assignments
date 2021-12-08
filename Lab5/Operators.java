public class Operators {
    public static void main(String[] args) {
        int x = 8;
        int y = 15;
        double d = 2; 
        
        x = ++x + 1;

        y = y += 5;

        d = d++ + 1;

        double z1 = d++ * x / y;
        // System.out.println(z1);

        double z2 = (x*d)/y  ;
        // System.out.println(z2);

        double z3 = (x*d)/y;



        System.out.println(z3);
        System.out.println("x = " + x  + " " + "y = " + y + " " + "d = " + d + " " + "z1 = " + z1 + " " + "z2 = " + z2 + " " + "z3 = " + z3);


    }
}
