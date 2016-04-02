package money;

import javax.swing.JOptionPane;

public class Money {

    public static void main(String[] args) {
        double sum;
        int leva;
        int fiftyCent;
        int twentyCent;
        int tenCent;
        int fiveCent;
        int twoCent;
        int oneCent;
        int cost;
        String print;
        
        
        sum = Double.parseDouble(JOptionPane.showInputDialog("Please enter sum: "));
        
        cost = (int)(sum * 100);
        
        leva = cost / 100;
        cost %= 100;
        
        fiftyCent = cost / 50;
        cost %= 50;
        
        twentyCent = cost / 20;
        cost %= 20;
        
        tenCent = cost / 10;
        cost %= 10;
        
        fiveCent = cost / 5;
        cost %= 5;
        
        twoCent = cost / 2;
        cost %= 2;
        
        oneCent = cost;
        
        print = String.format("%d лева, %d монети по 50, %d монети по 20, %d монети по 10, %d монети по 5, %d монети по 2, %d монети по 1\n", leva, fiftyCent, twentyCent, tenCent, fiveCent, twoCent, oneCent);
        
        JOptionPane.showMessageDialog(null, print, "Zadacha 2", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
