/*
 * A beer time is after 1:00 PM and before 3:00 AM.
 * Write a program that enters a time in format “hh:mm tt” (an hour in range [01...12],
 * a minute in range [00…59] and AM / PM designator) and prints beer time or non-beer time
 * according to the definition above or invalid time if the time cannot be parsed.
 *  Note: You may need to learn how to parse dates and times.
 */
package beertime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BeerTime {

    public static void main(String[] args) throws Exception{
        String time;
        String format;
        String designator;
        Date startTime;
        Date endTime;
        Date enteredTime;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter time in format \'hh:mm tt\': ");
        time = sc.nextLine();
        
        designator = time.split(" ")[1];
        
        format = "hh:mm aa";
        
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        
        switch (designator) {
            case "PM":
                startTime = sdf.parse("1:00 PM");
                endTime = sdf.parse("26:59 AM");
                break;
            case "AM":
                startTime = sdf.parse("-26:00 PM");
                endTime = sdf.parse("2:59 AM");
                break;
            default:
                System.out.println("Ivalid designator!");
                System.exit(0);
                return;
        }
        
        enteredTime = sdf.parse(time);
        
        if (startTime.compareTo(enteredTime) <= 0 && endTime.compareTo(enteredTime) >= 0) {
            System.out.println("BEER TIME!");
        } else {
            System.out.println("Non-beer time");
        }
    }
    
}
