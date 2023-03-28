import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Taking User Input For Number of Rows and cols
        System.out.print("Enter Number of Rows In matrix :");
        int rows=sc.nextInt();
        System.out.print("Enter Number of Cols In matrix :");
        int cols=sc.nextInt();

        //declaring 2d arrays
        int[][] matrix1=new int[rows][cols];
        int[][] matrix2=new int[rows][cols];

        //Scanning values of Matrix 1 From User
        System.out.println("Enter Matrix 1 :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        //Printing Matrix 1
        System.out.println("Matrix 1");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix1[i][j]+"  ");
            }
            System.out.println();
        }

        //Scanning values of Matrix 2 From User
        System.out.println("Enter Matrix 2 :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

        //Printing Matrix 2
        System.out.println("Matrix 2");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix2[i][j]+"  ");
            }
            System.out.println();
        }

        //Final Addition of matrix 1 and 2
        System.out.println("Addition of Matrix 1 and 2 :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix1[i][j]+matrix2[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
