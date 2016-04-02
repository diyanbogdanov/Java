/*
 * Write a program that applies bonus score to given score in the range [1…9] by the following rules:
 *  If the score is between 1 and 3, the program multiplies it by 10.
 *  If the score is between 4 and 6, the program multiplies it by 100.
 *  If the score is between 7 and 9, the program multiplies it by 1000.
 *  If the score is 0 or more than 9, the program prints “invalid score”
 */
package bonusscore;

import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {
        int score;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.print("Please, enter score betwen 1 and 9: ");
        score = sc.nextInt();
        
        if (score < 1 || score > 9) {
            System.out.println("You have entered invalid score!");
            System.exit(0);
        }
        
        if (score < 4) {
            score *= 10;
        } else if(score < 7) {
            score *= 100;
        } else {
            score *= 1000;
        }
        
        System.out.printf("Score: %d\n", score);
    }
    
}
