package quotesinstrings;

public class QuotesInStrings {

    public static void main(String[] args) {
        String withQuotes = "The \"use\" of quotations causes difficulties";
        String withoutQuotes = \u0022The \"use\" of quotations causes difficulties\u0022;
        System.out.printf("With quotest: %s\n", withQuotes);
        System.out.printf("Without quotest: %s", withoutQuotes);
    }
    
}
