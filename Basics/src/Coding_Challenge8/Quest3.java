/**
 * Write a program that simulates rolling a pair of dice. Roll of 1st die will give a number between 1 and
6. Roll of 2nd die will also give a number between 1 and 6. You can use java.security.SecureRandom
class to get the numbers for both the dice. Their sum can be number between 2 and 12.
At the start ask the user to guess a number between 2 and 12. Then roll both the dice and if their
sum matches with the guessed number then we have a winner. Display greetings and exit the
program.
But if their sum doesn’t match, then ask user, if he would like to play again. If his answer is n, then
exit the program but if his answer is y then re-run the same logic.
Your output should match with below output.
Result of three separate executions:
Guess a number between 2 and 12: 7
To win you have to score 7
Press Enter to roll the dice...
Your score: 9. Sorry you lost, would you like to play again? (y/n): y
Guess a number between 2 and 12: 7
To win you have to score 7
Press Enter to roll the dice...
Congratulations!!!! Collect prize money at the counter.
Guess a number between 2 and 12: 10
To win you have to score 10
Press Enter to roll the dice...
Your score: 5. Sorry you lost, would you like to play again? (y/n): n
Guess a number between 2 and 12: 100
Guess a number between 2 and 12: 45
Guess a number between 2 and 12: 10
To win you have to score 10
Press Enter to roll the dice...
Your score: 6. Sorry you lost, would you like to play again? (y/n): y
Guess a number between 2 and 12: 10
To win you have to score 10
Press Enter to roll the dice...
Your score: 5. Sorry you lost, would you like to play again? (y/n): n
 * 
 * 
 */


package Coding_Challenge8;

import java.security.SecureRandom;
import java.util.*;

public class Quest3 {

	public static void main(String[] args) {
		 while(true) {
		SecureRandom random = new SecureRandom();
		System.out.println("Guess the number between 2 and 12");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = random.nextInt(6)+1;
		int num3 = random.nextInt(6)+1;
		if(num1<2 || num1>12) {
			continue;
		}
		int sum = num3 + num2;
		System.out.println("To win you have to score " +num1);
		
		System.out.println("Press enter to roll the dice...");
		scan.nextLine(); 
		
		if(sum == num1) {
			System.out.println("Congratulations!!!! Collect prize money at the counter.");
			
		}else
		{
			String str1 = scan.nextLine();
			System.out.println("Your score:" +sum+ ". Sorry you lost, would you like to play again? (y/n): ");
			String str = scan.nextLine();
			char c = str.charAt(0);
			if( c== 'y' || c == 'Y') {
				continue;
			}
			else
			{
				System.out.println("thank you for playing");
				return;
			}
		 }
	   }
		
	}

}
