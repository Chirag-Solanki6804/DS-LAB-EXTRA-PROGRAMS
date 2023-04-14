import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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

        //Selection Sort : Algorithm
        for (int i=0;i<arr.length-1;i++){
            int minIndex=i;

            //finding minIndex in unsorted array
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            if(minIndex!=i){
                //swap minIndex with i index
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }

        System.out.println("Sorted Array :"+ Arrays.toString(arr));
    }
}
