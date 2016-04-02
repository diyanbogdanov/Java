package pointinacircle;

import java.util.Scanner;

public class PointInACircle {

    public static void main(String[] args) {
        double pointX;
        double pointY;
        double radius;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter \'x\' point: ");
        pointX = sc.nextDouble();
        
        System.out.print("Please enter \'y\' point: ");
        pointY = sc.nextDouble();
        
        radius = 2;
        
        if((Math.pow(pointX,2) + Math.pow(pointY,2)) <= Math.pow(radius,2)){
            System.out.println("The point is in circle!");
        } else {
            System.out.println("The point is NOT in circle!");
        }
    }
    
}
