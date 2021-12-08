public class ArrayCopy3 {
    public static   void main(String[] args){
        int[] sourceArray = {1,2,3,4,5};
        int[] targetArray = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        
        for(int i=0; i<=sourceArray.length-1; i++){
            System.out.print(targetArray[i] + " ");
        }
    } 
}
