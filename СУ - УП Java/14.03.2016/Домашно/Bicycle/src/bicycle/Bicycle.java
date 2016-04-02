package bicycle;

public class Bicycle {
    
    //Declare class variables as know as members or fields
    private int gear; //Variable from type int which hold gear of bicycle
    private int speed; //Variable from type int which hold speed of bicycle
    private int cadence; //Variable from type int which hold cadence of bicycle
    private int seats; //Variable from type int which hold number of seats of bicycle
    private String ownerName; //Variable from type String which hold name of owner of the bicycle
    
    //Set method to gear variable
    public void setGear(int gear){
        /*
        Check if gear is big than 0 and less than 22(less than 21 or equal to 21) to set new value to class variable gear
        In my logic i want gear to be in this range, it can be change any time if it is needed
        If gear is not in this range then set default gear a.k.a 1
        */
        if(gear > 0 && gear <= 21){
            this.gear = gear;
        } else {
            this.gear = 1;
        }
    }
    
    //Get method for gear variable
    public int getGear(){
        return gear;
    }
    
    //Set method for speed variable
    public void setSpeed(int speed){
        //Check if speed is big than or equal to 0 then set new speed to class varible speed else set default speed 0
        if(speed >= 0){
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }
    
    //Ger method for speed variable
    public int getSpeed(){
        return speed;
    }
    
    //Set method for cadence varible
    public void setCadence(int cadence) {
        //Check if cadence is big than or equal to 0 then set new cadence to class varible cadence else set default cadence 0
        if(cadence >= 0){
            this.cadence = cadence;
        } else {
            this.cadence = 0;
        }
    }
    
    //Get method for cadence variable
    public int getCadence() {
        return cadence;
    }
    
    //Set method for seats variable
    public void setSeats(int seats) {
        //Check if seats are big than 0 then set new seats to class varible seats else set default seats 1
        if(seats > 0){
            this.seats = seats;
        } else {
            this.seats = 1;
        }
    }
    
    //Get method for seats varible
    public int getSeats() {
        return seats;
    }
    
    //Set method for owner's name
    public void setOwnerName(String ownerName) {
        //Check if ownerName is NOT empty string then set new name to class varible ownerName else set default name "None"
        if(ownerName != ""){
            this.ownerName = ownerName;
        } else {
            this.ownerName = "None";
        }
    }
    
    //Get method for owner's name
    public String getOwenerName() {
        return ownerName;
    }
    
    //Method for speeding up bicycle
    public void speedUp(int speed){
        //Check if given speed is bigger than 0, then add this speed to class variavle speed
        if(speed > 0){
            this.speed = this.speed + speed; 
        }
    }
    
    //Method for speeding down bicycle or stoping it
    public void applyBrakes(int decrease){
        //Check if give decreasment is bigger than 0 then remove this speed form curent speed of bicycle
        if(decrease > 0){
            this.speed = this.speed - decrease;
        }
    }
    
    //Method to format all given informathin in method
    public String getInformation(){
        //Make new string and format it with given variables
        String information = String.format("Current speed: %d km/h\nCurrent gear: %d\nCurrent cadence: %d rpm\nNumber of seats: %d\nOwner of bike: %s",speed, gear, cadence, seats, ownerName);
        return information;
    } 
}
