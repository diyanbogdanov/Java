package date;

public class DateTest {
    public static void main(String[] args) {
        Date myDate;
        Date myFirstDate;
        Date mySecondDate;
        
        myDate = new Date(10,22,1996);
        myFirstDate = new Date(2,22, 2016);
        mySecondDate = new Date(3,21,2016);
        
        myDate.addOneDay();
        
        myDate.printDates(myFirstDate, mySecondDate);
    }
}
