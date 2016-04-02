package nullvaluesarithmetic;

public class NullValuesArithmetic {

    public static void main(String[] args) {
        Integer nullIntegerValue = null;
        String nullStringValue = null;
        System.out.printf("Null Integer value: %d\nNull String value: %s\n", nullIntegerValue, nullStringValue);
        nullIntegerValue = 7;
        nullStringValue = "Diyan";
        System.out.printf("Add Integer value: %d\nAdd String value: %s\n", nullIntegerValue, nullStringValue);
    }
    
}
