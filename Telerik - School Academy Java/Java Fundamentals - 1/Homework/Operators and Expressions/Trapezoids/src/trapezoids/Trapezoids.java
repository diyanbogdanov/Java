package trapezoids;

import java.util.Scanner;

public class Trapezoids {

    public static void main(String[] args) {
        double sideA;
        double sideB;
        double height;
        double area;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter positiv number for side A: ");
        sideA = sc.nextDouble();
        
        System.out.print("Please enter positiv number for side B: ");
        sideB = sc.nextDouble();
        
        System.out.print("Please enter positiv number for height: ");
        height = sc.nextDouble();
        
        area = (( sideA + sideB ) * height) / 2;
        
        System.out.printf("The area of trapezoid is %f", area);
    }
    
}
