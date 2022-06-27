/**
 * Question 3:
Write a java program to accept <first name> and <last name> as command-line arguments and
display message to the user:
Hello <first name> <last name>, Welcome to Core Java Development Course For Beginners.
If user enters only first name or last name and not both, treat the user with appropriate message,
such as "Please enter both your first name and last name"
 * 
 */



package CodingChallenge7;

public class Quest3 {

	public static void main(String[] args) {
		//System.out.println(args.length);
		if(args.length != 2) {
			System.out.println("Please enter both your first name and last name");
			return;
		}
		System.out.println("Hello "+ args[0] + " "+ args[1] + ", Welcome to Core Java Development Course For Beginners.");
		
		
	}

}
