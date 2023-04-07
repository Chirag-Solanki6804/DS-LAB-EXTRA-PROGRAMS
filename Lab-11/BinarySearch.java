import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //declaring array as per user given size
        System.out.print("Enter Size Of Array :");
        int size=sc.nextInt();
        int[] arr=new int[size];

        //scanning values of array
        System.out.println("Enter Values Of Array :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //main Logic of binary Search
        System.out.println("Enter Number to Search :");
        int search=sc.nextInt();

        //calling BinarySearch function

        System.out.println(binarySearch(arr,search));

    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
//           find the middle element
//           int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
