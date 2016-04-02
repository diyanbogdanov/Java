package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int numberToCheck;
        int checkUpTo;
        boolean isPrime;
        Scanner sc = new Scanner(System.in);
        
        isPrime = true;
        
        System.out.print("Enter positive number less than 101: ");
        numberToCheck = sc.nextInt();
        
        if(numberToCheck < 0 && numberToCheck > 100){
            System.out.println("You should entered number less than 101 and it should be positive!");
            System.exit(0);
        }
        
        checkUpTo = (int)Math.sqrt(numberToCheck) + 1;
        
        for (int i = 2; i < checkUpTo; i++) {
            if(numberToCheck % i == 0){
                isPrime = false;
                break;
            }
        }
        
        if(isPrime){
            System.out.println("The number you've entered is prime");
        } else {
            System.out.println("The number you've entered is NOT prime");
        }
    }
    
}
