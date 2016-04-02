package problemthree;

import java.util.Scanner;

public class ProblemThree {
    
    public static void main(String[] args) {
        double x;
        double sinX;
        double cosX;
        Scanner input;
        
        input = new Scanner(System.in);
        
        System.out.print("Please enter number x: ");
        x = toDegress(input.nextDouble());
        
        sinX = sinAndCos(x, 1);
        cosX = sinAndCos(x, 0);
        
        System.out.printf("sin:\t%.6f\ncos:\t%.6f\n",sinX, cosX);
    }
    
    private static int fact(int number){
        int sum;
        
        sum = 1;
        
        while (number > 1) {
            sum *= number;
            number--;
        }
        
        return sum;
    }
    
    public static double sinAndCos(double x, int temp){
        int n;
        double epsilon;
        double previusSum;
        double sum;
        
        n = 0;
        sum = 0;
        epsilon = 0.000001;
        
        do {
            previusSum = sum;
            sum += Math.pow(-1, n) * (Math.pow(x, temp)/fact(temp));
            temp += 2;
            n++;
        } while (Math.abs(sum - previusSum) >= epsilon);
        
        return sum;
    };
    
    private static double toDegress(double number){
        return number*Math.PI/180.;
    }
    
}
