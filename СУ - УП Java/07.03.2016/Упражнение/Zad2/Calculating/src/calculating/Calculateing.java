// Lab 2: Calculate2.java
// Perform simple calculations on three integers.
import javax.swing.JOptionPane;

public class Calculateing {

   public static void main( String args[] )
   {
      String firstNumber;  // first string entered by user
      String secondNumber; // second string entered by user
      String thirdNumber;  // third string entered by user
      String result;
      
      int number1; // first number
      int number2; // second number
      int number3; // third number

      double average;  // average of the numbers 
      int largest;  // largest number
      int product;  // product of the numbers
      int smallest; // smallest number
      int sum;      // sum of the numbers

      firstNumber = JOptionPane.showInputDialog("Please enter first integer number: ");
      number1 = Integer.parseInt(firstNumber);
      
      secondNumber = JOptionPane.showInputDialog("Please enter second integer number: ");
      number2 = Integer.parseInt(secondNumber);
      
      thirdNumber = JOptionPane.showInputDialog("Please enter third integer number: ");
      number3 = Integer.parseInt(thirdNumber);

      // determine smallest and largest
      if(number1 > number2){
          if(number1 > number3){
              largest = number1;
              if(number2 > number3){
                  smallest = number3;
              } else {
                  smallest = number2;
              }
          }else{
              largest = number3;
              smallest = number2;
          }
      } else {
          if(number2 > number3){
              if(number3 > number1){
                  smallest = number1;
              } else {
                  smallest = number3;
              }
              largest = number2;
          } else {
              largest = number3;
              smallest = number1;
          }
      }

      // perform calculations
      sum = number1 + number2 + number3;
      product =  number1 * number2 * number3;
      average = sum / 3.0;
      
      result = String.format("The average is: %.1f\nThe sum is: %d\nThe product is: %d\nThe largest is: %d\nThe smallest is: %d", average, sum, product, largest, smallest);

      // display results
      JOptionPane.showMessageDialog( null, result, "Calculation Results",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // end class Calculate2

 
 
