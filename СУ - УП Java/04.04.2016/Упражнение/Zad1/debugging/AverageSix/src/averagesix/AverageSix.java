package averagesix;

import javax.swing.*;

public class AverageSix {
    

    public double average(double x, double y) {
        return x / y;
    }

    public double maximum(double x, double y) {
        return Math.max(x, y);
    }

    public double minimum(double x, double y) {
        return Math.min(x, y);
    }

    public static void main(String[] args) {
        int students2;
        int counter = 1;
        double total = 0, previousNumber = 0, newMaximum = 0, newMinimum = 0;
        double average1;

        String students = JOptionPane.showInputDialog(
                "Please enter the number of students you wish to average");

        students2 = Integer.parseInt(students);
        int NumOfStudents = students2;

        AverageSix ave = new AverageSix();

        while (students2 != 0) {
            String si = JOptionPane.showInputDialog("Please enter a grade");
            double givenNum = Double.parseDouble(si);

            total = total + givenNum;

            if (counter == 1) {
                previousNumber = givenNum;
                newMinimum = givenNum;
            }

            if (newMaximum < givenNum) {
                newMaximum = ave.maximum(previousNumber, givenNum);
            }

            if (newMinimum > givenNum) {
                newMinimum = ave.minimum(previousNumber, givenNum);
            }

            students2--;
            counter++;

            previousNumber = givenNum;
        }

        average1 = ave.average(total, NumOfStudents);

        System.out.println("\nThe maximum: " + newMaximum
                + "\nThe Average: " + average1 + " \nThe minimum: " + newMinimum);
        System.exit(0);

    }

}
