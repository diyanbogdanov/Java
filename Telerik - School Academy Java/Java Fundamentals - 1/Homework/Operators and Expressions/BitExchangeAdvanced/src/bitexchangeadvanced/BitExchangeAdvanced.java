/*
Write a program that exchanges bits {p, p+1, …, p+k-1} with bits {q, q+1, …, q+k-1} of a given 32-bit integer.
The first and the second sequence of bits may not overlap.
 */
package bitexchangeadvanced;

import java.util.Scanner;

public class BitExchangeAdvanced {

    public static void main(String[] args) {        
        //Declare all variable used in program
        int number; //Readed number in decimal
        int bitOne; //First bit to change
        int bitTwo; //Second bit to change
        int mask; //Maske to take bit
        int temporaryNumber; //Number used while change bits
        int positionK; //Position of first bit
        int positionP; //Position of second bit
        int spacesQ; //Number of bits to change
        Scanner sc; //Scanner to read from console;
        
        //Init scanner
        sc = new Scanner(System.in);
        
        //Read from console
        System.out.print("Please enter positive integer: ");
        number = sc.nextInt();
        
        //Check if number is less than zero
        if(number < 0){
            System.out.println("You've entered negative integer!");
            System.exit( 0 );
        }
        
        //Read from console
        System.out.print("Enter number to start exchange from: ");
        positionK = sc.nextInt();
        
        //Check if bit is out of range
        if (positionK < 0 || positionK > 31) {
            System.out.println("You have enteret number which is out of range!");
            System.exit(0);
        }
        
        //Read from console
        System.out.print("Enter number to start exchange to: ");
        positionP = sc.nextInt();
        
        //Check if bit is out of range
        if (positionP < 0 || positionP > 31) {
            System.out.println("You have enteret number which is out of range!");
            System.exit(0);
        }
        
        //Read from console
        System.out.print("Enter number for spaces: ");
        spacesQ = sc.nextInt();
        
        //Check if number is out of range
        if (spacesQ < 0 || spacesQ > 31) {
            System.out.println("You have enteret number which is out of range!");
            System.exit(0);
        }
        
        //Take max of two bit positions
        positionP = Math.max(positionK, positionP);
        
        //Check if bits and spaces and in range and if tho intervals are overlaping
        if(positionK + spacesQ >= positionP || positionK + spacesQ - 1 > 31 || positionP + spacesQ - 1 > 31){
            System.out.println("The interval is overlaping or out of range!");
            System.exit(0);
        }
        
        //Init mask
        mask = 1;
        
        /*
        * Main part in program
        * Will change as many bits as spacesQ is big
        * First take first bit, then second bit and if they are equal
        * program will no change them if the aren't then check if the first
        * bit is equal to one and change second bit then change first bit
        * Same logic if first bit is not equal to one;
        */
        for (int i = 1; i <= spacesQ; i++, positionK++, positionP++) {
            mask = mask << positionK;
            bitOne = ( number & mask ) >> positionK;
            mask = mask >> positionK;
            mask = mask << positionP;
            bitTwo = ( number & mask ) >> positionP;
            mask = mask >> positionP;
            if(bitOne != bitTwo){
                if(bitOne == 1){
                    temporaryNumber = number | (mask << positionP);
                    number = temporaryNumber ^ (mask << positionK);
                } else {
                    temporaryNumber = number ^ (mask << positionP);
                    number = temporaryNumber | (mask << positionK);
                }
            }
        }
        
        //Print new number in decimal and in binary
        System.out.printf("Number in decimal: %d\nNumber is binary: %s",number, Integer.toBinaryString(number));
    }
    
}
