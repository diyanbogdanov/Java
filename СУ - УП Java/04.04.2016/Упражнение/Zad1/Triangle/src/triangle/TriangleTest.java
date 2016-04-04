package triangle;

import java.util.Random;

public class TriangleTest {
    public static void main(String[] args) {
        Random rand;
        Triangle triangle;
        int sideOne;
        int sideTwo;
        double angle;
        
        rand = new Random();
        
        sideOne = rand.nextInt(10) + 1;
        sideTwo = rand.nextInt(10) + 1;
        angle = 30 + rand.nextInt() * 90;
        
        triangle = new Triangle(sideOne, sideTwo, angle);
        
        System.out.println(triangle.toString());
        System.out.println(triangle.getMinHeight());
    }
}
