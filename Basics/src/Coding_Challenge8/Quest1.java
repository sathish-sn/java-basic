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
NOTE: Provide the solution under “challenge8” package and accept input as character.
 * 
 */


package Coding_Challenge8;
import java.util.*;

public class Quest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int flag = 1; 
		//System.out.println(c);
		while(true) {
			System.out.println("Enter either Y/N :");
			String str = scan.nextLine();
			
			char c = str.charAt(0);
			
		
		if(str.length()>1) {
			System.out.println("Please provide only one character ");
			
		}else if(c == 'y' || c == 'Y' ) {
			System.out.println("Welcome");
			break;
			//flag =0;
		}else if (c == 'n' || c == 'N'){
			System.out.println("Good Bye");
			break;
			//flag =0;
		}		else if(c != 'y' || c != 'Y' || c != 'n' || c != 'N' ) {
			System.out.println("Please provide correct input ");
			
		}
	 }
	}
}

