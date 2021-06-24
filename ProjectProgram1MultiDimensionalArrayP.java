import java.util.Scanner;

// Design a program to create and load an araay of size M X N. M.N will be entered by the user.
// Calculate and display the sum of each column of the array

public class ProjectProgram1MultiDimensionalArrayP {

    public static void resultSum(int array [] []) {
        int sum = 0 ;
        int row = 0 ;
        int column = 0 ;
        for (; row < array.length; row++) {
            sum += array [row] [column] ; //row changes but column remains constant
            if (row == array.length-1) {
                System.out.println("Sum of " + (column+1) + " column is :: " +sum); //Column-wise Sum
                if (column == array[row].length-1)
                    break ;
                row = -1 ;
                column ++ ;
                sum = 0 ;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array [] [] ;
        System.out.print("Enter length of row and column :: ");
        array = new int [sc.nextInt()] [sc.nextInt()] ;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the elements of " + (i+1) + " row :: ");
            for (int j = 0; j < array[i].length; j++)
                array [i] [j] = sc.nextInt() ;
        }
        resultSum(array);
        sc.close();
    }
}