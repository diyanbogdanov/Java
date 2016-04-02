package stars;
// Stars.java
// Program prints a checkerboard pattern.
// Correct the syntax error

public class Stars {

   // main method begins execution of program
   public static void main(String[] args)
   {
      int row = 1;
      while( row <= 8 )  {
         int column = 1;

         if ( row % 2 == 0 )
            System.out.print( " " );

         while( column  <= 8 ) { 
            System.out.print( "* " );
            ++ column;
         }

         System.out.println();
         ++ row;
      }

   }  // end method main

}  // end class Stars

