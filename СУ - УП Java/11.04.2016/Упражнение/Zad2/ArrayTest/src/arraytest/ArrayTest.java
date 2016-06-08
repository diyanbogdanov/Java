package arraytest;

import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {
        double[] dblArray = {0.5, 1.5, 3.7, 7.2, 12.8, 19.65, 102.65, 69.69};
        
        System.out.println("Елементите на масива:");
        arrayPrint(dblArray);
        
        System.out.println("Елементите на масива, които са по- големи от средната стойност на всички елементи: ");
        double averageValue;
        averageValue = arrayAverage(dblArray);
        for (int i = 0; i < dblArray.length; i++) {
            if (dblArray[i] > averageValue) {
                System.out.printf("%.2f ,", dblArray[i]);
            }
        }
        System.out.println();
        
        System.out.println("Елементите на масива в обратна последователност на техните индекси: ");
        for (int i = dblArray.length - 1; i > dblArray.length - 6; i--) {
            System.out.printf("%.2f", dblArray[i]);
            if (i > (dblArray.length - 5)) {
                System.out.print(" ,");
            }
        }
        System.out.println();
        
        System.out.println("Най-големия елемент на масива: ");
        System.out.println(arrayMin(dblArray));
        System.out.println("Най-малкия елемент на масива: ");
        System.out.println(arrayMax(dblArray));
        
        System.out.println("Елементите на масива в три колони: ");
        for (int i = 0; i < dblArray.length; i++) {
            System.out.printf("%-10.2f ", dblArray[i]);
            if ((i+1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("Дали елементите на масвиа са подредени в низходящ ред: ");
        System.out.println(arrayOrder(dblArray));
        
        System.out.println("Елементите на масива, които имат четни индекси: ");
        arrayPrint(arrayTriangle(dblArray));
    }

    public static void arrayPrint(double[] data) {
        System.out.print("[");
        for (double value : data) {
            System.out.printf("%.2f ,", value);
        }
        System.out.print("]\n");
    }

    public static double arrayAverage(double[] data) {
        double sum;
        sum = 0;
        for (double value : data) {
            sum += value;
        }

        return (sum / data.length);
    }

    public static double arrayMin(double[] data) {
        double min;

        min = data[0];

        for (double value : data) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static double arrayMax(double[] data) {
        double max;

        max = data[0];

        for (double value : data) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static double[] arrayShuffle(double[] data) {
        double[] newArray = new double[data.length];
        int length = data.length;

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            newArray[i] = data[random.nextInt(length)];
        }

        return newArray;
    }

    public static double[] arrayReverse(double[] data) {
        double[] newArray = new double[data.length];

        for (int i = 0; i < data.length; i++) {
            newArray[data.length - 1 - i] = data[i];
        }

        return newArray;
    }

    public static boolean arrayOrder(double[] data) {
        double max;
        max = data[0];

        for (double value : data) {
            if (value > max) {
                return false;
            }
        }

        return true;
    }

    public boolean arrayEquals(double[] data1, double[] data2) {
        if (data1.length != data2.length) {
            return false;
        }

        for (int i = 0; i < data2.length; i++) {
            if (data1[i] != data2[i]) {
                return false;
            }
        }

        return true;
    }

    public static int arrayMiddleCount(double[] data) {
        int middleIndex;
        double middleElement;
        int counter;

        middleIndex = data.length / 2;
        middleElement = data[middleIndex];
        counter = 0;

        for (double value : data) {
            if (value < middleElement) {
                counter++;
            }
        }

        return counter;
    }

    public static double[] arrayTriangle(double[] data) {
        int lenghtOfMassive;
        double[] newArray;

        lenghtOfMassive = data.length / 2;
        newArray = new double[lenghtOfMassive];

        for (int i = 0; i < data.length; i += 2) {
            newArray[i / 2] = data[i];
        }

        return newArray;
    }

}
