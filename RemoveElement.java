import java.util.Scanner;

class RemoveElement{
    public static int[] remove(int ar[], int item){
        int count=0;
        for( int value:ar){
            if(item==value)count++;
        }
        int temp[] = new int[ar.length-count];
        for( int i=0, pos=0; i<ar.length;i++){
            if(item!=ar[i]){
                temp[pos++]=ar[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int array [] = new int[sc.nextInt()];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < array.length; i++)
            array [i] = sc.nextInt();
        System.out.println("Enter the element to be removed:");
        System.out.println(remove(array, sc.nextInt()));
        sc.close();
    }
}
