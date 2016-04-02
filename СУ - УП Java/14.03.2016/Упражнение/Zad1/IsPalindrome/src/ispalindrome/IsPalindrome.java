package ispalindrome;

import javax.swing.JOptionPane;

public class IsPalindrome {

    public static void main(String[] args) {
        int fiveDigitNumber;
        int absoluteValueOfNumber;
        int digitOne;
        int digitTwo;
        int digitThree;
        int digitFour;
        int digitFive;
        boolean palindrome;
        int sumOfAll;
        boolean sumIsEven;
        int biggerThanAverage;
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
        
        sumOfAll = digitOne + digitTwo + digitThree + digitFour + digitFive;
        
        sumIsEven = false;
        if(sumOfAll % 2 == 0){
            sumIsEven = true;
        }
        
        biggerThanAverage = 0;
        if(digitFive > (sumOfAll / 5.0)){
            biggerThanAverage++;
        }
        if(digitFour > (sumOfAll / 5.0)){
            biggerThanAverage++;
        }
        if(digitThree > (sumOfAll / 5.0)){
            biggerThanAverage++;
        }
        if(digitTwo > (sumOfAll / 5.0)){
            biggerThanAverage++;
        }
        if(digitOne > (sumOfAll / 5.0)){
            biggerThanAverage++;
        }
        
        outprintString = String.format("The number %s palindrome\nThe sum of digit %s even\nNumber of digit bigger than average: %d\n", palindrome ? "is" : "is NOT", sumIsEven ? "is" : "is NOT", biggerThanAverage);
        
        JOptionPane.showMessageDialog(null, outprintString);
        
    }
    
}
