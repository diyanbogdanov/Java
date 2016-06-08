package weekfifteen;

public class Point extends HeavyElement {
    private int x;
    private int y;
    
    public Point(double weight, int x, int y) {
        super(weight);
        setX(x);
        setY(y);
    }
    
    public Point() {
        this(0,0,0);
    }
    
    public Point(Point point) {
        this(point.getWeight(), point.getX(), point.getY());
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    //Need improvement
    @Override
    public double calcWeight() {
        return this.getWeight();
    }
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}