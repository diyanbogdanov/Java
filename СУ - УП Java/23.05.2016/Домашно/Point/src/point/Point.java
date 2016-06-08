package point;

public class Point {
    private int x;
    private int y;
    
    public Point() {
        this(0,0);
    }
    
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }
    
    public Point(Point a) {
        this(a.getX(), a.getY());
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
