package date;

public class DateTest {
    
    public static void main(String[] args) {
        //Declare and initialize new variables using default constrinctor and shared constructor
        Date newDate = new Date(12,03,2014); //Here is used shared constructor
        Date defaultDate = new Date(); //Here is used default constructor
        
        newDate.displayDate(); //Call's method dispalyDate() which print to dialog window date
        defaultDate.displayDate(); //This line is the same as above one but to other variable
    }
}
