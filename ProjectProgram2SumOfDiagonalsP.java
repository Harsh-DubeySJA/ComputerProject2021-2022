import java.util.Scanner;

// Write a program to create and load a 2D array of size N*N. 
// Display the sum of elements which lie  on the diagonals (either primary diagonal or secondary diagonal). 
// Overlapping elements must not be added twice.

// Example:
// N: 4
// 1 1 1 1
// 1 1 1 1
// 1 1 1 1
// 1 1 1 1
// Sum = 8

public class ProjectProgram2SumOfDiagonalsP {

    public static void diagonalSum( int array [] [] ) {
        int sum = 0;
        int last = array.length-1;
        if (array.length%2 == 1) {
            int common = array.length/2;
            sum += array [common] [common];
            for (int i = 0; i < array.length; i++ , last--) {
                if (i == common || last == common)   break ;
                sum += array [i] [i] + array [last] [last]; // Primary Diagonal
                sum += array [i] [last] + array [last] [i]; // Secondary Diagonal
            }
        }
        else {
            for (int i = 0; i < array.length/2; i++ , last--) {
                sum += array [i] [i] + array [last] [last]; // Primary Diagonal
                sum += array [i] [last] + array [last] [i]; // Secondary Diagonal
            }
        }
        System.out.println("Sum of primary and secondary diagonals is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int array [] [] ;
        System.out.println("Enter the value of N to get the sum of its diagonals :: ");
        int c = sc.nextInt();
        array = new int [c] [c];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter elements of " + (i+1) + " row :: ");
            for (int j = 0; j < array.length; j++)
                array [i] [j] = sc.nextInt();
        }
        diagonalSum(array);
        sc.close();
    }
}