package triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle;
        double perimeter;
        
        triangle = new Triangle(3, 9);
        
        perimeter = triangle.computePerimeter();
        
        System.out.println(perimeter);
    }    
}
