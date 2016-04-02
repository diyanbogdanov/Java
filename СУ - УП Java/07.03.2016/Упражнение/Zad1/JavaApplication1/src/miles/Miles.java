
package miles;

public class Miles {

    public static void main(String[] args) {
        //Declaring variables
        double miles; //Declaring miles
        double totalTravelTime; //Declaring travel time
        double speed; //Declaring speed
        
        //Initializing variables
        miles = 0; //Initializing miles
        totalTravelTime = 8.50; //Initializing travel time
        
        speed = miles / totalTravelTime; //Calculating speed
        
        System.out.printf("The speed is: %s", speed); //Outprint the speed to standart output console
    }
    
}
