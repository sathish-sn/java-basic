/**
 * Write a Java program to print all the numbers between 1 and 100 (including 1 and 100)
which are divisible by 5.
 */

package Looping_Statement;

public class Divible_by_5 {

	public static void main(String[] args) {
		
		System.out.println("The numbers divisible by 5 are:");
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}

}
