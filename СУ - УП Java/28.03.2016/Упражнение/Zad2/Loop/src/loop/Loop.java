package loop;

public class Loop {

    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        
        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
    
}
