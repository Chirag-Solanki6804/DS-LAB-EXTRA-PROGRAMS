import java.util.Scanner;
/*
*
* *
* * *
* * * *
* * * * *
*/
public class P1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number Of Rows : ");
		int r=sc.nextInt();
		System.out.print("Enter Number Of Columns : ");
		int c=sc.nextInt();
        System.out.print("\n---------PATTREN---------\n\n");
		for(int i=1;i<=r;i++){
			for(int j=1;j<=c;j++){
				if(j<=i){
				    System.out.print("* ");
			    }
			    else{
			    	System.out.print(" ");
			    }
			}
			System.out.print("\n");
		}
		System.out.print("\n--------------------------------");
	}
}