package coordinates;

import java.util.Scanner;

public class Coordinates {

    public static void main(String[] args) {
        double xA;
        double yA;
        double xB;
        double yB;
        double xC;
        double yC;
        Scanner sc;
        boolean pointCOnAB;
        boolean aboveLine;
        boolean inTriangle;
        String stringOutput;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter x coordinate for point A: ");
        xA = sc.nextDouble();
        
        System.out.print("Please enter y coordinate for point A: ");
        yA = sc.nextDouble();
        
        System.out.print("Please enter x coordinate for point B: ");
        xB = sc.nextDouble();
        
        System.out.print("Please enter y coordinate for point B: ");
        yB = sc.nextDouble();
        
        System.out.print("Please enter x coordinate for point C: ");
        xC = sc.nextDouble();
        
        System.out.print("Please enter y coordinate for point C: ");
        yC = sc.nextDouble();
        
        pointCOnAB = false;
        
        if ((yC - yA) == (yB - yA)*(xC - xA)/(xB - xA) ) {
            pointCOnAB = true;
        }
        
        aboveLine = false;
        
        if (yC > 0 && (yC - yA) >= (yB - yA)*(xC - xA)/(xB - xA) ) {
            aboveLine = true;
        }
        
        inTriangle = false;
        
        if(yC > 0 && xC > 0 && !((yC - yA) >= (yB - yA)*(xC - xA)/(xB - xA))) {
            inTriangle = true;
        } else if(yC < 0 && xC > 0  && !((yC - yA) >= (yB - yA)*(xC - xA)/(xB - xA))) {
            inTriangle = true;
        } else if(yC > 0 && xC < 0 && ((yC - yA) >= (yB - yA)*(xC - xA)/(xB - xA))){
            inTriangle = true;
        } else if(yC < 0 && xC > 0 && ((yC - yA) >= (yB - yA)*(xC - xA)/(xB - xA))) {
            inTriangle = true;
        }
        
        stringOutput = String.format("Point C line on AB: %s\nPoint C line above AB: %s\nPoint C line in triangle OAB: %s", pointCOnAB,aboveLine,inTriangle);
        
        System.out.println(stringOutput);
        
    }
    
}
