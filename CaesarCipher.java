public class CaesarCipher {
    public static String encrpt(String plainText , int key) {
        String cipherText = "";
        key = 26 - key;
        plainText = plainText.toUpperCase();
        for (int i = 0; i < plainText.length(); i++) {
            if(plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            }
            cipherText += (char)((int)plainText.charAt(i)+key < 91 ? (int)plainText.charAt(i)+key : ((int)plainText.charAt(i)+key) - 26 );
        }
        return cipherText.trim();
    }
    public static String decrypt(String cipherText , int key) {
        String plainText = "";
        cipherText = cipherText.toUpperCase();
        int b = cipherText.length();
        for (int i = 0; i < b; i++) {
            if(cipherText.charAt(i) == ' ') {
                plainText += ' ';
                continue;
            }
            plainText += (char)((int)cipherText.charAt(i)+key > 90 ? (int)cipherText.charAt(i)+key - 26 : cipherText.charAt(i)+key );
        }
        return plainText.trim();
    }
}