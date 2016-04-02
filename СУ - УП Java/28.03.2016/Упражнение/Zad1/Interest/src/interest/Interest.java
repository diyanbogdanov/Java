package interest;

public class Interest 
{
   public static void main( String args[] )
   {
      int amount; // amount on deposit at end of each year
      int principal = 100000; // initial amount before interest
      int rate = 5; // interest rate

      // display headers
      System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );

      // calculate amount on deposit for each of ten years
      for ( int year = 1; year <= 10; year++ ) 
      {
         // calculate new amount for specified year
         amount = (int)(principal * Math.pow( 1 + rate/100.0, year ));

         // display the year and the amount
         System.out.printf( "%4d%15d.%04d\n", year, amount/100, amount%100 );
      } // end for
   } // end main
} // end class Interest

