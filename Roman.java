import java.util.Scanner;

class Roman{
    public static String repeat(String symbol,int times){
        String output="";
        for(int i=1; i<=times;i++){
            output+=symbol;
        }
        return output;
    }
    public static String convertToRoman(int n){
        String roman="";
        int repeat;
        int magnitude[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for( int x=0; x<magnitude.length;x++){
            repeat=n/magnitude[x];
            roman+=repeat(symbol[x],repeat);
            n=n%magnitude[x];
        }
        return roman;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be converted to a Roman number.");
        System.out.println(convertToRoman(sc.nextInt()));
        sc.close();
    }
}
