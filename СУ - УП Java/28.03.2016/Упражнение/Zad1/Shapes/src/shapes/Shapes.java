package shapes;
// Fig. 5.26: Shapes.java
// Demonstrates drawing different shapes.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
   private int choice; // user's choice of which shape to draw
   
   // constructor sets the user's choice
   public Shapes( int userChoice )
   {
      choice = userChoice;
   } // end Shapes constructor
   
   // draws a cascade of shapes starting from the top left corner
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      int centerX;
      int centerY;
      
      centerX = getWidth()/2;
      centerY = getHeight()/2;
      
      for ( int i = 0; i < 10; i++ )
      {
         // pick the shape based on the user's choice
         switch ( choice )
         {
            case 1: // draw rectangles
               g.drawRect( centerX -(50 + i * 20)/2, centerY - (50 + i * 20)/2, 
                  50 + i * 20, 50 + i * 20 );
               break;
            case 2: // draw ovals
               g.drawOval( centerX -(50 + i * 20)/2, centerY - (50 + i * 20)/2, 
                  50 + i * 20, 50 + i * 20 );
               break;
         } // end switch
      } // end for
      
      g.setColor(Color.red);
      g.drawLine(centerX - (50 + 9 * 20)/2, centerY , centerX + (50 + 9 * 20)/2, centerY);
      g.drawLine(centerX , centerY - (50 + 9 * 20)/2, centerX , centerY + (50 + 9 * 20)/2);
   } // end method paintComponent
} // end class Shapes


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
