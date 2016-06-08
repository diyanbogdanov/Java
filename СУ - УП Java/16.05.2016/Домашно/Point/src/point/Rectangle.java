package point;

import java.awt.*;

public class Rectangle {
    private Point[] points;
    
    public Point[] getPoints() {
        Point[] result = new Point[this.points.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = new Point(this.points[i]);
        }
        
        return result;
    }
    
    public void setPoints(Point[] points) {
        if (points == null || points.length != 2) {
            this.points = new Point[] {new Point(), new Point()};
        } else {
            this.points = new Point[points.length];
            for (int i = 0; i < points.length; i++) {
                this.points[i] = new Point(points[i]);
            }
        }
    }
    
    public Rectangle(Point[] points) {
        setPoints(points);
    }
    
    public Rectangle() {
        this(new Point[] {new Point(), new Point()});
    }
    
    public Rectangle(Rectangle q) {
        this(q.getPoints());
    }
    
    public void draw(Graphics g) {
        int height = points[1].getCords()[0] - points[0].getCords()[0];
        int width = points[1].getCords()[1] - points[0].getCords()[1];
        g.drawRect(points[0].getCords()[0], points[0].getCords()[1], width, height);
    }
    
    @Override
    public String toString() {
        return String.format("{%s, %s}", points[0].toString(), points[1].toString());
    }
}
