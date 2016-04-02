package function;

//Read from console beggining and ending of interval, and calculate function with this input values;
import javax.swing.JOptionPane;

public class Function {

    public static void main(String[] args) {
        //Declaring variables
        double numberA; //Begining of interval
        double numberB; //End of interval
        double middleOfInterval; //Middle value of interval
        double averageValue; // Average sum of runction results
        double minimumValue; //Maximum result of function
        double maximumValue; //Minimum result of function
        double functionResultA; //Result of function with input begining of interval
        double functionResultB; //Result of function with input end of interval
        double functionResultMiddle; //Result of function with input middle value of interval
        double absoluteValueAFirst; //Use this variable to calculate absolute value of expresson for begginig of interval
        double absoluteValueASecond; //Use this variable to calculate absolute value of expresson for begginig of interval
        double absoluteValueBFirst; //Use this variable to calculate absolute value of expresson for end of interval
        double absoluteValueBSecond; //Use this variable to calculate absolute value of expresson for end of interval
        double absoluteValueMidFirst; //Use this variable to calculate absolute value of expresson for middle of interval
        double absoluteValueMidSecond; //Use this variable to calculate absolute value of expresson for middle of interval
        String inputNumberA; //String to read beggining of interval value from input dialog
        String inputNumberB; //String to read end of interval from input dialog
        String outprintString; //String to format the output
        
        //Read string value from dialog window for beginning of inteval
        inputNumberA = JOptionPane.showInputDialog("Please eneter number \'a\' for begining of interval: ");
        numberA = Double.parseDouble(inputNumberA); //Parse value to double
        
        //Read string value from dialog window for end of interval
        inputNumberB = JOptionPane.showInputDialog("Please eneter number \'b\' for begining of interval: ");
        numberB = Double.parseDouble(inputNumberB); //Parse value to double
        
        //Check if the two number are the same, if they are then program will show dialog window with information and close.
        if(numberB == numberA) {
            JOptionPane.showMessageDialog(null, "You entered two same numbers, they should be different!", "Error",
         JOptionPane.WARNING_MESSAGE );
            System.exit(0);
        }
        
        //Calculate middle of interval value
        middleOfInterval = ( numberA + numberB ) / 2;
        
        //Calculate absolute value of expressions used in formula for middle value of interval
        absoluteValueAFirst = ( ( numberA - 1 ) < 0) ? -( numberA - 1 ) : ( numberA - 1 );
        absoluteValueASecond = ( ( ( numberA * numberA ) - 4 ) < 0) ? -( ( numberA * numberA) - 4) : ( ( numberA * numberA) - 4) ;
        //Calculate all result of function needed in program to print for beginning of interval
        functionResultA = absoluteValueAFirst / absoluteValueASecond + 2 * ( (numberA * numberA * numberA) - 9);
        
        //Check if result of function is infinity then function do not have solution
        if(functionResultA == 1.0 / 0.0){
            JOptionPane.showMessageDialog(null, "Function do not have solution in beggining of interval!", "Error",
         JOptionPane.WARNING_MESSAGE );
            System.exit(0);
        }
        
        //Calculate absolute value of expressions used in formula for middle value of interval
        absoluteValueBFirst = ( ( numberB - 1 ) < 0 ) ? -( numberB - 1 ) : ( numberB - 1 );
        absoluteValueBSecond = ( ( ( numberB * numberB ) - 4 ) < 0 ) ? -( ( numberB * numberB ) - 4) : ( ( numberB * numberB ) - 4);
        //Calculate result of function needed in program to print for end of interval
        functionResultB = absoluteValueBFirst / absoluteValueBSecond + 2 * ( (numberB * numberB * numberB) - 9);
        
        //Check if result of function is infinity then function do not have solution
        if(functionResultB == 1.0 / 0.0){
            JOptionPane.showMessageDialog(null, "Function do not have solution in end of interval!", "Error",
         JOptionPane.WARNING_MESSAGE );
            System.exit(0);
        }
        
        //Calculate absolute value of expressions used in formula for middle value of interval
        absoluteValueMidFirst = ( ( middleOfInterval - 1 ) < 0 ) ? -( middleOfInterval - 1 ) : (middleOfInterval - 1);
        absoluteValueMidSecond = ( ( ( middleOfInterval * middleOfInterval ) - 4) < 0 ) ? -( ( middleOfInterval * middleOfInterval ) - 4) : ( ( middleOfInterval * middleOfInterval ) - 4) ;
        //Calculate result of function needed in program to print for middle of interval
        functionResultMiddle = absoluteValueMidFirst / absoluteValueMidSecond + 2 * ( (middleOfInterval * middleOfInterval * middleOfInterval) - 9);
        
        //Check if result of function is infinity then function do not have solution
        if(functionResultMiddle == 1.0 / 0.0){
            JOptionPane.showMessageDialog(null, "Function do not have solution in middle of interval!", "Error",
         JOptionPane.WARNING_MESSAGE );
            System.exit(0);
        }
        
        //Find the maximum function result and asign it to maximumValue using ternary operator
        if(functionResultA >= functionResultB) {
            maximumValue = functionResultA >= functionResultMiddle ? functionResultA : functionResultMiddle;
        } else {
            maximumValue = functionResultB >= functionResultMiddle ? functionResultB : functionResultMiddle;
        }
        //Find the smallest function result and asign it to minimumValue using ternary operator
        if (functionResultA <= functionResultB) {
            minimumValue = functionResultA <= functionResultMiddle ? functionResultA : functionResultMiddle;
        } else {
            minimumValue = functionResultB <= functionResultMiddle ? functionResultB : functionResultMiddle;
        }
        //Calculating the average sum of function results
        averageValue = ( functionResultA + functionResultB + functionResultMiddle ) / 3;
        
        //Format string for easy reading
        outprintString = String.format("X    F(x)\n%.1f    %.1f\n%.1f    %.1f\n%.1f    %.1f\nMaximum value is: %.1f\nMinimum value is: %.1f\nAverage sum is: %.1f", numberA, functionResultA, middleOfInterval, functionResultMiddle, numberB, functionResultB, maximumValue, minimumValue, averageValue);
        
        //Show message dialog and print already formated string
        JOptionPane.showMessageDialog(null, outprintString, "Calculating Function",
         JOptionPane.INFORMATION_MESSAGE );
    } //End of main method
    
} //End of class