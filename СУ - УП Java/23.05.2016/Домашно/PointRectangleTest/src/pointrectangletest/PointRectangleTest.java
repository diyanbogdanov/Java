package pointrectangletest;

import point.*;

public class PointRectangleTest {

    public static void main(String[] args) {
        Point upperLeftPoint = new Point(0,0);
        Point bottomRightPoint = new Point(4,3);
        Rectangle rectangle = new Rectangle(upperLeftPoint, bottomRightPoint);
        
        System.out.printf("Upper Left Point info: %s\n", upperLeftPoint.toString());
        System.out.printf("Bottom Right Point info: %s\n", bottomRightPoint.toString());
        System.out.printf("Rectangle info: %s\n", rectangle.toString());
        System.out.printf("Diagonal: %s\n", rectangle.Diagonal());
    }
    
}
