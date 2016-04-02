package function;

import javax.swing.JOptionPane;

public class Function {

    public static void main(String[] args) {
        //Declaring variables
        double x; //Declare x
        double y; //Declare y
        double z; //Declare z
        double result; //Declare result of functin
        String outputString; //Declare string to output
        
        //Read variables x,y,x from dialog window
        x = Double.parseDouble(JOptionPane.showInputDialog("Please enter first number: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Please enter second number: "));
        z = Double.parseDouble(JOptionPane.showInputDialog("Please enter third number: "));
        
        //Calculate result with give variables
        result = 4 * (Math.pow(x,2) / (Math.pow(x, 2) + 1)) - 9*(y + x * z)  + (3 + y*(2 + x))/((Math.pow(y, 2)) + 4);
        
        //Frormating string to output
        outputString = String.format("x: %.2f\ny: %.2f\nz: %.2f\nResult is: %.2f", x, y, z, result);
        
        //Show window and outprint formated string
        JOptionPane.showMessageDialog(null,outputString, "Zadacha1", JOptionPane.INFORMATION_MESSAGE );
    }
    
}
