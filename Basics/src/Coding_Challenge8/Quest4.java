/**
 * Write a program to accept an int value from the user until user provides 0.
Display the same value in the output.
For non-zero values, re-run the logic.
 * 
 * 
 * One of the results of the execution:
Enter 0 to exit: 100
You entered: 100
Enter 0 to exit: -1
You entered: -1
Enter 0 to exit: 5
You entered: 5
Enter 0 to exit: 0
You entered: 0
 */


package Coding_Challenge8;

import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
		while(true) {
			System.out.println("enter the number ");
			Scanner scan = new Scanner(System.in);
			int num =  scan.nextInt();
			
			System.out.println("Enter 0 to exit ");
			if(num == 0) {
				System.out.println("exiting the program");
				return;
			}else
				System.out.println("You entered :" + num);
		}

	}

}
	
