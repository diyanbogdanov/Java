/*
* Write a program that gets two numbers from the console and prints the greater of them.
* Try to implement this without if statements.
*/
package numbercomparer;

import java.util.Scanner;

public class NumberComparer {
    public static void main(String[] args) {
        double numberA;
        double numberB;
        double max;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        numberA = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        numberB = sc.nextDouble();
        
        max = (numberA > numberB) ? numberA : numberB;
        
        System.out.printf("Maximum numer is: %.2f", max);
        
    }
    
}
