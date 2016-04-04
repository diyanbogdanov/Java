package cosinusfunction;

public class CosinusFunction {
    public void calculateCosinus(double x){
        double eps;
        double cosX;
        double mathCosX;
        int counter;
        int temp;
        
        eps = 0.00001;
        cosX = 0;
        mathCosX = Math.cos(Math.toRadians(x));
        counter = 0;
        temp = 0;
        
        x = Math.toRadians(x);
        
        do {
            cosX += Math.pow(-1, counter) * (Math.pow(x, temp)/factoriel(temp));
            temp += 2;
            counter++;
        } while (Math.abs(mathCosX - cosX) >= eps);
        
        x = Math.toDegrees(x);
        
        System.out.printf("Custom cosinus(%.2f): %.5f\nMath cos(%.2f): %.5f\n",x, cosX, x, mathCosX);
    }
    
    private double factoriel(int number){
        double sum = 1;
        
         while (number > 1) {
            sum *= number;
            number--;
        }
        
        return sum;
    }
}
