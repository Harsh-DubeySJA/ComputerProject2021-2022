import java.util.Scanner;

public class ProjectBinarySearchP {
    public static int binarySearch(int a[], int item){
        // return the position of 'item' in array 'a', if found else return -1
        int pos=-1,lb,ub,mid;
        lb=0;//lower bound
        ub=a.length-1;//upper bound
        while(lb<=ub){
            mid = (lb+ub)/2;
            if(item==a[mid]){
                pos=mid;
                break;
            }else if(item<mid){// search in left half
                ub=mid-1;
            }else{// search in right half
                lb=mid+1;
            }
        }
        return pos;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements to be entered :: ");
        int array [] = new int [sc.nextInt()];
        System.out.println("Enter the elements of the array :: ");
        for (int i = 0; i < array.length; i++)
            array [i] = sc.nextInt();
        System.out.println("Enter the element to be searched for");
        int item = sc.nextInt();
        sc.close();
        java.util.Arrays.sort(array);//<- sorting the array in ascending order
        System.out.println(java.util.Arrays.toString(array));
        System.out.println( "Element present at " + binarySearch(array,item) + " position.");
    }
}