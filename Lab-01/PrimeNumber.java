import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Taking Input From User
        System.out.print("Enter Number :");
        int number=sc.nextInt();

        //main Logic to check prime number
        boolean isPrime=true;
        if(number<2){
            isPrime=false;
        }else{
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        //final decision-making
        if(isPrime){
            System.out.println(number+" is Prime Number");
        }else{
            System.out.println(number+" is Not Prime Number");
        }
    }
}
