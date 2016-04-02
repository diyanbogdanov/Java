/*
 * Write a program that, depending on the user’s choice, inputs an int, double or string variable.
 *  If the variable is int or double, the program increases it by one.
 *  If the variable is a string, the program appends * at the end.
 * Print the result at the console. Use switch statement.
 */
package intdoublestring;

import java.util.Scanner;

public class IntDoubleString {

    public static void main(String[] args) {
        byte chose;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Types:\n1-->int\n2-->double\n3-->String\nPlese chose a type: ");
        chose = sc.nextByte();
        
        switch (chose) {
            case 1:
                int numberInt;
                
                System.out.print("Please enter int: ");
                numberInt = sc.nextInt();
                
                numberInt++;
                System.out.println(numberInt);
                break;
            case 2:
                double numberDouble;
                
                System.out.print("Please enter double: ");
                numberDouble = sc.nextDouble();
                
                numberDouble++;
                System.out.println(numberDouble);
                break;
            case 3:
                String input;
                
                System.out.print("Please enter string: ");
                input = sc.next();
                
                System.out.printf("%s*\n",input);
                break;
            default:
                System.out.println("You have enteret not corect number!");
                break;
        }
    }
    
}
