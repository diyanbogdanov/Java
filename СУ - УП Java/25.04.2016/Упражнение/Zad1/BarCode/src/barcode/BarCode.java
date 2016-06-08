package barcode;

public class BarCode {
    private static final int[][] CODE = {{1,1,0,0,0},
                                        {0,0,0,1,1},
                                        {0,0,1,0,1},
                                        {0,0,1,1,0},
                                        {0,1,0,0,1},
                                        {0,1,0,1,0},
                                        {0,1,1,0,0},
                                        {1,0,0,0,1},
                                        {1,0,0,1,0},
                                        {1,0,1,0,0}}; 
    
    public String decode(int zip) {
        String result = "";
        int digit;
        for (int i = 0; i < 3; i++) {
            digit = zip % 10;
            zip /= 10;
            result = execute(CODE[digit]) + result;
        }
        return result;
    }
    
    private String execute(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result += ": ";
            } else {
                result += "| ";
            }
        }
        return result;
    }
}
