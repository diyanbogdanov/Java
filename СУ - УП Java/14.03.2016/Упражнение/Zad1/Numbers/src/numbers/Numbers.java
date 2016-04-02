package numbers;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Numbers {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int numberThree;
        int numberFour;
        int numberFive;
        double average;
        int countBiggerThanAverage;
        int countNegative;
        int countZeroes;
        String outputString;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter number one: ");
        numberOne = sc.nextInt();
        
        System.out.print("Please enter number two: ");
        numberTwo = sc.nextInt();
        
        System.out.print("Please enter number three: ");
        numberThree = sc.nextInt();
        
        System.out.print("Please enter number four: ");
        numberFour = sc.nextInt();
        
        System.out.print("Please enter number five: ");
        numberFive = sc.nextInt();
        
        average = ( numberOne + numberTwo + numberThree + numberFour + numberFive ) / 5;
        
        countBiggerThanAverage  = 0;
        if(numberOne > average){
            countBiggerThanAverage++;
        } 
        if(numberTwo > average) {
            countBiggerThanAverage++;
        }
        if(numberThree > average) {
            countBiggerThanAverage++;
        }
        if(numberFour > average) {
            countBiggerThanAverage++;
        }
        if(numberFive > average) {
            countBiggerThanAverage++;
        }
        
        countNegative = 0;
        if(numberOne < 0){
            countNegative++;
        }
        if(numberTwo < 0) {
            countNegative++;
        }
        if(numberTwo < 0) {
            countNegative++;
        }
        if(numberTwo < 0) {
            countNegative++;
        }
        if(numberTwo < 0) {
            countNegative++;
        }
        
        countZeroes = 0;
        if(numberOne == 0){
            countZeroes++;
        }
        if(numberTwo == 0) {
            countZeroes++;
        }
        if(numberTwo == 0) {
            countZeroes++;
        } 
        if(numberTwo == 0) {
            countZeroes++;
        }
        if(numberTwo == 0) {
            countZeroes++;
        }
        
        outputString = String.format("Numbers bigger than average: %d\nNumber of negative are: %d\nNumber of zeroes: %d\n", countBiggerThanAverage, countNegative, countZeroes);
        
        JOptionPane.showMessageDialog(null, outputString);
        
    }
    
}
