/**
 * Write a java program to accept more than 1 digit as command-line arguments and display the
highest digit to the user.
For example, if user passes 9, 14, 0, 23, 98, 2, 45
Output should be: Highest digit is: 98
 * 
 */

package CodingChallenge7;

public class Quest4 {

	public static void main(String[] args) {
		int large = 0;
		for(String x : args) {
			if(Integer.parseInt(x)>large) {
				large = Integer.parseInt(x);
			}
		}
		System.out.println("Highest digit is: "+ large);
		
	}

}
