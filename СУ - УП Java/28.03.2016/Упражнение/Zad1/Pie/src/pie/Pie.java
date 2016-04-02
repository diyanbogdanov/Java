package pie;

public class Pie {

    public static void main(String[] args) {
        int n;
        double sum;
        double epsilon;
        
        n = 0;
        sum = 0;
        epsilon = 0.0001;
        
        do {
            sum += Math.pow(-1,n) * (4.0 / ( 2 * n + 1));
            System.out.printf("%d\t%f\n",n ,sum);
            n++;
        } while (Math.abs(sum - 3.14159) >= epsilon);
        
    }
    
}
