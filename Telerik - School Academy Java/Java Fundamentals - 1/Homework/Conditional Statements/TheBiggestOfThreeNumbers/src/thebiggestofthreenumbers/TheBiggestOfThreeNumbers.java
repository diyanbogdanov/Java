/*
 * Write a program that finds the biggest of three numbers.
 */
package thebiggestofthreenumbers;

import java.text.MessageFormat;
import java.util.Scanner;

public class TheBiggestOfThreeNumbers {

    public static void main(String[] args) {
        double numberOne;
        double numberTwo;
        double numberThree;
        double biggestNumber;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter first number: ");
        numberOne = sc.nextDouble();
        
        System.out.print("Please enter second number: ");
        numberTwo = sc.nextDouble();
        
        System.out.print("Please enter third number: ");
        numberThree = sc.nextDouble();
        
        biggestNumber = numberOne;
        
        if (numberTwo > biggestNumber) {
            biggestNumber = numberTwo;
        }
        if(numberThree > biggestNumber) {
            biggestNumber = numberThree;
        }
        
        System.out.printf("Biggest number is: %.2f\n", biggestNumber);
    }
    
}
