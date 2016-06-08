package weekfifteen;

public class Line extends Point {
    private Point ePoint;
    
    public Line(double weight, int x, int y, Point ePoint) {
        super(weight, x, y);
        setePoint(ePoint);
    }
    
    public Line() {
        this(0, 0, 0, new Point());
    }
    
    public Line(Line line) {
        this(line.getWeight(), line.getX(), line.getY(), line.getePoint());
    }

    public void setePoint(Point ePoint) {
        if (ePoint != null) {
            this.ePoint = new Point(ePoint);
        } else {
            this.ePoint = new Point();
        }
    }
    
    public Point getePoint() {
        return new Point(ePoint);
    }
    
    @Override
    public double calcWeight() {
        double averageWeight = (super.calcWeight() + ePoint.calcWeight()) / 2;
        return Math.sqrt(Math.pow(super.getX() - ePoint.getX(), 2) + Math.pow(super.getY() - ePoint.getY(),2)) * averageWeight;
    }
    
    @Override
    public String toString() {
        return String.format("{%s, %s}", super.toString(), ePoint.toString());
    }
}