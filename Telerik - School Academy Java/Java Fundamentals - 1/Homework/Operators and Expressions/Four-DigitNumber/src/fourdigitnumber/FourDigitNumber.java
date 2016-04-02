package fourdigitnumber;

import java.util.Scanner;

public class FourDigitNumber {

    public static void main(String[] args) {
        int fourDigitNumber;
        int sumDigits;
        int reverse;
        int lastToFirst;
        int exchangeDigits;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter four digit positive integer: ");
        fourDigitNumber = sc.nextInt();
        
        if(fourDigitNumber / 1000 < 1 || fourDigitNumber / 1000 > 9){
            System.out.println("You have enteret not four digit number or not positive!");
            System.exit(0);
        }
        
        sumDigits = ((fourDigitNumber / 1000) % 10) + ((fourDigitNumber / 100) % 10) + ((fourDigitNumber / 10) % 10) + (fourDigitNumber % 10) ;
        
        reverse = 0;
        
        for (int i = 0; i < 4; i++) {
            reverse *= 10;
            reverse += fourDigitNumber/Math.pow(10, i) % 10;
        }
        
        lastToFirst = ((fourDigitNumber % 10) * 1000) + (fourDigitNumber / 10);
        
        exchangeDigits = (((fourDigitNumber / 1000) % 1000) * 1000) + (((fourDigitNumber / 10) % 10) * 100) + (((fourDigitNumber / 100) % 10) * 10) + (fourDigitNumber % 10);
        
        System.out.printf("Original number: %d\nSum of digits: %d\nReversed: %d\nLast digit in front: %d\nSecond and third digits exchanged: %d\n",fourDigitNumber, sumDigits, reverse,lastToFirst, exchangeDigits);
    }
    
}
