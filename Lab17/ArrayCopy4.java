public class ArrayCopy4 {
    public static   void main(String[] args){
        int[] sourceArray = {1,2,3,4,5};
        int[] targetArray = new int[sourceArray.length];

        // Array Copy using System.arraycopy
        System.arraycopy(sourceArray, 2, targetArray, 0, 3);        
        for(int i=0; i<=sourceArray.length-1; i++){
            System.out.print(targetArray[i] + " ");
        }

        // Reset Target
        System.out.println();
        targetArray = new int[sourceArray.length];

        // Array Copy using For Loop
        int destinationIndex = 0;
        for(int i=2;i<sourceArray.length; i++){            
            targetArray[destinationIndex] = sourceArray[i];
            destinationIndex++;
        }
        for(int i=0; i<=sourceArray.length-1; i++){
            System.out.print(targetArray[i] + " ");        
        }
    } 
}
