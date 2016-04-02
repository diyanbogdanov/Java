
package celsiustofahrenheit;

import javax.swing.JOptionPane;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        //Declaring variables
        int celsiusTemperature; //Declaring fahrenheit temperature
        double fahrenheitTemperature; //Declaring celsius temperature
        String inputCelsius;//Declaring string to read from dialog
        String resultString;//Declaring string to output
        
        //read from dialog
        inputCelsius = JOptionPane.showInputDialog("Please enter integer for Celsius temperature: ");
        
        //parse number from string to int
        celsiusTemperature = Integer.parseInt(inputCelsius);
        
        //calculating the celsius temperature
        fahrenheitTemperature = 9.0 / 5.0 * celsiusTemperature + 32;
        
        //initializing the output string
        resultString = String.format("Temperature from Celsius to Fahrenheit is: %.2f", fahrenheitTemperature);
        
        //output using dialog
        JOptionPane.showMessageDialog( null, resultString, 
         "Celsius To Fahrenheit", JOptionPane.INFORMATION_MESSAGE );

        System.exit( 0 );
    }
    
}
