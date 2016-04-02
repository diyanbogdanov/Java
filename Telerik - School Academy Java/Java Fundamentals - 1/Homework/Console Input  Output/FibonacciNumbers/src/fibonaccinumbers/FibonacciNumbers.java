/*
 * Write a program that reads a number n and prints on the console the first n members of the Fibonacci sequence
 * (at a single line, separated by comma and space - ,) : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ….
 */
package fibonaccinumbers;

import java.util.Scanner;

/**
 *
 * @author Diyan
 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        int number;
        int first;
        int second;
        int third;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter positive integer bigger than 0: ");
        number = sc.nextInt();
        
        first = 0;
        second = 1;
        for (int i = 0; i < number; i++) {
            System.out.printf("%d, ",first);
            third = first + second;
            first = second;
            second = third;
        }
    }
    
}
