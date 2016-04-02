package analysis;
// Fig. 4.12: Analysis.java
// Analysis of examination results.

import java.util.Scanner; // class uses class Scanner

public class Analysis {

    public void processExamResults() {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in declarations
        int counter = 1; // number of failures
        int number; // student counter
        int largest; // one exam result (obtains value from user)

        System.out.print("Enter number: ");
        number = input.nextInt();
        largest = number;

        // process 10 students using counter-controlled loop
        while (counter < 10) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        } // end while

        System.out.printf("The largest number is: %d\n", largest);
    } // end method processExamResults

} // end class Analysis

