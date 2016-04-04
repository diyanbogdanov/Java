package greatestcommondivisor;

public class GreatestCommonDivisor {
    public int gcd(int numberOne, int numberTwo){
        int gcd;
        
        gcd = Math.min(numberOne, numberTwo);
        
        for (int i = gcd; i >= 1; i--) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                return i;
            }
        }
        
        return gcd;
    }
    
    public static void main(String[] args) {
        int number;
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        
        number = gcd.gcd(314, 264);
        
        System.out.println(number);
    }
}
