package palindrome;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        int fiveDigit;
        boolean isPalindrome;
        Scanner input;
        Palindrome palindrome;
        
        input = new Scanner(System.in);
        
        System.out.print("Please enter five digit integer: ");
        fiveDigit = input.nextInt();
        
        while (fiveDigit / 10000 > 9 || fiveDigit / 10000 < 1) {
            System.out.print("Please enter new integer with five digits: ");
            fiveDigit = input.nextInt();
        }
        
        palindrome = new Palindrome(fiveDigit);
        
        isPalindrome = palindrome.isPalindrome();
        
        if (isPalindrome) {
            System.out.printf("Number %d is palindrome\n", fiveDigit);
        } else {
            System.out.printf("Number %d is NOT palindrome\n", fiveDigit);
        }
        
    }
}
