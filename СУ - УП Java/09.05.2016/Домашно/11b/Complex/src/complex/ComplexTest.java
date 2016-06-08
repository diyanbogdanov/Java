package complex;

import java.util.Random;

public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(7.0, 7.0);
        Complex b = new Complex(-3.0, 5);
        
        System.out.printf("First complex number a: %s\nSecond complex nuber b: %s\n", a.toString(), b.toString());
        System.out.printf("a + b: %s\n", a.plus(b));
        System.out.printf("a - b: %s\n", a.minus(b));
        System.out.printf("a * b: %s\n", a.multiply(b));
        System.out.printf("a / b: %s\n", a.divide(b));
        
        Complex[] arrayComplex = new Complex[5];
        initializeArray(arrayComplex);
        
        printArray(arrayComplex);
        System.out.println("Array SORTED");
        printArray(Complex.sort(arrayComplex));
        
        Complex[][] arrayComplexsTwo = new Complex[5][5];
        initializeArray(arrayComplexsTwo);
        
        System.out.printf("Maximum norm in arrayComplexTwo: %.2f\n", Complex.findMaximumNorm(arrayComplexsTwo));
    }
    
    private static Complex[] initializeArray(Complex[] array) {
        Random random = new Random();
        double realPart;
        double imaginaryPart;
        
        for (int i = 0; i < array.length; i++) {
            realPart = random.nextInt(10) + 1;
            imaginaryPart = random.nextInt(10) + 1;
            
            array[i] = new Complex(realPart / imaginaryPart, imaginaryPart / realPart);
        }
        
        return array.clone();
    }
    
    private static Complex[][] initializeArray(Complex[][] array) {
        Random random = new Random();
        double realPart;
        double imaginaryPart;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                realPart = random.nextInt(10) + 1;
                imaginaryPart = random.nextInt(10) + 1;
            
                array[i][j] = new Complex(realPart / imaginaryPart, imaginaryPart / realPart);
            }
        }
        
        return array.clone();
    }
    
    private static void printArray(Complex[] array) {
        for (Complex complex : array) {
            System.out.println(complex.toString());
        }
    }
    
    private static void printArray(Complex[][] array) {
        for (Complex[] complex : array) {
            for (Complex arraComplex : complex) {
                System.out.println(arraComplex.toString());
            }
        }
    }
}
