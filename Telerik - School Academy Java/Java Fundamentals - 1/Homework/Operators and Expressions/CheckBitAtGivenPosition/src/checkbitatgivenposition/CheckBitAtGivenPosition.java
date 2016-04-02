/*
Write a Boolean expression that returns if the bit at position p (counting from 0, starting from the right) in given integer number n, has value of 1.
*/
package checkbitatgivenposition;

import java.util.Scanner;

public class CheckBitAtGivenPosition {

    public static void main(String[] args) {
        int number; //Readed number from console
        int bitPosition; //Save bit position 
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
        
        //Make mask
        mask = 1 << bitPosition;
        //Number and mask
        numberAndMask = number & mask;
        //Take neded bit
        bit = numberAndMask >> bitPosition;
        
        isOne = false;
        if (bit == 1) {
            isOne = true;
        }
        //Print the bit
        System.out.println(isOne);
    }
    
}
