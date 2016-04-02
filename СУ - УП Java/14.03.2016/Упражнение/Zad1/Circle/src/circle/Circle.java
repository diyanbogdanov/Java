package circle;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        double numberR;
        double xA;
        double yA;
        double xB;
        double yB;
        boolean insideCircle;
        int numberOfPoints;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please, enter number R - radius: ");
        numberR = sc.nextDouble();
        
        System.out.print("Please, enter coordinate x for point A: ");
        xA = sc.nextDouble();
        
        System.out.print("Please, enter coordinate y for point A: ");
        yA = sc.nextDouble();
        
        System.out.print("Please, enter coordinate x for point B: ");
        xB = sc.nextDouble();
        
        System.out.print("Please, enter coordinate y for point B: ");
        yB = sc.nextDouble();
        
        insideCircle = false;
        if((Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2)) < Math.pow(numberR,2)){
            insideCircle = true;
        }
        
        if((yA > 0 && (yA - numberR) < 0) || (yA < 0 &&(yA + numberR) > 0) || yA == 0) {
            numberOfPoints = 2;
        } else if((yA > 0 &&(yA - numberR) == 0) ||(yA < 0 &&(yA + numberR) == 0)) {
            numberOfPoints = 1;
        } else {
            numberOfPoints = 0;
        }
        
        System.out.printf("Point B is inside circle: %s\nNumber of crossed points: %d", insideCircle, numberOfPoints);
    }
    
}
