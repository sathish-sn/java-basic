package Control_Statement;
import java.util.*;
public class Marks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		
		if(marks>100 || marks<0)
		{
			System.out.println("enter valid marks ");
		}
		if(marks>=0 && marks<60) {
			System.out.println("Fail");
		}
		if(marks>60 && marks<90)
		{
			System.out.println("Pass");
		}
		if(marks>=90 &&marks<=100)
		{
			System.out.println("Passed with Distinction");
		}
	}

}
