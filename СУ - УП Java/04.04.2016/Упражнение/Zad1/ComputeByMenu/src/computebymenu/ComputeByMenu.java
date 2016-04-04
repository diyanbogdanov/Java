package computebymenu;

import java.util.Scanner;

public class ComputeByMenu {
    
    public double x;
    
    public ComputeByMenu(double x){
        setX(x);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }
    
    public void displayMenu() {
        for (int i = 0; i < 60; i++) {
            System.out.println();
        }
        System.out.println("1. Въведи число x в плаваща запетая\n2. Пресметни  и изведи exp(x)\n3. Пресметни и изведи sin(x)\n4. Пресметни и изведи floor(x)\n5. Край");
    }
    
    public void doSelection(int choice) {
        switch (choice) {
            case 1:
                Scanner sc;
                
                sc = new Scanner(System.in);
                System.out.print("Въведи число с плаваща запетая: ");
                
                setX(sc.nextDouble());
                getUserChoice();
                break;
            case 2:
                System.out.printf("exp(%.2f): %.2f", this.x, Math.exp(x));
                getUserChoice();
                break;
            case 3:
                System.out.printf("sin(%.2f): %.2f", this.x, Math.sin(Math.toRadians(x)));
                getUserChoice();
                break;
            case 4:
                System.out.printf("floor(%.2f): %.2f", this.x, Math.floor(x));
                getUserChoice();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    
    public void getUserChoice() {
        int choice;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        displayMenu();
        
        choice = sc.nextInt();
        
        doSelection(choice);
    }
}
