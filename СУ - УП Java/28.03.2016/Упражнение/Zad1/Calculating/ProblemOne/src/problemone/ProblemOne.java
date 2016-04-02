package problemone;

public class ProblemOne {

    public static void main(String[] args) {
        int n;
        double fact;
        double sum;
        double epsilon;
        
        n = 1;
        fact = 1;
        sum = 1;
        epsilon = 0.001;
        
        do {
            sum += 1.0/fact;
            System.out.printf("%d %.6f\n",n, sum);
            n++;
            fact *= n;
        } while (Math.abs(sum - 2.71828) >= epsilon);
        
        
    }
    
}
