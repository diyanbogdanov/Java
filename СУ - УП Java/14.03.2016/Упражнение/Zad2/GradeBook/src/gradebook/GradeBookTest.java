// Fig. 3.11: GradeBookTest.java
// GradeBook constructor used to specify the course name at the 
// time each GradeBook object is created.
package gradebook;

import javax.swing.JOptionPane;

public class GradeBookTest {

    // main method begins program execution

    public static void main(String args[]) {
      // create GradeBook object
        String courseName;
        String professorName;
        
        courseName = JOptionPane.showInputDialog("Please enter course name: ");
        professorName = JOptionPane.showInputDialog("Please enter professor name: ");
        
        GradeBook gradeBook1 = new GradeBook(courseName, professorName);

        // display initial value of courseName for each GradeBook
        gradeBook1.displayMessage();
    } // end main

} // end class GradeBookTest

