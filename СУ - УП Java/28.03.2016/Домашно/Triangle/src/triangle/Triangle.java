package triangle;

public class Triangle {
    private double nPart;
    private double mPart;
    
    public Triangle(double mPart, double nPart){
        setnPart(nPart);
        setmPart(mPart);
    }

    public void setnPart(double nPart) {
        if (nPart > 0) {
            this.nPart = nPart;
        } else {
            this.nPart = 1;
        }
    }

    public void setmPart(double mPart) {
        if (mPart > 0) {
            this.mPart = mPart;
        } else {
            this.mPart = 1;
        }
    }

    public double getnPart() {
        return nPart;
    }

    public double getmPart() {
        return mPart;
    }
    
    public double computePerimeter(){
        double x;
        double cathetusCA;
        double cathetusCB;
        double hypotenuseAB;
        
        cathetusCA = 1.0;
        x = 1/(Math.sqrt( ( mPart*mPart  + mPart*nPart) ) );
        
        hypotenuseAB = (nPart + mPart) * x;
        
        cathetusCB = Math.sqrt( Math.pow(hypotenuseAB,2) - Math.pow(cathetusCA, 2));
        
        return cathetusCA + cathetusCB + hypotenuseAB;
    }
}
