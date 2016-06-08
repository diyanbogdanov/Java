package matharray;

public class MathArray {
    private int[][] table;
    private  int[] row;
    
    public MathArray() {
        table = new int[][] {{3, 4, 5, 6, 3}, {2, 1, 2, 1, 1,}, {3, 2, 1, 4, 9}, {1, 0, 0, 1, 1}, {9, 2, 6, 4, 9}};
        row = new int[] {2, 1, 2, 3, 4};
    }

    public int[][] getTable() {
        return table;
    }

    public int[] getRow() {
        return row;
    }
    
    public int[] multiplyMatrixByRow() {
        int[] result = new int[row.length];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < row.length; j++) {
                result[j] += table[i][j] * row[j]; 
            }
        }
        return result;
    }
    
    public int[][] squareMatrix() {
        int[][] result = new int[table.length][table[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                for (int k = 0; k < result.length; k++) {
                    result[i][j] += table[i][k]*table[k][j];
                }
            }
        }
        return result;
    }
    
    public double scalarProduct() {
        double result = 0;
        for (int i = 0; i < row.length; i++) {
            result += Math.pow(row[i], 2);   
        }
        return Math.sqrt(result);
    }
    
    public int[][] transposeMatrix() {
        int[][] result = new int[table.length][table[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[j][i] = result[i][j];
            }
        }
        return result;
    }
    
    public double matrixTrace() {
        double result;
        result = table[0][0];
        for (int i = 1; i < table.length; i++) {
            result += table[i][i];
        }
        return result;
    }
    
    public String toString(int[] matrix) {
        if (matrix.length > 0 && matrix != null) {
            String result = "";
            for (int i = 0; i < matrix.length; i++) {
                result += matrix[i];
                if (i+1 < matrix.length) {
                    result += ", ";
                }
            }
            return result;
        } return "";
    }
    
    public String toString(int[][] matrix) {
        if (matrix.length > 0 && matrix != null) {
            String result = "";
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    result += matrix[i][j];
                    if (j+1 < matrix.length) {
                        result += ", ";
                    }
                }
                if (i+1 < matrix.length) {
                    result += "\n";
                }
            }
            return result;
        } return "";
    }
    
    public String toString() {
        String result;
        result = "Table:\n" + toString(table) + "\nRow:\n" + toString(row);
        return result;
    }
}
