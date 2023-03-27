/* Read n numbers in an array then read two different numbers,
 replace 1st number with 2nd number in an array
 and print its index and final array. */

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Size of Array :");
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];

        //Scanning Array values
        for(int i=0;i<sizeOfArray;i++){
            arr[i]=sc.nextInt();
        }

        //Taking Input for Replace
        System.out.print("Select Number From "+Arrays.toString(arr)+":");
        int numberOne=sc.nextInt();

        System.out.print("Replace "+numberOne+" with :");
        int numberTwo=sc.nextInt();

        //Replacing Number using Linear Search algorithm
        for(int i=0;i<sizeOfArray;i++){
            if(arr[i]==numberOne){
                arr[i]=numberTwo;
            }
        }
        System.out.print("Final Array :"+Arrays.toString(arr));
    }
}
