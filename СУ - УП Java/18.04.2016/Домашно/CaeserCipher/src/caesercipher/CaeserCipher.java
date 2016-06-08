package caesercipher;

public class CaeserCipher {
    //constant for beggining of alphabet letter code
    private static final int FIRST_LETTER_CODE = (int) 'A';
    
    public String encrypt( int shiftLength, String plainText) {
        if (isTextValid(plainText) && isShiftValid(shiftLength)) {
            String output = "";
            int letterCode;
            char[] arrayOfChars = plainText.toUpperCase().toCharArray();
            for (char letter : arrayOfChars) {
                letterCode = (int)letter - FIRST_LETTER_CODE; 
                if (letterCode < 0 || letterCode > 26) {
                    return "NOT VALID STRING!";
                }
                letterCode = (letterCode + shiftLength) % 26;
                output += (char)(letterCode + FIRST_LETTER_CODE);
            }
            return output;
        } return "NOT VALID STRING!";
    }
    
    public String decrypt( int shiftLength, String cipherText) {
        if (isShiftValid(shiftLength) && isTextValid(cipherText)) {
            String output = "";
            int letterCode;
            char[] arrayOfChars = cipherText.toUpperCase().toCharArray();
            for (char letter : arrayOfChars) {
                letterCode = (int)letter - FIRST_LETTER_CODE; 
                if (letterCode < 0 || letterCode > 26) {
                    return "NOT VALID STRING!";
                }
                letterCode = (letterCode - shiftLength + 26) % 26;
                output += (char)(letterCode + FIRST_LETTER_CODE);
            }
            return output;
        } return "NOT VALID STRING!";
    }
    
    private boolean isShiftValid(int shift) {
        return (shift > 0) && (shift < 27);
    }
    
    private boolean isTextValid(String text) {
        return (text != null) && (text.length() > 0);
    }
}
