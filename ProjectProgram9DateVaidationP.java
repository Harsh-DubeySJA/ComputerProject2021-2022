import java.util.Scanner;

// Design a function isValidDate() to check whether a date given in DD/MM/YYYY format is a valid date or not.
// A date is considered valid if:
// Day is in the correct range for the corresponding month
// Month should be 1-12
// Year can be positive number.


public class ProjectProgram9DateVaidationP {
    private static String Date ;

    public static void isValidDate() {
        int dd , mm , yyyy ;
            dd = Integer.parseInt(Date.substring(0, 2)) ;
            mm = Integer.parseInt(Date.substring(3, 5)) ;
            yyyy = Integer.parseInt(Date.substring( 6 )); 
        int month [] [] = new int [12] [1] ;

        
        if ( yyyy %4 == 0) {
            if ( yyyy %100 == 0 && yyyy %400 ==0 )
                month [1] [0] = 29;
            else
                month [1] [0] = 28;
        }
        else    month [1] [0] = 28;

        for (int i = 0; i < month.length; i++) {
            if ( i <7 ) {
                if ( i%2==0 ) {
                    month [i] [0] = 31;
                    continue;
                }
                if ( i%2 == 1 && i != 1)
                    month [i] [0] = 30;
            }
            else {
                if ( i%2 == 1 )
                    month [i] [0] = 31;
                else
                    month [i] [0] = 30;
            }
        }

        if ( yyyy > 999 && mm > 0 && mm <13 && 0 < dd && dd <= month [mm-1] [0] ) {
            System.out.println( Date + " is a Valid Date.");
        }
        else
            System.out.println( Date + " is not a Valid Date.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a date(DD/MM/YYYY) to check its validation :: ");
        Date = sc.next() ;
        isValidDate() ;
        sc.close() ;
    }
}
