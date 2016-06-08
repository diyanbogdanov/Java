package weekdays;

import java.util.Random;
import javax.swing.JOptionPane;

public class WeekdaysTest {
    public static void main(String[] args) {
        int fullNamesNumber;
        int shortNamesNumber;
        String fullNames = "";
        String shortNames = "";
        Weekdays[] days = Weekdays.values();
        Random random = new Random();
        
        fullNamesNumber = random.nextInt(7);
        shortNamesNumber = fullNamesNumber;
        
        for (int i = 0; i < days.length; i++) {
            fullNames = String.format("%s %s %s", fullNames, days[fullNamesNumber].getFullName(), ((i < 6) ? ", " : ""));
            shortNames = String.format("%s %s %s", shortNames, days[shortNamesNumber].getShortName(), ((i < 6) ? ", " : ""));
            fullNamesNumber = (fullNamesNumber + 1) % 7;
            shortNamesNumber = (shortNamesNumber +6) % 7;
        }
        
        JOptionPane.showMessageDialog(null, fullNames + "\n" + shortNames, "Weekdays", 1);
    }
}