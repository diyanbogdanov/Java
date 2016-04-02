/*
* Write a program that reads 3 real numbers from the console and prints their sum.
*/
package sumofthreenumbers;

import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        double numberOne;
        double numberTwo;
        double numberThree;
        double sum;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter first number: ");
        numberOne = sc.nextDouble();
        
        System.out.print("Please enter second number: ");
        numberTwo = sc.nextDouble();
        
        System.out.print("Please enter third number: ");
        numberThree = sc.nextDouble();
        
        sum = numberOne + numberTwo + numberThree;
        
        System.out.printf("The sum ot three numbers is: %.2f\n", sum);
    }
    
}
