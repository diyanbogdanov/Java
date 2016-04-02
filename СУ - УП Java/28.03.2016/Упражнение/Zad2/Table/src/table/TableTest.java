
package table;

import java.util.Scanner;

public class TableTest {
    public static void main(String[] args) {
        int a;
        int b;
        int temp;
        int steps;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter a: ");
        a = sc.nextInt();
        
        System.out.print("Please enter b: ");
        b = sc.nextInt();
        
        System.out.print("Please enter steps: ");
        steps = sc.nextInt();
        
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        Table tb = new Table(a, b, steps);
        
        tb.makeTable();
    }
}
