package Control_Statement;
import java.util.*;
public class IF_and_Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("choose 1 to execute using if statement ");
		System.out.println("choose 2 to execute using switch statement ");
		int choose = scan.nextInt();
		System.out.println(" choose day ");
		int day = scan.nextInt();
		switch(choose) 
		{
		
		case 1:
			System.out.println(" executing using if statment ");
		
		
			if(day == 1)
			{
				System.out.println("Monday");
			}
			else if(day == 2)
			{
				System.out.println("Tuesday");
			}else if(day == 3)
			{
				System.out.println("Wednesday");
			}
			else if(day == 4)
			{
				System.out.println("Thursday");
			}
			else if(day == 5)
			{
				System.out.println("Friday");
			}
			else if(day == 6)
			{
				System.out.println("Saturday");
			}
			else if(day == 7)
			{
				System.out.println("Sunday");
			}
			else {
				System.out.println("not a valid day");
			}
			break;
		case 2: System.out.println("using Switch statement");
				switch(day) {
					case 1:
							System.out.println("Monday");
							break;
					case 2:
							System.out.println("Tuesday");
							break;
					case 3:
							System.out.println("Wednesday");
							break;
					case 4:
							System.out.println("Thursday");
							break;
					case 5:
							System.out.println("Friday");
							break;
					case 6:
							System.out.println("Saturday");
							break;
					case 7:
							System.out.println("Sunday");
							break;
					default:
							System.out.println("Invalid day");
			
		}
			
			
			
			
			
			
		}
	}

}
