package fivedigitnumber;

import javax.swing.JOptionPane;

public class FiveDigitNumber {

    public static void main(String[] args) {
        int fiveDigitNumber;
        int absoluteValueOfNumber;
        int digitOne;
        int digitTwo;
        int digitThree;
        int digitFour;
        int digitFive;
        boolean palindrome;
        int sumOfEven;
        int sumOfAll;
        String outprintString;
        
        fiveDigitNumber = Integer.parseInt(JOptionPane.showInputDialog("Please, enter five digit number: "));
        
        absoluteValueOfNumber = (fiveDigitNumber < 0) ? -fiveDigitNumber : fiveDigitNumber;
        if(absoluteValueOfNumber / 10000 >= 10 || absoluteValueOfNumber / 10000 <= 0){
            JOptionPane.showMessageDialog(null, "You have enteret invalit number.\nThe number must be no loger or less than five digits\nand it must me different from five zeroes!");
            System.exit( 0 );
        }
        digitFive = (fiveDigitNumber % 10);
        digitFour = ((fiveDigitNumber / 10) % 10);
        digitThree = ((fiveDigitNumber / 100) % 10);
        digitTwo = ((fiveDigitNumber / 1000) % 10);
        digitOne = (fiveDigitNumber / 10000);
        
        palindrome = false;
        if(digitOne == digitFive && digitTwo == digitFour){
            palindrome = true;
        }
        
        sumOfEven = 0;
        
        if(digitOne % 2 == 0){
            sumOfEven += digitOne;
        }
        if(digitTwo % 2 == 0){
            sumOfEven += digitTwo;
        }
        if(digitThree % 2 == 0){
            sumOfEven += digitThree;
        }
        if(digitFour % 2 == 0){
            sumOfEven += digitFour;
        }
        if(digitFive % 2 == 0){
            sumOfEven += digitFive;
        }
        
        sumOfAll = digitOne + digitTwo + digitThree + digitFour + digitFive;
        
        if(sumOfAll / 10.0 > 0){
            sumOfAll = sumOfAll / 10 + sumOfAll % 10;
        }
        
        outprintString = String.format("The number %s palindrome\nSum of even digit is: %d\nSum of all digits in one number is: %d", palindrome ? "is" : "is NOT", sumOfEven, sumOfAll);
        
        JOptionPane.showMessageDialog(null, outprintString);
    }
    
}
