package date;

public class Date
{
   private int month;  // mesec
   private int day;    // den
   private int year;   // godina

   // constructor general purpose
   public Date( int monthValue, int dayValue, int yearValue )
   {
      setMonth(monthValue); // input and validate
      setDay(dayValue);       // input and validate
      setYear(yearValue) ;    // input and validate
   } // end general purpose constructor
   
   // set the month
   public void setMonth( int monthValue )
   {
      if (monthValue > 0 ) // validate monthValue is greater than 0
      {  
         if (monthValue <=12 )   // validate monthValue is less or equal 12 
         {
         	  month = monthValue; // set the month
         }
      }
   } // end method setMonth
   // set the day
   public void setDay( int dayValue )
   {
     if (dayValue > 0 )
      {  //a  more accurate validation we learn to use later in the course
         if (dayValue <=31 )  
         {
         	 day = dayValue;
         }
      }
   } // end method setDay
   // set the year
   public void setYear( int yearValue )
   {   
      if (yearValue >= 0 )
      {
         year = yearValue;
      }
   } // end method setYear
   // display the date
   public String displayDate()
   {
      return String.format( "%02d/%02d/%4d ", day, month , year );
   } // end method displayDate
   
   public void addOneDay(){
       day++;
       if (day >31) {
           day = 1;
           month++;
           if (month > 12) {
               month = 1;
               year++;
           }
       }
   }
   
   public void printDates(Date startDate, Date endDate) {
       while (startDate.day != endDate.day 
               || startDate.month != endDate.month 
               || startDate.year != endDate.year) {
           System.out.println(startDate.displayDate());
           startDate.addOneDay();
       }
   }
} // end class Date

