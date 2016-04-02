package thirddigitis7;

import java.util.Scanner;

public class ThirdDigitIs7 {

    public static void main(String[] args) {
        int enteredNumber;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter integer: ");
        enteredNumber = sc.nextInt();
        
        if((enteredNumber / 100) % 10 == 7){
            System.out.printf("The third difig in number: %d is 7", enteredNumber);
        } else {
            System.out.printf("The third difig in number: %d is NOT 7", enteredNumber);
        }
    }
    
}
