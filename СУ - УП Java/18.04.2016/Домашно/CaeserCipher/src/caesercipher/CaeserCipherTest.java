package caesercipher;

public class CaeserCipherTest {
    public static void main(String[] args) {
        CaeserCipher cCipher = new CaeserCipher();
        System.out.println(cCipher.encrypt(3, "toy"));
        System.out.println(cCipher.decrypt(3, "wrb"));
    }
}
