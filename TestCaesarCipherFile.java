import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class TestCaesarCipherFile {

    private static int key;

public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner plainfile = new Scanner(new File("PlainText.txt"));
        Scanner cipherfile = new Scanner(new File("CipherText.txt"));
        System.out.println("Press 1 to enter plain text and get it converted into Cipher text ::");
        System.out.println("Press 2 to enter a Cipher text and get it converted into Plain text ::");
        System.out.println("Press 3 to enter plain text from a source file and get it converted into Cipher text in a output file ::");
        System.out.println("Press 4 to enter a Cipher text from a source file and get it converted into Plain text in a output file ::");
        switch ( sc.nextInt() ) {
            case 1 :
                System.out.println("Swift Parameter <Space> Plain Text");
                key = sc.nextInt(); 
                System.out.println(CaesarCipher.encrypt(sc.nextLine() , key));;
                break;
            case 2 :
                System.out.println("Swift Parameter <Space> Cipher Text");
                key = sc.nextInt();
                System.out.println(CaesarCipher.decrypt(sc.nextLine(), key));
                break;
            case 3:
                System.out.println("Enter Swift Parameter");
                key = sc.nextInt();
                CaesarCipherFile.encryptFile(plainfile.nextLine(), key, ""); // File name of plaintext
                break;
            case 4:
                System.out.println("Enter Swift Parameter");
                key = sc.nextInt();
                CaesarCipherFile.decryptFile(cipherfile.nextLine(), key, ""); // File name of ciphertext
                break;
            default:
            System.out.println("Invalid Input!!!");
                break;
        }
        sc.close();
    }
}
