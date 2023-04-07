import java.util.Scanner;

public class LinearSearch {
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

        //main Logic of Linear Search
        System.out.println("Enter Number to Search :");
        int search=sc.nextInt();
        int foundIndex=-1;
        for(int i=0;i<size;i++){
            if(search==arr[i]){
                foundIndex=i;
                break;
            }
        }

        //Final decision-making
        if(foundIndex!=-1){
            System.out.println("Search Found at Index :"+foundIndex);
        }else{
            System.out.println("Number not found in array");
        }

    }
}
