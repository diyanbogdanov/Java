/*
* Write a program that reads the coefficients a, b and c of a quadratic equation
* ax2 + bx + c = 0 and solves it (prints its real roots).
*/
package quadraticequation;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        double numberA;
        double numberB;
        double numberC;
        double determinant;
        double rootOne;
        double rootTwo;
        String outprintString;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter coefficent a: ");
        numberA = sc.nextDouble();
        
        System.out.print("Please enter coefficent b: ");
        numberB = sc.nextDouble();
        
        System.out.print("Please enter coefficent c: ");
        numberC = sc.nextDouble();
        
        determinant = (numberB * numberB) - (4 * numberA * numberC);
        
        outprintString = "no real roots";
        
        if(determinant > 0) {
            rootOne = ( -numberB - Math.sqrt(determinant) ) / ( 2 * numberA );
            rootTwo = ( -numberB + Math.sqrt(determinant) ) / ( 2 * numberA );
            outprintString = String.format("x1 = %.2f; x2 = %.2f",rootOne, rootTwo);
        } else if (determinant == 0){
            rootOne = -numberB / ( 2 * numberA );
            outprintString = String.format("x1 = x2 = %.2f",rootOne);
        }
        
        System.out.println(outprintString);
    }
    
}
