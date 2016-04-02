/*
 * Write a program that asks for a digit (0-9), and depending on the input, shows the digit as a word (in English).
 *  Print “not a digit” in case of invalid input.
 *  Use a switch statement.
 */
package digitasword;

import java.util.Scanner;

public class DigitAsWord {

    public static void main(String[] args) {
        String digit;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Pleae enter digit: ");
        digit = sc.next();
        
        switch (digit) {
            case "0":
                System.out.println("zero");
                break;
            case "1":
                System.out.println("one");
                break;
            case "2":
                System.out.println("two");
                break;
            case "3":
                System.out.println("three");
                break;
            case "4":
                System.out.println("four");
                break;
            case "5":
                System.out.println("five");
                break;
            case "6":
                System.out.println("six");
                break;
            case "7":
                System.out.println("seven");
                break;
            case "8":
                System.out.println("eleven");
                break;
            case "9":
                System.out.println("nine");
                break;
            default:
                System.out.println("not a digit");
                break;
        }
    }
    
}
