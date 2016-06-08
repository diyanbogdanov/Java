package barcode;

import java.util.Scanner;

public class BarCodeTest {
    public static void main(String[] args) {
        int zipCode;
        Scanner sc;
        BarCode barCode;
        
        barCode = new BarCode();
        sc = new Scanner(System.in);
        
        do {
            System.out.print("Please enter zip: ");
            zipCode = sc.nextInt();
        } while (zipCode < 100 && zipCode > 999);
        
        System.out.println(barCode.decode(zipCode));
    }
}
