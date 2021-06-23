import java.util.Scanner;

class ProjectSelectionSortP {
    public static void selectionSort(int array[]) {//sort the array in ascending order
        int temp, pos;
        for( int i=0; i<array.length-1; i++){
            pos=i;
            for( int x=i+1; x<array.length;x++){
                if(array[x]<array[pos]){ // curr element is less than element at assumed min
                    pos=x; // update the new minimum position
                }
            }
            if(pos!=i){
                temp=array[i];
                array[i]=array[pos];
                array[pos]=temp;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be sorted :: ");
        int array [] = new int[sc.nextInt()];
        System.out.println("Enter Elements :: ");
        for (int i = 0; i < array.length; i++)
            array [i] = sc.nextInt();
        sc.close();
        selectionSort(array);
        System.out.println("Sorted Array :: " + java.util.Arrays.toString(array));
    }
}