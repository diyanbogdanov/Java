package bubblesort;

public class BubbleSort {
    // initialize applet 
    public static void main(String[] args) {
        BubbleSort app = new BubbleSort();
        int array[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};

        String output = "Data items in original order\n";

        // append original array values to String output
        for (int counter = 0; counter < array.length; counter++) {
            output += "   " + array[counter];
        }

        app.bubbleSort(array);  // sort array

        output += "\n\nData items in ascending order\n";

        // append sorted\ array values to String output
        for (int counter = 0; counter < array.length; counter++) {
            output += "   " + array[counter];
        }
        System.out.println(output);
    }

    // sort elements of array with bubble sort
    public void bubbleSort(int array2[]) {
        boolean hasMadeCahnges = false;
        // loop to control number of passes
        for (int pass = 1; pass < array2.length; pass++) {
            // loop to control number of comparisons
            for (int element = 0; element < array2.length - 1 - pass; element++) {
            // compare side-by-side elements and swap them if 
                // first element is greater than second element
                if (array2[element] > array2[element + 1]) {
                    hasMadeCahnges = true;
                    swap(array2, element, element + 1);
                }
            }  // end loop to control comparisons
            if (!hasMadeCahnges) {
                return;
            }
        }  // end loop to control passes
    }  // end method bubbleSort

    // swap two elements of an array
    public void swap(int array3[], int first, int second) {
        int hold;  // temporary holding area for swap

        hold = array3[first];
        array3[first] = array3[second];
        array3[second] = hold;
    }
}
