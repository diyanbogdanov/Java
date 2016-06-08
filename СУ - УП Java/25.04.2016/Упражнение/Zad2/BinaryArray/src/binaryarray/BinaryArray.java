package binaryarray;

import java.util.Arrays;
import java.util.Random;

public class BinaryArray {

    private int[] data; // array of values
    private static Random generator = new Random();

    // create array of given size and fill with random integers
    public BinaryArray(int size) {
        data = new int[size]; // create space for array

        // fill array with random ints in range 10-99
        for (int i = 0; i < size; i++) {
            data[i] = 10 + generator.nextInt(90);
        }

        Arrays.sort(data);
    } // end BinaryArray constructor

    // perform a binary search on the data
    public int binarySearch(int searchElement) {
        int low = 0; // low end of the search area
        int high = data.length - 1; // high end of the search area
        int middle = (low + high + 1) / 2; // middle element
        int location = -1; // return value; -1 if not found

        do // loop to search for element
        {
            // print remaining elements of array
            System.out.print(remainingElements(low, high));

            // output spaces for alignment
            for (int i = 0; i < middle; i++) {
                System.out.print("   ");
            }
            System.out.println(" * "); // indicate current middle

            // if the element is found at the middle
            if (searchElement == data[middle]) {
                location = middle; // location is the current middle
            } // middle element is too high
            else if (searchElement < data[middle]) {
                high = middle - 1; // eliminate the higher half
            } else // middle element is too low
            {
                low = middle + 1; // eliminate the lower half
            }
            middle = (low + high + 1) / 2; // recalculate the middle
        } while ((low <= high) && (location == -1));

        return location; // return location of search key
    } // end method binarySearch

    // method to output certain values in array
    public String remainingElements(int low, int high) {
        StringBuffer temporary = new StringBuffer();

        // output spaces for alignment
        for (int i = 0; i < low; i++) {
            temporary.append("   ");
        }

        // output elements left in array
        for (int i = low; i <= high; i++) {
            temporary.append(data[i] + " ");
        }

        temporary.append("\n");
        return temporary.toString();
    } // end method remainingElements
    
    public String binarySearchAll(int searchKey) {
        String result = "";
        boolean found = true;
        int index = 0;
        int low = 0; // low end of the search area
        int high = data.length - 1; // high end of the search area
        int middle = (low + high + 1) / 2; // middle element

        do // loop to search for element
        {
            // if the element is found at the middle
            if (searchKey == data[middle]) {
                result = String.format("%s %d ",result, middle+1); // location is the current middle
                index = middle + 1;
                while (index < data.length && found) {
                    if(searchKey == data[index]) {
                        result = String.format("%s %d ",result, index+1);
                        index++;
                    } else {
                        found = false;
                    }
                }
                index = middle - 1;
                found = true;
                while (index > 0 && found) {                    
                    if (searchKey == data[index]) {
                        result = String.format("%s %d ",result, index+1);
                        index--;
                    } else {
                        found = false;
                    }                    
                }                
            } // middle element is too high
            else if (searchKey < data[middle]) {
                high = middle - 1; // eliminate the higher half
            } else // middle element is too low
            {
                low = middle + 1; // eliminate the lower half
            }
            middle = (low + high + 1) / 2; // recalculate the middle
        } while ((low <= high) && result.isEmpty());
        
        return result.isEmpty() ? "No match was found!" : String.format("Found value in element %s", result);
    }

    // method to output values in array
    public String toString() {
        return remainingElements(0, data.length - 1);
    } // end method toString   
}
