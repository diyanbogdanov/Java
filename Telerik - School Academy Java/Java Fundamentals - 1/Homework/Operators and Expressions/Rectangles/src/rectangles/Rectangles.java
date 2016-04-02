package rectangles;

import java.util.Scanner;

public class Rectangles {

    public static void main(String[] args) {
        double width;
        double height;
        double perimeter;
        double area;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter integer number for width: ");
        width = sc.nextDouble();
        
        System.out.print("Please enter integer number for height: ");
        height = sc.nextDouble();
        
        perimeter = (2 * width) + (2 * height);
        area = width * height;
        
        System.out.printf("The perimeter of reactagle is: %.2f\nThe are of rectangle is: %.2f\n", perimeter, area);
    }
    
}
