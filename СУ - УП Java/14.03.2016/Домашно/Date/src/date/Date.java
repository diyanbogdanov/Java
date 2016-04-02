package date;

import javax.swing.JOptionPane;

public class Date {
    //Declare class variables
    private int month; //This save month
    private int day; //This save day
    private int year; //This save year
    
    //Default constructor used by class when there is no given variables when it is implement;
    public Date(){
        setMonth(1);
        setDay(1);
        setYear(2000);
    }
    
    //This is the shared constructor, it takes three variables for month, day and year, then the are passed throug set methos
    public Date(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    
    //Set method for month
    public void setMonth(int month) {
        //Check if month is biger than zero and less than 13, then asign it's value to class variable month else give default value 1
        if(month > 0 && month < 13){
            this.month = month;
        } else {
            this.month = 1;
        }
    }
    
    //Get method for month
    public int getMonth() {
        return month;
    }
    
    //Set method for day
    public void setDay(int day) {
        //Check if day is biger than zero and less than 32, then asign it's value to class variable day else give default value 1
        if(day > 0 && day < 32){
            this.day = day;
        } else{
            this.day = 1;
        }
    }
    
    //Get method for day
    public int getDay() {
        return day;
    }
    
    //Set method for year
    public void setYear(int year) {
        //Check if year is biger than zero or equal, then asign it's value to class variable year else give default value 2000
        if(year >= 0){
            this.year = year;
        } else {
            this.year = 2000;
        }
    }

    //Get method for year
    public int getYear() {
        return year;
    }
    
    //Return string formated day/month/year
    public String toString(){
        return String.format("%02d/%02d/%04d", getDay(), getMonth(), getYear());
    }
    
    //Method which format string with date and then show it using message dialog window
    public void displayDate(){
        JOptionPane.showMessageDialog(null, toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
    }
}
