/*
 * Write a program that enters 5 numbers (given in a single line, separated by a space), calculates and prints their sum.
 */
package sumoffivenumbers;

import java.util.Scanner;

public class SumOfFiveNumbers {

    public static void main(String[] args) {
        String readedNumber;
        double sum;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter five number separet by one space: ");
        readedNumber = sc.nextLine();
        
        sum = 0;
        
        for (int i = 0; i < 5; i++) {
            sum += Double.parseDouble(readedNumber.split(" ")[i]);
        }
        
        System.out.printf("The sum is: %.2f\n", sum);
    }
    
}
