public class Array1
{
    public static void main(String[] args) {
        
    double[] myList1 = {1.1, 2.1, 3.1, 4};
    double[] myList2 = new double[4];
   
    myList2[0] = -1.1;
    myList2[1] = -2.1;
    myList2[2] = -3.1;
    myList2[3] = -4.1;

    System.out.println(myList1[2]);
    System.out.println(myList2[2]);

    }
}