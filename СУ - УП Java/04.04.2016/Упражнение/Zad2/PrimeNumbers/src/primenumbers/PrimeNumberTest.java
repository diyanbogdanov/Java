package primenumbers;

public class PrimeNumberTest {
    public static void main(String[] args) {
        PrimeNumbers prime = new PrimeNumbers();
        
        for (int i = 1; i < prime.getnLimit(); i++) {
            System.out.printf("%d - %s\n", i, prime.isPrime(i));
        }
    }
}
