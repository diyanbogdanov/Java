//Write an expression that extracts from given integer n the value of given bit at index p.
package extractbitfrominteger;

import java.util.Scanner;

public class ExtractBitFromInteger {

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
        
        //Read from console bit position
        System.out.print("Please enter the position of bit: ");
        bitPosition = sc.nextInt();
        
        
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
