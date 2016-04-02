/*
Write a program that exchanges bits 3, 4 and 5 with bits 24, 25 and 26 of given 32-bit integer.
*/
package bitsexchange;

import java.util.Scanner;

public class BitsExchange {

    public static void main(String[] args) {
        //Declare all variable used in program
        int number; //Readed number in decimal
        int bitOne; //First bit to change
        int bitTwo; //Second bit to change
        int mask; //Maske to take bit
        int temporaryNumber; //Number used while change bits
        int positionK; //Position of first bit
        int positionP; //Position of second bit
        Scanner sc; //Scanner to read from console
        
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
        
        //Init mask, first bit position, second bit position
        mask = 1;
        positionK = 3;
        positionP = 24;
        
        /*
        * Main part in program
        * First take first bit, then second bit and if they are equal
        * program will no change them if the aren't then check if the first
        * bit is equal to one and change second bit then change first bit
        * Same logic if first bit is not equal to one;
        */
        for (int i = 1; i <= 3; i++, positionK++, positionP++) {
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
        System.out.printf("Number in decimal: %d\nNumber in binary: %s",number, Integer.toBinaryString(number));
    }
    
}
