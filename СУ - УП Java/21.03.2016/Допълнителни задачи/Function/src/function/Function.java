package function;

import javax.swing.JOptionPane;

public class Function {

    public static void main(String[] args) {
        int x;
        int absX;
        int y;
        int result;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Please enter integer for x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Please enter integer for y: "));
        
        absX = ( x < 0)? -x : x;
        
        result = ( absX / (y % 2) + 5) / ( 4 - x);
        
        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
    
}
