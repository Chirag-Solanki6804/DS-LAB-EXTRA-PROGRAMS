import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size=sc.nextInt();

        //declaring and scanning values of array
        int[] arr = new int[size];
        System.out.println("Enter Values Of Array");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //Insertion Sort : Algorithm
        for (int i=1;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            while (j>=0 && temp<=arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        System.out.println("Sorted Array :"+ Arrays.toString(arr));
    }
}
