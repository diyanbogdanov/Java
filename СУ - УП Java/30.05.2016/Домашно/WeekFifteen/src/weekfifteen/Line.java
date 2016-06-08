package weekfifteen;

public class Line extends Point {
    private Point sPoint;
    private Point ePoint;
    
    public Line(Point sPoint, Point ePoint) {
        setePoint(ePoint);
        setsPoint(sPoint);
    }
    
    public Line() {
        this(new Point(), new Point());
    }
    
    public Line(Line line) {
        this(line.getsPoint(), line.getePoint());
    }

    public void setsPoint(Point sPoint) {
        if (sPoint != null) {
            this.sPoint = new Point(sPoint);
        } else {
            this.sPoint = new Point();
        }
    }

    public void setePoint(Point ePoint) {
        if (ePoint != null) {
            this.ePoint = new Point(ePoint);
        } else {
            this.ePoint = new Point();
        }
    }
    
    public Point getsPoint() {
        return new Point(this.sPoint);
    }
    
    public Point getePoint() {
        return new Point(this.ePoint);
    }
    
    @Override
    public double calcWeight() {
        double averageWeight = (sPoint.calcWeight() + ePoint.calcWeight()) / 2;
        return Math.sqrt(Math.pow(sPoint.getX() - ePoint.getX(), 2) + Math.pow(sPoint.getY() - sPoint.getY(),2)) * averageWeight;
    }
    
    @Override
    public String toString() {
        return String.format("{%s, %s}", this.sPoint.toString(), this.ePoint.toString());
    }
}