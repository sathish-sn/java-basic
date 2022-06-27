/**
Write a program to ask user to enter either Y or N.
User can enter in lower case or upper case.
If user enters Y or y, then display “Welcome!” and terminate the program.
If user enters N or n, then display “Good Bye!” and terminate the program.
If user enters any other character, then display “Please provide correct input.” and ask user to enter
either Y or N.
If user enters more than one character such as yes/no/abc, then display “Please provide only one
character.” and ask user to enter either Y or N.
Program should not be terminated until user provides Y/y/N/n.
 use some inbuilt method
 * 
 */

package Coding_Challenge8;

import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int flag = 1; 
		//System.out.println(c);
		while(flag == 1) {
			System.out.println("Enter either Y/N :");
			String str = scan.nextLine();
			
			char c = str.charAt(0);
			
		
		if(str.length()>1) {
			System.out.println("Please provide only one character ");
			
		}else if(str.equalsIgnoreCase("y"))  {
			System.out.println("Welcome");
			flag =0;
		}else if(str.equalsIgnoreCase("n")) {
			System.out.println("Good Bye");
			flag =0;
		}		else if(c != 'y' || c != 'Y' || c != 'n' || c != 'N' ) {
			System.out.println("Please provide correct input ");
			
		}
	 }

	}

}
