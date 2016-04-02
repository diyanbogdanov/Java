/*
 * Write a program that converts a number in the range [0…999] to words, corresponding to the English pronunciation.
 */
package numberaswords;

import java.util.Scanner;

public class NumberAsWords {

    public static void main(String[] args) {
        int number;
        int lenght;
        int[] digits;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        String[] digit = {"" ,"one", "tow", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] decimals = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        
        System.out.print("Plese enter number in interval 0 and 999: ");
        number = sc.nextInt();
        
        if (number < 0 || number > 999) {
            System.out.println("The number you have entered is not in interval!");
            System.exit(0);
        }
        
        lenght = String.valueOf(number).length();
        
        digits = new int[lenght];
        
        for (int i = lenght - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        switch (lenght) {
            case 1:
                if (digits[0] == 0) {
                    System.out.println("zero");
                } else {
                    System.out.println(digit[digits[0]]);
                }
                break;
            case 2:
                if (digits[0] == 1) {
                    System.out.println(decimals[digits[1]]);
                } else {
                    System.out.println(tens[digits[0]] + " " + digit[digits[1]]);
                }
                break;
            case 3:
                if (digits[1] == 1) {
                    System.out.println(digit[digits[0]] + " and " + decimals[digits[2]]);
                } else {
                    if (digits[1] != 0 || digits[2] != 0) {
                        System.out.println(digit[digits[0]] + " hudred and " + tens[digits[1]] + " " + digit[digits[2]]);
                    } else {
                        System.out.println(digit[digits[0]] + " hundred");
                    }
                }
                break;
        }
    }
}
