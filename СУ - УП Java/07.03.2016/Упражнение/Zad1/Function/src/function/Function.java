
package function;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        int numberA;
        int numberB;
        double middleOfInterval;
        double resultA;
        double resultB;
        double resultMiddle;
        double averageOfFunction;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter integer for begining of interval: ");
        numberA = sc.nextInt();
        
        System.out.print("Please enter integer for end of interval: ");
        numberB = sc.nextInt();
        
        middleOfInterval = (numberA + numberB) / 2;
        
        resultA = ( ( Math.pow(numberA, 2) + 3) / 5) + 5 * numberA;
        resultB = ( ( Math.pow(numberB, 2) + 3) / 5) + 5 * numberB;
        resultMiddle = ( ( Math.pow(middleOfInterval, 2) + 3) / 5) + 5 * middleOfInterval;
        
        averageOfFunction = ( resultA + resultB + resultMiddle ) / 3;
        
        System.out.printf("X\tF(x)\n%d\t%.1f\n%.0f\t%.1f\n%d\t%.1f\nAverage of function is: %.2f\n",numberA, resultA, middleOfInterval, resultMiddle, numberB, resultB, averageOfFunction);
    }
    
}
