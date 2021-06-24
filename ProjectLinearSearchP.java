import java.util.Scanner;

public class ProjectLinearSearchP {
    public static int linearSearch(int a[], int item){
        // return the position of 'item' in array 'a', if found else return -1
        int foundAt=-1;
        for(int pos=0; pos<a.length-1;pos++){
            if(a[pos]==item){
                foundAt=pos;
                break;
            }
        }
        return foundAt;//not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements :: ");
        int array[] = new int[sc.nextInt()];
        System.out.println("Enter elements :: ");
        for (int i = 0; i < array.length; i++)
            array [i] = sc.nextInt();
        System.out.print("Enter the element to be serached for :: ");
        int item = sc.nextInt();
        sc.close();
        System.out.println("Element present at " + linearSearch(array,item) + " position");
        System.out.println(java.util.Arrays.toString(array));
    }
}