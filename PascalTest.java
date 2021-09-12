import java.util.*;
public class PascalTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Pascal Triangle: ");
        int size = in.nextInt();
        PascalTriangle obj = new PascalTriangle(size);
        // obj.generatePascalTriangle();
        //
        // String str = ""+obj; // Empty string + obj will call toString()
        // System.out.println(str);
        // str=obj.toString();
        // System.out.println(str);
        //obj.generatePascalTriangle();

        System.out.println(obj);
        in.close();
    }
}
