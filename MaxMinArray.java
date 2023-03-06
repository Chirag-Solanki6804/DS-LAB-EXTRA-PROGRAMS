//Write A Java Program To Find The Maximum And Minimum Element Of an Array
import java.util.Scanner;
public class MaxMinArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of Array : ");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter Array:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.print("Max Element In Array : "+max);
		System.out.println("\n");
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Min Element In Array : "+min);
	}
	
}
