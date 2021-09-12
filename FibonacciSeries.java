import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to generate Fibonacci Series: ");
        int terms = sc.nextInt();
        Fibonacci f = new Fibonacci();
        for (int term = 0; term < terms; term++) {
            System.out.println(f.getTerm());
            f.generateNext();
        }
        sc.close();
    }
}