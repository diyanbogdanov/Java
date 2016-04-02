package stringsandobjects;

public class StringsAndObjects {

    public static void main(String[] args) {
        String helloStringVariable = "Hello";
        String worldStringVariable = "World!";
        Object objectVariable = helloStringVariable + " " + worldStringVariable;
        String thirdStringVariable = (String)objectVariable;
        System.out.println(thirdStringVariable);
    }
    
}
