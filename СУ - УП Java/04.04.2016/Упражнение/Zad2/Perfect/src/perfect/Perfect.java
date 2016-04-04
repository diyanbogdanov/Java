package perfect;

public class Perfect {
    private static int NUMBER_PER_LINE = 5; 
    private static int NUMBER_OF_PRIMES = 10000;

    public static int getNUMBER_OF_PRIMES() {
        return NUMBER_OF_PRIMES;
    }
    
    public static boolean isPerfect(int number){
        int sum;
        
        sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        if (sum == number) {
            return true;
        } else { 
            return false;
        }
    }
    
    public static void showMultipliers(int number){
        int counter = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (counter / NUMBER_PER_LINE == 1) {
                System.out.println();
                counter = 0;
            }
            if (number % i == 0) {
                System.out.printf("%d, ", i);
                counter++;
            }
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        Perfect perfect = new Perfect();
        for (int i = 1; i < perfect.NUMBER_OF_PRIMES; i++) {
            if (perfect.isPerfect(i)) {
                perfect.showMultipliers(i);
            }
        }
    }
}
