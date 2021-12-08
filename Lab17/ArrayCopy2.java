public class ArrayCopy2 {
    public static   void main(String[] args){
        int[] sourceArray = {1,2,3,4,5};
        int[] targetArray = new int[sourceArray.length];

        int destinationIndex = 0;
        for(int i=sourceArray.length-1;i>=0; i--){            
            targetArray[destinationIndex] = sourceArray[i];
            destinationIndex++;
        }
        
        for(int i=0; i<=sourceArray.length-1; i++){
            System.out.print(targetArray[i] + " ");
        }
    } 
}
