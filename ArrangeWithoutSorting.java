import java.util.Scanner;

public class ArrangeWithoutSorting {

    public static int array [] ;
    public static int n ;
    
    public static int [] arrange() {

        int Rearranged [] = new int [n];

        int left = 1 , right = n - 1;
        int minpos = array[0] , maxpos = array[0];

        // if number of elements is odd
        // Starting from left
        if (n % 2 == 1) {

            //Finding Minimum and Maximum

            for (int i = 1; i < n; i++) {
                if (maxpos < array[i])
                    maxpos = array[i];
                if (minpos > array[i])                    
                    minpos = array[i];
            }

            Rearranged [0] = minpos;
            Rearranged [n/2] = maxpos;

            for (int i = 1; right > n/2 && i < n; i++) {
                if (maxpos < array[i] && minpos > array[i]) {
                    maxpos = array[i];
                    Rearranged [right--] = maxpos;
                    break;
                }
                if (minpos > array[i] && maxpos > array[i]) {
                    minpos = array[i];
                    Rearranged [left++] = minpos;
                    break;
                }
            }
        }
        
        // if number of elements is even
        // Starting from right
        else {
            
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
