/*
We are given an integer number n, a bit value v (v=0 or 1) and a position p.
Write a sequence of operators that modifies n to hold the value v at the position p from the binary representation of n while preserving all other bits in n.
*/
package modifybitatgivenposition;

import java.util.Scanner;

public class ModifyBitAtGivenPosition {

    public static void main(String[] args) {
        int number; //Readed number from console
        int bitPosition; //Save bit position 
        int newBit; //...
        int mask; //Make mask of bit's
        int numberAndMask; //Use oberator &
        int bit; //Save extracted bit
        boolean isOne; //Variable to save is the bis equal to one
        Scanner sc = new Scanner(System.in);
        
        //Read from console number
        System.out.print("Please enter positive integer: ");
        number = sc.nextInt();
        
        if(number < 0){
            System.out.println("You've entered negative integer!");
            System.exit(0);
        }
        
        //Read from console number
        System.out.print("Please enter the position of bit: ");
        bitPosition = sc.nextInt();
        
        //Read from console number
        System.out.print("Please enter the new bit: ");
        newBit = sc.nextInt();
        
        //Make mask
        mask = 1 << bitPosition;
        //Number and mask
        numberAndMask = number & mask;
        //Take neded bit
        bit = numberAndMask >> bitPosition;
        
        if (bit != newBit) {
            
            if(bit == 1){
                mask = number ^ (1 << bitPosition);
                number = number & mask;
            } else {
                mask = 1 << bitPosition;
                number = number | mask;
            }
        }
        
        System.out.println(number);
    }
    
}
