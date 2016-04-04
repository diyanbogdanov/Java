package primenumbers;

public class PrimeNumbers {
    private static int nLimit = 10000;
    
    public int getnLimit() {
        return nLimit;
    }
    
    public boolean isPrime(int number){
        int maxNumber;
        boolean isPrime;
        
        maxNumber = (int)Math.sqrt(number);
        isPrime = true;
        
        for (int i = 2; i <= maxNumber; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        
        return isPrime;
    }
}
