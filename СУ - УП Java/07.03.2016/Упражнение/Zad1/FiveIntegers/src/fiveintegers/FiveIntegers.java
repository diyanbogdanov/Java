
package fiveintegers;

import java.util.Scanner;

public class FiveIntegers {

    public static void main(String[] args) {
        int integerOne;
        int integerTwo;
        int integerThree;
        int integerFour;
        int integerFive;
        int numberOfPositive;
        int numberOfNegative;
        int numberOfZeroes;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter integer: ");
        integerOne = sc.nextInt();
        
        System.out.print("Please enter integer: ");
        integerTwo = sc.nextInt();
        
        System.out.print("Please enter integer: ");
        integerThree = sc.nextInt();
        
        System.out.print("Please enter integer: ");
        integerFour = sc.nextInt();
        
        System.out.print("Please enter integer: ");
        integerFive = sc.nextInt();
        
        numberOfPositive = 0;
        numberOfNegative = 0;
        
        if(integerOne >= 0){
            numberOfPositive += (int)Math.signum(integerOne);
        } else {
            numberOfNegative++;
        }
        
        if(integerTwo >= 0){
            numberOfPositive += (int)Math.signum(integerTwo);
        } else {
            numberOfNegative++;
        }
        
        if(integerThree >= 0){
            numberOfPositive += (int)Math.signum(integerThree);
        } else {
            numberOfNegative++;
        }
        
        if(integerFour >= 0){
            numberOfPositive += (int)Math.signum(integerFour);
        } else {
            numberOfNegative++;
        }
        
        if(integerFive >= 0){
            numberOfPositive += (int)Math.signum(integerFive);
        } else {
            numberOfNegative++;
        }
        
        numberOfZeroes = 5 - (numberOfPositive + numberOfNegative);
        
        System.out.printf("Positive: %d\nNegative: %d\nZeroes: %d", numberOfPositive, numberOfNegative, numberOfZeroes);
        
    }
    
}
