package largest;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        int counter;
        double number;
        double largest;
        double largestTwo;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print("Въведете число: ");
        largest = sc.nextDouble();
        largestTwo = largest;

        for (counter = 1; counter < 10; counter++) {
            System.out.print("Въведете число: ");
            number = sc.nextDouble();
            
            if (number > largest) {
                largestTwo = largest;
                largest = number;
            } else if (number > largestTwo) {
                largestTwo = number;
            }
        }

        System.out.printf("Largest: %.2f\nLargestTwo: %.2f\n", largest, largestTwo);
    }

}
