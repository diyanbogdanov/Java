/*
 * We are given 5 integer numbers. Write a program that finds all subsets of these numbers whose sum is 0.
 * Assume that repeating the same subset several times is not a problem.
 */
package zerosubset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZeroSubset {

    public static void main(String[] args) {
        int n; //Amount of numbers
        int finalSum;
        String[] stringNumbers;
        int[] numbers;
        int combinations;
        boolean subsetFound;
        Scanner sc;
        
        finalSum = 0;//Sum needed to be made
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter five numbers separate by whitespace: ");
        stringNumbers = sc.nextLine().split(" ");
        
        n = stringNumbers.length;
        numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        
        combinations = (int)Math.pow(2,n);
        int bit;
        subsetFound = false;
        
        for (int i = 1; i < combinations; i++) {
            
            String comBinary = Integer.toBinaryString(i);
            
            String reversBinary = new StringBuffer(comBinary).reverse().toString();
            
            List<Integer> currentCombinationNumbers = new ArrayList<Integer>();
            
            long sum = 0;
            
            for (int k = 0; k < reversBinary.length(); k++) {
                
                bit = Integer.parseInt(Character.toString(reversBinary.charAt(k)));
                
                if (bit == 1) {
                    
                    currentCombinationNumbers.add(numbers[k]);
                    
                    sum += numbers[k];
                    
                    if (k == (reversBinary.length() - 1) && sum == finalSum && currentCombinationNumbers.size() > 1) {
                        
                        subsetFound = true;
                        
                        for (int j = 0; j < currentCombinationNumbers.size(); j++) {
                            
                            if (j < (currentCombinationNumbers.size() - 1)) {
                                
                                System.out.printf("%d + ", currentCombinationNumbers.get(j));
                                
                            } else if(( j == currentCombinationNumbers.size() - 1)){
                                
                                System.out.printf("%d = %d\n", currentCombinationNumbers.get(j), finalSum);
                                
                            }
                        }
                    }
                }
            }
        }
        
        if (!subsetFound) {
            System.out.println("No subsets found!");
        }
    }
    
}
