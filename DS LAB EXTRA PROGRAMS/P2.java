/* WAP to convert number of days into year, week & days 
[e.g. 375 days mean 1 year, 1 week and 3 days].*/
import java.util.Scanner;
public class P2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Total Days:");
		int d=sc.nextInt();
		int y=0;
		int m=0;
		int w=0;
		while(d>=365){
			y++;
			d=d-365;
		}
		while(d>=30){
			m++;
			d=d-30;
		}
		while(d>=7){
			w++;
			d=d-7;
		}
		System.out.println(y+" Year:"+m+" Month:"+w+" Week :"+d+" Days");

		
	}
}