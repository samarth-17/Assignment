package Question2;

public class linearSearch {
    public static int searchMethod1(int[] arr , int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
