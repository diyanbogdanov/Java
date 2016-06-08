package complex;

public class Complex {
    private double realPart;
    private double imaginaryPart;
    
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }
    
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    
    public double getRealPart() {
        return this.realPart;
    }
    
    public double getImaginaryPart() {
        return this.imaginaryPart;
    }
    
    //Default construcor
    public Complex() {
        setRealPart(1.0);
        setImaginaryPart(0.0);
    }
    
    //Counstrucor for common use
    public Complex(double realPart, double imaginaryPart) {
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }
    
    //Copy constructor
    public Complex(Complex c) {
        setRealPart(c.getRealPart());
        setImaginaryPart(c.getImaginaryPart());
    }
    
    //Constructor for initializing real numbers
    public Complex(double realPart) {
        setRealPart(realPart);
        setImaginaryPart(0.0);
    }
    
    public int linearSeacrch(Complex[] list) {
        // loop through array sequentially
      for ( int index = 0; index < list.length; index++ )
         if ( this.equals(list[index]) /*(list[index].getRealPart() == this.realPart) && (list[index].imaginaryPart == this.imaginaryPart)*/ )
            return index; // return index of integer

      return -1; // integer was not found  
    }
    
    
    //Return norm of complex number
    public double norm() {
        // return Math.sqrt(Math.pow(realParty, 2) + Math.pow(imaginaryPart, 2));
        return Math.hypot(realPart, imaginaryPart); //execute Math.sqrt(realPart*realPart + imaginaryPart*imaginaryPart)
    }
    
    public static Complex[] sort(Complex[] numbers) {
        Complex[] numbersLocal = new Complex[numbers.length];
        cloneArray(numbersLocal, numbers);
        
        for (int pass = 1; pass < numbersLocal.length; pass++) {
            
            for (int element = 0; element < numbersLocal.length - pass; element++) {
            // compare side-by-side elements and swap them if 
            // first element is greater than second element
                if (numbersLocal[element].norm() > numbersLocal[element + 1].norm()) {
                    swap(numbersLocal, element, element + 1);
                }
            }
        }
        
        return numbersLocal;
    }
    
    public static double findMaximumNorm(Complex[][] numbers) {
        double maxNorm = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (maxNorm < numbers[i][j].norm()) {
                    maxNorm = numbers[i][j].norm();
                }
            }
        }
        
        return maxNorm;
    }
    
    //Return a new Complex object with value is (this + b)
    public Complex plus(Complex b) {         // invoking object
        double real = this.realPart + b.getRealPart();
        double imaginary = this.imaginaryPart + b.getImaginaryPart();
        return new Complex(real, imaginary);
    }
    
    //Return a new Complex object with value is (this - b)
    public Complex minus(Complex b) {
        double real = this.realPart - b.getRealPart();
        double imaginary = this.imaginaryPart - b.getImaginaryPart();
        return new Complex(real, imaginary);
    }
    
    //Return a new Complex object with value is (this * b)
    public Complex multiply(Complex b) {
        double real = this.realPart * b.getRealPart() - this.imaginaryPart * b.getImaginaryPart();
        double imaginary = this.realPart * b.getImaginaryPart() + this.imaginaryPart * b.getRealPart();
        return new Complex(real, imaginary);
    }
    
    //Return a new Complex object with value is (this / b)
    public Complex divide(Complex b) {
        double real = this.realPart / b.getRealPart() - this.imaginaryPart / b.getImaginaryPart();
        double imaginary = this.realPart / b.getImaginaryPart() + this.imaginaryPart / b.getRealPart();
        return new Complex(real, imaginary);
    }

    // swap two elements of an array
    public static void swap(Complex[] array, int first, int second) {
        double temp;  // temporary holding area for swap

        temp = array[first].getRealPart();
        array[first].setRealPart(array[second].getRealPart());
        array[second].setRealPart(temp);
        
        temp = array[first].getImaginaryPart();
        array[first].setImaginaryPart(array[second].getImaginaryPart());
        array[second].setImaginaryPart(temp);
    }
    
    private static void cloneArray(Complex[] arrayOne, Complex[] arrayTwo) {
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = new Complex(arrayTwo[i].getRealPart(), arrayTwo[i].getImaginaryPart());
        }
    }
    
    //Return formated string with complex number and it's norm
    @Override
    public String toString() {
        return String.format("(%.2f,%.2f)\nNorm: %.2f", this.realPart, this.imaginaryPart, this.norm());
    }
}
