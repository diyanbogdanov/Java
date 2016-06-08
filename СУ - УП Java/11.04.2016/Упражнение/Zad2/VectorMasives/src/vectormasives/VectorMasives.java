package vectormasives;

import java.util.Random;

public class VectorMasives {

    public static void main(String[] args) {
        double[] vectorA = {0.0,0.0,0.0};
        double[] vectorB = {0.0,0.0,0.0};
        double[] vectorC;
        double lenghtOfVectorA;
        double lenghtoFVectorB;
        double cosinus;
        double sinus;
        double area;
        
        generateArrayElements(vectorA);
        generateArrayElements(vectorB);
        
        lenghtOfVectorA = lenghtOfVector(vectorA);
        lenghtoFVectorB = lenghtOfVector(vectorB);
        
        System.out.println(lenghtOfVectorA);
        System.out.println(lenghtoFVectorB);
        
        cosinus = Math.toDegrees(Math.acos(scalarProduct(vectorA, vectorB) - (lenghtOfVectorA*lenghtoFVectorB)));
        System.out.printf("Cosinus: %.2f\n", cosinus);
        
        sinus = Math.sqrt(1 - Math.pow(cosinus, 2));
        
        vectorC = vectorProduct(vectorA, vectorB);
        
        area = lenghtOfVector(vectorC) / 2;
    }
    
    public static double[] vectorProduct(double[] vectorOne, double[] vectorTwo) {
        double[] arrResult = new double[3];
        int x;
        int y;
        
        for (int i = 0; i < arrResult.length; i++) {
            x = (i + 1) % 3;
            y = (i + 2) % 3;
            
            arrResult[i] = Math.pow(-1,i) * (Math.pow(-1,i)*vectorOne[x]*vectorTwo[y] + Math.pow(-1, i + 1)*vectorOne[y]*vectorTwo[x]);    
        }
        
        return arrResult;
    }
    
    public static double scalarProduct(double[] vectorOne, double[] vectorTwo) {
        double result;
        
        result = vectorOne[0] * vectorTwo[0];
        
        for (int i = 1; i < vectorTwo.length; i++) {
            result += vectorOne[i] * vectorTwo[i];
        }
        
        return result;
    }
    
    public static double lenghtOfVector(double[] arr) {
        double lenght;
        double sum;
        
        sum = Math.pow(arr[0], 2);
        
        for (int i = 1; i < arr.length; i++) {
            sum += Math.pow(arr[i], 2);
        }
        
        lenght = Math.sqrt(sum);
        
        return lenght;
    }
    
    private static void generateArrayElements(double[] arr) {
        double randomNumber;
        Random random = new Random();
        
        do {
            for (int i = 0; i < arr.length; i++) {
                randomNumber = (random.nextInt(101) / 50) - 1;
                arr[i] = randomNumber;                
            }
        } while (isIdenticalZero(arr));
    }
    
    private static boolean isIdenticalZero(double[] arr) {        
        for (double el : arr) {
            if (el != 0.0) {
                return false;
            }
        }
        return true;
    }
    
}
