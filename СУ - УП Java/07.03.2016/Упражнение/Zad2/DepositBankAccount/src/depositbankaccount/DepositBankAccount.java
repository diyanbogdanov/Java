
package depositbankaccount;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class DepositBankAccount {

    public static void main(String[] args) {
        double rate;
        double deposit;
        double totalOneMonth;
        double totalThreeMonths;
        int months;
        String readRate;
        String readDeposit;
        String resultString;
        
        readRate = JOptionPane.showInputDialog("Please, enter rate: ");
        rate = Integer.parseInt(readRate);
        
        readDeposit = JOptionPane.showInputDialog("Please, enetr deposit: ");
        deposit = Integer.parseInt(readDeposit);
        
        totalOneMonth = deposit * (1 + rate/1000);
        totalThreeMonths = deposit * Math.pow((1 + rate/1000),3.0);
        
        resultString = String.format("Total for one month: %f\nTotal for three months: %f", totalOneMonth, totalThreeMonths);
        
        //output using dialog
        JOptionPane.showMessageDialog( null, resultString, 
         "Celsius To Fahrenheit", JOptionPane.INFORMATION_MESSAGE );

        System.exit( 0 );
    }
    
}
