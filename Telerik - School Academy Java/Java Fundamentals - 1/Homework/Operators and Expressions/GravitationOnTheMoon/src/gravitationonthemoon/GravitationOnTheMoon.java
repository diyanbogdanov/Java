package gravitationonthemoon;

import java.util.Scanner;

public class GravitationOnTheMoon {

    public static void main(String[] args) {
        double weightOnTheEarth;
        double weightOnTheMoon;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter weight on the Earth: ");
        weightOnTheEarth = sc.nextDouble();
        
        weightOnTheMoon = (weightOnTheEarth / 100) * 17;
        
        System.out.printf("Weight on the moon is: %f", weightOnTheMoon);
    }
    
}
