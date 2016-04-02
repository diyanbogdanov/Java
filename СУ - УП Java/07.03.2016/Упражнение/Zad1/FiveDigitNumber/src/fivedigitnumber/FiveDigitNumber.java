
package fivedigitnumber;

import java.util.Scanner;

public class FiveDigitNumber {

    public static void main(String[] args) {
        int fiveDigitNumber;
        int digitOne;
        int digitTwo;
        int digitThree;
        int digitFour;
        int digitFive;
        int numberOfDigits;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter five digit integer: ");
        fiveDigitNumber = sc.nextInt();
        
        numberOfDigits = (int)(Math.log10(fiveDigitNumber) + 1);
        
        if(numberOfDigits > 5 || numberOfDigits < 5) {
            System.out.println("You must enter only five digit integer, program will be closed.\nGood bye!");
            System.exit( 0 );
        }
        
        digitFive = fiveDigitNumber % 10;
        fiveDigitNumber /= 10;
        digitFour = fiveDigitNumber % 10;
        fiveDigitNumber /= 10;
        digitThree = fiveDigitNumber % 10;
        fiveDigitNumber /= 10;
        digitTwo = fiveDigitNumber % 10;
        fiveDigitNumber /= 10;
        digitOne = fiveDigitNumber % 10;
        
        System.out.printf("Digits in same order: \'%d, %d, %d, %d, %d\'\nDigits in reverse order: \'%5$d, %4$d, %3$d, %2$d, %1$d\'\n", digitOne, digitTwo, digitThree, digitFour, digitFive);
    }
    
}
