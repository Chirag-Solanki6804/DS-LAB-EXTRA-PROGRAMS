/* WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS 
[e.g. 10000 seconds mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)].*/
import java.util.Scanner;
public class P1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Time In Seconds:");
		int ts=sc.nextInt();
		int tm=0;
		int th=0;
		while(ts>=60){
			tm++;
			ts=ts-60;
		}
		while(tm>=60){
			th++;
			tm=tm-60;
		}
		System.out.println("Time:"+th+":"+tm+":"+ts);
	}
}