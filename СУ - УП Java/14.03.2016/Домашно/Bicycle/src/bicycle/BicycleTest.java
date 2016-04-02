package bicycle;

public class BicycleTest {
    public static void main(String[] args) {
        //Declare variable used in program block
        String informationAboutBicycle; //This variable is used to contain information of bicycle then is printed on console
        
        //Make new instace of Bicycle class and save it to variable bicycle from type Bicycle;
        Bicycle bicycle = new Bicycle();
        
        //Use all setters of bicycle to give to it some values
        bicycle.setGear(1); //Set gear
        bicycle.setSpeed(8); //Set speed
        bicycle.setCadence(60); //Set cadence
        bicycle.setSeats(1); //Set number of seats
        bicycle.setOwnerName("Diyan Bogdanov"); //Set owner name
        
        //Use methods of bicycle
        bicycle.speedUp(7); //Add speed 7
        bicycle.applyBrakes(5); //Remove speed 5
        
        //Use method getInformation() and give it's value to variable informationAboutBicycle
        informationAboutBicycle = bicycle.getInformation();
        
        //Prinf all information we have to console
        System.out.println(informationAboutBicycle);
    }
}
