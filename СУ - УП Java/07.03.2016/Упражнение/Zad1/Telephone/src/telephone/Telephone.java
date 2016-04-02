
package telephone;

import java.util.Scanner;

public class Telephone {

    public static void main(String[] args) {
        int fourDigitsNumber;
        int digitOne;
        int digitTwo;
        int digitThree;
        int digitFour;
        int numberOfDigits;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter four digit integer: ");
        fourDigitsNumber = sc.nextInt();
        
        numberOfDigits = (int)(Math.log10(fourDigitsNumber) + 1);
        
        if(numberOfDigits > 4 || numberOfDigits < 4){
            System.out.println("You must enter only four digit integer, program will be closed.\nGood bye!");
            System.exit( 0 );
        }
        
        digitFour = fourDigitsNumber % 10;
        fourDigitsNumber /= 10;
        digitThree = fourDigitsNumber % 10;
        fourDigitsNumber /= 10;
        digitTwo = fourDigitsNumber % 10;
        fourDigitsNumber /= 10;
        digitOne = fourDigitsNumber % 10;
        
        digitFour = (digitFour + 7) % 10;
        digitThree = (digitThree + 7) % 10;
        digitTwo = (digitTwo + 7) % 10;
        digitOne = (digitOne + 7) % 10;
        
        System.out.printf("The code is: \'%d%d%d%d\'", digitThree, digitFour, digitOne, digitTwo);
    }
    
}
