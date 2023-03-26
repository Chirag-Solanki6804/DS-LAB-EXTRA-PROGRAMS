import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Taking Input From User
        System.out.print("Enter Number :");
        int number=sc.nextInt();

        //main logic to find factorial
        int factorial=1;
        for(int i=number;i>0;i--){
            factorial=factorial*i;
        }

        System.out.println("Factorial of "+number+" is :"+factorial);
    }
}
