/**
 * Print the multiples of 5 starting from 200 to 5 with following restrictions:
1. Use for loop
2. Don't use modulus (%) operator to check whether number is divisible by 5 or not.
 */

package Looping_Statement;

public class Multiples_of_5 {

	public static void main(String[] args) {
		 
		for(int i=200; i>=5 ; i=i-5)
		{
			System.out.println(i);
		}
	}

}
