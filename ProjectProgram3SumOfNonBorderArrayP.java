import java.util.Scanner;

// Design a program/function to find the sum of non-border elements of a regular array(square/rectangular)

public class ProjectProgram3SumOfNonBorderArrayP {

    public static int sumOfNonBorderElements( int array [] [] ) {
        int sum = 0 ;
        if (array.length <=1 ) {
            System.out.println("Non-Border Elements not present.");
        }
        else {
            for (int row = 1; row < array.length-1; row++)
                for (int column = 1; column < array[row].length-1; column++)
                    sum += array [row] [column];
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array [] [] ;
        System.out.println("Enter the number of rows and column of the array");
        array = new int [sc.nextInt()] [sc.nextInt()];
        for (int row = 0; row < array.length; row++) {
            System.out.print("Enter the elements of " + (row+1) + " row :: ");
            for (int col = 0; col < array[row].length; col++) {
                array [row] [col] = sc.nextInt();
            }
        }
        System.out.println("Sum of Non-Border Elements :: " + sumOfNonBorderElements(array) );
        sc.close();
    }
}