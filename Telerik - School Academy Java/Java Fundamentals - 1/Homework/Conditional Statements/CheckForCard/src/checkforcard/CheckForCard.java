/*
 * Classical play cards use the following signs to designate the card face: `2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A.
 * Write a program that enters a string and prints “yes” if it is a valid card sign or “no” otherwise.
 */
package checkforcard;

import java.util.Scanner;

public class CheckForCard {

    public static void main(String[] args) {
        String character;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please enter play card character: ");
        character = sc.next();
        
        switch(character) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
            case "A":
                System.out.println("Yes");
                break;
            default:
                System.out.println("No");
                break;
        }
    }
    
}
