package point;

public class Point {
    private int[] coords;
    
    public void setCords(int[] coords) {
        this.coords = new int[coords.length];
        
        if (coords == null && coords.length != 2) {
            this.coords = new int[] {0,0};
        } else {
            for (int i = 0; i < coords.length; i++) {
                this.coords[i] = coords[i];
            }
        }
    }
    
    public int[] getCords() {
        int[] result = new int[this.coords.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = this.coords[i];
        }
        
        return result;
    }
    
    public Point() {
        this(new int[] {0,0});
    }
    
    public Point(int[] coords) {
        setCords(coords);
    }
    
    public Point(Point a) {
        this(a.getCords());
    }
    
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.coords[0], this.coords[1]);
    }
}
