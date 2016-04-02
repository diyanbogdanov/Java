package biggesttwo;

import java.util.Scanner;

public class BiggestTwo {

    public static void main(String[] args) {
        int bigOne;
        int bigTwo;
        int crnNumber;
        int counter;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter number: ");
        bigOne = sc.nextInt();
        
        System.out.print("Please enter number: ");
        crnNumber = sc.nextInt();
        
        if (crnNumber > bigOne) {
            bigTwo = bigOne;
            bigOne = crnNumber;
        } else {
            bigTwo = crnNumber;
        }
        
        counter = 8;
        while (counter > 0) {
            System.out.print("Please enter number: ");
            crnNumber = sc.nextInt();
            
            if (crnNumber > bigOne) {
                bigTwo = bigOne;
                bigOne = crnNumber;
            } else if (crnNumber > bigTwo) {
                bigTwo = crnNumber;
            }
            
            counter--;
        }
        
        System.out.printf("Biggest first: %d\nBiggest second: %d\n", bigOne, bigTwo);
    }
    
}
