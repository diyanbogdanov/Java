package Five;

// Lab 3: Five.java
// Program breaks apart a five-digit number
import javax.swing.JOptionPane;

public class Five {

   public static void main( String args[] )
   {
      int originalNumber;
      int number;
      String inputString;
      String resultString;

      // read five-digit number from user as a String
      inputString = JOptionPane.showInputDialog( "Enter five digit integer:" );

      // convert inputString to an integer and assign it to originalNumber
      originalNumber = Integer.parseInt( inputString );

      // determine the 5 digits
      int digit1; // first digit of number
      int digit2; // second digit of number
      int digit3; // third digit of number
      int digit4; // fourth digit of number 
      int digit5; // fifth digit of number

      digit1 = originalNumber / 10000; // get leftmost digit
      number = originalNumber % 10000; // get rightmost four digits

      digit2 = number / 1000;
      number = number % 1000;
      
      digit3 = number / 100;
      number = number % 100;
      
      digit4 = number / 10;
      number = number % 10;
      
      digit5 = number;
      
      resultString = digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5;
      
      // display results
      JOptionPane.showMessageDialog( null, resultString, 
         "Digits in " + originalNumber, JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // end class Five

