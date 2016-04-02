package median;

import java.util.Scanner;

public class Median {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int numberThree;
        int med;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        numberOne = input.nextInt();

        System.out.print("Please enter second number: ");
        numberTwo = input.nextInt();

        System.out.print("Please enter three number: ");
        numberThree = input.nextInt();
        
        if (numberOne > numberTwo) {
            if (numberTwo > numberThree) {
                med = numberTwo;
            } else if (numberOne > numberThree) {
                med = numberThree;
            } else {
                med = numberOne;
            }
        } else {
            if (numberOne > numberThree) {
                med = numberOne;
            } else if(numberThree > numberTwo) {
                med = numberTwo;
            } else {
                med = numberThree;
            }
        }

        System.out.printf("Median: %d\n", med);
    }
}