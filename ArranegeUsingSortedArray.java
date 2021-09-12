import java.util.Scanner;

public class ArranegeUsingSortedArray {

    public static int array [] ;
    public static int n ;

    public static int [] arrange() {

        java.util.Arrays.sort(array);

        int Rearranged [] = new int [n];

        int left = 0 , right = n - 1;

        // if number of elements is odd
        // Starting from left
        if (n % 2 == 1) {

            // Filling the centeral element
            Rearranged [(n/2)] = array [n -1] ;

            for (int i = 0; right > (n/2); i++ ) {

                // Filling the elements simultaneously
                Rearranged [left++] = array [i] ;
                Rearranged [right--] = array [++i];

            }
        }
        
        // if number of elements is even
        // Starting from right
        else {
            for (int i = 0; right > (n/2) -1; i++) {
                
                // Filling the elements simultaneously
                Rearranged [right--] = array [i];
                Rearranged [left++] = array [++i];

            }
        }
        return Rearranged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of Array");
        n = sc.nextInt();
        array = new int [n];
        
        System.out.println("Enter the elements");
        
        for (int i = 0; i < array.length; i++)
            array [i] = sc.nextInt();
        
        System.out.println("Original Array " + java.util.Arrays.toString(array));
        
        System.out.println("Rearranged Array " + java.util.Arrays.toString(arrange()));
        
        sc.close();
    }
}
