package gradebook;

import javax.swing.JOptionPane;

public class GradeBook {

    private String courseName; // course name for this GradeBook
    private String professorName; // professor name for this GradeBook

    public GradeBook(){
        setCourseName("No name");
        setProfessorName("No name");
    }
    // constructor initializes courseName with String supplied as argument
    public GradeBook(String name, String professorName) {
        setCourseName(name); // initializes courseName
        setProfessorName(professorName); // initialize professorName
    } // end constructor

    // method to set the course name
    public void setCourseName(String name) {
        if(name != null) {
            courseName = name; // store the course name
        } else {
            courseName = "Not given course name!";
        }
    } // end method setCourseName

    // method to retrieve the course name
    public String getCourseName() {
        return courseName;
    } // end method getCourseName
    
     // method to set the course name
    public void setProfessorName(String name) {
        if(name != null) {
            professorName = name; // store the course name
        } else {
            professorName = "Not given professor name!";
        }
    } // end method setCourseName

    // method to retrieve the course name
    public String getProfessorName() {
        return professorName;
    } // end method getCourseName

    // display a welcome message to the GradeBook user
    public void displayMessage() {
      // this statement calls getCourseName to get the 
        // name of the course this GradeBook represents
        String result = String.format("Welcome to the grade book for\n%s!\nThis course is presented by: %s",
                getCourseName(),getProfessorName());
        JOptionPane.showMessageDialog(null, result, "Information", JOptionPane.INFORMATION_MESSAGE);
    } // end method displayMessage

} // end class GradeBook

