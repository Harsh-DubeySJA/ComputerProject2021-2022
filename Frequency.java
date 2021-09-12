import java.util.Scanner;

class Frequency {
    public static void generateFrequencyTable(int a[]) {
        int count = 0;
        boolean check[] = new boolean[a.length];
        System.out.println("Number\tFrequency");
        for (int i = 0; i < a.length - 1; i++) {
            if(check[i]) continue; // skip if the element is already counted
            count = 1;
            for (int x = i + 1; x < a.length; x++) {
                if (a[i] == a[x]) {
                    count++;
                    check[x]=true;
                }
            }
            System.out.println(a[i] + "\t" + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int array [] = new int[sc.nextInt()];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < array.length; i++)
            array [i]  = sc.nextInt();
        generateFrequencyTable(array);
        sc.close();
    }
}
