package morsecode;

public class MorseCode {

    //Constant for mores code
    private static final String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.",
                                            "--.", "....", "..", ".---", "-.-", ".-..",
                                            "--", "-.", "---", ".--.", "--.--", ".-.",
                                            "...", "-", "...-", "..-", ".--", "-..-",
                                            "-.--", "--.."};
    //constant for beggining of alphabet letter code
    private static final int FIRST_LETTER_CODE = (int) 'A';

    //Encode normal string to morse code string
    public String encode(String input) {
        //Check is string is null or lenght is less than 1
        if ((input != null) && (input.length() > 0)) {
            String output = "";
            int letterCode;
            //Array of all chars upper cased from input string
            char[] arrayOfChars = input.toCharArray();
            for (char letter : arrayOfChars) {
                //Code of current char
                letterCode = (int)letter;
                //If code is less than 65 then it is not A, otherwise if it is bigger than 90 it is not Z
                if (letterCode > 90 || letterCode < 65) {
                    return "NOT VALID STRING!";
                }
                //Concat. current string with morse code with new code
                //Get code from MORSE constant array
                output += MORSE[(int) letter - FIRST_LETTER_CODE] + " ";
            }
            //return string
            return output;
        } return "NOT VALID STRING!";
    }
}
