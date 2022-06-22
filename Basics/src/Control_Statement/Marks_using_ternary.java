package Control_Statement;

import java.util.Scanner;

public class Marks_using_ternary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		String res=marks>=60?marks>=90?marks>100 || marks<0?"enter valid marks" :"passed with distinction":"pass":"Fail";
		System.out.println(res);
	}

}
