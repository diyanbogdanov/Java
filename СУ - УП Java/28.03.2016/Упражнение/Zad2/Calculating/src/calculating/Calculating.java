package calculating;

public class Calculating {

    public static void main(String[] args) {
        int kilograms;
        int pounds;
        
        System.out.printf("Kilograms\tPounds\t|\tPounds\tKilograms\n");
        
        kilograms = 1;
        pounds = 20;
        
        while (kilograms < 200) {
            System.out.printf("%d\t\t%.2f\t|\t%d\t%.2f\n",kilograms,kilograms*2.2,pounds, pounds/2.2);
            kilograms += 2;
            pounds += 5;
        }
    }
    
}
