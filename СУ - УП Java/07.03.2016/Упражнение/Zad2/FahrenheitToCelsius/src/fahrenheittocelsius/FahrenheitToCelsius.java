package fahrenheittocelsius;

import javax.swing.JOptionPane;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        //Declaring variables
        int fahrenheitTemperature; //Declaring fahrenheit temperature
        double celsiusTemperature; //Declaring celsius temperature
        String inputFahrenheit;//Declaring string to read from dialog
        String resultString;//Declaring string to output
        
        //read from dialog
        inputFahrenheit = JOptionPane.showInputDialog("Please enter integer for Fahrenheit temperature: ");
        
        //parse number from string to int
        fahrenheitTemperature = Integer.parseInt(inputFahrenheit);
        
        //calculating the celsius temperature
        celsiusTemperature = (5.0 / 9.0) * (fahrenheitTemperature - 32);
        
        //initializing the output string
        resultString = String.format("Temperature from Fahrenheit to Celsius is: %.2f", celsiusTemperature);
        
        //output using dialog
        JOptionPane.showMessageDialog( null, resultString, 
         "Fahrenheit To Celsius", JOptionPane.INFORMATION_MESSAGE );

        System.exit( 0 );
    }
    
}
