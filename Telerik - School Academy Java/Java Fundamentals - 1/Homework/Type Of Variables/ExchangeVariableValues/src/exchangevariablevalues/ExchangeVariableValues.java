package exchangevariablevalues;

public class ExchangeVariableValues {

    public static void main(String[] args) {
        int variableA = 5;
        int variableB = 10;
        variableA += variableB;
        variableB = variableA - variableB;
        variableA -= variableB;
        System.out.printf("A: %d\nB: %d", variableA, variableB);
    }
    
}
