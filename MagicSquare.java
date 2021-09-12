import java.util.Scanner;

class MagicSquare {
    public static void generateMagicSquare(int size) {
        assert size % 2 == 1 : "Invalid Size. Must be odd.";
        int magic[][] = new int[size][size];
        int row = 0, col = size / 2;
        final int square = size * size;
        for (int i = 1; i <= square; i++) {
            magic[row][col] = i;
            if(i%size==0) row++;
            else{
                if(row==0) row=size-1;
                else row--;
                if(col==(size-1)) col=0;
                else col++;
            }
        }
        for(row=0; row<size;row++){
            for(col=0; col<size;col++){
                System.out.print(magic[row][col]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of magic square:");
        generateMagicSquare(sc.nextInt());
        sc.close();
    }
}