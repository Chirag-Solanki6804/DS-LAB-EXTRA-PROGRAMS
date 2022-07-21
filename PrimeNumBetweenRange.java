//Write a Java Program to Find All Prime Numbers Between Two Number
import java.util.Scanner;
public class PrimeNumBetweenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,count=0;
		System.out.print("Enter start Value : ");
		int start=sc.nextInt();
		if(start==1){
			start=2;
		}
		System.out.print("Enter End Value : ");
		int end=sc.nextInt();
		
	    for(i=start;i<end;i++){
			for (j=2;j<i;j++ ) {
				if(i%j==0){
					count=1;
				}
			}
			if(count==0){
				System.out.println("Prime Number : "+i);
			}else if(count!=0){
				count=0;
			}
		}
	}
}



	
