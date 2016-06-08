package morsecode;

public class MorseCodeTest {
    public static void main(String[] args) {
        //Declare and initialize morse code variable
        MorseCode mCode = new MorseCode();
        
        //Encode "SOS" string to morse code
        System.out.println(mCode.encode("SOS"));
    }
}
