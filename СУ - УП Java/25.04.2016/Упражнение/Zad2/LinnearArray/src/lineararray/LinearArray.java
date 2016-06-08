package lineararray;

import java.util.Random;

public class LinearArray {

    private int[] data; // array of values
    private static Random generator = new Random();

    // create array of given size and fill with random integers
    public LinearArray(int size) {
        data = new int[size]; // create space for array

        // fill array with random ints in range 10-99
        for (int i = 0; i < size; i++) {
            data[i] = 10 + generator.nextInt(90);
        }
    } // end LinearArray constructor

    // perform a linear search on the data
    public int linearSearch(int searchKey) {
        // loop through array sequentially
        for (int index = 0; index < data.length; index++) {
            if (data[index] == searchKey) {
                return index; // return index of integer
            }
        }
        return -1; // integer was not found      
    } // end method linearSearch
    
    public String linearSearchAll(int searchKey) {
        String result = "";
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchKey) {
                result = String.format("%s %d ",result, i+1);
            }
        }
        
        return result.isEmpty() ? "No match was found!" : String.format("Found value in element %s", result);
    }
    
    

    // method to output values in array
    public String toString() {
        String temporary = "";

        // iterate through array
        for (int element : data) {
            temporary += element + " ";
        }

        temporary += "\n"; // add endline character
        return temporary;
    } // end method toString
}
