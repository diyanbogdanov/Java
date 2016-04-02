package insidecircleoutsiderectangle;

import java.util.Scanner;

public class InsideCircleOutsideRectangle {

    public static void main(String[] args) {
        double coordinateX;
        double coordinateY;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter X coordinate: ");
        coordinateX = sc.nextDouble();
        
        System.out.print("Please enter Y coordinate: ");
        coordinateY = sc.nextDouble();
        
        if(!(Math.abs(coordinateX) >=6 && Math.abs(coordinateY) <=2) && (Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2) < Math.pow(3, 2))){
            System.out.println("The point is inside circle and outside rectagle");
        } else {
            System.out.println("The point is not inside circle and outside rectagle");
        }
    }
    
}
