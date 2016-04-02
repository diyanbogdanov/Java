/*
 * Write a program that reads an integer number n from the console and prints all the numbers in the interval [1..n],
 * each on a single line.
 */
package numbersfromoneton;

import java.util.Scanner;

public class NumbersFromOneToN {

    public static void main(String[] args) {
        int number;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter positive integer bigger than 0: ");
        number = sc.nextInt();
        
        if (number <= 0) {
            System.out.println("You have entered number less than 1!");
            System.exit(0);
        }
        
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    
    }
    
}
