import java.util.Scanner;

class SortTest {
    public static boolean isSorted(int a[]) {
        boolean isAscending = true, isDescending = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] < a[i])
                isAscending = false;
            if (a[i + 1] > a[i])
                isDescending = false;
            if (!isAscending && !isDescending)
                break;
        }
        return isAscending || isDescending;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array to be checked for sorting:");
        int array [] = new int[sc.nextInt()];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < array.length; i++)
            array [i] = sc.nextInt();
        if (isSorted(array))
            System.out.println("Entered array is sorted.");
        else
            System.out.println("Entered array is not sorted.");
        sc.close();
    }
}
