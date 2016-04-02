/*
 * Write a program that enters a number n and after that enters more n numbers and calculates and prints their sum.
 */
package sumofnnumbers;

import java.util.Scanner;

public class SumOfNNumbers {

    public static void main(String[] args) {
        int number;
        double sum;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter positive integer bigger than 0: ");
        number = sc.nextInt();
        
        if(number <= 0) {
            System.out.println("You have entered number less than 1!");
            System.exit(0);
        }
        
        sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.print("Enter number: ");
            sum += sc.nextDouble();
        }
        
        System.out.printf("The sum is: %.2f", sum);
    }
    
}
