import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class CaesarCipherFile {
   public static void encryptFile( String pathToSourceFile , int key , String pathToTargetFile ) throws IOException {
      File Cipher = new File("Cipher.txt");
      FileOutputStream Cipherprint = new FileOutputStream(Cipher);
      DataOutputStream print = new DataOutputStream(Cipherprint);
      pathToTargetFile = CaesarCipher.encrpt(pathToSourceFile, key);
      print.writeUTF(pathToTargetFile);
      print.close();
   }
   public static void decryptFile( String pathToSourceFile , int key , String pathToTargetFile ) throws IOException {
      File Plain = new File("Plain.txt");
      FileOutputStream Planeprint = new FileOutputStream(Plain);
      DataOutputStream print = new DataOutputStream(Planeprint);
      pathToTargetFile = CaesarCipher.decrypt(pathToSourceFile, key);
      print.writeUTF(pathToTargetFile);
      print.close();
   }
}
