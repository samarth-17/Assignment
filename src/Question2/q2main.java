package Question2;

public class q2main {
    public static void main(String[] args) {
        int[] arr={2,4,8,9,10};
        int target=8;

        System.out.println("Linear Seacrh : " + linearSearch.searchMethod1(arr , target));
        System.out.println("Binary Search : " + binarySearch.search(arr,target));
    }
}
