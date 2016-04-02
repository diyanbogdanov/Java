package palindrome;

public class Palindrome {
    private int fiveDigit;
    
    public Palindrome(int fiveDigit){
        setFiveDigit(fiveDigit);
    }

    public void setFiveDigit(int fiveDigit) {
        if (fiveDigit / 10000 > 9 || fiveDigit / 10000 < 1) {
            System.out.println("Not valid value!");
            System.exit(0);
        } else {
            this.fiveDigit = fiveDigit;
        }
    }

    public int getFiveDigit() {
        return fiveDigit;
    }
    
    public boolean isPalindrome(){
        boolean palindrome;
        
        palindrome = true;
        
        for (int i = 2; i > 0; i--) {
            if ( ( fiveDigit / (int)Math.pow(10,i+2) % 10 ) != ( fiveDigit / (int)Math.pow(10, 2-i) % 10) ) {
                palindrome = false;
            }
        }
        
        return palindrome;
    }
}
