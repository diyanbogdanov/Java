/*
 * Write an if-statement that takes two double variables a and b and exchanges their values
 * if the first one is greater than the second one. As a result print the values a and b, separated by a space.
 */
package exchangeifgreater;

import java.util.Scanner;

public class ExchangeIfGreater {

    public static void main(String[] args) {
        double valueOne;
        double valueTwo;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter fisrt double value: ");
        valueOne = sc.nextDouble();
        
        System.out.print("Please enter second double value: ");
        valueTwo = sc.nextDouble();
        
        if (valueOne > valueTwo) {
            System.out.printf("%.2f %.2f\n", valueTwo, valueOne);
        } else {
            System.out.printf("%.2f %.2f\n", valueOne, valueTwo);
        }
    }
    
}
