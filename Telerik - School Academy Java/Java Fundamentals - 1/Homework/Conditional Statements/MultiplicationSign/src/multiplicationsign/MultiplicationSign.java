/*
 * Write a program that shows the sign (+, - or 0) of the product of three real numbers, without calculating it.
 *  Use a sequence of if operators.
 */
package multiplicationsign;

import java.util.Scanner;

public class MultiplicationSign {

    public static void main(String[] args) {
        double numberOne;
        double numberTwo;
        double numberThree;
        byte sign;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Plese enter first number: ");
        numberOne = sc.nextDouble();
        
        System.out.print("Plese enter second number: ");
        numberTwo = sc.nextDouble();
        
        System.out.print("Plese enter third number: ");
        numberThree = sc.nextDouble();
        
        sign = 1;
        
        if(numberOne < 0){
            sign *= -1;
        } else if(numberOne == 0){
            System.out.println("Sign: 0");
            System.exit(0);
        }
        
        if(numberTwo < 0){
            sign *= -1;
        } else if(numberTwo == 0){
            System.out.println("Sign: 0");
            System.exit(0);
        }
        
        if(numberThree < 0){
            sign *= -1;
        } else if(numberThree == 0){
            System.out.println("Sign: 0");
            System.exit(0);
        }
        
        System.out.printf("Sign: %s\n", sign > 0 ? '+' : '-');
    }
    
}
