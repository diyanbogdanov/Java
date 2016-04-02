/*
 * Write a program that enters 3 real numbers and prints them sorted in descending order.
 *  Use nested if statements.
 */
package sortthreenumbers;

import java.util.Scanner;

public class SortThreeNumbers {

    public static void main(String[] args) {
        double numberOne;
        double numberTwo;
        double numberThree;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter first number: ");
        numberOne = sc.nextDouble();
        
        System.out.print("Please enter second number: ");
        numberTwo = sc.nextDouble();
        
        System.out.print("Please enter third number: ");
        numberThree = sc.nextDouble();
        
        if (numberOne > numberTwo) {
            if (numberOne > numberThree){
                if (numberThree > numberTwo) {
                    System.out.printf("%.2f %.2f %.2f\n", numberOne, numberThree, numberTwo);
                } else {
                    System.out.printf("%.2f %.2f %.2f\n", numberOne, numberTwo, numberThree);
                }
            } else {
                System.out.printf("%.2f %.2f %.2f\n", numberThree, numberOne, numberTwo);
            }
        } else if (numberOne > numberThree) {
            if (numberTwo > numberThree) {
                System.out.printf("%.2f %.2f %.2f\n", numberOne, numberTwo, numberThree);
            } else {
                System.out.printf("%.2f %.2f %.2f\n", numberOne, numberThree, numberTwo);
            }
        } else {
            if (numberTwo > numberThree){
                System.out.printf("%.2f %.2f %.2f\n", numberTwo, numberThree, numberOne);
            } else {
                System.out.printf("%.2f %.2f %.2f\n", numberThree, numberTwo, numberOne);
            }
        }
    }
}
