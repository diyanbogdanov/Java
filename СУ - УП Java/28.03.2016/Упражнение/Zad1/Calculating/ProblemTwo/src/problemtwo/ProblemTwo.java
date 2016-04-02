package problemtwo;

import java.util.Scanner;

public class ProblemTwo {

    public static void main(String[] args) {
        int n;
        double x;
        double fact;
        double sum;
        double epsilon;
        double previusSum;
        Scanner input;
        
        n = 1;
        fact = 1;
        sum = 1;
        epsilon = 0.001;
        input = new Scanner(System.in);
        
        System.out.print("Please enter number x: ");
        x = input.nextDouble();
        
        do {
            previusSum = sum;
            sum += Math.pow(x, n)/fact;
            System.out.printf("%d %.6f\n",n, sum);
            n++;
            fact *= n;
        } while (Math.abs(sum - previusSum) >= epsilon);
    }
    
}
