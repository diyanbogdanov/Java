package oddoreven;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        int readNumber;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter integer: ");
        readNumber = sc.nextInt();
        
        if(readNumber % 2 == 0){
            System.out.printf("Number %d is even!", readNumber);
        } else {
            System.out.printf("Number %d is odd!", readNumber);
        }
    }
    
}
