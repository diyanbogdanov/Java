package divideby7and5;

import java.util.Scanner;

public class DivideBy7And5 {

    public static void main(String[] args) {
        int readedNumber;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter integer: ");
        readedNumber = sc.nextInt();
        
        if(readedNumber % 5 == 0 && readedNumber % 7 == 0){
            System.out.printf("The number %d can be deleted by 5 and 7 without remainder", readedNumber);
        } else {
            System.out.printf("The number %d can not be deleted by 5 and 7 without remainder", readedNumber);
        }
    }
    
}
