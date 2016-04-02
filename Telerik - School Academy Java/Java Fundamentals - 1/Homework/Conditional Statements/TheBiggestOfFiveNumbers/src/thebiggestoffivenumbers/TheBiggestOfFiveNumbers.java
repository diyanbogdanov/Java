/*
 * Write a program that finds the biggest of five numbers by using only five if statements.
 */
package thebiggestoffivenumbers;

import java.util.Scanner;

public class TheBiggestOfFiveNumbers {

    public static void main(String[] args) {
        double numberOne;
        double numberTwo;
        double numberThree;
        double numberFour;
        double numberFive;
        double biggestNumber;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter first number: ");
        numberOne = sc.nextDouble();
        
        System.out.print("Please enter second number: ");
        numberTwo = sc.nextDouble();
        
        System.out.print("Please enter third number: ");
        numberThree = sc.nextDouble();
        
        System.out.print("Please enter forth number: ");
        numberFour = sc.nextDouble();
        
        System.out.print("Please enter fifth number: ");
        numberFive = sc.nextDouble();
        
        biggestNumber = numberOne;
        
        if (numberTwo > biggestNumber) {
            biggestNumber = numberTwo;
        }
        if(numberThree > biggestNumber) {
            biggestNumber = numberThree;
        }
        if(numberFour > biggestNumber) {
            biggestNumber = numberFour;
        }
        if(numberFive > biggestNumber) {
            biggestNumber = numberFive;
        }
        
        System.out.printf("Biggest number is: %.2f\n", biggestNumber);
    }
    
}
