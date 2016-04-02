/*
Write a program that reads the radius r of a circle and prints its perimeter and area
formatted with 2 digits after the decimal point.
*/
package circleperimeterandarea;

import java.util.Scanner;

public class CirclePerimeterAndArea {

    public static void main(String[] args) {
            double radius;
            double perimeter;
            double area;
            Scanner sc;
            
            sc = new Scanner(System.in);
            
            System.out.print("Please enter radisu of circle: ");
            radius = sc.nextDouble();
            
            
            perimeter = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius, 2);
            
            System.out.printf("Radius: %.2f\nPerimeter: %.2f\nArea: %.2f\n", radius, perimeter, area);
    }
    
}
