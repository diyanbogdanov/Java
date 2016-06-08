package point;

public class Rectangle {
    private Point upperLeft;
    private Point bottomRight;
    
    public Rectangle() {
        this(new Point(), new Point());
    }
    
    public Rectangle(Point upperLeft, Point bottomRight) {
        setUpperLeft(upperLeft);
        setBottomRight(bottomRight);
    }
    
    public Rectangle(Rectangle rectangle) {
        this(rectangle.getUpperLeft(), rectangle.getBottomRight());
    }
    
    public void setUpperLeft(Point point) {
        if (point != null) {
            upperLeft = new Point(point);
        } else {
            upperLeft = new Point();
        }
    }
    
    public void setBottomRight(Point point) {
        if (point != null) {
            bottomRight = new Point(point);
        } else {
            bottomRight = new Point();
        }
    }
    
    public Point getUpperLeft() {
        return new Point(upperLeft);
    }
    
    public Point getBottomRight() {
        return new Point(bottomRight);
    }
    
    public double Diagonal() {
        int height = bottomRight.getY() - upperLeft.getY();
        int width = bottomRight.getX() - upperLeft.getX();
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width,2));
    }
    
    @Override
    public String toString() {
        return String.format("{%s, %s}", upperLeft.toString(), bottomRight.toString());
    }
}
