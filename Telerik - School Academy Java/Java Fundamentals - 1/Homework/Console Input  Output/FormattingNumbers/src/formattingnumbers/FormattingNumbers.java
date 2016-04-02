/*
* Write a program that reads 3 numbers:
*   integer a (0 <= a <= 500)
*   floating-point b
*   floating-point c
* The program then prints them in 4 virtual columns on the console. Each column should have a width of 10 characters.
*   The number a should be printed in hexadecimal, left aligned
*   Then the number a should be printed in binary form, padded with zeroes
*   The number b should be printed with 2 digits after the decimal point, right aligned
*   The number c should be printed with 3 digits after the decimal point, left aligned.
*/
package formattingnumbers;

import java.util.Scanner;

public class FormattingNumbers {

    public static void main(String[] args) {
        int numberA;
        double numberB;
        double numberC;
        String outprintString;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter integer in range 0 - 500: ");
        numberA = sc.nextInt();
        
        if (numberA < 0 || numberA > 500) {
            System.out.println("You have entered number bigger than 500 or lower than 0!");
            System.exit(0);
        }
        
        System.out.print("Please enter number with folating point: ");
        numberB = sc.nextDouble();
        
        System.out.print("Please enter number with folating point: ");
        numberC = sc.nextDouble();
        
        outprintString = String.format("%s |%010d| %.2f |%.3f",Integer.toHexString(numberA).toUpperCase(), Integer.parseUnsignedInt(Integer.toBinaryString(numberA)), numberB, numberC);
        
        System.out.println(outprintString);
    }
    
}
