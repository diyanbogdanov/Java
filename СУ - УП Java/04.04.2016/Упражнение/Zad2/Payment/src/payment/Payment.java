package payment;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Payment {

    private double balance;

    public Payment(double balance) {
        setBalance(balance);
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void addToBalance(double sum) {
        if (sum > 0) {
            this.balance += sum;
        }
    }
    
    public void calculateChange(double pay) {
        String outprint;
        int sum = (int)((pay - balance) * 100);
        
        int lev = sum / 100;
        sum %= 100;
        int fifty = sum / 50;
        sum %= 50;
        int twenty = sum / 20;
        sum %= 20;
        int tens = sum / 10;
        sum %= 10;
        int five = sum / 5;
        sum %= 5;
        int two = sum / 2;
        sum %= 2;
        int one = sum;
        
        outprint = String.format("%d лева, %d монети по 50 стотинки, %d монета от 20  стотинки, %d монета от 10 стотинки, %d монети от 5 стотинки, %d монета от 2 стотинки и %d монети от 1 стотинка.", lev, fifty, twenty, tens, five, two, one);
        
        JOptionPane.showMessageDialog(null, outprint, "Плащане", JOptionPane.INFORMATION_MESSAGE);
    }

    public void displayMenu() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("1. Добави стока\n2. Плащане\n3. Изход");
    }

    public void doSelection(int choice) {
        Scanner sc = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.print("Добавете стойност: ");

                addToBalance(sc.nextDouble());
                getUserChoice();
                break;
            case 2:
                double sum;
                
                System.out.printf("Текущата сума е: %.2f\n", getBalance());
                
                do {
                    System.out.print("Моле въведета дължимата сума: ");
                    sum = sc.nextDouble();
                } while (sum < getBalance());
                
                if (sum == getBalance()) {
                    setBalance(0);
                    System.out.println("Благодаря!");
                } else {
                    calculateChange(sum);
                }

                getUserChoice();
                break;
            case 3:
                System.exit(0);
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
