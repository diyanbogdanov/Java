/*
Using bitwise operators, write an expression for finding the value of the bit #3 of a given unsigned integer.
The bits are counted from right to left, starting from bit #0.
The result of the expression should be either 1 or 0.
*/
package bitwiseextractbit;

import java.util.Scanner;

public class BitwiseExtractBit {

    public static void main(String[] args) {
        int number; //Readed number from console
        int bitPosition; //Save bit position 
        int mask; //Make mask of bit's
        int numberAndMask; //Use oberator &
        int bit; //Save extracted bit
        Scanner sc = new Scanner(System.in);
        
        //Read from console number
        System.out.print("Please enter positive integer: ");
        number = sc.nextInt();
        
        if(number < 0){
            System.out.println("You've entered negative integer!");
            System.exit(0);
        }
        
        //Initialize bit position
        bitPosition = 3;
        
        //Make mask
        mask = 1 << bitPosition;
        //Number and mask
        numberAndMask = number & mask;
        //Take neded bit
        bit = numberAndMask >> bitPosition;
        
        //Print the bit
        System.out.println(bit);
    }
    
}
