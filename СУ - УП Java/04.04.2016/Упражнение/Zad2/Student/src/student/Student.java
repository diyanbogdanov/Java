package student;

import java.awt.Point;
import java.util.Random;

public class Student {
    private static int fn = 10000;
    
    private String firstName;
    private String sex;
    private int age;
    private int facNumber;
    
    public Student(String firstName, String sex, int age){
        setFirstName(firstName);
        setSex(sex);
        setAge(age);
        setFacNum(fn);
        fn++;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "None";
        }
    }

    public void setSex(String sex) {
        if (sex != null) {
            this.sex = sex;
        } else {
            this.sex = "None";
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 19;
        }
    }
    
    public void setFacNum(int facNumber){
        this.facNumber = facNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getFacNumber() {
        return facNumber;
    }
    
    public int generateQuestion(int number){
        int randNumber;
        Random rand = new Random();
        
        randNumber = rand.nextInt(number) + 1;
        
        return randNumber;
    }
    
    public int gainPoint(int number){
        int randPoints;
        Random rand = new Random();
        
        randPoints = rand.nextInt(100) + 1;
        
        return randPoints;
    }
    
    public int grade(int points){
        int grade;
        
        if (points <= 54) {
            grade = 2;
        } else if (points >= 55 && points <= 64) {
            grade = 3;
        } else if (points >= 65 && points <= 74) {
            grade = 4;
        } else if (points >= 75 && points <= 84) {
            grade = 5;
        } else {
            grade = 6;
        }
        
        return grade;
    }
    
    @Override
    public String toString(){
        String returnString;
        
        returnString = String.format("First name: %s\nGender: %s\nAge: %d\nFaculty number: %d", firstName, sex, age, facNumber);
        
        return returnString;
    }    
}
