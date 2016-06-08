package weekdays;

public enum Weekdays {
    MON("Monday", "Mon", 1),
    TUE("Tuesday", "Tue", 2),
    WED("Wednesday", "Wed", 3),
    THU("Thusday", "Thu", 4),
    FRI("Friday", "Fri", 5),
    SAT("Saturday", "Sat", 6),
    SUN("Sunday", "Sun", 7);
    
    private String fullName;
    private String shortName;
    private int serialNumber;
    
    private Weekdays(String fullN, String shortN, int serialN){
        fullName = fullN;
        shortName = shortN;
        serialNumber = serialN;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public String getShortName() {
        return shortName;
    }
    
    public int getSerialNumber() {
        return serialNumber;
    }
}