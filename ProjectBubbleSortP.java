import java.util.Scanner;

class ProjectBubbleSortP {
    public static void bubbleSort(int a[]) {
        int temp;
        boolean swapped;
        // number of passes required is one less than the number of elements
        for( int pass=0; pass<a.length-1;pass++){
            // inner loop is for comparing adjacent elements
            swapped = false;
            for( int i=0; i<a.length-1-pass;i++){
                if(a[i+1]<a[i]){ // next element is less than current element
                    // swap
                    temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                    swapped=true;
                }
            }
            if(!swapped){// no swapping means that the array is now sorted
                break;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be sorted :: ");
        int array[] = new int[sc.nextInt()] ;
        System.out.println("Enter the elements to be sorted ::");
        for (int i = 0; i < array.length; i++)
            array [i] = sc.nextInt();
        sc.close();
        System.out.println("Elements entered " + java.util.Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Sorted elelments in ascending order " + java.util.Arrays.toString(array));
    }
}