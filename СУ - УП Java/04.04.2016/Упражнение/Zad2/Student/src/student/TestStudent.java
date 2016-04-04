package student;

import java.util.Random;

public class TestStudent {
    public static void main(String[] args) {
        int question;
        int point;
        int grade;
        
        Student student = new Student("Diyan", "male", 19);
        Random rand = new Random();
        
        System.out.printf("Брой въпроси\tВъпрос от конспекта\tТочки\tОценка\n");
        
        for (int i = 0; i < 10; i++) {
            question = student.generateQuestion(rand.nextInt(30) + 1);
            point = student.gainPoint(question);
            grade = student.grade(point);
            System.out.printf("30\t\t%d\t\t\t%d\t%d\n",question, point, grade);
        }
    }
}
