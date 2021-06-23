import java.util.Scanner;

class ProjectInsertionSortP {
    public static void insertionSort(int array[]) {//sort the array in ascending order
        int temp, x;
        for(int i=1; i<array.length;i++){
            temp=array[i];
            x=i-1;
            while(x>=0 && temp<array[x]){
                array[x+1]=array[x];
                x--;
            }
            array[x+1]=temp;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be sorted :: ");
        int array[] = new int[sc.nextInt()];
        System.out.println("Enter Elements to be sorted :: ");
        for (int i = 0; i < array.length; i++)
            array [i] = sc.nextInt();
        sc.close();
        insertionSort(array);
        System.out.println("Sorted Array :: " + java.util.Arrays.toString(array));
    }
}