package comparingfloats;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ComparingFloats {

    public static void main(String[] args) {
        double eps = 0.000001;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter float value: ");
        double numberA = sc.nextDouble();
        
        System.out.print("Please enter float value: ");
        double numberB = sc.nextDouble();
        
        if(eps > Math.abs(Math.max(numberA, numberB) - Math.min(numberA, numberB))){
            System.out.println("The two numbers are equal!");
        } else {
            System.out.println("The two numbers are not equal!");
        }
    }
    
}
