/*
 * Write a program that reads two positive integer numbers and prints how many numbers p exist between them
 * such that the reminder of the division by 5 is 0.
 */
package numbersinintervaldividablebygivennumber;

import java.util.Scanner;

public class NumbersInIntervalDividableByGivenNumber {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int counter;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter first positive integer to begin with: ");
        numberOne = sc.nextInt();
        
        if (numberOne < 0) {
            System.out.println("You have entered number less than zero!");
            System.exit(0);
        }
        
        System.out.print("Please enter second positive integer to begin with: ");
        numberTwo = sc.nextInt();
        
        if (numberTwo < 0) {
            System.out.println("You have entered number less than zero!");
            System.exit(0);
        }
        
        if (numberOne > numberTwo) {
            System.out.println("First number must be smaller than second!");
            System.exit(0);
        }
        
        counter = 0;
        for (int i = numberOne; i <= numberTwo; i++) {
            if(i % 5 == 0) {
                counter++;
            }
        }
        
        System.out.printf("Numbers betwen %d and %d who can be devide by 5 with no remainder are: %d\n", numberOne, numberTwo, counter);
    }
    
}
