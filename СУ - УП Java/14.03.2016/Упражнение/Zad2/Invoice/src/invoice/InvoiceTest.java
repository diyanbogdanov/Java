package invoice;

import javax.swing.JOptionPane;

public class InvoiceTest {
    
    public static void main(String[] args) {
        String productName;
        String productDescription;
        int quantity;
        double price;
        String outprintAstring;
        
        productName = JOptionPane.showInputDialog("Please enter product name: ");
        productDescription = JOptionPane.showInputDialog("Please enter product description: ");
        quantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter quantity: "));
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter price: "));
        
        Invoice inv = new Invoice(productName, productDescription, quantity, price);
        
        outprintAstring = String.format("The invoice is: %.2f", inv.getInvoiceAmount());
        
        JOptionPane.showMessageDialog(null, outprintAstring);
    }
}
