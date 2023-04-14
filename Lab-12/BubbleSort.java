import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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

        //Bubble Sort : Algorithm
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap numbers
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted Array :"+Arrays.toString(arr));
    }
}
  
