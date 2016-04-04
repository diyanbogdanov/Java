package triangle;

public class Triangle {
    public double sideAB;
    public double sideAC;
    public double angleACB;
    
    public Triangle(double sideAB, double sideAC, double angleACB){
        setSideAB(sideAB);
        setSideAC(sideAC);
        setAngleACB(angleACB);
    }

    public void setSideAB(double sideAB) {
        if (sideAB > 0) {
            this.sideAB = sideAB;
        } else {
            this.sideAB = 1;
        }
    }

    public void setSideAC(double sideAC) {
        if (sideAC > 0) {
            this.sideAC = sideAC;
        } else {
            this.sideAC = 1;
        }
    }

    public void setAngleACB(double angleACB) {
        if (angleACB > 0) {
            this.angleACB = angleACB;
        } else {
            this.angleACB = Math.toRadians(30);
        }
    }

    public double getSideAB() {
        return sideAB;
    }

    public double getSideAC() {
        return sideAC;
    }

    public double getAngleACB() {
        return angleACB;
    }
    
    public String toString(){
        String returnString;
        
        returnString = String.format("Side AB: %.2f\nSide AC: %.2f\nAngle ACB: %.2f", this.sideAB, this.sideAC, this.angleACB);
        
        return returnString;
    }
    
    public double area(){
        double area;
        
        area = (getBC() * sideAC  * Math.sin(angleACB)) / 2;
        
        return area;
    }
    
    public double perimeter(){
        double perimeter;
        
        perimeter = sideAB + sideAC + getBC();
        
        return perimeter;
    }
    
    public double getBC(){
        double sideBC;
        double angleCBA;
        double angleBAC;
        
        angleCBA = Math.asin(Math.toRadians((sideAC*Math.sin(angleACB))/sideAB));
        
        angleBAC = 180 - angleCBA - angleACB;
        
        sideBC = Math.sqrt(Math.pow(sideAC,2) + Math.pow(sideAB, 2) - 2 * sideAC * sideAB * Math.cos(Math.toRadians(angleBAC)));
        
        return sideBC;
    }
    
    public double getCH(){
        double ch;
        
        ch = ( 2*area() ) / sideAB;
        
        return ch;
    }
    
    public double getMinHeight(){
        double ah;
        double bh;
        
        ah = ( 2 * area() ) / getBC();
        bh = ( 2 * area() ) / sideAC;
        
        return Math.min(ah, Math.min(getCH(), bh));
    }
}
