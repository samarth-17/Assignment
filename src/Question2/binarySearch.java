package Question2;

import java.util.Arrays;

public class binarySearch {
    public static int search(int[] arr , int  target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left + (right-left)/2;

            if(target<arr[mid]){
                right=mid-1;
            }
            else if(target>arr[mid]){
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
